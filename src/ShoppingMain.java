
import java.util.List;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author kstor
 */
public class ShoppingMain {

    public static void main(String[] args) {
        //code to populate the ElectronicProducts
        Product phone1 = new ElectronicProduct("Iphone 8", 600, "Mobile phone with touchscreen display",
                 "Apple", "Iphone 8", 24);
        Product phone2 = new ElectronicProduct("Iphone 10", 900, "Latest Apple Mobile phone with touchscreen display",
                 "Apple", "Iphone 10", 24);
        Product computer1 = new ElectronicProduct("MacBook 13", 1200, "slim and powerful notebook with LCD display",
                 "Apple", "MacBook 13inch 256gb", 36);
        Product computer2 = new ElectronicProduct("MacBook 16 pro", 1200, "powerful 16 inch notebook with LCD display",
                 "Apple", "MacBook pro 16inch 512gb", 36);

        //code to populate the HouseholdProducts
        Product couch1 = new HouseholdProduct(HouseholdProduct.householdproducttype.FURNITURE, 100, 100, 200, 40,
                "Small Couch", 400, "a small sized couch");
        Product couch2 = new HouseholdProduct(HouseholdProduct.householdproducttype.FURNITURE, 200, 150, 400, 85,
                "Large Couch", 700, "a large sized couch");
        Product couch3 = new HouseholdProduct(HouseholdProduct.householdproducttype.OUTDOOR, 100, 100, 180, 30,
                "Outdoor Couch", 600, "a small sized waterproof outdoor couch");
        Product blender = new HouseholdProduct(HouseholdProduct.householdproducttype.APPLIANCE, 10, 30, 10, 2,
                "Small Blender", 100, "a small sized blender, perfect for smoothies");
        Product electrictoothbrush = new HouseholdProduct(HouseholdProduct.householdproducttype.APPLIANCE, 2, 15, 2, 1,
                "Electric Toothbrush", 40, "an electric toothbrush which helps keep your teeth shining");
        Product screwdriver = new HouseholdProduct(HouseholdProduct.householdproducttype.TOOLS, 2, 20, 2, 2,
                "Screwdriver", 15, "a standard yet reliable screwdriver");

        //code to populate the BeverageProducts
        Product energydrink1 = new BeverageProduct(500, 2000, BeverageProduct.beveragetype.ENERGY, "Monster",
                 4, "Monster energy refreshing fruity energy drink");
        Product energydrink2 = new BeverageProduct(250, 1200, BeverageProduct.beveragetype.ENERGY, "Red Bull",
                 3, "Red Bull gives you wings");
        Product sportsdrink = new BeverageProduct(750, 1000, BeverageProduct.beveragetype.SPORTS, "Powerade",
                 4.50, "Replaces essential electrolytes lost during exercise");
        Product softdrink = new BeverageProduct(330, 1100, BeverageProduct.beveragetype.SOFTDRINKS, "CocaCola",
                 2.50, "CocaCola worlds most successfull soft drink");
        Product alcohol1 = new BeverageProduct(330, 500, BeverageProduct.beveragetype.ALCOHOLIC, "Beer",
                 3.50, "refreshing 5% alcohol beer with a refreshing taste");
        Product alcohol2 = new BeverageProduct(750, 1200, BeverageProduct.beveragetype.ALCOHOLIC, "Red Wine",
                 17, "12% alcohol red wine made in new zealand");
        Product juice1 = new BeverageProduct(400, 800, BeverageProduct.beveragetype.JUICES, "Orange Juice",
                 4, "refreshing freshly squeezed orange juice");
        Product juice2 = new BeverageProduct(400, 850, BeverageProduct.beveragetype.JUICES, "Apple Juice",
                 4.50, "refreshing freshly squeezed apple juice");

        //code to populate the FoodProducts
        Product fastfood1 = new FoodProduct(500, 150, FoodProduct.foodtype.FASTFOOD, "Cheeseburger", 6,
                 "Cheeseburger with american cheese, dill pickles and a brioche bun");
        Product fastfood2 = new FoodProduct(600, 200, FoodProduct.foodtype.FASTFOOD, "French Fries", 5.50,
                 "French Fries with a dash of sea salt");
        Product salad1 = new FoodProduct(200, 150, FoodProduct.foodtype.FASTFOOD, "Asian Salad", 10,
                 "salad with a spicy and tangy asian dressing");
        Product salad2 = new FoodProduct(300, 250, FoodProduct.foodtype.FASTFOOD, "Morrocan Chicken Salad", 13.50,
                 "Morrocan Chickan salad with, cucumber, cherry tomatoes and a refreshing dressing");

        //code that creates a ProductList object which we will then add the products above to
        ProductList productlist = new ProductList();

        //code to add ElectronicProducts to the productlist object that i created above
        productlist.addProduct(phone1);
        productlist.addProduct(phone2);
        productlist.addProduct(computer1);
        productlist.addProduct(computer2);

        //code to add HouseholdProducts to the productlist object
        productlist.addProduct(couch1);
        productlist.addProduct(couch2);
        productlist.addProduct(couch3);
        productlist.addProduct(blender);
        productlist.addProduct(electrictoothbrush);
        productlist.addProduct(screwdriver);

        //code to add BeverageProducts to productlist object
        productlist.addProduct(energydrink1);
        productlist.addProduct(energydrink2);
        productlist.addProduct(sportsdrink);
        productlist.addProduct(softdrink);
        productlist.addProduct(alcohol1);
        productlist.addProduct(alcohol2);
        productlist.addProduct(juice1);
        productlist.addProduct(juice2);

        //code to add FoodProducts to productlist object
        productlist.addProduct(fastfood1);
        productlist.addProduct(fastfood2);
        productlist.addProduct(salad1);
        productlist.addProduct(salad2);

       

    }    
}
