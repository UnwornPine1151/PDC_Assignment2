
import java.util.HashMap;
import javax.swing.JOptionPane;

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
        populateProductList();
        populateProductComboBox();
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
        jComboBox1.removeAllItems();

        ProductList productList = populateProductList();

        if (productList != null) {
            for (Product product : productList.getProductList()) {
                jComboBox1.addItem(product.getProductname());
            }
        }
        else{
           String errorMessage = "ProductList is null";
           JOptionPane.showMessageDialog(this, errorMessage, "Error", JOptionPane.ERROR_MESSAGE); // shows a error message on screen when the productList is null
        }
    }

    private Product findProductByName(String productName) { // because the combobox uses strings, i need to take that string(name) and match the string(name) with the product so that i can add it to the ShoppingCart
        ProductList productList = populateProductList();

        for (Product product : productList.getProductList()) {
            if (product.getProductname().equals(productName)) {
                return product;
            }
        }

        return null;
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
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        ShoppingCartLabel = new javax.swing.JLabel();
        ProductDescriptionLabel = new javax.swing.JLabel();
        ActualDescriptionLabel = new javax.swing.JLabel();
        TotalPriceLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(102, 204, 0));
        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Please Select Product You Are Thinking About Buying");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        ShoppingCartLabel.setText("Your Shopping Cart:");

        ProductDescriptionLabel.setText("Product Description");

        ActualDescriptionLabel.setText("actual product description");

        TotalPriceLabel.setText("Total Price:");

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
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 180, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ProductDescriptionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ActualDescriptionLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ShoppingCartLabel)
                    .addComponent(TotalPriceLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ProductDescriptionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ActualDescriptionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        String selectedProduct = (String) jComboBox1.getSelectedItem();// gets a string representation for the value of the Product that is selected in the combobox
        ProductDescriptionLabel.setText(selectedProduct + " Product Description:"); //updates the label so it states that it is the product + Product Description, for example, iphone8 Product Description:
        Product actualSelectedProduct = findProductByName(selectedProduct);
        if(actualSelectedProduct != null)
        {
        ActualDescriptionLabel.setText(actualSelectedProduct.toString());
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String selectedProduct = (String) jComboBox1.getSelectedItem(); // makes selected product equal to the current product name that is selected in the combobox
        Product actualSelectedProduct = findProductByName(selectedProduct); //uses the findSelectedproduct method to compare the product name in the combobox to the product
        shoppingcart.addToShoppingcart(actualSelectedProduct); // adds that product to the product list
        String currentText = jTextArea1.getText(); //saves the current text in the jtextarea to a string so it can be appended
        String newText = currentText + actualSelectedProduct.getProductname() + "  $"+actualSelectedProduct.getProductprice() + "\n"; // appends the Strings to the jtextArea and adds the cost of each of the products alongside
        jTextArea1.setText(newText); //sets the textarea to the appended string
        String totalprice = String.valueOf(shoppingcart.totalPrice()); // converts the double, total price into a string representation of total price
        TotalPriceLabel.setText("Total Price: $" + totalprice); // now that total price is a string it  can be displayed on the TotalPriceLabel
    }//GEN-LAST:event_jButton1ActionPerformed

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
    private javax.swing.JLabel ActualDescriptionLabel;
    private javax.swing.JLabel ProductDescriptionLabel;
    private javax.swing.JLabel ShoppingCartLabel;
    private javax.swing.JLabel TotalPriceLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
