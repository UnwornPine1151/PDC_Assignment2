
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author kstor
 */
public class ProductList implements Iterable<Product> {

    private List<Product> productlist;

    public ProductList() { //constructor that initializes the arraylist
        productlist = new ArrayList<Product>();
    }

    public void addProduct(Product product) //add product method
    {
        productlist.add(product);
    }

    public void removeProduct(Product product) // method to remove a product
    {
        productlist.remove(product);
    }

    public List<Product> getProductList() { //getter for ProductList
        return productlist;
    }

    @Override
    public Iterator<Product> iterator() {
        return productlist.iterator();
    }

}
