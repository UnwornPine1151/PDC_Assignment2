/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kstor
 */
public class BeverageProduct extends Product{
    
    private int sizeinmillilitres; //BeverageProduct classes private variables
    private int energyinkj;
    private beveragetype beveragetype;

    public BeverageProduct(int sizeinmillilitres, int energyinkj, beveragetype beveragetype, String productname, double productprice, String productdescription) {
        super(productname, productprice, productdescription); // constructor for BeverageProduct class that has all of its variables
        this.sizeinmillilitres = sizeinmillilitres; // size of the drink im mls
        this.energyinkj = energyinkj; // energy of the drink in kj
        this.beveragetype = beveragetype; // type of the beverage
    }
     
    public enum beveragetype{ // enum for the type of beverage
        ENERGY,
        SPORTS,
        SOFTDRINKS,
        ALCOHOLIC,
        JUICES,
    }

    public int getSizeinmillilitres() { //getter for sizeinmillilitres variable
        return sizeinmillilitres;
    }

    public void setSizeinmillilitres(int sizeinmillilitres) { // setter for sizeinmillilitres variable
        this.sizeinmillilitres = sizeinmillilitres;
    }

    public int getEnergyinkj() { // getter for energyinkj
        return energyinkj;
    }

    public void setEnergyinkj(int energyinkj) { //setter for energyinkj
        this.energyinkj = energyinkj;
    }

    public beveragetype getBeveragetype() { // getter for beveragetype 
        return beveragetype;
    }

    public void setBeveragetype(beveragetype beveragetype) { // setter for beveragetype
        this.beveragetype = beveragetype;
    }

    @Override
    public String toString() { // toString method for the BeverageProduct class, displays all of its variables
        return "BeverageProduct{" + super.toString()+ "sizeinmillilitres = " + sizeinmillilitres + ", energyinkj = " + energyinkj + ", beveragetype = " + beveragetype + '}';
    }
    
    
}
