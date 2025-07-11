
import java.util.Arrays;

/**
 *
 * @author August Preuss
 * @version 5/6/2025
 * various sorting methods
 * 
 */
public class Sort {
    
    /**
     * A generic bubbleSort
     * @param <E> keeps the sort generic
     * @param data the generic array that will be sorted
     * @param cmp the comparator that will compare the data values with eachother
     */
    public static <E> void bubbleSort(E[] data, Comparator<E> cmp){
        for(int j = 0; j < data.length - 1; j++){
            for(int i = 0; i < data.length - 1; i++){
                //cmp determines correct order of data
                //if current element is greater than the next then swap them
                if(cmp.compare(data[i], data[i + 1]) > 0){
                    E temp = data[i + 1];
                    data[i + 1] = data[i];
                    data[i] = temp;
                }
            }
        }
    }
    //
    /**
     * A generic enhancedBubbleSort
     * @param <E> keeps the sort generic
     * @param data the generic array that will be sorted
     * @param cmp the comparator that will compare the data values with eachother
     */
    public static <E> void enhancedBubbleSort(E[] data, Comparator<E> cmp){
        boolean swapped;
        
        for(int j = 0; j < data.length - 1; j++){
            swapped = false;
            for(int i = 0; i < data.length - 1 - j; i++){
                if(cmp.compare(data[i], data[i + 1]) > 0){
                E temp = data[i];
                data[i] = data[i + 1];
                data[i + 1] = temp;
                swapped = true;
            }
        }
        //if we swapped value break out of loop
        if(!swapped){
            break;
        }
      }  
    }
    
    /**
     * A generic insertionSort
     * @param <E> keeps the sort generic
     * @param data the generic array that will be sorted
     * @param cmp the comparator that will compare the data values with eachother
     */
    public static <E> void insertionSort(E[] data, Comparator<E> cmp){
        //element to be inserted into ssorted position
        E key;
        //index for traversing sorted part of array
        int j;
        for(int i = 1; i < data.length; i++){
            
            key = data[i];
            j = i - 1;
            //elements of sorted position that are greater than key are shifted to the right
            while(j >= 0 && cmp.compare(data[j], key) > 0){
                data[j + 1] = data[j];
                j = j - 1;
            }
            data[j + 1] = key;
        }
        
    }
    
    /**
     * A generic selectionSort
     * @param <E> keeps the sort generic
     * @param data the generic array that will be sorted
     * @param cmp the comparator that will compare the data values with eachother
     */
    public static <E> void selectionSort(E[] data, Comparator<E> cmp){
        //index for smallest element found
        int minIndex;
        for(int i = 0; i < data.length - 1; i++){
            //current index starts as smallest
            minIndex = i;
            
            //find index of smallest element in the unsorted portion
            for(int j = i + 1; j < data.length; j++){
                
                if(cmp.compare(data[j], data[minIndex]) < 0){
                    minIndex = j;
                }
                
            }
            
            //swap smallest element with element at current position
            E temp = data[minIndex];
            data[minIndex] = data[i];
            data[i] = temp;
                
        }
        
    }
    
    /**
     * A merge method used inside of the mergeSort method, taken from code fragments 12.1 - 12.2 
     * @param <E> keeps the merge generic
     * @param S1 the first half of the array
     * @param S2 the second half of the array
     * @param S the full array
     * @param cmp used to compare values
     */
    private static <E> void merge(E[] S1, E[] S2, E[] S, Comparator<E> cmp){
        int i = 0, j = 0;
        while(i + j < S.length) {
            if(j == S2.length || (i < S1.length && cmp.compare(S1[i], S2[j]) < 0)){
                //copy ith element of S1 and increment i
                S[i + j] = S1[i++];
            }
            //copy jth element of S2 and increment j
            else{
                S[i+j] = S2[j++];
            }
                
        }
    }
    
    /**
     * A generic MergeSort, taken from code fragments 12.1 - 12.2
     * @param <E> keeps the sort generic
     * @param S the generic array that will be sorted
     * @param cmp the comparator that will compare the data values with eachother
     */
    public static <E> void mergeSort(E[] S, Comparator<E> cmp){
        int n = S.length;
        if(n < 2) return;
        //divide
        int mid = n/2;
        E[] S1 = Arrays.copyOfRange(S, 0, mid); //copy of first half
        E[] S2 = Arrays.copyOfRange(S, mid, n); // copy of second half
        //conquer with recursion
        mergeSort(S1, cmp);                     // sort copy of first
        mergeSort(S2, cmp);                     // sort copy of second
            
        //merge results
        merge(S1, S2, S, cmp);                  // merge sorted halves back into original
    }
    
    /**
     * A generic quickSort, code fragment 12.5
     * @param <E> keeps the sort generic
     * @param S the generic queue that will be sorted
     * @param cmp the comparator that will compare the data values with eachother
     */
    public static <E> void quickSort(Queue<E> S, Comparator<E> cmp){
        int n = S.size();
        if(n < 2) return;
        // divide
        E pivot = S.first();                // using first as arbitrary
        
        Queue<E> L = new LinkedQueue<>();   
        Queue<E> K = new LinkedQueue<>();
        Queue<E> G = new LinkedQueue<>();
        
        while(!S.isEmpty()){                // divide original into L, K, G
            E element = S.dequeue();
            int c = cmp.compare(element, pivot);
            if (c < 0){
                L.enqueue(element);         // element is less than pivot
            }
            else if( c == 0){
                K.enqueue(element);         // element is equal to pivot
            }
            else{
                G.enqueue(element);         // element is greater than pivot
            }
        }
        
        quickSort(L, cmp);                  // sort elements less than pivot
        quickSort(G, cmp);                  // sort elements greater than pivot
        
        // concatenate results
        while(!L.isEmpty()){
            S.enqueue(L.dequeue());
        }
        while(!K.isEmpty()){
            S.enqueue(K.dequeue());
        }
        while(!G.isEmpty()){
            S.enqueue(G.dequeue());
        }
    }
    
    /**
     * A generic radixSort that has 2 keys
     * @param <E> keeps the sort generic
     * @param data the generic array that will be sorted
     * @param cmp1 the comparator that will compare the data values with eachother
     * @param cmp2 the comparator that will compare the data values with eachother
     */
    public static <E> void radixSort(E[] data, Comparator<E> cmp1, Comparator<E> cmp2){
        enhancedBubbleSort(data, cmp2);
        enhancedBubbleSort(data, cmp1);
    }
    
    /**
     * A generic radixSort that has 3 keys
     * @param <E> keeps the sort generic
     * @param data the generic array that will be sorted
     * @param cmp1 the comparator that will compare the data values with eachother
     * @param cmp2 the comparator that will compare the data values with eachother
     * @param cmp3 the comparator that will compare the data values with eachother
     */
    public static <E> void radixSort(E[] data, Comparator<E> cmp1, Comparator<E> cmp2, Comparator<E> cmp3){
        enhancedBubbleSort(data, cmp3);
        enhancedBubbleSort(data, cmp2);
        enhancedBubbleSort(data, cmp1);
    }
    
    /**
     * A generic radixSort that has 4 keys
     * @param <E> keeps the sort generic
     * @param data the generic array that will be sorted
     * @param cmp1 the comparator that will compare the data values with eachother
     * @param cmp2 the comparator that will compare the data values with eachother
     * @param cmp3 the comparator that will compare the data values with eachother
     * @param cmp4 the comparator that will compare the data values with eachother
     */
    public static <E> void radixSort(E[] data, Comparator<E> cmp1, Comparator<E> cmp2, Comparator<E> cmp3, Comparator<E> cmp4){
        enhancedBubbleSort(data, cmp4);
        enhancedBubbleSort(data, cmp3);
        enhancedBubbleSort(data, cmp2);
        enhancedBubbleSort(data, cmp1);
    }
    
    
}
