/**
 * 
 */
package gui;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import utils.DialogUtils;


/**
 *
 * @author Amira
 */
public class CityControlPanel extends javax.swing.JPanel {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1474836193997700589L;
	/**
     * Creates new form CityControlPanel
     */
    public CityControlPanel() {
        initComponents();
    }
    @Override
    public void show(){
    
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
                            
    private void initComponents() {

        ControlMyCityjLabel = new javax.swing.JLabel();
        BuyAreajButton = new javax.swing.JButton();
        AddStationjButton = new javax.swing.JButton();
        AddLineButton = new javax.swing.JButton();
        DevelopmentjButton = new javax.swing.JButton();
        EvolutionjLabel = new javax.swing.JLabel();

        ControlMyCityjLabel.setFont(new java.awt.Font("Silom", 1, 18)); // NOI18N
        ControlMyCityjLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ControlMyCityjLabel.setText("Contrôler ma ville");

        BuyAreajButton.setText("Acheter un  quartier");
        BuyAreajButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuyAreajButtonActionPerformed(evt);
            }
        });

        AddStationjButton.setText("Ajouter une station");
        AddStationjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddStationjButtonActionPerformed(evt);
            }
        });

        AddLineButton.setText("Ajouter une ligne de métro");
        AddLineButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddLineButtonActionPerformed(evt);
            }
        });

        DevelopmentjButton.setText("Développer un quartier");
        DevelopmentjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DevelopmentjButtonActionPerformed(evt);
            }
        });

        EvolutionjLabel.setFont(new java.awt.Font("Silom", 1, 18)); // NOI18N
        EvolutionjLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EvolutionjLabel.setText("Evolution");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ControlMyCityjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(EvolutionjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(BuyAreajButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(AddStationjButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(AddLineButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                            .addComponent(DevelopmentjButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(ControlMyCityjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BuyAreajButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AddStationjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AddLineButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DevelopmentjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(EvolutionjLabel)
                .addContainerGap(153, Short.MAX_VALUE))
        );
    }                      

    private void BuyAreajButtonActionPerformed(java.awt.event.ActionEvent evt) {                                               
        DialogUtils.showDialog(new BuyAreaPanel());
    }                                              

    private void AddStationjButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        // TODO add your handling code here:
    }                                                 

    private void AddLineButtonActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
    }                                             

    private void DevelopmentjButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        DialogUtils.showDialog(new DevelopmentControlPanel());
    }                                                  

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        
       /* Create and display the form */
        
           CityControlPanel city = new CityControlPanel();
           city.setVisible(true);
           
          
    }
    // Variables declaration - do not modify                     
    private javax.swing.JButton AddLineButton;
    private javax.swing.JButton AddStationjButton;
    private javax.swing.JButton BuyAreajButton;
    private javax.swing.JLabel ControlMyCityjLabel;
    private javax.swing.JButton DevelopmentjButton;
    private javax.swing.JLabel EvolutionjLabel;
    // End of variables declaration                   
}

