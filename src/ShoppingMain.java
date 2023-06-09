
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
        
        java.awt.EventQueue.invokeLater(new Runnable() { //code to start the first GUI which u can select products to add to the shoppingCart, the second GUI loads when you click the checkout button in the first GUI
            public void run() {
                new AddingToShoppingCart().setVisible(true);
            }
        });
       
        
        
    }    
}
