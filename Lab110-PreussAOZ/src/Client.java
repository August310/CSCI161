/**
 *
 * @author August Preuss
 * @version 5/6/2025
 * Sorts given amount of randomized employees and outputs the info onto a table
 * 
 */
public class Client {

    private static final long TIMEOUT = 60000;
    
    public static void main(String[] args) {
        
        //a series of flag variables to check if a sort can work properly
        boolean creationFailed = false;
        boolean skipMerge = false;
        boolean skipQuick = false;
        boolean skipBubble = false;
        boolean skipEnhancedBubble = false;
        boolean skipInsertion = false;
        boolean skipSelection = false;
        boolean skipRadix = false;
        
        //printing out the header section of the table
        System.out.println("+-------------------------------------------------------------------------------------------------------------------+");
        System.out.println("|                                             Run time in milliseconds                                              |");
        System.out.println("+---------------+------------+--------+------------+------------+------------+------------+------------+------------+");
        
        //format all of the headers to correctly be centered in the table
        System.out.printf("|%15s|%12s|%8s|%12s|%12s|%12s|%12s|%12s|%12s|\n", 
                          center("N", 15), center("create", 12), center("copy", 8), center("bubble", 10),
                          center("eBubble", 10), center("selection", 12), center("merge", 8), center("radix", 8),
                          center("quick", 8), center("insertion", 12));
        System.out.println("+---------------+------------+--------+------------+------------+------------+------------+------------+------------+");
        
    //for loop that goes from multiples of 10 starting at 1000 and ending at 1000000000    
    for(long i = 1000; i <= 1000000000; i *= 10){
        
        //tracks when we start making the Employee objects
        long startCreate = System.currentTimeMillis();
        Employee[] employees = null;
        long creationTime = 0;
        
        try{
        employees = new Employee[(int)i];
        
        //makes a random employee until we hit i which will be 1000 or more
        for(int j = 0; j < i; j++){
           
            employees[j] = new Employee();
            
        }
        //gets the time it takes to make a certain amount of Employees
        creationTime = System.currentTimeMillis() - startCreate;
        
        }
        //catches an error if we have run out of memory space
        catch(OutOfMemoryError e){
            creationFailed = true;
            employees = null;
            System.gc();
           }
        
        //this if statement occurs if we got the OutOfMemoryError and it adds outofmemory to that given row in the table
        if(creationFailed){
            System.out.printf("|%15s|%12s|%8s|%12s|%12s|%12s|%12s|%12s|%12s|\n", 
                    String.format("%,15d", i),
                    "OutOfMemory",
                    "n/a",
                    padLeft("OutOfMemory", 10),
                    padLeft("OutOfMemory", 10),
                    padLeft("OutOfMemory", 12),
                    padLeft("OutOfMemory", 8),
                    padLeft("OutOfMemory", 8),
                    padLeft("OutOfMemory", 8),
                    padLeft("OutOfMemory", 12) 
            );
            
            continue;
            
        }
        
        //these O(n^2) sorts take extremely long after 10,000 so we set these values to timeout
        if (i > 10000){
        skipBubble = true;
        skipEnhancedBubble = true;
        skipInsertion = true;
        skipSelection = true;
        }
        
        
       
        //every sort will follow this process so I will just explain this one
        
        //default String is timeout
        String mergeTime = "timeout";
        
        //checks if our flag variable is listed as true, if it is then we don't do the sort block
        if(!skipMerge){
        try{
            //copy over the array of random employees into a new Employee array to do the sort
            Employee[] mergeSortName = copyArray(employees);
            
            //we get the start time to do the sort
            long startMerge = System.currentTimeMillis();
            
            //now we do the merge sort on the array of Employees, we use the NameComparator since we are sorting by name
            Sort.mergeSort(mergeSortName, new NameComparator());
            
            //the elapsed time is the system time - the time it was at when we started the sort
            long elapsed = System.currentTimeMillis() - startMerge;
            
            //if the elapsed time is greater then our final variable which is 60,000 then we will timeout the sort
            //we also set skipMerge to true since if it timedOut with this amount of employees it will timeout again with a new larger array of employees
            if(elapsed > TIMEOUT){
                skipMerge = true;
                mergeTime = "timeout";
            }
            //if we don't timeout then we get the amount of time it took to conduct the sort and use it later in our table
            else{
                mergeTime = String.valueOf(elapsed);
            }
            //simple garbage collection to clear up memory
            mergeSortName = null;
            System.gc();
        }
        //also checks for an OutOfMemoryError and skips merge in the future if we get this error
        catch(OutOfMemoryError e){
            skipMerge = true;
            mergeTime = "OutOfMemory";
        }
        
        }
        
        String quickTime = "timeout";
        
        if(!skipQuick){
        try{
            //only difference in code is we copy the array of Employees into a queue so the quick sort can utilize the data
            Queue<Employee> quickSortDept = arrayToQueue(copyArray(employees));
            long startQuick = System.currentTimeMillis();
            Sort.quickSort(quickSortDept, new DeptComparator());
            long elapsed = System.currentTimeMillis() - startQuick;
            if(elapsed > TIMEOUT){
                skipQuick = true;
                quickTime = "timeout";
            }
            else{
                quickTime = String.valueOf(elapsed);
            }
            quickSortDept = null;
            System.gc();
        }
        catch(OutOfMemoryError e){
            skipQuick = true;
            quickTime = "timeout";
        }
        
        }
        
        String bubbleTime = "timeout";
        
        if(!skipBubble){
        try{
            Employee[] bubbleSortId = copyArray(employees);
            long startBubble = System.currentTimeMillis();
            Sort.bubbleSort(bubbleSortId, new IdComparator());
            long elapsed = System.currentTimeMillis() - startBubble;
            if(elapsed > TIMEOUT){
                skipBubble = true;
                bubbleTime = "timeout";
            }
            else{
                bubbleTime = String.valueOf(elapsed);
            }
            bubbleSortId = null;
            System.gc();
        }
        catch(OutOfMemoryError e){
            skipBubble = true;
            bubbleTime = "OutOfMemory";
        }
        
        }
        
        String enhancedBubbleTime = "timeout";
        
        if(!skipEnhancedBubble){
        try{
            Employee[] enhancedBubbleSortHired = copyArray(employees);
            long startEnhanced = System.currentTimeMillis();
            Sort.enhancedBubbleSort(enhancedBubbleSortHired, new HiredComparator());
            long elapsed = System.currentTimeMillis() - startEnhanced;
            if(elapsed > TIMEOUT){
                skipEnhancedBubble = true;
                enhancedBubbleTime = "timeout";
            }
            else{
                enhancedBubbleTime = String.valueOf(elapsed);
            }
            enhancedBubbleSortHired = null;
            System.gc();
        }
        catch(OutOfMemoryError e){
            skipEnhancedBubble = true;
            enhancedBubbleTime = "OutOfMemory";
        }
      
        }
        
        String insertionTime = "timeout";
        
        if(!skipInsertion){
        try{
            Employee[] insertionSortName = copyArray(employees);
            long startInsertion = System.currentTimeMillis();
            Sort.insertionSort(insertionSortName, new NameComparator());
            long elapsed = System.currentTimeMillis() - startInsertion;
            if(elapsed > TIMEOUT){
                skipInsertion = true;
                insertionTime = "timeout";
            }
            else{
                insertionTime = String.valueOf(elapsed);
            }
            
            insertionSortName = null;
            System.gc();
        }
        catch(OutOfMemoryError e){
            skipInsertion = true;
            insertionTime = "OutOfMemory";
        }
        
        }
        
        String selectionTime = "timeout";
        
        if(!skipSelection){
        try{
            Employee[] selectionSortId = copyArray(employees);
            long startSelection = System.currentTimeMillis();
            Sort.selectionSort(selectionSortId, new IdComparator());
            long elapsed = System.currentTimeMillis() - startSelection;
            if(elapsed > TIMEOUT){
                skipSelection = true;
                selectionTime = "timeout";
            }
            else{
                selectionTime = String.valueOf(elapsed);
            }
            selectionSortId = null;
            System.gc();
        }
        catch(OutOfMemoryError e){
            skipSelection = true;
            selectionTime = "OutOfMemory";
        }
        
        }
        
        String radixTime = "timeout";
        
        if(!skipRadix){
        try{
            Employee[] enhancedBubbleSortDptHiredName = copyArray(employees);
            long startRadix = System.currentTimeMillis();
            Sort.radixSort(enhancedBubbleSortDptHiredName, new DeptComparator(), new HiredComparator(), new NameComparator());
            long elapsed = System.currentTimeMillis() - startRadix;
            if(elapsed > TIMEOUT){
                skipRadix = true;
                radixTime = "timeout";
            }
            else{
                radixTime = String.valueOf(elapsed);
            }
            enhancedBubbleSortDptHiredName = null;
            System.gc();
        }
        catch(OutOfMemoryError e){
            skipRadix = true;
            radixTime = "OutOfMemory";
        }
        
        }
        
        //we format a new row with all of the times that it took to do each sort for a given amount of Employees
        //Pad left adds space to the left side of the text
        System.out.printf("|%15s|%12s|%8s|%12s|%12s|%12s|%12s|%12s|%12s|\n",
                String.format("%,15d", i),
                creationTime,
                padLeft("0", 8),
                padLeft(bubbleTime, 12),
                padLeft(enhancedBubbleTime, 12),
                padLeft(selectionTime, 12),
                padLeft(mergeTime, 12),
                padLeft(radixTime, 12),
                padLeft(quickTime, 12),
                padLeft(insertionTime, 12)
        );
        
    }
    //our closing line to end the entire table
     System.out.println("+---------------+------------+--------+------------+------------+------------+------------+------------+------------+");
    
    }
    
    /**
     * A method to copy an array 
     * @param original is the initial Employee array we want to copy
     * @return another Employee array that is copied from the original one
     */
    private static Employee[] copyArray(Employee[] original){
        Employee[] copy = new Employee[original.length];
        for(int i = 0; i < original.length; i++){
            copy[i] = original[i];
        }
        
        return copy;
    }
    
    /**
     * turns all array data to a Queue
     * @param <E>, works for any values
     * @param array, enter an array as a parameter and it will be turned into a queue
     * @return a queue form of the initial array
     */
    private static <E> Queue<E> arrayToQueue(E[] array){
        Queue<E> queue = new LinkedQueue<>();
        for(E e : array) {
            queue.enqueue(e);
        }
        return queue;
    }
    
    /**
     * centers a given string
     * @param text, the text you want centered
     * @param width, how wide the area in your table is
     * @return a centered version of the text
     */
    private static String center(String text, int width){
        if(text.length() >= width) return text;
        int left = (width - text.length()) / 2;
        int right = width - text.length() - left;
        return " ".repeat(left) + text + " ".repeat(right);
    }
    
    /**
     * pads a string to the left
     * @param text, the text you want padded
     * @param width, how wide the area in your table is
     * @return a padded version of the text
     */
    private static String padLeft(String text, int width){
        if(text.length() >= width) return text;
        return " ".repeat(width - text.length()) + text;
    }
    

}
