package GUI;

@SuppressWarnings("serial")
public class PageAdmin extends javax.swing.JFrame {

    public PageAdmin() {
        initComponents();
    }

    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        membre = new javax.swing.JLabel();
        user = new javax.swing.JLabel();
        recette = new javax.swing.JLabel();
        depense = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(254, 254, 254));

        title.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/LogoSample_ByTailorBrands(1).jpg")));

        membre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/membre.png")));

        user.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/user.png"))); 

        recette.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/recAd.png")));

        depense.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/depAd.png")));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Créer un membre", "Désactiver un membre", "Réactiver un membre" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Créer un administrateur", "Créer un financier", "Modifier un administrateur", "Modifier un financier" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enregister une recette principale", "Enregister une recette secondaire", "Consulter les types de recettes", "Consulter les recettes d'un membre", "Consulter toutes les recettes" }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enregister une dépense par chéque", "Enregister une dépense par espéces", "Consulter les types de dépenses ", "Consulter toutes les dépenses", " ", " " }));
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Ubuntu", 1, 18));
        jButton1.setText("Quitter");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/mail.png")));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(286, 286, 286)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(recette)
                    .addComponent(membre))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(user)
                        .addGap(97, 97, 97))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(302, 302, 302)
                        .addComponent(depense, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 107, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(257, 257, 257)
                .addComponent(title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(59, 59, 59))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(membre)
                    .addComponent(user))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(recette)
                    .addComponent(depense))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {
        if (jComboBox2.getSelectedIndex() == 0) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreerAdmin().setVisible(true);
                dispose();
            }
        });}
        if (jComboBox2.getSelectedIndex() == 1) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreerFinancier().setVisible(true);
                dispose();
            }
        });}
        if (jComboBox2.getSelectedIndex() == 2) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModifierAdmin().setVisible(true);
                dispose();
            }
        });}
        if (jComboBox2.getSelectedIndex() == 3) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModifierFinancier().setVisible(true);
                dispose();
            }
        });}
    }

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {
        if (jComboBox1.getSelectedIndex() == 0) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreerMembre().setVisible(true);
                dispose();
            }
        });}
        if (jComboBox1.getSelectedIndex() == 1) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DesactiverMembre().setVisible(true);
                dispose();
            }
        });}
        if (jComboBox1.getSelectedIndex() == 2) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DesactiverMembre().setVisible(true);
                dispose();
            }
        });}
        
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PageAccueil().setVisible(true);
            }
        });
        dispose();
    }

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {
        if (jComboBox3.getSelectedIndex() == 0) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Recette().setVisible(true);
                dispose();
            }
        });}
  
        if (jComboBox3.getSelectedIndex() == 1) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RecetteSecondaire().setVisible(true);
                dispose();
            }
        });}
        if (jComboBox3.getSelectedIndex() == 2) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsulterRecettes().setVisible(true);
                dispose();
            }
        });}
        if (jComboBox3.getSelectedIndex() == 3) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsulterRecettes1().setVisible(true);
                dispose();
            }
        });}
        if (jComboBox3.getSelectedIndex() == 4) {
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new ConsRecettes().setVisible(true);
                    dispose();
                }
            });}
    }
    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {
        if (jComboBox4.getSelectedIndex() == 0) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DepenseCheque().setVisible(true);
                dispose();
            }
        });}
        if (jComboBox4.getSelectedIndex() == 1) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DepenseEspece().setVisible(true);
                dispose();
            }
        });}
        if (jComboBox4.getSelectedIndex() == 2) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsulterDepenses().setVisible(true);
                dispose();
            }
        });}
        if (jComboBox4.getSelectedIndex() == 3) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsDépenses().setVisible(true);
                dispose();
            }
        });}
    
    }
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PageAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PageAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PageAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PageAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PageAdmin().setVisible(true);
            }
        });
    }

    
    private javax.swing.JLabel depense;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel membre;
    private javax.swing.JLabel recette;
    private javax.swing.JLabel title;
    private javax.swing.JLabel user;
    
}
