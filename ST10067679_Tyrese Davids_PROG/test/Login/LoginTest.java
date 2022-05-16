/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Britney
 */
public class LoginTest {
    
    public LoginTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of checkUserName method, of class Login.
     */
    @Test
    public void testCheckUserName() {
        System.out.println("checkUserName");
        String UserName = "kyl_1";
        boolean expResult = true;
        boolean result = Login.checkUserName(UserName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       ;
    }

    /**
     * Test of checkPasswordComplexity method, of class Login.
     */
    @Test
    public void testCheckPasswordComplexity() {
        System.out.println("checkPasswordComplexity");
        String Password = "Cha&&sec@ke99";
        boolean expResult = false;
        boolean result = Login.checkPasswordComplexity(Password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of registerUser method, of class Login.
     */
    @Test
    public void testRegisterUser() {
        System.out.println("registerUser");
        String UserName = "kyl_1";
        String Password = "Cha&&sec@ke99";
        String expResult = "The password does not meet the complexity requirements";
        String result = Login.registerUser(UserName, Password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of loginUser method, of class Login.
     */
    @Test
    public void testLoginUser() {
        System.out.println("loginUser");
        String UserName = "kyl_1";
        String Password = "Cha&&sec@ke99";
        boolean expResult = true;
        boolean result = Login.loginUser(UserName, Password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of returnLoginStatus method, of class Login.
     */
    @Test
    public void testReturnLoginStatus() {
        System.out.println("returnLoginStatus");
        String UserName = "kyl_1";
        String Password = "Cha&&sec@ke99";
        String loginUserName = "kyl_1";
        String loginPassword = "Cha&&sec@ke99";
        boolean expResult = true;
        boolean result = Login.returnLoginStatus(UserName, Password, loginUserName, loginPassword);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of main method, of class Login.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Login.main(args);
        // TODO review the generated test code and remove the default call to fail.
      
    }
    
}
