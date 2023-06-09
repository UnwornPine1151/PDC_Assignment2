
import java.util.HashMap;
import javax.swing.JOptionPane;
import java.util.Iterator;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author kstor
 */
public class AddingToShoppingCart extends javax.swing.JFrame {

    ShoppingCart shoppingcart = new ShoppingCart();

    /**
     * Creates new form AddingToShoppingList
     */
    public AddingToShoppingCart() {

        initComponents();
        populateProductList();// calls the populateProductList which updates the productList with a bunch of products so the user has products to add in the GUI
        populateProductComboBox(); //populates the combobox with the products from the productList
    }

    private ProductList populateProductList() // my method to populate the productList
    {
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

        return productlist;
    }

    private void populateProductComboBox() {
        jComboBox1.removeAllItems(); //removes all the items from the combobox so it is ready to populate

        ProductList productList = populateProductList(); //creates and populates a productlist object

        if (productList != null) { // if productlist is not null
            for (Product product : productList.getProductList()) { // it uses a for-each loop to iterate through the productList 
                jComboBox1.addItem(product.getProductname()); //adds each product in the productList as an item in the combobox using its name as the title
            }
        } else {
            String errorMessage = "ProductList is null";
            JOptionPane.showMessageDialog(this, errorMessage, "Error", JOptionPane.ERROR_MESSAGE); // shows a error message on screen when the productList is null
        }
    }

    private Product findProductByName(String productName) { // because the combobox uses strings, i need to take that string(name) and match the string(name) with the product so that i can add it to the ShoppingCart
        ProductList productList = populateProductList(); //creates a productlist object that is then populated by the populate function

        for (Product product : productList.getProductList()) {  //uses a for-each loop to iterate through the productlist
            if (product.getProductname().equals(productName)) { // if the current products name is the same as the inputted products name it returns that product
                return product;
            }
        }

        return null;
    }

    public void iterateShoppingCartKeys(HashMap<Product, Integer> shoppingcart) { // method so i can iterate through the shoppingcart, need it for remove button
        shoppingCartText.setText(""); // Clear the text area before appending the updated content
        for (Product key : shoppingcart.keySet()) { //uses a for-each loop to iterate through the ShoppingCartKeys
            shoppingCartText.append(key.getProductname() + " $" + key.getProductprice() + "\n"); //appends the productsname of the current product to the ShoppingCartText
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        addButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        shoppingCartText = new javax.swing.JTextArea();
        ShoppingCartLabel = new javax.swing.JLabel();
        ProductDescriptionLabel = new javax.swing.JLabel();
        TotalPriceLabel = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        ProductDescriptionArea = new javax.swing.JTextArea();
        ClearButton = new javax.swing.JButton();
        CheckOutButton = new javax.swing.JButton();
        RestartButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 255));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        addButton.setBackground(new java.awt.Color(102, 204, 0));
        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Please Select Product You Are Thinking About Buying");

        shoppingCartText.setEditable(false);
        shoppingCartText.setColumns(20);
        shoppingCartText.setRows(5);
        jScrollPane1.setViewportView(shoppingCartText);

        ShoppingCartLabel.setText("Your Shopping Cart:");

        ProductDescriptionLabel.setText("Product Description");

        TotalPriceLabel.setText("Total Price:");

        ProductDescriptionArea.setEditable(false);
        ProductDescriptionArea.setColumns(20);
        ProductDescriptionArea.setRows(5);
        jScrollPane3.setViewportView(ProductDescriptionArea);

        ClearButton.setBackground(new java.awt.Color(204, 204, 204));
        ClearButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ClearButton.setText("Clear");
        ClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearButtonActionPerformed(evt);
            }
        });

        CheckOutButton.setBackground(new java.awt.Color(204, 204, 204));
        CheckOutButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        CheckOutButton.setText("Checkout");
        CheckOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckOutButtonActionPerformed(evt);
            }
        });

        RestartButton.setBackground(new java.awt.Color(204, 0, 51));
        RestartButton.setForeground(new java.awt.Color(255, 255, 255));
        RestartButton.setText("Restart");
        RestartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RestartButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(ShoppingCartLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TotalPriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ClearButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(227, 227, 227)
                        .addComponent(CheckOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(152, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ProductDescriptionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(10, 10, 10))
                            .addComponent(RestartButton, javax.swing.GroupLayout.Alignment.TRAILING)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ShoppingCartLabel)
                    .addComponent(TotalPriceLabel)
                    .addComponent(RestartButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ProductDescriptionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(CheckOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ClearButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        String selectedProduct = (String) jComboBox1.getSelectedItem();// gets a string representation for the value of the Product that is selected in the combobox
        ProductDescriptionLabel.setText(selectedProduct + " Product Description:"); //updates the label so it states that it is the product + Product Description, for example, iphone8 Product Description:
        Product actualSelectedProduct = findProductByName(selectedProduct); //creates a product called actualSelectedProduct and uses the findProductByName method taking the string from the combobox as input
        if (actualSelectedProduct != null) { //if the product object actualSelectedProduct is not null it sets the ProductDescriptionArea to the actualSelectedProducts toString
            ProductDescriptionArea.setText(actualSelectedProduct.toString());
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed
    //add button method
    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        String selectedProduct = (String) jComboBox1.getSelectedItem(); // makes selected product equal to the current product name that is selected in the combobox
        Product actualSelectedProduct = findProductByName(selectedProduct); //uses the findSelectedproduct method to compare the product name in the combobox to the product
        shoppingcart.addToShoppingcart(actualSelectedProduct); // adds that product to the product list
        String currentText = shoppingCartText.getText(); //saves the current text in the jtextarea to a string so it can be appended
        String newText = currentText + actualSelectedProduct.getProductname() + "  $" + actualSelectedProduct.getProductprice() + "\n"; // appends the Strings to the jtextArea and adds the cost of each of the products alongside
        shoppingCartText.setText(newText); //sets the textarea to the appended string
        String totalprice = String.valueOf(shoppingcart.totalPrice()); // converts the double, total price into a string representation of total price
        TotalPriceLabel.setText("Total Price: $" + totalprice); // now that total price is a string it  can be displayed on the TotalPriceLabel
    }//GEN-LAST:event_addButtonActionPerformed

    //button to clear the shoppinglist
    private void ClearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearButtonActionPerformed
        shoppingcart = new ShoppingCart(); // clears the shopping cart by making it equal to a new shopping cart object which doesnt contain any products
        shoppingCartText.setText(""); //sets the text area that lists the products in the shoppingcart and price
        TotalPriceLabel.setText("Total Price:"); //clears the total price label above the shoppingcart text area
    }//GEN-LAST:event_ClearButtonActionPerformed

    private void CheckOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckOutButtonActionPerformed
        CheckoutCart checkoutCart = new CheckoutCart(shoppingcart); // Create an instance of the CheckoutCart class
        checkoutCart.setVisible(true); // Set the visibility of the checkout form to true
        dispose(); // Close the current JFrame form
    }//GEN-LAST:event_CheckOutButtonActionPerformed

    private void RestartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RestartButtonActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() { //Starts the AddingToShoppingCart GUI
            public void run() {
                new AddingToShoppingCart().setVisible(true);
            }
        });
        dispose(); //closes the current JFrame form
    }//GEN-LAST:event_RestartButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddingToShoppingCart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddingToShoppingCart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddingToShoppingCart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddingToShoppingCart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddingToShoppingCart().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CheckOutButton;
    private javax.swing.JButton ClearButton;
    private javax.swing.JTextArea ProductDescriptionArea;
    private javax.swing.JLabel ProductDescriptionLabel;
    private javax.swing.JButton RestartButton;
    private javax.swing.JLabel ShoppingCartLabel;
    private javax.swing.JLabel TotalPriceLabel;
    private javax.swing.JButton addButton;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea shoppingCartText;
    // End of variables declaration//GEN-END:variables
}
