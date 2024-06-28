/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package registration.and.login.feature;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author RC_Student_lab
 */
public class RegistrationAndLoginFeatureTest {
    
    public RegistrationAndLoginFeatureTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of main method.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        RegistrationAndLoginFeature.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isValidUsername method.
     */
    @Test
    public void testIsValidUsername() {
        System.out.println("isValidUsername");
        String username = "";
        boolean expResult = false;
        boolean result = RegistrationAndLoginFeature.isValidUsername(username);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isValidPassword method.
     */
    @Test
    public void testIsValidPassword() {
        System.out.println("isValidPassword");
        String password = "";
        boolean expResult = false;
        boolean result = RegistrationAndLoginFeature.isValidPassword(password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of login method.
     */
    @Test
    public void testLogin() {
        System.out.println("login");
        boolean expResult = false;
        boolean result = RegistrationAndLoginFeature.login();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
