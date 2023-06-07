
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kstor
 */
public class FileIO {
    
     public void readProductListFromFile() //reads the text that is on the ProductList.txt file and prints it to the console
    {
         try {
             BufferedReader br = new BufferedReader(new FileReader("ProductList.txt")); //file is in the resources folder of the project
             String line;
             while((line = br.readLine())!=null)
             {
                 System.out.println(line);
             }
             br.close();
             System.out.println("File has been read and printed using a file reader");
         } catch (FileNotFoundException ex) {
             System.out.println("error");
         } catch (IOException ex) {
             System.out.println("error");
         }
    }
     
    public void writeProductListToFile(List<Product> productlist) //takes a productlist as input and then prints it to the ProductList.txt file
    {
         try {
             BufferedWriter bw = new BufferedWriter(new FileWriter("ProductList.txt")); //file is in the resources folder of the project
             
             for(Product product: productlist)
             {
                 bw.write(product.toString());
                 bw.newLine();
             }
             
             bw.close();
             System.out.println("The ProductList has been written to the file ProductList.txt, it can be found under resources");
         } catch (IOException ex) {
             System.out.println("error");
         }
    }
     
     public void writeShoppingCartToFile(HashMap<Product,Integer> shoppingcart) // takes a shoppingcart as input and writes it to the ShoppingCart.txt file
    {
         try {
             BufferedWriter bw2 = new BufferedWriter(new FileWriter("ShoppingCart.txt"));
             
             for(Map.Entry<Product,Integer> entry: shoppingcart.entrySet()) // the code from here to ∨
             {
                 bw2.write(entry.getKey().toString()+ "," +entry.getValue());//here ^ i had chatGPT help and assist to develop because i was getting confused with the hashmap lines 66-68
                 bw2.newLine();                                                      
             }
             bw2.close();
             System.out.println("The ShoppingCart has been written to the file ShoppingCart.txt, it can be found under resources");
             
         } catch (IOException ex) {
            System.out.println("Error");
         }
    }
     
    public void readShoppingCartFromFile() // method that reads and prints out the text from the file ShoppingCart.txt which is found in the resources folder
    {
         try {
             BufferedReader br2 = new BufferedReader(new FileReader("ShoppingCart.txt"));
             String line2;
             while((line2 = br2.readLine())!=null)
             {
                 System.out.println(line2);
             }
             System.out.println("The ShoppingCart has been printed from the file");
         } catch (FileNotFoundException ex) {
             System.out.println("Error");
         } catch (IOException ex) {
             System.out.println("Error");
         }
    }
}
