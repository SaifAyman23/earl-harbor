package inserting_page;
/**
 *
 * @author omniamahmoud
 */
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
public class inserting_page_jframe extends javax.swing.JFrame {
    public inserting_page_jframe() {
    initComponents();

        this.setTitle("Inserting Page");
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        client_table = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        client_name_text = new javax.swing.JTextField();
        client_email_txt = new javax.swing.JTextField();
        client_phone_txt = new javax.swing.JTextField();
        client_clear_btn = new javax.swing.JButton();
        clinet_enter_btn = new javax.swing.JButton();
        vessel_table = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        vessel_name_txt = new javax.swing.JTextField();
        vessel_type_txt = new javax.swing.JTextField();
        vessel_weight_txt = new javax.swing.JTextField();
        vessel_clear_bt = new javax.swing.JButton();
        vessel_enter_btn = new javax.swing.JButton();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        vessel_capacity_txt = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        vessel_length_txt = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        vessel_reg_num_txt = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        vessel_client_id_txt = new javax.swing.JTextField();
        vessel_height_txt = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        vessel_status_txt = new javax.swing.JTextField();
        back_btn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        shipment_table = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        shipment_arrival_date_txt = new javax.swing.JTextField();
        shipment_weight_txt = new javax.swing.JTextField();
        shipment_clear_bt = new javax.swing.JButton();
        shipment_enter_btn = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        shipment_cost_txt = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        shipment_bay_id_txt = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        shipment_destination_txt = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        shipment_vessel_id_txt = new javax.swing.JTextField();
        shipment_status_txt = new javax.swing.JTextField();
        shipment_dp_date_txt = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        cargo_table = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        cargo_type_txt = new javax.swing.JTextField();
        cargo_weight_txt = new javax.swing.JTextField();
        cargo_shipment_id_txt = new javax.swing.JTextField();
        cargo_clear_btn = new javax.swing.JButton();
        cargo_enter_btn = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        cargo_quantity_txt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 102));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        client_table.setBackground(new java.awt.Color(204, 204, 204));
        client_table.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel5.setBackground(new java.awt.Color(51, 51, 51));
        jLabel5.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 153));
        jLabel5.setText("Clinet Information");

        jLabel6.setBackground(new java.awt.Color(51, 51, 51));
        jLabel6.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 153));
        jLabel6.setText("Name");

        jLabel7.setBackground(new java.awt.Color(51, 51, 51));
        jLabel7.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 153));
        jLabel7.setText("Email");

        jLabel8.setBackground(new java.awt.Color(51, 51, 51));
        jLabel8.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 153, 153));
        jLabel8.setText("Phone");

        client_email_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                client_email_txtActionPerformed(evt);
            }
        });

        client_phone_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                client_phone_txtActionPerformed(evt);
            }
        });

        client_clear_btn.setText("Clear");
        client_clear_btn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        client_clear_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                client_clear_btnActionPerformed(evt);
            }
        });

        clinet_enter_btn.setText("Enter");
        clinet_enter_btn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        clinet_enter_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clinet_enter_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout client_tableLayout = new javax.swing.GroupLayout(client_table);
        client_table.setLayout(client_tableLayout);
        client_tableLayout.setHorizontalGroup(
            client_tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(client_tableLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(client_tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(client_name_text, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(93, Short.MAX_VALUE))
            .addGroup(client_tableLayout.createSequentialGroup()
                .addGroup(client_tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(client_tableLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel7)
                        .addGap(17, 17, 17))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, client_tableLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(client_tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(clinet_enter_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(client_tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(client_tableLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(client_email_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(client_tableLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(client_phone_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, client_tableLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(client_clear_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))))
        );
        client_tableLayout.setVerticalGroup(
            client_tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(client_tableLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(client_tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(client_name_text, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(client_tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(client_email_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(client_tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(client_phone_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(client_tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(client_clear_btn)
                    .addComponent(clinet_enter_btn))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        vessel_table.setBackground(new java.awt.Color(204, 204, 204));
        vessel_table.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel28.setBackground(new java.awt.Color(51, 51, 51));
        jLabel28.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(0, 153, 153));
        jLabel28.setText("Vessel Information");

        jLabel29.setBackground(new java.awt.Color(51, 51, 51));
        jLabel29.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(0, 153, 153));
        jLabel29.setText("Name");

        jLabel30.setBackground(new java.awt.Color(51, 51, 51));
        jLabel30.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(0, 153, 153));
        jLabel30.setText("Type");

        vessel_type_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vessel_type_txtActionPerformed(evt);
            }
        });

        vessel_weight_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vessel_weight_txtActionPerformed(evt);
            }
        });

        vessel_clear_bt.setText("Clear");
        vessel_clear_bt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        vessel_clear_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vessel_clear_btActionPerformed(evt);
            }
        });

        vessel_enter_btn.setText("Enter");
        vessel_enter_btn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        vessel_enter_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vessel_enter_btnActionPerformed(evt);
            }
        });

        jLabel32.setBackground(new java.awt.Color(51, 51, 51));
        jLabel32.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(0, 153, 153));
        jLabel32.setText("Capacity");

        jLabel33.setBackground(new java.awt.Color(51, 51, 51));
        jLabel33.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(0, 153, 153));
        jLabel33.setText("Wieght");

        vessel_capacity_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vessel_capacity_txtActionPerformed(evt);
            }
        });

        jLabel34.setBackground(new java.awt.Color(51, 51, 51));
        jLabel34.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(0, 153, 153));
        jLabel34.setText("Reg Number");

        jLabel35.setBackground(new java.awt.Color(51, 51, 51));
        jLabel35.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(0, 153, 153));
        jLabel35.setText("Length");

        jLabel36.setBackground(new java.awt.Color(51, 51, 51));
        jLabel36.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(0, 153, 153));
        jLabel36.setText("Height");

        vessel_client_id_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vessel_client_id_txtActionPerformed(evt);
            }
        });

        vessel_height_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vessel_height_txtActionPerformed(evt);
            }
        });

        jLabel38.setBackground(new java.awt.Color(51, 51, 51));
        jLabel38.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(0, 153, 153));
        jLabel38.setText("Client ID");

        jLabel37.setBackground(new java.awt.Color(51, 51, 51));
        jLabel37.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(0, 153, 153));
        jLabel37.setText("Status");

        javax.swing.GroupLayout vessel_tableLayout = new javax.swing.GroupLayout(vessel_table);
        vessel_table.setLayout(vessel_tableLayout);
        vessel_tableLayout.setHorizontalGroup(
            vessel_tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vessel_tableLayout.createSequentialGroup()
                .addGroup(vessel_tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(vessel_tableLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(vessel_tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(vessel_tableLayout.createSequentialGroup()
                                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addGroup(vessel_tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(vessel_tableLayout.createSequentialGroup()
                                        .addComponent(vessel_name_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(vessel_height_txt))
                                    .addGroup(vessel_tableLayout.createSequentialGroup()
                                        .addComponent(vessel_type_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(vessel_tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(vessel_status_txt)
                                            .addGroup(vessel_tableLayout.createSequentialGroup()
                                                .addComponent(vessel_length_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(3, 3, 3)
                                                .addComponent(jLabel32)
                                                .addGap(18, 18, 18)
                                                .addComponent(vessel_capacity_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))))))
                            .addComponent(jLabel30)
                            .addGroup(vessel_tableLayout.createSequentialGroup()
                                .addGroup(vessel_tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(vessel_tableLayout.createSequentialGroup()
                                        .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(vessel_weight_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(31, 31, 31))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, vessel_tableLayout.createSequentialGroup()
                                        .addComponent(jLabel38)
                                        .addGap(12, 12, 12)
                                        .addGroup(vessel_tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(vessel_enter_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(vessel_client_id_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, 0)))
                                .addGroup(vessel_tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, vessel_tableLayout.createSequentialGroup()
                                        .addComponent(vessel_clear_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(26, 26, 26))
                                    .addComponent(jLabel37)
                                    .addGroup(vessel_tableLayout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(jLabel34)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(vessel_reg_num_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(vessel_tableLayout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        vessel_tableLayout.setVerticalGroup(
            vessel_tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vessel_tableLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(vessel_tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vessel_name_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29)
                    .addComponent(jLabel36)
                    .addComponent(vessel_height_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(vessel_tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(vessel_type_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32)
                    .addComponent(vessel_capacity_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel35)
                    .addComponent(vessel_length_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(vessel_tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(vessel_weight_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel37)
                    .addComponent(vessel_status_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(vessel_tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vessel_reg_num_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34)
                    .addComponent(vessel_client_id_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel38))
                .addGap(18, 18, 18)
                .addGroup(vessel_tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vessel_enter_btn)
                    .addComponent(vessel_clear_bt))
                .addGap(8, 8, 8))
        );

        back_btn.setBackground(new java.awt.Color(204, 204, 204));
        back_btn.setText("Back");
        back_btn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        back_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(client_table, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vessel_table, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(back_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(back_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(client_table, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(vessel_table, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
        );

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        shipment_table.setBackground(new java.awt.Color(204, 204, 204));
        shipment_table.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel13.setBackground(new java.awt.Color(51, 51, 51));
        jLabel13.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 153, 153));
        jLabel13.setText("Shipment Information");

        jLabel14.setBackground(new java.awt.Color(51, 51, 51));
        jLabel14.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 153, 153));
        jLabel14.setText("Departure Date");

        jLabel15.setBackground(new java.awt.Color(51, 51, 51));
        jLabel15.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 153, 153));
        jLabel15.setText("Arrival Date");

        shipment_arrival_date_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shipment_arrival_date_txtActionPerformed(evt);
            }
        });

        shipment_weight_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shipment_weight_txtActionPerformed(evt);
            }
        });

        shipment_clear_bt.setText("Clear");
        shipment_clear_bt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        shipment_clear_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shipment_clear_btActionPerformed(evt);
            }
        });

        shipment_enter_btn.setText("Enter");
        shipment_enter_btn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        shipment_enter_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shipment_enter_btnActionPerformed(evt);
            }
        });

        jLabel25.setBackground(new java.awt.Color(51, 51, 51));
        jLabel25.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 153, 153));
        jLabel25.setText("Cost");

        jLabel26.setBackground(new java.awt.Color(51, 51, 51));
        jLabel26.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 153, 153));
        jLabel26.setText("Wieght");

        shipment_cost_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shipment_cost_txtActionPerformed(evt);
            }
        });

        jLabel17.setBackground(new java.awt.Color(51, 51, 51));
        jLabel17.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 153, 153));
        jLabel17.setText("Destination");

        jLabel18.setBackground(new java.awt.Color(51, 51, 51));
        jLabel18.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 153, 153));
        jLabel18.setText("Vessel ID");

        jLabel20.setBackground(new java.awt.Color(51, 51, 51));
        jLabel20.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 153, 153));
        jLabel20.setText("Status");

        shipment_dp_date_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shipment_dp_date_txtActionPerformed(evt);
            }
        });

        jLabel21.setBackground(new java.awt.Color(51, 51, 51));
        jLabel21.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 153, 153));
        jLabel21.setText("Client ID");

        javax.swing.GroupLayout shipment_tableLayout = new javax.swing.GroupLayout(shipment_table);
        shipment_table.setLayout(shipment_tableLayout);
        shipment_tableLayout.setHorizontalGroup(
            shipment_tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(shipment_tableLayout.createSequentialGroup()
                .addGroup(shipment_tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(shipment_tableLayout.createSequentialGroup()
                        .addGroup(shipment_tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(shipment_tableLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(shipment_tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(shipment_tableLayout.createSequentialGroup()
                                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(31, 31, 31)
                                        .addComponent(shipment_destination_txt))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, shipment_tableLayout.createSequentialGroup()
                                        .addComponent(jLabel15)
                                        .addGap(41, 41, 41)
                                        .addComponent(shipment_arrival_date_txt))
                                    .addGroup(shipment_tableLayout.createSequentialGroup()
                                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(shipment_dp_date_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(shipment_tableLayout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addComponent(shipment_enter_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(shipment_tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(shipment_tableLayout.createSequentialGroup()
                                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)
                                .addComponent(shipment_bay_id_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel25))
                            .addGroup(shipment_tableLayout.createSequentialGroup()
                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(shipment_tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(shipment_tableLayout.createSequentialGroup()
                                        .addGap(114, 114, 114)
                                        .addComponent(shipment_cost_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                                    .addGroup(shipment_tableLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(shipment_status_txt))))
                            .addGroup(shipment_tableLayout.createSequentialGroup()
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(shipment_tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(shipment_tableLayout.createSequentialGroup()
                                        .addComponent(shipment_vessel_id_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(shipment_weight_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(shipment_clear_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(shipment_tableLayout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(jLabel13)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        shipment_tableLayout.setVerticalGroup(
            shipment_tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(shipment_tableLayout.createSequentialGroup()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(shipment_tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(shipment_dp_date_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel20)
                    .addComponent(shipment_status_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(shipment_tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(shipment_tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(shipment_arrival_date_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel15)
                        .addComponent(shipment_cost_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, shipment_tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel21)
                        .addComponent(shipment_bay_id_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel25)))
                .addGap(18, 18, 18)
                .addGroup(shipment_tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(shipment_destination_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(shipment_vessel_id_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(jLabel26)
                    .addComponent(shipment_weight_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(shipment_tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(shipment_clear_bt)
                    .addComponent(shipment_enter_btn))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        cargo_table.setBackground(new java.awt.Color(204, 204, 204));
        cargo_table.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel10.setBackground(new java.awt.Color(51, 51, 51));
        jLabel10.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 153, 153));
        jLabel10.setText("Type");

        jLabel11.setBackground(new java.awt.Color(51, 51, 51));
        jLabel11.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 153, 153));
        jLabel11.setText("Weight");

        jLabel12.setBackground(new java.awt.Color(51, 51, 51));
        jLabel12.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 153, 153));
        jLabel12.setText("Shipment ID");

        cargo_type_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargo_type_txtActionPerformed(evt);
            }
        });

        cargo_weight_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargo_weight_txtActionPerformed(evt);
            }
        });

        cargo_shipment_id_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargo_shipment_id_txtActionPerformed(evt);
            }
        });

        cargo_clear_btn.setText("Clear");
        cargo_clear_btn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cargo_clear_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargo_clear_btnActionPerformed(evt);
            }
        });

        cargo_enter_btn.setText("Enter");
        cargo_enter_btn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cargo_enter_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargo_enter_btnActionPerformed(evt);
            }
        });

        jLabel22.setBackground(new java.awt.Color(51, 51, 51));
        jLabel22.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 153, 153));
        jLabel22.setText("Quantity");

        cargo_quantity_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargo_quantity_txtActionPerformed(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(51, 51, 51));
        jLabel9.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 153, 153));
        jLabel9.setText("Cargo Information");
        jLabel9.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout cargo_tableLayout = new javax.swing.GroupLayout(cargo_table);
        cargo_table.setLayout(cargo_tableLayout);
        cargo_tableLayout.setHorizontalGroup(
            cargo_tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cargo_tableLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(cargo_tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cargo_tableLayout.createSequentialGroup()
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addGroup(cargo_tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(cargo_tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(cargo_tableLayout.createSequentialGroup()
                                    .addGroup(cargo_tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(cargo_shipment_id_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cargo_quantity_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                                    .addGap(29, 29, 29)
                                    .addComponent(jLabel11)
                                    .addGap(18, 18, 18)
                                    .addComponent(cargo_weight_txt))
                                .addComponent(cargo_type_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(34, Short.MAX_VALUE))
            .addGroup(cargo_tableLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(cargo_enter_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cargo_clear_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        cargo_tableLayout.setVerticalGroup(
            cargo_tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cargo_tableLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(cargo_tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cargo_type_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(cargo_tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(cargo_quantity_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cargo_weight_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(cargo_tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(cargo_shipment_id_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(cargo_tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cargo_clear_btn)
                    .addComponent(cargo_enter_btn))
                .addGap(8, 8, 8))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(cargo_table, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(shipment_table, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(cargo_table, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(shipment_table, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clinet_enter_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clinet_enter_btnActionPerformed
        String clientName = client_name_text.getText();
        String clientEmail = client_email_txt.getText();
        String clientPhone = client_phone_txt.getText();
        if (clientName.isEmpty() || clientEmail.isEmpty() || clientPhone.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill all fields!", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String query = "INSERT INTO Client (name, email, telephone) VALUES ('" 
                        + clientName + "', '" + clientEmail + "', '" + clientPhone + "')";
        
        try (Connection conn = connection.getConnection(); Statement stm = conn.createStatement()) {
            int rows = stm.executeUpdate(query);
            if (rows > 0) {
                JOptionPane.showMessageDialog(this, "New client added successfully");
                client_clear_btnActionPerformed(evt);
            } else {
                JOptionPane.showMessageDialog(this, "Error adding client.");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Database error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    

    }//GEN-LAST:event_clinet_enter_btnActionPerformed

    private void client_clear_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_client_clear_btnActionPerformed
        client_name_text.setText("");
        client_phone_txt.setText("");
        client_email_txt.setText("");
    }//GEN-LAST:event_client_clear_btnActionPerformed

    private void client_phone_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_client_phone_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_client_phone_txtActionPerformed

    private void client_email_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_client_email_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_client_email_txtActionPerformed

    private void cargo_quantity_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargo_quantity_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cargo_quantity_txtActionPerformed

    private void cargo_enter_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargo_enter_btnActionPerformed
    String cargoType = cargo_type_txt.getText();
    String cargoWeightStr = cargo_weight_txt.getText();
    String cargoQuantityStr = cargo_quantity_txt.getText();
    String shipmentIdStr = cargo_shipment_id_txt.getText();
    if (cargoType.isEmpty() || cargoWeightStr.isEmpty() || cargoQuantityStr.isEmpty() || shipmentIdStr.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please fill all fields!", "Validation Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
    float cargoWeight;
    int cargoQuantity;
    int shipmentId;
    try {
        cargoWeight = Float.parseFloat(cargoWeightStr);
        cargoQuantity = Integer.parseInt(cargoQuantityStr);
        shipmentId = Integer.parseInt(shipmentIdStr);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Please enter valid numbers for weight, quantity, and shipment ID", "Input Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
    if (cargoWeight <= 0 || cargoQuantity <= 0) {
        JOptionPane.showMessageDialog(this, "Weight and quantity must be greater than 0", "Validation Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
    
    String query = "INSERT INTO Cargo (type, weight, quantity, shipment_id) VALUES ('"
            + cargoType + "', " + cargoWeight + ", " + cargoQuantity + ", " + shipmentId + ")";
    try (Connection conn = connection.getConnection(); Statement stm = conn.createStatement()) {
        int rows = stm.executeUpdate(query);
        if (rows > 0) {
            JOptionPane.showMessageDialog(this, "Cargo added successfully!");
            cargo_clear_btnActionPerformed(evt);
        } else {
            JOptionPane.showMessageDialog(this, "Error adding cargo.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Database error: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_cargo_enter_btnActionPerformed

    private void cargo_clear_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargo_clear_btnActionPerformed
        cargo_type_txt.setText("");
        cargo_weight_txt.setText("");
        cargo_quantity_txt.setText("");
        cargo_shipment_id_txt.setText("");
    }//GEN-LAST:event_cargo_clear_btnActionPerformed

    private void cargo_shipment_id_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargo_shipment_id_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cargo_shipment_id_txtActionPerformed

    private void cargo_weight_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargo_weight_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cargo_weight_txtActionPerformed

    private void cargo_type_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargo_type_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cargo_type_txtActionPerformed

    private void shipment_dp_date_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shipment_dp_date_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_shipment_dp_date_txtActionPerformed

    private void shipment_cost_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shipment_cost_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_shipment_cost_txtActionPerformed

    private void shipment_enter_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shipment_enter_btnActionPerformed
    String departureDateStr = shipment_dp_date_txt.getText();
    String arrivalDateStr = shipment_arrival_date_txt.getText();
    String shipmentWeightStr = shipment_weight_txt.getText();
    String shipmentCostStr = shipment_cost_txt.getText();
    String destination = shipment_destination_txt.getText();
    String status = shipment_status_txt.getText();
    String vesselIdStr = shipment_vessel_id_txt.getText();
    String bayIdStr = shipment_bay_id_txt.getText();
    if (departureDateStr.isEmpty() || arrivalDateStr.isEmpty() || shipmentWeightStr.isEmpty() || shipmentCostStr.isEmpty() ||
        destination.isEmpty() || vesselIdStr.isEmpty() || bayIdStr.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please fill all required fields!", "Validation Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
    double shipmentWeight;
    int shipmentCost, vesselId, bayId;
    try {
        shipmentWeight = Double.parseDouble(shipmentWeightStr);
        shipmentCost = Integer.parseInt(shipmentCostStr);
        vesselId = Integer.parseInt(vesselIdStr);
        bayId = Integer.parseInt(bayIdStr);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Please enter valid numbers for weight, cost, vessel ID, and bay ID.", "Input Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
    if (shipmentWeight <= 0 || shipmentCost <= 0) {
        JOptionPane.showMessageDialog(this, "Weight and cost must be positive values!", "Validation Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
    if (status.isEmpty()) {
        status = "Passed";
    }
    
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    dateFormat.setLenient(false);

    String date_test = "^\\d{4}-\\d{2}-\\d{2}$";
    if (!departureDateStr.matches(date_test)) {
        JOptionPane.showMessageDialog(this, "Please enter a valid departure date in format: YYYY-MM-DD.", "Date Format Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
    if (!arrivalDateStr.matches(date_test)) {
        JOptionPane.showMessageDialog(this, "Please enter a valid arrival date in format: YYYY-MM-DD.", "Date Format Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
    String query = "INSERT INTO Shipment (departure_date, arrival_date, weight, cost, destination, status, vessel_id, bay_id) "
            + "VALUES ('" + departureDateStr + "', '" + arrivalDateStr + "', " + shipmentWeight + ", " + shipmentCost 
            + ", '" + destination + "', '" + status + "', " + vesselId + ", " + bayId + ")";
    try (Connection conn = connection.getConnection(); Statement stm = conn.createStatement()) {
        int rows = stm.executeUpdate(query);
        if (rows > 0) {
            JOptionPane.showMessageDialog(this, "New shipment added successfully!");
            shipment_clear_btActionPerformed(evt);
        } else {
            JOptionPane.showMessageDialog(this, "Error adding shipment.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Database error: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_shipment_enter_btnActionPerformed

    private void shipment_clear_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shipment_clear_btActionPerformed
        shipment_dp_date_txt.setText("");
        shipment_arrival_date_txt.setText("");
        shipment_weight_txt.setText("");
        shipment_cost_txt.setText("");
        shipment_destination_txt.setText("");
        shipment_status_txt.setText("");
        shipment_vessel_id_txt.setText("");
        shipment_bay_id_txt.setText("");
    }//GEN-LAST:event_shipment_clear_btActionPerformed

    private void shipment_weight_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shipment_weight_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_shipment_weight_txtActionPerformed

    private void shipment_arrival_date_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shipment_arrival_date_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_shipment_arrival_date_txtActionPerformed

    private void vessel_capacity_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vessel_capacity_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vessel_capacity_txtActionPerformed

    private void vessel_enter_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vessel_enter_btnActionPerformed
    String vesselName = vessel_name_txt.getText();
    String vesselType = vessel_type_txt.getText();
    String vesselWeightStr = vessel_weight_txt.getText();
    String vesselCapacityStr = vessel_capacity_txt.getText();
    String registrationNumber = vessel_reg_num_txt.getText();
    String vesselHeightStr = vessel_height_txt.getText();
    String vesselLengthStr = vessel_length_txt.getText();
    String vesselStatus = vessel_status_txt.getText();
    String clientIdStr = vessel_client_id_txt.getText();
    if (vesselName.isEmpty() || vesselType.isEmpty() || vesselWeightStr.isEmpty() || vesselCapacityStr.isEmpty() || 
        registrationNumber.isEmpty() || vesselHeightStr.isEmpty() || vesselLengthStr.isEmpty() || 
        vesselStatus.isEmpty() || clientIdStr.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please fill all fields!", "Validation Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
    double vesselWeight;
    int vesselCapacity, clientId;
    double vesselHeight, vesselLength;
    try {
        vesselWeight = Double.parseDouble(vesselWeightStr);
        vesselCapacity = Integer.parseInt(vesselCapacityStr);
        vesselHeight = Double.parseDouble(vesselHeightStr);
        vesselLength = Double.parseDouble(vesselLengthStr);
        clientId = Integer.parseInt(clientIdStr);
        if (vesselWeight <= 0 || vesselCapacity <= 0 || vesselHeight <= 0 || vesselLength <= 0) {
            JOptionPane.showMessageDialog(this, "Weight, capacity, height, and length must be positive values!", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Please enter valid numbers for weight, capacity, height, length, and client ID.", "Input Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
    String query = "INSERT INTO Vessel (name, type, weight, capacity, registration_number, height, length, status, client_id) "
                 + "VALUES ('" + vesselName + "', '" + vesselType + "', " + vesselWeight + ", " + vesselCapacity + ", '" 
                 + registrationNumber + "', " + vesselHeight + ", " + vesselLength + ", '" + vesselStatus + "', " + clientId + ")";
    try (Connection conn = connection.getConnection(); Statement stmt = conn.createStatement()) {
        int rows = stmt.executeUpdate(query);

        if (rows > 0) {
            JOptionPane.showMessageDialog(this, "New vessel added successfully!");
            vessel_clear_btActionPerformed(evt);
        } else {
            JOptionPane.showMessageDialog(this, "Error adding vessel.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Database error: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
}

    }//GEN-LAST:event_vessel_enter_btnActionPerformed

    private void vessel_clear_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vessel_clear_btActionPerformed
        vessel_name_txt.setText("");
        vessel_type_txt.setText("");
        vessel_weight_txt.setText("");
        vessel_capacity_txt.setText("");
        vessel_reg_num_txt.setText("");
        vessel_height_txt.setText("");
        vessel_length_txt.setText("");
        vessel_status_txt.setText("");
        vessel_client_id_txt.setText("");
    }//GEN-LAST:event_vessel_clear_btActionPerformed

    private void vessel_weight_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vessel_weight_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vessel_weight_txtActionPerformed

    private void vessel_type_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vessel_type_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vessel_type_txtActionPerformed

    private void vessel_height_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vessel_height_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vessel_height_txtActionPerformed

    private void vessel_client_id_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vessel_client_id_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vessel_client_id_txtActionPerformed

    private void back_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_back_btnActionPerformed


    public static void main(String args[]) {

            java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inserting_page_jframe().setVisible(true);
            }
        });
}
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back_btn;
    private javax.swing.JButton cargo_clear_btn;
    private javax.swing.JButton cargo_enter_btn;
    private javax.swing.JTextField cargo_quantity_txt;
    private javax.swing.JTextField cargo_shipment_id_txt;
    private javax.swing.JPanel cargo_table;
    private javax.swing.JTextField cargo_type_txt;
    private javax.swing.JTextField cargo_weight_txt;
    private javax.swing.JButton client_clear_btn;
    private javax.swing.JTextField client_email_txt;
    private javax.swing.JTextField client_name_text;
    private javax.swing.JTextField client_phone_txt;
    private javax.swing.JPanel client_table;
    private javax.swing.JButton clinet_enter_btn;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField shipment_arrival_date_txt;
    private javax.swing.JTextField shipment_bay_id_txt;
    private javax.swing.JButton shipment_clear_bt;
    private javax.swing.JTextField shipment_cost_txt;
    private javax.swing.JTextField shipment_destination_txt;
    private javax.swing.JTextField shipment_dp_date_txt;
    private javax.swing.JButton shipment_enter_btn;
    private javax.swing.JTextField shipment_status_txt;
    private javax.swing.JPanel shipment_table;
    private javax.swing.JTextField shipment_vessel_id_txt;
    private javax.swing.JTextField shipment_weight_txt;
    private javax.swing.JTextField vessel_capacity_txt;
    private javax.swing.JButton vessel_clear_bt;
    private javax.swing.JTextField vessel_client_id_txt;
    private javax.swing.JButton vessel_enter_btn;
    private javax.swing.JTextField vessel_height_txt;
    private javax.swing.JTextField vessel_length_txt;
    private javax.swing.JTextField vessel_name_txt;
    private javax.swing.JTextField vessel_reg_num_txt;
    private javax.swing.JTextField vessel_status_txt;
    private javax.swing.JPanel vessel_table;
    private javax.swing.JTextField vessel_type_txt;
    private javax.swing.JTextField vessel_weight_txt;
    // End of variables declaration//GEN-END:variables
}
