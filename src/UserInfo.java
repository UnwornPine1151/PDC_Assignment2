/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kstor
 */
public class UserInfo {
    private String name;
    private int age;
    private String contactnumber;
    private String contactemail;
    private String deliveryaddress;
    

    public UserInfo()
    {
        
    }
    public UserInfo(String name, int age, String contactnumber, String contactemail,String deliveryaddress) {
        this.name = name;
        this.age = age;
        this.contactnumber = contactnumber;
        this.contactemail = contactemail;
        this.deliveryaddress = deliveryaddress;
    }

    public String getName() { // getter for name
        return name;
    }

    public void setName(String name) { //setter for name
        this.name = name;
    }

    public int getAge() { // getter for age
        return age;
    }

    public void setAge(int age) { //setter for age
        this.age = age;
    }

    public String getContactnumber() { //getter for contactnumber
        return contactnumber;
    }

    public void setContactnumber(String contactnumber) { //setter for contactnumber
        this.contactnumber = contactnumber;
    }

    public String getContactemail() { //getter for contactemail
        return contactemail;
    }

    public void setContactemail(String contactemail) {// setter for contactemail
        this.contactemail = contactemail;
    }

    public String getDeliveryaddress() {//getter for deliveryaddress
        return deliveryaddress;
    }

    public void setDeliveryaddress(String deliveryaddress) { //setter for deliveryaddress
        this.deliveryaddress = deliveryaddress;
    }
    
    
    public boolean AgeVerification() // a method to determine whether the user is over 18 to see if they can buy the alcoholic drinks
    {
        boolean verification = false; // false until proven
        if(age > 18)
        {
            System.out.println("age verification successfull, you are over 18 years old");
            verification = true;
        }
        
        else if(age < 18) 
        {
            System.out.println("age verfication failed, you are not over 18 years old");
            verification = false;
        }
        return verification;
    }

    @Override
    public String toString() { //toString method that displays the UserInfos variables
        return "UserInfo{" + "name = " + name + ", age = " + age + ", contactnumber = " + contactnumber + ", contactemail = " + contactemail + ", deliveryaddress = " + deliveryaddress + '}';
    }
        
            
}
