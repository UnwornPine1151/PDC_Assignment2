
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

        //code to create a FileIO object and write the productlist to the file ProductList.txt
        FileIO fileio = new FileIO();
        fileio.writeProductListToFile(productlist.getProductList());

        //code to read from the ProductList.txt and use that to display the productlist to the console for the user to see
        System.out.println("Here is the list of Products that you can buy: ");
        fileio.readProductListFromFile();

        //code to create scanner that will be used to ask the user what products they would like to add to their shoppingcart
        Scanner scanner = new Scanner(System.in);

        //code to make the shoppingcart object that will be used to store the Products that the user wants to buy
        ShoppingCart shoppingcart = new ShoppingCart();

        //bunch of scanners and stuff that ask the user if they would like to add some stuff to the shoppingcart,
        //takes the user inputs and adds them to the shopping cart, has a button to exit this part of the program at any time.
        boolean close = false;

        while (close == false) {
            System.out.println("Here is the list of products");
            fileio.readProductListFromFile();
            System.out.println("From the product list above are there any products that you would like to buy?");
            System.out.println("Please respond with Yes or No, saying No will take you to review your shoppingcart");
            String answer = scanner.nextLine();
            if (answer.equalsIgnoreCase("Yes")) // opens up the next menu which gives the user the options to buy products
            {
                System.out.println("Please press 1 to buy Electronic Products");
                System.out.println("Please press 2 to buy Household Products");
                System.out.println("Please press 3 to buy Beverages");
                System.out.println("Please press 4 to buy Food");
                int catagory = scanner.nextInt();

                if (catagory == 1) // Electronic Product buy options
                {
                    System.out.println("If you would like to buy a Iphone 8 please respond with 1");
                    System.out.println("If you would like to buy an Iphone 10 please respond with 2");
                    System.out.println("If you would like to buy an Macbook 13 please respond with 3");
                    System.out.println("If you would like to buy a Macbook 16 pro please respond with 4");
                    System.out.println("at anytime u can exit the program by pressing 0");
                    int cat1 = scanner.nextInt();

                    if (cat1 == 1) {
                        shoppingcart.addToShoppingcart(phone1);
                        System.out.println("a Iphone 8 has been added to your shopping cart!");
                    } else if (cat1 == 2) {
                        shoppingcart.addToShoppingcart(phone2);
                        System.out.println("a Iphone 10 has been added to your shopping cart!");
                    } else if (cat1 == 3) {
                        shoppingcart.addToShoppingcart(computer1);
                        System.out.println("a Macbook 13 has been added to your shopping cart!");
                    } else if (cat1 == 4) {
                        shoppingcart.addToShoppingcart(computer2);
                        System.out.println("a Macbook 16 pro has been added to your shopping cart!");
                    } else if (cat1 == 0) {
                        System.out.println("You have exited the program, have a great day!");
                        close = true;
                    } else {
                        System.out.println("Invalid input please try again!");
                    }

                } else if (catagory == 2) // Household Product buy options
                {
                    System.out.println("If you would like to buy a Small Couch please respond with 1");
                    System.out.println("If you would like to buy a Large Couch please respond with a 2");
                    System.out.println("If you would like to buy a Outdoor Couch please respond with a 3");
                    System.out.println("If you would like to buy a Small Blender please respond with a 4");
                    System.out.println("If you would like to buy a Electric Toothbrush please respond with a 5");
                    System.out.println("If you would like to buy a Screwdriver please respond with a 6");
                    System.out.println("at anytime u can exit the program by pressing 0");
                    int cat2 = scanner.nextInt();

                    if (cat2 == 1) {
                        shoppingcart.addToShoppingcart(couch1);
                        System.out.println("a Small Couch has been added to your shoppingcart!");
                    } else if (cat2 == 2) {
                        shoppingcart.addToShoppingcart(couch2);
                        System.out.println("a Large Couch has been added to your shoppingcart!");
                    } else if (cat2 == 3) {
                        shoppingcart.addToShoppingcart(couch3);
                        System.out.println("a Outdoor Couch has been added to your shoppingcart!");
                    } else if (cat2 == 4) {
                        shoppingcart.addToShoppingcart(blender);
                        System.out.println("a Small Blender has been added to your shoppingcart!");
                    } else if (cat2 == 5) {
                        shoppingcart.addToShoppingcart(electrictoothbrush);
                        System.out.println("a Electric Toothbrush has been added to your shoppingcart!");
                    } else if (cat2 == 6) {
                        shoppingcart.addToShoppingcart(screwdriver);
                        System.out.println("a Screwdriver has been added to your shoppingcart!");
                    } else if (cat2 == 0) {
                        System.out.println("You have exited the program, have a great day!");
                        close = true;
                    } else {
                        System.out.println("Invalid input please try again!");
                    }

                } else if (catagory == 3) // Beverages buy options
                {
                    System.out.println("If you would like to buy a Monster please respond with a 1");
                    System.out.println("If you would like to buy a Red Bull please respond with a 2");
                    System.out.println("If you would like to buy a Powerade please respond with a 3");
                    System.out.println("If you would like to buy a CocaCola please respond with a 4");
                    System.out.println("If you would like to buy a Beer Please respond with a 5, you must be over the age of 18");
                    System.out.println("If you would like to buy a Wine Please respond with a 6, you must be over the age of 18");
                    System.out.println("If you would like to buy a Orange Juice please respond with a 7");
                    System.out.println("If you would like to buy a Apple Juice please respond with a 8");
                    System.out.println("at anytime u can exit the program by pressing 0");
                    int cat3 = scanner.nextInt();

                    if (cat3 == 1) {
                        shoppingcart.addToShoppingcart(energydrink1);
                        System.out.println("a Monster has been added to your shoppingcart!");
                    }

                    if (cat3 == 2) {
                        shoppingcart.addToShoppingcart(energydrink2);
                        System.out.println("a Red Bull has been added to your shoppingcart!");
                    }

                    if (cat3 == 3) {
                        shoppingcart.addToShoppingcart(sportsdrink);
                        System.out.println("a Powerade has been added to your shoppingcart!");
                    }

                    if (cat3 == 4) {
                        shoppingcart.addToShoppingcart(softdrink);
                        System.out.println("a CocaCola has been added to your shoppingcart!");
                    }

                    if (cat3 == 5) {
                        shoppingcart.addToShoppingcart(alcohol1);
                        System.out.println("a Beer has been added to your shoppingcart!");
                    }

                    if (cat3 == 6) {
                        shoppingcart.addToShoppingcart(alcohol2);
                        System.out.println("a Wine has been added to your shoppingcart!");
                    }

                    if (cat3 == 7) {
                        shoppingcart.addToShoppingcart(juice1);
                        System.out.println("a Orange Juice has been added to your shoppingcart!");
                    }

                    if (cat3 == 8) {
                        shoppingcart.addToShoppingcart(juice2);
                        System.out.println("a Apple Juice has been added to your shoppingcart!");
                    } else if (cat3 == 0) {
                        System.out.println("You have exited the program, have a great day!");
                        close = true;
                    } else {
                        System.out.println("Invalid input please try again!");
                    }

                } else if (catagory == 4) // Food buy options
                {
                    System.out.println("If you would like to buy a Cheeseburger please respond with 1");
                    System.out.println("If you would like to buy French Fries please respond with a 2");
                    System.out.println("If you would like to buy a Asian Salad please respond with a 3");
                    System.out.println("If you would like to buy a Morrocan Chicken Salad please respond with a 4");
                    System.out.println("at anytime u can exit the program by pressing 0");
                    int cat4 = scanner.nextInt();

                    if (cat4 == 1) {
                        shoppingcart.addToShoppingcart(fastfood1);
                        System.out.println("a Cheeseburger has been added to your shoppingcart!");
                    } else if (cat4 == 2) {
                        shoppingcart.addToShoppingcart(fastfood2);
                        System.out.println("French Fries have been added to your shoppingcart!");
                    } else if (cat4 == 3) {
                        shoppingcart.addToShoppingcart(salad1);
                        System.out.println("a Asian Salad has been added to your shoppingcart!");
                    } else if (cat4 == 4) {
                        shoppingcart.addToShoppingcart(salad2);
                        System.out.println("a Morrocan Chicken Salad has been added to your shoppingcart!");
                    } else if (cat4 == 0) {
                        System.out.println("You have exited the program, have a great day!");
                        close = true;
                    }
                } else if (catagory == 0) {
                    close = true;
                } else {
                    System.out.println("Invalid input please try again!");
                }
            } else if (answer.equalsIgnoreCase("No")) //closes program because the user does not want to buy anything
            {
                System.out.println("Thank you for shopping with us!");
                close = true;
            } else {
                System.out.println("Invalid Input! please enter Yes or No");
            }
        }

        //code to create printer object
        Printer printer = new Printer();

        //code to show the user their shoppingcart and total cost of their shoppingcart using the printer class
        System.out.println("The Content of your shoppingcart:");
        printer.printShoppingCart(shoppingcart.getShoppingcart());
        System.out.println();
        printer.printTotalCost(shoppingcart);

        //code to write the shoppingcart to the ShoppingCart.txt file which is found in the resources folder
        fileio.writeShoppingCartToFile(shoppingcart.getShoppingcart());

        //reading the shoppingcart from the ShoppingCart.txt file found under resources
        fileio.readShoppingCartFromFile();

        //collected customer info and store it into a UserInfo object
        System.out.println("What is your name?");
        String name = scanner.nextLine();

        System.out.println("What is your age?");
        int age = scanner.nextInt();

        System.out.println("What is your contact number?");
        int contactnumber = scanner.nextInt();
        scanner.nextLine();//had to add to fix a bug that was making contact email scanner not work

        System.out.println("What is your contact email?");
        String contactemail = scanner.nextLine();

        System.out.println("What is your delivery address");
        String deliveryaddress = scanner.nextLine();

        UserInfo customer = new UserInfo(name, age, contactnumber, contactemail, deliveryaddress);

        //check if the user is 18 and can buy alcoholic beverages
        if (customer.AgeVerification() == true) {
            System.out.println("user is over 18 and old enough to buy alcohol");
        } else if (customer.AgeVerification() == false) {
            System.out.println("user is NOT over 18 and not old enough to buy alcohol");
        }

        //displays the users info back to them to and asks user to confirm that the user information is correct. if it is correct it continues to payment, 
        //if the info is not correct it will ask for the information again and use setters to update the information
        printer.printUserInfo(customer);
        System.out.println("Is your information correct? yes or no");
        String info = scanner.nextLine();

        if (info.equalsIgnoreCase("yes")) {
            System.out.println("Thats good, we can now move on to payment");
            System.out.println();
        }

        if (info.equalsIgnoreCase("no")) {
            System.out.println("What is your name?");
            String name1 = scanner.nextLine();

            System.out.println("What is your age?");
            int age1 = scanner.nextInt();

            System.out.println("What is your contact number?");
            int contactnumber1 = scanner.nextInt();
            scanner.nextLine();

            System.out.println("What is your contact email?");
            String contactemail1 = scanner.nextLine();

            System.out.println("What is your delivery address");
            String deliveryaddress1 = scanner.nextLine();

            customer.setName(name1);
            customer.setAge(age1);
            customer.setContactnumber(contactnumber1);
            customer.setContactemail(contactemail1);
            customer.setDeliveryaddress(deliveryaddress1);
        }

        //asks for users card for payment, then creates a payment object that stores the users card 
        printer.printTotalCost(shoppingcart);
        System.out.println("Please enter your card information to complete payment");
        int card = scanner.nextInt();
        Payment customer1 = new Payment(card);

        //thanks user for purchase
        System.out.println("Thank you for your purchase, have a great day");
        
        
    }
}
