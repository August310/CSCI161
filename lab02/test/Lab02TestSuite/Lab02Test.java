/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab02TestSuite;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Alex Radermacher
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({Questions.Question3Test.class, Questions.Question5Test.class, Questions.Question1Test.class, Questions.Question2Test.class, Questions.Question4Test.class, Questions.Question6Test.class})
public class Lab02Test {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
