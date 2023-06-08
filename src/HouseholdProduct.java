/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kstor
 */
public class HouseholdProduct extends Product{
    
    private int width; // the width of the HouseholdProduct in cm
    private int height; //the height of the HouseholdProduct in cm
    private int length; //the length of the HouseholdProduct in cm
    private double weight; //the weight of the Household in kilograms
    private householdproducttype producttype; // an enum for the HouseholdProduct that classifys it more specifically, like Furtniture etc.
    
    public enum householdproducttype{ //the enum above, this contains all the types of products under the HouseholdProduct class
        FURNITURE,
        OUTDOOR,
        APPLIANCE,
        TOOLS
    }

    public HouseholdProduct(householdproducttype producttype,int width, int height, int length, double weight, String productname, double productprice, String productdescription) {
        super(productname, productprice, productdescription); //constructor for the HouseholdProduct class
        this.producttype = producttype;
        this.width = width;
        this.height = height;
        this.length = length;
        this.weight = weight;
    }

    public int getWidth() { //getter for width variable
        return width;
    }

    public void setWidth(int width) { //setter for width variable
        this.width = width;
    }

    public int getHeight() { // getter fot height variable
        return height;
    }

    public void setHeight(int height) { //setter for height variable
        this.height = height;
    }

    public int getLength() { // getter for length variable
        return length;
    }

    public void setLength(int length) { // setter for length variable
        this.length = length;
    }

    public double getWeight() { // getter for weight variable
        return weight;
    }

    public void setWeight(double weight) { // setter for weight variable
        this.weight = weight;
    }

    public householdproducttype getProducttype() { //getter for producttype enum
        return producttype;
    }

    public void setProducttype(householdproducttype producttype) { //setter for producttype enum
        this.producttype = producttype;
    }

    @Override
    public String toString() { //toString method for Household subclass so that its information can be easily displayed/printed out to the user
        return "Type of Household Product" + super.toString() + "Width In CM = " + width + "\n"+ "Height In CM = " + height + "\n"+ "Length In CM = " + length + "\n" +"Weight In KG = " + weight + "\n"+"Product Type = " + producttype;
    }
    
}
