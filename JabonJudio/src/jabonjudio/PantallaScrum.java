/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jabonjudio;

/**
 *
 * @author Benjiman
 */
public class PantallaScrum extends javax.swing.JFrame {

    /**
     * Creates new form PantallaScrum
     */
    public PantallaScrum() {
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

        bMenu = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Scrum");
        setBackground(new java.awt.Color(0, 153, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(new java.awt.Color(51, 153, 0));

        bMenu.setText("Volver al Inicio");
        bMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bMenuMouseClicked(evt);
            }
        });
        bMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMenuActionPerformed(evt);
            }
        });

        jTextPane1.setText("¿QUÉ ES SCRUM?\n          *Metodología ágil*\nFrente a los pasos del tradicional método en cascada, el desarrollo ágil de software se basa en seis pasos comunes dentro del ciclo de vida del software: planificación, análisis de requisitos, diseño, codificación, test y documentación. En cada interacción, el equipo de desarrollo no entrega todo el programa, sino que se van añadiendo pequeños elementos totalmente probados, sin errores, con el fin de que la solución final esté completamente operativa desde el minuto uno. En los métodos de desarrollo ágil de software, la comunicación entre todos los miembros del equipo es clave, ya que se busca eliminar las trabas habituales de reuniones, validaciones y revisiones formales por encuentros más informales y en fases tempranas e intermedias del proceso, no sólo en la última etapa del trabajo.\n\nManifiesto por el desarrollo ágil\nEstamos buscando formas mejores de desarrollar software tanto por nuestra propia experiencia como ayudando a terceros. A través de este trabajo aprendimos a valorar:\n\n• Los individuos e interacciones, por encima de los procesos y las herramientas.\n• Software en funcionamiento, frente a la documentación exhaustiva.\n• La colaboración con el cliente sobre la negociación contractual.\n• Respuesta al cambio, mejor que el seguimiento de un plan.\nEsto es, aunque valoremos los de la derecha, valoramos más a los de la izquierda.\n\n*Scrum*\nEs una metodología de desarrollo ágil, centrado en el desarrollo iterativo e incremental, en periodos cortos del tiempo y en colaboración con el cliente.\n\n-Roles \n-Product owner\n-Scrum master\n-Scrum team\n\nPRODUCT OWNER\n•VISIÓN.-ESTABLECE EL OBJETIVO A TRAVÉS DE UN DESEO A CUMPLIR.\n•REPRESENTA A LOS PATROCINADORES (STAKEHOLDERS).\n•DESCUBRE Y APRUEBA EL PBI Y CONOCE EL VALOR DE NEGOCIO DE CADA ITEM.\n•TOMA EN CUENTA EL RETORNO DE INVERSIÓN.\n•TRIUNFA O FALLA RÁPIDO.\n\nSCRUM MASTER\n•COACH (FACILITADOR)\n•ESTABLECE LOS CALENDARIOS Y AGENDAS.\n•GUÍA AL EQUIPO A LA IDENTIFICACIÓN DE ENTREGABLES.\n•FACILITA LA COMUNICACIÓN CON EL PRODUCTOWNER.\n•RESPONSABLE DE CORREGIR PROBLEMAS O IMPEDIMENTOS.\n\nSCRUM TEAM (O SÓLO TEAM)\n•AUTO ORGANIZADO\n•CROSS FUNCTIONAL\n•COLABORA Y COMPARTE EL CONOCIMIENTO.\n•ESTIMADOS DE TRABAJO.\n•DE 3 A 9 MIEMBROS.");
        jScrollPane1.setViewportView(jTextPane1);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\darke\\Desktop\\ICO_SCRUM_ProFINALJabonJudio\\Imagenes\\SCRUM_1.jpg")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bMenu)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bMenu)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 443, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bMenuMouseClicked
        PantallaMenu pm = new PantallaMenu();
        pm.setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_bMenuMouseClicked

    private void bMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bMenuActionPerformed

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
            java.util.logging.Logger.getLogger(PantallaScrum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaScrum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaScrum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaScrum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaScrum().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables
}
