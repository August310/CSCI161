/**
 *
 * @author August Preuss
 * @version 5/6/2025
 * Compares the id between two employee objects
 * 
 */
public class IdComparator implements Comparator<Employee> {
    /**
     * compares the id of two employees
     * @param e1, the 1st employee
     * @param e2, the 2nd employee
     * @return an int determining if the employees ids are equal, or different
     */
    @Override
    public int compare(Employee e1, Employee e2){
        return Integer.compare(e1.getId(), e2.getId());
    }
}
