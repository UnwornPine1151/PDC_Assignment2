/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kstor
 */
public class FoodProduct extends Product{
    
    private double calories; //the amount of calories in the FoodProduct
    private int sizeingrams; //the size of the FoodProduct measured in grams
    private foodtype foodtype; //the type of food of the FoodProduct
    
    public enum foodtype{
        FASTFOOD,
        HEALTHY,
        SNACKS
    }

    public FoodProduct(double calories, int sizeingrams,foodtype foodtype, String productname, double productprice, String productdescription) {
        super(productname, productprice, productdescription);
        this.calories = calories;
        this.sizeingrams = sizeingrams;
        this.foodtype = foodtype;
    }

    public double getCalories() { // getter for the calories variable
        return calories;
    }

    public void setCalories(double calories) {// setter for the calories variable
        this.calories = calories;
    }

    public int getSizeingrams() { // getter for the sizeingrams variable
        return sizeingrams;
    }

    public void setSizeingrams(int sizeingrams) { // setter for the sizeingrams
        this.sizeingrams = sizeingrams;
    }

    public foodtype getFoodtype() { // getter for the foodtype enum variable
        return foodtype;
    }

    public void setFoodtype(foodtype foodtype) { // setter for the food type enum variable
        this.foodtype = foodtype;
    }

    @Override
    public String toString() { // a toString method that displays all of the variables for FoodProduct and the variables it gets from Product
        return "FoodProduct{"+ super.toString() + "calories = " + calories + ", sizeingrams = " + sizeingrams + ", foodtype = " + foodtype + '}';
    }

    
    
    
    
}
