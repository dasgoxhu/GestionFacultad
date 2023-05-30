package gestion_facultad;



import javax.swing.JOptionPane;


public class FRMINICIO extends javax.swing.JFrame {

    
    public FRMINICIO() {
        initComponents();
        
        this.setLocationRelativeTo(null);
    }
    
    
    
    
    Estudiante estudiante = new Estudiante();
    Profesores profesores = new Profesores();
    Servicio servicio = new Servicio();
    Empleado empleado = new Empleado();
    Persona persona = new Persona();
    
    
    

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jFrame1 = new javax.swing.JFrame();
        prof = new javax.swing.JButton();
        estd = new javax.swing.JButton();
        emple = new javax.swing.JButton();
        serv = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Profe = new javax.swing.JButton();
        Est = new javax.swing.JButton();
        Serv = new javax.swing.JButton();
        Emp = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Mostr = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jFrame1.setLocationRelativeTo(null);
        jFrame1.setMinimumSize(new java.awt.Dimension(318, 220));
        jFrame1.setResizable(false);

        prof.setText("Profesor");
        prof.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profActionPerformed(evt);
            }
        });

        estd.setText("Estudiante");
        estd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estdActionPerformed(evt);
            }
        });

        emple.setText("Empleado");
        emple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empleActionPerformed(evt);
            }
        });

        serv.setText("Servicio");
        serv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                servActionPerformed(evt);
            }
        });

        jLabel2.setText("Mostrar info de :");

        jLabel3.setText("Mostrar info de :");

        jLabel4.setText("Mostrar info de :");

        jLabel5.setText("Mostrar info de :");

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(estd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(prof, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(emple, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(serv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prof)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(estd)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emple)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(serv))
                .addContainerGap(76, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Profe.setText("Profesor");
        Profe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProfeActionPerformed(evt);
            }
        });

        Est.setText("Estudiante");
        Est.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EstActionPerformed(evt);
            }
        });

        Serv.setText("Servicio");
        Serv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ServActionPerformed(evt);
            }
        });

        Emp.setText("Empleado");
        Emp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmpActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Escoger el tipo de Persona ");
        jLabel1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLabel1AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        Mostr.setText("Mostrar toda la info");
        Mostr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(Profe)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Est)
                                .addGap(18, 18, 18)
                                .addComponent(Serv, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Emp))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(Mostr)))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel1)
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Profe)
                    .addComponent(Est)
                    .addComponent(Serv)
                    .addComponent(Emp))
                .addGap(76, 76, 76)
                .addComponent(Mostr)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ServActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ServActionPerformed
        servicio.setNombre(JOptionPane.showInputDialog("¿Cual es su nombre?"));
        servicio.setApellido(JOptionPane.showInputDialog("¿Cual es su Apellido?"));
        servicio.setID(Integer.parseInt(JOptionPane.showInputDialog("¿Cual es ID?")));
        servicio.CambiarEstd_Civil(JOptionPane.showInputDialog("¿Cual es su estado civil?"));
        servicio.CambiodSeccion(JOptionPane.showInputDialog("¿Cual es su sección?"));
        JOptionPane.showMessageDialog(null,servicio.mostrarInformacion());
      
        
        
        
        int aux = Integer.parseInt(JOptionPane.showInputDialog("¿Cambiar seeción? 1 = sí 0= no"));
        if (aux == 1)
        {
          servicio.CambiodSeccion(JOptionPane.showInputDialog("¿Cual es el cambio de sección?"));
          JOptionPane.showMessageDialog(null,servicio.mostrarInformacion());
        }
        else 
        {
        
        JOptionPane.showMessageDialog(null,servicio.mostrarInformacion());
    
        }
        
           aux = Integer.parseInt(JOptionPane.showInputDialog("¿Cambiar estado civil? 1 = sí 0= no"));
        if (aux == 1)
        {
          servicio.CambiarEstd_Civil(JOptionPane.showInputDialog("Cambio estado civil"));
          JOptionPane.showMessageDialog(null,servicio.mostrarInformacion());
        }
        else 
        {
        
        JOptionPane.showMessageDialog(null,servicio.mostrarInformacion());
    
        }
        
        
        
                
               
    }//GEN-LAST:event_ServActionPerformed

    
    private void EmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmpActionPerformed
        
        empleado.setNombre(JOptionPane.showInputDialog("¿Cual es su nombre?"));
        empleado.setApellido(JOptionPane.showInputDialog("¿Cual es su Apellido?"));
        empleado.setID(Integer.parseInt(JOptionPane.showInputDialog("¿Cual es ID?")));
        empleado.CambiarEstd_Civil(JOptionPane.showInputDialog("¿Cual es su estado civil?"));
        empleado.CambiarDespacho(JOptionPane.showInputDialog("¿Cual es su despacho")); 
        empleado.setAño(Integer.parseInt(JOptionPane.showInputDialog("¿Cual es su año de incorporació?")));
        JOptionPane.showMessageDialog(null,empleado.mostrarInformacion());
        
        
        int aux = Integer.parseInt(JOptionPane.showInputDialog("¿Cambiar despacho? 1 = sí 0= no"));
        if (aux == 1)
        {
          empleado.CambiarDespacho(JOptionPane.showInputDialog("¿Cual es el cambio de despacho?"));
          JOptionPane.showMessageDialog(null,empleado.mostrarInformacion());
        }
        else 
        {
        
        JOptionPane.showMessageDialog(null,empleado.mostrarInformacion());
    
        }
        
           aux = Integer.parseInt(JOptionPane.showInputDialog("¿Cambiar estado civil? 1 = sí 0= no"));
        if (aux == 1)
        {
          empleado.CambiarEstd_Civil(JOptionPane.showInputDialog("Cambio estado civil"));
          JOptionPane.showMessageDialog(null,empleado.mostrarInformacion());
        }
        else 
        {
        
        JOptionPane.showMessageDialog(null,empleado.mostrarInformacion());
    
        }
        
        
        
        
        
        
     
        
    }//GEN-LAST:event_EmpActionPerformed

    private void ProfeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProfeActionPerformed
       
        profesores.setNombre(JOptionPane.showInputDialog("¿Cual es su nombre?"));
        profesores.setApellido(JOptionPane.showInputDialog("¿Cual es su Apellido?"));
        profesores.setID(Integer.parseInt(JOptionPane.showInputDialog("¿Cual es ID?")));
        profesores.CambiarEstd_Civil(JOptionPane.showInputDialog("¿Cual es su estado civil?"));
        profesores.CambioDepart(JOptionPane.showInputDialog("¿Cual es su Departamento?"));
        JOptionPane.showMessageDialog(null,profesores.mostrarInformacion());

        
        int aux = Integer.parseInt(JOptionPane.showInputDialog("¿Cambiar departamento? 1 = sí 0= no"));
        if (aux == 1)
        {
          profesores.CambioDepart(JOptionPane.showInputDialog("¿Cual es el cambio de departamento"));
          JOptionPane.showMessageDialog(null,profesores.mostrarInformacion());
        }
        else 
        {
        
        JOptionPane.showMessageDialog(null,profesores.mostrarInformacion());
    
        }
        
           aux = Integer.parseInt(JOptionPane.showInputDialog("¿Cambiar estado civil? 1 = sí 0= no"));
        if (aux == 1)
        {
          profesores.CambiarEstd_Civil(JOptionPane.showInputDialog("Cambio estado civil"));
          JOptionPane.showMessageDialog(null,profesores.mostrarInformacion());
        }
        else 
        {
        
        JOptionPane.showMessageDialog(null,profesores.mostrarInformacion());
    
        }
        
        
        
        
        
    }//GEN-LAST:event_ProfeActionPerformed

    private void EstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EstActionPerformed
        estudiante.setNombre(JOptionPane.showInputDialog("¿Cual es su nombre?"));
        estudiante.setApellido(JOptionPane.showInputDialog("¿Cual es su Apellido?"));
        estudiante.setID(Integer.parseInt(JOptionPane.showInputDialog("¿Cual es ID?")));
        estudiante.CambiarEstd_Civil(JOptionPane.showInputDialog("¿Cual es su estado civil?"));
        estudiante.CambioCurso(JOptionPane.showInputDialog("¿Cual es su curso")); 
        JOptionPane.showMessageDialog(null,estudiante.mostrarInformacion());
        
        
          int aux = Integer.parseInt(JOptionPane.showInputDialog("¿Cambiar de curso? 1 = sí 0= no"));
        if (aux == 1)
        {
          estudiante.CambioCurso(JOptionPane.showInputDialog("¿Cual es el cambio de curso"));
          JOptionPane.showMessageDialog(null,estudiante.mostrarInformacion());
        }
        else 
        {
        
        JOptionPane.showMessageDialog(null,estudiante.mostrarInformacion());
    
        }
        
           aux = Integer.parseInt(JOptionPane.showInputDialog("¿Cambiar estado civil? 1 = sí 0= no"));
        if (aux == 1)
        {
          estudiante.CambiarEstd_Civil(JOptionPane.showInputDialog("Cambio estado civil"));
          JOptionPane.showMessageDialog(null,estudiante.mostrarInformacion());
        }
        else 
        {
        
        JOptionPane.showMessageDialog(null,estudiante.mostrarInformacion());
    
        }
        
    }//GEN-LAST:event_EstActionPerformed

    private void jLabel1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabel1AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1AncestorAdded

    private void MostrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrActionPerformed
    jFrame1.setVisible(true);
        
    
   
    }//GEN-LAST:event_MostrActionPerformed

    private void estdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estdActionPerformed
        JOptionPane.showMessageDialog(null,estudiante.mostrarInformacion());

    }//GEN-LAST:event_estdActionPerformed

    private void profActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profActionPerformed
        JOptionPane.showMessageDialog(null,profesores.mostrarInformacion());

    }//GEN-LAST:event_profActionPerformed

    private void servActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_servActionPerformed
        JOptionPane.showMessageDialog(null,servicio.mostrarInformacion());
    }//GEN-LAST:event_servActionPerformed

    private void empleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empleActionPerformed
        JOptionPane.showMessageDialog(null,empleado.mostrarInformacion());
    }//GEN-LAST:event_empleActionPerformed

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
            java.util.logging.Logger.getLogger(FRMINICIO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FRMINICIO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FRMINICIO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FRMINICIO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FRMINICIO().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Emp;
    private javax.swing.JButton Est;
    private javax.swing.JButton Mostr;
    private javax.swing.JButton Profe;
    private javax.swing.JButton Serv;
    private javax.swing.JButton emple;
    private javax.swing.JButton estd;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JButton prof;
    private javax.swing.JButton serv;
    // End of variables declaration//GEN-END:variables
}
