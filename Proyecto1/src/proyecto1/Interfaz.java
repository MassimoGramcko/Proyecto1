/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto1;

import java.awt.Color;

/**
 *
 * @author massi
 */
public class Interfaz extends javax.swing.JFrame {
    
    int xMouse, yMouse;
    
    public Interfaz() {
        initComponents();
        tab1.setBackground(Color.black);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tab1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tab2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        tab3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        tab4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        Inicio = new javax.swing.JPanel();
        Pagina1 = new javax.swing.JPanel();
        exitBtn1 = new javax.swing.JPanel();
        exitTxt1 = new javax.swing.JLabel();
        Pagina2 = new javax.swing.JPanel();
        exitBtn2 = new javax.swing.JPanel();
        exitTxt2 = new javax.swing.JLabel();
        Pagina3 = new javax.swing.JPanel();
        exitBtn3 = new javax.swing.JPanel();
        exitTxt3 = new javax.swing.JLabel();
        Pagina4 = new javax.swing.JPanel();
        exitBtn4 = new javax.swing.JPanel();
        exitTxt4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        tab1.setBackground(new java.awt.Color(102, 102, 102));
        tab1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tab1MouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Home");

        javax.swing.GroupLayout tab1Layout = new javax.swing.GroupLayout(tab1);
        tab1.setLayout(tab1Layout);
        tab1Layout.setHorizontalGroup(
            tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tab1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(88, 88, 88))
        );
        tab1Layout.setVerticalGroup(
            tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tab2.setBackground(new java.awt.Color(102, 102, 102));
        tab2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tab2MouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Services");

        javax.swing.GroupLayout tab2Layout = new javax.swing.GroupLayout(tab2);
        tab2.setLayout(tab2Layout);
        tab2Layout.setHorizontalGroup(
            tab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tab2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(82, 82, 82))
        );
        tab2Layout.setVerticalGroup(
            tab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tab3.setBackground(new java.awt.Color(102, 102, 102));
        tab3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tab3MouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Contact");

        javax.swing.GroupLayout tab3Layout = new javax.swing.GroupLayout(tab3);
        tab3.setLayout(tab3Layout);
        tab3Layout.setHorizontalGroup(
            tab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tab3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(82, 82, 82))
        );
        tab3Layout.setVerticalGroup(
            tab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tab4.setBackground(new java.awt.Color(102, 102, 102));
        tab4.setForeground(new java.awt.Color(102, 102, 102));
        tab4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tab4MouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("About");

        javax.swing.GroupLayout tab4Layout = new javax.swing.GroupLayout(tab4);
        tab4.setLayout(tab4Layout);
        tab4Layout.setHorizontalGroup(
            tab4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tab4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(89, 89, 89))
        );
        tab4Layout.setVerticalGroup(
            tab4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel6.setFont(new java.awt.Font("Dubai", 1, 30)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText(" SUCURSALES");

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tab1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tab2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tab3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tab4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(tab1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tab2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(tab3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(tab4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Inicio.setBackground(new java.awt.Color(153, 153, 153));
        Inicio.setLayout(new javax.swing.OverlayLayout(Inicio));

        Pagina1.setBackground(new java.awt.Color(255, 153, 0));
        Pagina1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                Pagina1MouseDragged(evt);
            }
        });
        Pagina1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Pagina1MousePressed(evt);
            }
        });

        exitBtn1.setBackground(new java.awt.Color(255, 153, 51));

        exitTxt1.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        exitTxt1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitTxt1.setText("X");
        exitTxt1.setPreferredSize(new java.awt.Dimension(40, 40));
        exitTxt1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitTxt1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitTxt1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitTxt1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout exitBtn1Layout = new javax.swing.GroupLayout(exitBtn1);
        exitBtn1.setLayout(exitBtn1Layout);
        exitBtn1Layout.setHorizontalGroup(
            exitBtn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, exitBtn1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(exitTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        exitBtn1Layout.setVerticalGroup(
            exitBtn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitTxt1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout Pagina1Layout = new javax.swing.GroupLayout(Pagina1);
        Pagina1.setLayout(Pagina1Layout);
        Pagina1Layout.setHorizontalGroup(
            Pagina1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Pagina1Layout.createSequentialGroup()
                .addGap(0, 648, Short.MAX_VALUE)
                .addComponent(exitBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        Pagina1Layout.setVerticalGroup(
            Pagina1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pagina1Layout.createSequentialGroup()
                .addComponent(exitBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 446, Short.MAX_VALUE))
        );

        Inicio.add(Pagina1);

        Pagina2.setBackground(new java.awt.Color(255, 153, 0));
        Pagina2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                Pagina2MouseDragged(evt);
            }
        });
        Pagina2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Pagina2MousePressed(evt);
            }
        });

        exitBtn2.setBackground(new java.awt.Color(255, 153, 0));
        exitBtn2.setPreferredSize(new java.awt.Dimension(40, 40));

        exitTxt2.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        exitTxt2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitTxt2.setText("X");
        exitTxt2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitTxt2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitTxt2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitTxt2MouseExited(evt);
            }
        });

        javax.swing.GroupLayout exitBtn2Layout = new javax.swing.GroupLayout(exitBtn2);
        exitBtn2.setLayout(exitBtn2Layout);
        exitBtn2Layout.setHorizontalGroup(
            exitBtn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitTxt2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );
        exitBtn2Layout.setVerticalGroup(
            exitBtn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitTxt2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout Pagina2Layout = new javax.swing.GroupLayout(Pagina2);
        Pagina2.setLayout(Pagina2Layout);
        Pagina2Layout.setHorizontalGroup(
            Pagina2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Pagina2Layout.createSequentialGroup()
                .addGap(0, 648, Short.MAX_VALUE)
                .addComponent(exitBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        Pagina2Layout.setVerticalGroup(
            Pagina2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pagina2Layout.createSequentialGroup()
                .addComponent(exitBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 446, Short.MAX_VALUE))
        );

        Inicio.add(Pagina2);

        Pagina3.setBackground(new java.awt.Color(255, 153, 0));
        Pagina3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                Pagina3MouseDragged(evt);
            }
        });
        Pagina3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Pagina3MousePressed(evt);
            }
        });

        exitBtn3.setBackground(new java.awt.Color(255, 153, 0));
        exitBtn3.setPreferredSize(new java.awt.Dimension(40, 40));

        exitTxt3.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        exitTxt3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitTxt3.setText("X");
        exitTxt3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitTxt3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitTxt3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitTxt3MouseExited(evt);
            }
        });

        javax.swing.GroupLayout exitBtn3Layout = new javax.swing.GroupLayout(exitBtn3);
        exitBtn3.setLayout(exitBtn3Layout);
        exitBtn3Layout.setHorizontalGroup(
            exitBtn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitTxt3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );
        exitBtn3Layout.setVerticalGroup(
            exitBtn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitTxt3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout Pagina3Layout = new javax.swing.GroupLayout(Pagina3);
        Pagina3.setLayout(Pagina3Layout);
        Pagina3Layout.setHorizontalGroup(
            Pagina3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Pagina3Layout.createSequentialGroup()
                .addGap(0, 648, Short.MAX_VALUE)
                .addComponent(exitBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        Pagina3Layout.setVerticalGroup(
            Pagina3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pagina3Layout.createSequentialGroup()
                .addComponent(exitBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 446, Short.MAX_VALUE))
        );

        Inicio.add(Pagina3);

        Pagina4.setBackground(new java.awt.Color(255, 153, 0));
        Pagina4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                Pagina4MouseDragged(evt);
            }
        });
        Pagina4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Pagina4MousePressed(evt);
            }
        });

        exitBtn4.setBackground(new java.awt.Color(255, 153, 0));
        exitBtn4.setPreferredSize(new java.awt.Dimension(40, 40));

        exitTxt4.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        exitTxt4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitTxt4.setText("X");
        exitTxt4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitTxt4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitTxt4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitTxt4MouseExited(evt);
            }
        });

        javax.swing.GroupLayout exitBtn4Layout = new javax.swing.GroupLayout(exitBtn4);
        exitBtn4.setLayout(exitBtn4Layout);
        exitBtn4Layout.setHorizontalGroup(
            exitBtn4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitTxt4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );
        exitBtn4Layout.setVerticalGroup(
            exitBtn4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitTxt4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout Pagina4Layout = new javax.swing.GroupLayout(Pagina4);
        Pagina4.setLayout(Pagina4Layout);
        Pagina4Layout.setHorizontalGroup(
            Pagina4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Pagina4Layout.createSequentialGroup()
                .addGap(0, 648, Short.MAX_VALUE)
                .addComponent(exitBtn4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        Pagina4Layout.setVerticalGroup(
            Pagina4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pagina4Layout.createSequentialGroup()
                .addComponent(exitBtn4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 446, Short.MAX_VALUE))
        );

        Inicio.add(Pagina4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Inicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Inicio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tab1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab1MouseClicked
   Pagina1.setVisible(true);
   Pagina2.setVisible(false);
   Pagina3.setVisible(false);
   Pagina4.setVisible(false);
   tab1.setBackground(Color.black);
   tab2.setBackground(new Color (102,102,102));
   tab3.setBackground(new Color (102,102,102));
   tab4.setBackground(new Color (102,102,102));
    }//GEN-LAST:event_tab1MouseClicked

    private void tab2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab2MouseClicked
   Pagina2.setVisible(true);
   Pagina1.setVisible(false);
   Pagina3.setVisible(false);
   Pagina4.setVisible(false);
   tab2.setBackground(Color.black);
   tab1.setBackground(new Color (102,102,102));
   tab3.setBackground(new Color (102,102,102));
   tab4.setBackground(new Color (102,102,102));
    }//GEN-LAST:event_tab2MouseClicked

    private void tab3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab3MouseClicked
   Pagina3.setVisible(true);
   Pagina2.setVisible(false);
   Pagina1.setVisible(false);
   Pagina4.setVisible(false);
   tab3.setBackground(Color.black);
   tab2.setBackground(new Color (102,102,102));
   tab1.setBackground(new Color (102,102,102));
   tab4.setBackground(new Color (102,102,102));
    }//GEN-LAST:event_tab3MouseClicked

    private void tab4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab4MouseClicked
   Pagina4.setVisible(true);
   Pagina3.setVisible(false);
   Pagina2.setVisible(false);
   Pagina1.setVisible(false);
   tab4.setBackground(Color.black);
   tab2.setBackground(new Color (102,102,102));
   tab3.setBackground(new Color (102,102,102));
   tab1.setBackground(new Color (102,102,102));
    }//GEN-LAST:event_tab4MouseClicked

    private void Pagina1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Pagina1MousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_Pagina1MousePressed

    private void Pagina1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Pagina1MouseDragged
        
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse); // Direccion del eje X y eje Y del mouse 
    }//GEN-LAST:event_Pagina1MouseDragged

    private void exitTxt1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxt1MouseClicked
       System.exit(0); // Salida del programa
    }//GEN-LAST:event_exitTxt1MouseClicked

    private void exitTxt1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxt1MouseEntered
        exitBtn1.setBackground(Color.red);// Coloca el color rojo al seleccionarlo
        exitTxt1.setForeground(Color.white);
    }//GEN-LAST:event_exitTxt1MouseEntered

    private void exitTxt1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxt1MouseExited
        exitBtn1.setBackground(new Color (255,153,51));// Devuelve el color del background
        exitTxt1.setForeground(Color.black);
    }//GEN-LAST:event_exitTxt1MouseExited

    private void Pagina2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Pagina2MousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_Pagina2MousePressed

    private void Pagina2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Pagina2MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_Pagina2MouseDragged

    private void exitTxt2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxt2MouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitTxt2MouseClicked

    private void exitTxt2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxt2MouseEntered
        exitBtn2.setBackground(Color.red);
        exitTxt2.setForeground(Color.white);
    }//GEN-LAST:event_exitTxt2MouseEntered

    private void exitTxt2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxt2MouseExited
        exitBtn2.setBackground(new Color (255,153,51));
        exitTxt2.setForeground(Color.black);
    }//GEN-LAST:event_exitTxt2MouseExited

    private void exitTxt3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxt3MouseClicked
       System.exit(0);
    }//GEN-LAST:event_exitTxt3MouseClicked

    private void exitTxt3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxt3MouseEntered
        exitBtn3.setBackground(Color.red);
        exitTxt3.setForeground(Color.white);
    }//GEN-LAST:event_exitTxt3MouseEntered

    private void exitTxt3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxt3MouseExited
        exitBtn3.setBackground(new Color (255,153,51));
        exitTxt3.setForeground(Color.black);
    }//GEN-LAST:event_exitTxt3MouseExited

    private void Pagina3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Pagina3MousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_Pagina3MousePressed

    private void Pagina3MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Pagina3MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_Pagina3MouseDragged

    private void exitTxt4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxt4MouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitTxt4MouseClicked

    private void exitTxt4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxt4MouseEntered
        exitBtn4.setBackground(Color.red);
        exitTxt4.setForeground(Color.white);
    }//GEN-LAST:event_exitTxt4MouseEntered

    private void exitTxt4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxt4MouseExited
       exitBtn4.setBackground(new Color (255,153,51));
        exitTxt4.setForeground(Color.black);
    }//GEN-LAST:event_exitTxt4MouseExited

    private void Pagina4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Pagina4MousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_Pagina4MousePressed

    private void Pagina4MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Pagina4MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_Pagina4MouseDragged

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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Inicio;
    private javax.swing.JPanel Pagina1;
    private javax.swing.JPanel Pagina2;
    private javax.swing.JPanel Pagina3;
    private javax.swing.JPanel Pagina4;
    private javax.swing.JPanel exitBtn1;
    private javax.swing.JPanel exitBtn2;
    private javax.swing.JPanel exitBtn3;
    private javax.swing.JPanel exitBtn4;
    private javax.swing.JLabel exitTxt1;
    private javax.swing.JLabel exitTxt2;
    private javax.swing.JLabel exitTxt3;
    private javax.swing.JLabel exitTxt4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel tab1;
    private javax.swing.JPanel tab2;
    private javax.swing.JPanel tab3;
    private javax.swing.JPanel tab4;
    // End of variables declaration//GEN-END:variables
}
