/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form.panel.recipe;

import domain.Ingredient;
import domain.MeasureUnit;
import domain.RecipeCategory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Milos
 */
public class AddNewRecipePanel extends javax.swing.JPanel {

    /**
     * Creates new form AddNewRecipePanel
     */
    public AddNewRecipePanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtxtRecipeTitle = new javax.swing.JTextField();
        jcbIngredients = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtxtQuantity = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jcbMeasureUnits = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtxtAreaIngredients = new javax.swing.JTextArea();
        jbtnAddIngredient = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jtxtPreparingTime = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtxtAreaStep = new javax.swing.JTextArea();
        jbtnAddStep = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtxtAreaAllSteps = new javax.swing.JTextArea();
        jbtnRemoveLastStep = new javax.swing.JButton();
        jbtnSaveRecipe = new javax.swing.JButton();
        jbtnRemoveLastIngredient = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jcbRecipeCategory = new javax.swing.JComboBox<>();

        setPreferredSize(new java.awt.Dimension(1500, 900));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("New Recipe");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Title:");

        jtxtRecipeTitle.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel3.setText("Ingredient:");

        jLabel4.setText("Quantity:");

        jLabel5.setText("Measure unit:");

        jLabel6.setText("All ingredients:");

        jtxtAreaIngredients.setEditable(false);
        jtxtAreaIngredients.setColumns(20);
        jtxtAreaIngredients.setRows(5);
        jScrollPane1.setViewportView(jtxtAreaIngredients);

        jbtnAddIngredient.setText("Add ingredient");

        jLabel7.setText("Preparing time (minutes):");

        jLabel8.setText("Step:");

        jtxtAreaStep.setColumns(20);
        jtxtAreaStep.setRows(5);
        jScrollPane2.setViewportView(jtxtAreaStep);

        jbtnAddStep.setText("Add step");

        jLabel9.setText("All steps:");

        jtxtAreaAllSteps.setEditable(false);
        jtxtAreaAllSteps.setColumns(20);
        jtxtAreaAllSteps.setRows(5);
        jScrollPane3.setViewportView(jtxtAreaAllSteps);

        jbtnRemoveLastStep.setText("Remove last step");

        jbtnSaveRecipe.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jbtnSaveRecipe.setText("Save new recipe");

        jbtnRemoveLastIngredient.setText("Remove last ingredient");

        jLabel10.setText("Category:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jbtnRemoveLastStep, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 146, Short.MAX_VALUE)
                                            .addComponent(jbtnAddStep, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jScrollPane2)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jtxtRecipeTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jtxtPreparingTime, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel10)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jcbRecipeCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(119, 119, 119)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel6)
                                        .addComponent(jScrollPane1)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addGap(18, 18, 18)
                                            .addComponent(jcbIngredients, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel4)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jtxtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel5)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jcbMeasureUnits, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(270, 270, 270)
                                    .addComponent(jbtnAddIngredient, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGap(390, 390, 390)
                                    .addComponent(jbtnRemoveLastIngredient, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addComponent(jLabel9)))
                .addGap(45, 45, 45)
                .addComponent(jbtnSaveRecipe, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jbtnSaveRecipe, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jcbIngredients, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)
                                .addComponent(jtxtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5)
                                .addComponent(jcbMeasureUnits, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jtxtRecipeTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(jcbRecipeCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(jtxtPreparingTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jbtnAddStep, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jbtnRemoveLastStep, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbtnAddIngredient, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel6))
                                    .addComponent(jbtnRemoveLastIngredient, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(45, 45, 45)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton jbtnAddIngredient;
    private javax.swing.JButton jbtnAddStep;
    private javax.swing.JButton jbtnRemoveLastIngredient;
    private javax.swing.JButton jbtnRemoveLastStep;
    private javax.swing.JButton jbtnSaveRecipe;
    private javax.swing.JComboBox<Ingredient> jcbIngredients;
    private javax.swing.JComboBox<MeasureUnit> jcbMeasureUnits;
    private javax.swing.JComboBox<RecipeCategory> jcbRecipeCategory;
    private javax.swing.JTextArea jtxtAreaAllSteps;
    private javax.swing.JTextArea jtxtAreaIngredients;
    private javax.swing.JTextArea jtxtAreaStep;
    private javax.swing.JTextField jtxtPreparingTime;
    private javax.swing.JTextField jtxtQuantity;
    private javax.swing.JTextField jtxtRecipeTitle;
    // End of variables declaration//GEN-END:variables

    public JButton getJbtnAddIngredient() {
        return jbtnAddIngredient;
    }

    public JButton getJbtnAddStep() {
        return jbtnAddStep;
    }

    public JButton getJbtnRemoveLastStep() {
        return jbtnRemoveLastStep;
    }

    public JButton getJbtnSaveRecipe() {
        return jbtnSaveRecipe;
    }

    public JComboBox<Ingredient> getJcbIngredients() {
        return jcbIngredients;
    }

    public JComboBox<MeasureUnit> getJcbMeasureUnits() {
        return jcbMeasureUnits;
    }

    public JTextArea getJtxtAreaAllSteps() {
        return jtxtAreaAllSteps;
    }

    public JTextArea getJtxtAreaIngredients() {
        return jtxtAreaIngredients;
    }

    public JTextArea getJtxtAreaStep() {
        return jtxtAreaStep;
    }

    public JTextField getJtxtPreparingTime() {
        return jtxtPreparingTime;
    }

    public JTextField getJtxtQuantity() {
        return jtxtQuantity;
    }

    public JTextField getJtxtRecipeTitle() {
        return jtxtRecipeTitle;
    }

    public JButton getJbtnRemoveLastIngredient() {
        return jbtnRemoveLastIngredient;
    }

    public JComboBox<RecipeCategory> getJcbRecipeCategory() {
        return jcbRecipeCategory;
    }
    
    
}