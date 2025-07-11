

/**
 *
 * @author August Preuss
 * @version January 16, 2025
 * 
 * A main class to test the Employee class.
 * 
 */
// ====================
// The Example 4 Client file
//====================
public class Client {
    public static void main(String[] args) {
        Employee boss = new Employee( 1, "Joe", 120000, 0.0 );
        System.out.println( boss.toString() );
        Employee worker = new Employee( 2, "Bob", 0, -9915.00 );
        System.out.println( worker );
        worker.setHourlyRate( -99.00 );
        System.out.println( worker );
        System.out.println( "boss = worker? " + boss.equals( worker ) );
    }   
}
