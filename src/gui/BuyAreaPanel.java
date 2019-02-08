/**
 * 
 */
package gui;

import javax.swing.JPanel;

/**
 * @author Amira
 *
 */
public class BuyAreaPanel extends JPanel {

    /**
	 * 
	 */
	private static final long serialVersionUID = -654896393921746437L;
	/**
     * Creates new form BuyAreaPanelPanel
     */
    public BuyAreaPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
                              
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        AreaPricejLabel = new javax.swing.JLabel();
        AreaTypejLabel = new javax.swing.JLabel();
        AreajComboBox1 = new javax.swing.JComboBox<>();
        AreaTypejLabel1 = new javax.swing.JLabel();
        AreajComboBox2 = new javax.swing.JComboBox<>();
        PricejComboBox = new javax.swing.JComboBox<>();
        ValidatejButton1 = new javax.swing.JButton();

        jLabel2.setFont(new java.awt.Font("Silom", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Achat d'un quartier");

        AreaPricejLabel.setFont(new java.awt.Font("Songti SC", 1, 18)); // NOI18N
        AreaPricejLabel.setText("Prix");

        AreaTypejLabel.setFont(new java.awt.Font("Songti SC", 1, 18)); // NOI18N
        AreaTypejLabel.setText("Nom du quartier");

        AreajComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Quartier Commercial", "Quartier Résidentiel", "Quartier Public" }));
        AreajComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AreajComboBox1ActionPerformed(evt);
            }
        });

        AreaTypejLabel1.setFont(new java.awt.Font("Songti SC", 1, 18)); // NOI18N
        AreaTypejLabel1.setText("Type du quartier");

        AreajComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Quartier Q1", "Quartier Q2", "Quartier Q3", "Quartier Q4", "Quartier Q5", "Quartier Q6", "Quartier Q7", "Quartier Q8", "Quartier Q9" }));
        AreajComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AreajComboBox2ActionPerformed(evt);
            }
        });

        PricejComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0$", "500$" }));
        PricejComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PricejComboBoxActionPerformed(evt);
            }
        });

        ValidatejButton1.setText("Valider");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AreaTypejLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AreaTypejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AreaPricejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PricejComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AreajComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AreajComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(43, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ValidatejButton1)
                .addGap(67, 67, 67))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AreaTypejLabel)
                    .addComponent(AreajComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AreaTypejLabel1)
                    .addComponent(AreajComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PricejComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AreaPricejLabel))
                .addGap(29, 29, 29)
                .addComponent(ValidatejButton1)
                .addGap(20, 20, 20))
        );
    }// </editor-fold>                        

    private void AreajComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
    }                                              

    private void AreajComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
    }                                              

    private void PricejComboBoxActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
    }                                              


    // Variables declaration - do not modify                     
    private javax.swing.JLabel AreaPricejLabel;
    private javax.swing.JLabel AreaTypejLabel;
    private javax.swing.JLabel AreaTypejLabel1;
    private javax.swing.JComboBox<String> AreajComboBox1;
    private javax.swing.JComboBox<String> AreajComboBox2;
    private javax.swing.JComboBox<String> PricejComboBox;
    private javax.swing.JButton ValidatejButton1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration                   
}