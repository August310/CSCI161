/**
 *
 * @author August Preuss
 * @version 5/6/2025
 * Compares the name of two employees
 * 
 */
public class NameComparator implements Comparator<Employee>{
    /**
     * compares the Name of two employees
     * @param e1, the 1st employee
     * @param e2, the 2nd employee
     * @return an int determining if the employees names are equal, or different
     */
    @Override
    public int compare(Employee e1, Employee e2){
        return Integer.compare(e1.getName().length(), e2.getName().length());
    }
}
