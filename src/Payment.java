/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kstor
 */
public class Payment {

    private String cardnumber; //private variable for cardnumber
    private String cardexpiry;
    private String cardholderfullname;
    private String cvc;

    public Payment()
    {
        
    }
    public Payment(String cardnumber, String cardexpiry, String cardholderfullname, String cvc) { // construcor that takes the cards details
        this.cardnumber = cardnumber;
        this.cardexpiry = cardexpiry;
        this.cardholderfullname = cardholderfullname;
        this.cvc = cvc;
    }

    public String getCardexpiry() { // getter for card expiry
        return cardexpiry;
    }
    
    public boolean setCardExpiry(String expiry) { // setter for card expiry makes sure it follows the MM/YY format
        if (expiry.matches("\\d{2}/\\d{2}")) {
            cardexpiry = expiry;
            return true; // Validation successful, used to make the gui accept that input
        } else {
            return false; // Invalid format, used to make the gui display an error message in the GUi class if false is returned
        }
    }

    public String getCardholderfullname() { // getter for cardholder fullname
        return cardholderfullname;
    }

    public void setCardholderfullname(String cardholderfullname) { // setter for cardholder fullname
        this.cardholderfullname = cardholderfullname;
    }

    public String getCvc() { // getter for cvc
        return cvc;
    }

    public boolean setCvc(String cvc) { // setter for cvc
       if (cvc.matches("\\d{3}")) {
            this.cvc = cvc;
            return true; // Validation successful!, cvc has 3 digits
        } else {
            return false; // Validation unsuccessful, card does not contain 3 digits or has letters or other values other than digits
        }
    }
    

    public String getCardnumber() { //getter for cardnumber
        return cardnumber;
    }

    public boolean setCardnumber(String cardnumber) { //setter for cardnumber
        if (cardnumber.matches("\\d{16}")) {
            this.cardnumber = cardnumber;
            return true; // Validation successful!, card does have 16 digits
        } else {
            return false; // Validation unsuccessful, card does not contain 16 digits or has letters or other values other than digits
        }
    }

}
