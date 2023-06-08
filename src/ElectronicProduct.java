/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kstor
 */
public class ElectronicProduct extends Product{
    
    private String brand; //brand of the ElectronicProduct
    private String model; //model of the ElectronicProduct
    private int warranty; //warranty period of the Electronic product measured in months

    public ElectronicProduct(String productname, double productprice, String productdescription, String brand, String model, int warranty) {
        super(productname, productprice, productdescription); // constructor for ElectronicProduct class
        this.brand = brand;
        this.model = model;
        this.warranty = warranty;
    }
    
    public String getBrand() { //getter for brand variable
        return brand;
    }

    public void setBrand(String brand) { //setter for brand variable
        this.brand = brand;
    }

    public String getModel() { //getter for model variable
        return model;
    }

    public void setModel(String model) { //setter for model variable
        this.model = model;
    }

    public int getWarranty() { //getter for warranty variable
        return warranty;
    }

    public void setWarranty(int warranty) { // setter for warranty variable
        this.warranty = warranty;
    }

    @Override
    public String toString() { // this is a toString method for ElectronicProduct that prints out all of the ElectronicProducts variables, including the variables it gets from the Product class
        return "Type of ElectronicProduct: "+ super.toString() + "Brand = " + brand + "\nModel = " + model + " \nWarranty = " + warranty;
    }
    
    
    
}
