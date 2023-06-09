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
    public void testAddSingleToShoppingCart() //Tests adding a single product to the ShoppingCart
    {
        ShoppingCart shoppingCart = new ShoppingCart(); // making a shoppingcart object
        Product couch2 = new HouseholdProduct(HouseholdProduct.householdproducttype.FURNITURE, 200, 150, 400, 85,
                "Large Couch", 700, "a large sized couch"); //populates the product
        shoppingCart.addToShoppingcart(couch2); //adds it to the shoppingcart
        assertTrue(shoppingCart.getShoppingcart().containsKey(couch2)); //checks if the shoppingcart contains the couch2 product
        assertEquals(1, shoppingCart.getShoppingcart().size());  //checks the size of the shoppingcart if it is equal to 1 cause there is one class
    }

    @Test
    public void testAddMultipleToShoppingCart() //Tests adding a multiple products to the ShoppingCart
    {
        ShoppingCart shoppingCart = new ShoppingCart(); // making a shoppingcart object
        Product couch2 = new HouseholdProduct(HouseholdProduct.householdproducttype.FURNITURE, 200, 150, 400, 85,
                "Large Couch", 700, "a large sized couch"); //populates the product
        Product computer1 = new ElectronicProduct("MacBook 13", 1200, "slim and powerful notebook with LCD display",
                "Apple", "MacBook 13inch 256gb", 36);
        Product screwdriver = new HouseholdProduct(HouseholdProduct.householdproducttype.TOOLS, 2, 20, 2, 2,
                "Screwdriver", 15, "a standard yet reliable screwdriver");
        shoppingCart.addToShoppingcart(couch2); //adds it to the shoppingcart
        shoppingCart.addToShoppingcart(computer1); // adds it to the shoppingcart
        shoppingCart.addToShoppingcart(screwdriver); //adds it to the shoppingcart
        assertTrue(shoppingCart.getShoppingcart().containsKey(couch2)); //checks if the shoppingcart contains the couch2 product
        assertTrue(shoppingCart.getShoppingcart().containsKey(computer1)); //checks if the shoppingcart contains the computer1 product
        assertTrue(shoppingCart.getShoppingcart().containsKey(screwdriver)); //checks if the shoppingcart contains the screwdriver product
        assertEquals(3, shoppingCart.getShoppingcart().size());  //checks the size of the shoppingcart if it is equal to 1 cause there is one class
    }

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
