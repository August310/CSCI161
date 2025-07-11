/**
 *
 * @author August Preuss
 * @version 4/30/2025
 * Compares two dept number values
 * 
 */
public class DeptComparator implements Comparator<Employee>{
    /**
     * compares the dept of two employees
     * @param e1, the 1st employee
     * @param e2, the 2nd employee
     * @return an int determining if the employees dept are equal, or different
     */
    @Override
    public int compare(Employee e1, Employee e2){
        return Integer.compare(e1.getDept(), e2.getDept());
    }
}
