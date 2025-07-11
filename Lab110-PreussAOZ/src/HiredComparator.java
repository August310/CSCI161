/**
 *
 * @author August Preuss
 * @version 5/6/2025
 * Compares two hired years between two employees
 * 
 */
public class HiredComparator implements Comparator<Employee>{
    /**
     * compares the hired date of two employees
     * @param e1, the 1st employee
     * @param e2, the 2nd employee
     * @return an int determining if the employees hired dates are equal, or different
     */
    @Override
    public int compare(Employee e1, Employee e2){
        return Integer.compare(e1.getHired(), e2.getHired());
    }
}
