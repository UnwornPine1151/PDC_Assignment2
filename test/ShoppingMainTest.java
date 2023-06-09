/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author kstor
 */
public class ShoppingMainTest {

    public ShoppingMainTest() {
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
     * Test of main method, of class ShoppingMain.
     */
    @Test
    public void testTotalPriceEmptyShoppingCart() { //test case for the totalPrice() from the ShoppingCart Class, it is important so that the user is not overcharged or undercharged
        //code to test code with empty shoppingcart
        ShoppingCart shoppingCart1 = new ShoppingCart();
        double result1 = shoppingCart1.totalPrice();
        double expected1 = 0;
        assertEquals(expected1, result1, 0.01);

    }

    @Test
    public void testTotalPriceSoloShoppingCart() { //test case for the totalPrice() from the ShoppingCart Class, it is important so that the user is not overcharged or undercharged
        //codes to test ShoppingCart with one product
        ShoppingCart shoppingCart2 = new ShoppingCart();
        Product computer1 = new ElectronicProduct("MacBook 13", 1200, "slim and powerful notebook with LCD display",
                "Apple", "MacBook 13inch 256gb", 36);
        shoppingCart2.addToShoppingcart(computer1);
        double result2 = shoppingCart2.totalPrice();
        double expected2 = 1200;
        assertEquals(expected2, result2, 0.01);
    }

    @Test
    public void testTotalPriceMultipleShoppingCart() { //test case for the totalPrice() from the ShoppingCart Class, it is important so that the user is not overcharged or undercharged
        //code to test ShoppingCart with multiple products:
        ShoppingCart shoppingCart3 = new ShoppingCart();
        Product phone1 = new ElectronicProduct("Iphone 8", 600, "Mobile phone with touchscreen display",
                "Apple", "Iphone 8", 24);
        Product phone2 = new ElectronicProduct("Iphone 10", 900, "Latest Apple Mobile phone with touchscreen display",
                "Apple", "Iphone 10", 24);
        shoppingCart3.addToShoppingcart(phone1);
        shoppingCart3.addToShoppingcart(phone2);
        double result3 = shoppingCart3.totalPrice();
        double expected3 = 1500;
        assertEquals(expected3, result3, 0.01);
    }

}
