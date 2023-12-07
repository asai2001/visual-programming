package Tugas3;


import javax.swing.*;

public class Tugas extends javax.swing.JFrame {


    public Tugas() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        ScrolMinum = new javax.swing.JScrollPane();
        ListMinum = new javax.swing.JList<>();
        ScrolOlah = new javax.swing.JScrollPane();
        ListOlahraga = new javax.swing.JList<>();
        refresh = new javax.swing.JButton();
        proses = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        MemoResume = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ScrollMakan = new javax.swing.JScrollPane();
        ListMakan = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Rivaldo Diki_19533108\n");

        ListMinum.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = {"Es Teh", "Es Teh Susu", "Kopi", "Susu Soda", "Susu Murni", "Sprite", "Fanta", "Coca Cola", "Es Juice", "Es Jeruk", "Es Teler", "Es Dawet", " "};

            public int getSize() {
                return strings.length;
            }

            public String getElementAt(int i) {
                return strings[i];
            }
        });
        ScrolMinum.setViewportView(ListMinum);

        ListOlahraga.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = {"Renang ", "Badminton", "Sepak Bola", "Tenis Meja", "Silat", "Wushu", "Catur", "Volly Ball", "Lari ", "Basket", "Panahan", "Atletik", " ", " "};

            public int getSize() {
                return strings.length;
            }

            public String getElementAt(int i) {
                return strings[i];
            }
        });
        ScrolOlah.setViewportView(ListOlahraga);

        refresh.setText("Refresh");

        proses.setText("Proses");
        proses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prosesActionPerformed(evt);
            }
        });

        jLabel1.setText("Resume");

        MemoResume.setColumns(20);
        MemoResume.setRows(5);
        jScrollPane5.setViewportView(MemoResume);

        jLabel2.setText("Makanan");

        jLabel3.setText("Minuman");

        jLabel4.setText("Olahraga");

        ListMakan.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = {"Rujak", "Soto", "Pecel Lele", "Tempe Penyet", "Padang", "Rawon", "Sate", "Ayam Panggang", "Nila Bkar", "Bakso", "Nasi Bakar", " "};

            public int getSize() {
                return strings.length;
            }

            public String getElementAt(int i) {
                return strings[i];
            }
        });
        ListMakan.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        ScrollMakan.setViewportView(ListMakan);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(ScrollMakan, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(proses)
                                        .addComponent(refresh))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(33, 33, 33)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel3)
                                                        .addComponent(ScrolMinum, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(39, 39, 39)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel4)
                                                        .addComponent(ScrolOlah, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addContainerGap(78, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(3, 3, 3)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel1))
                                                .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(ScrolOlah, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                                        .addComponent(ScrolMinum)
                                        .addComponent(ScrollMakan))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(refresh))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(proses)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>

    private void prosesActionPerformed(java.awt.event.ActionEvent evt) {
        int IndexMakanan = ListMakan.getSelectedIndex(); // Get the selected food item index
        int IndexMinMinuman = ListMinum.getMinSelectionIndex(); // Get the first selected drink index
        int IndexMaxMinuman = ListMinum.getMaxSelectionIndex(); // Get the last selected drink index

        String Kalimat;
        Kalimat = "Daftar Makanan Yang Dipilih : \n";
        Kalimat = Kalimat + ListMakan.getModel().getElementAt(IndexMakanan).toString() + "\n";

        Kalimat = Kalimat + "Daftar Minuman Yang dipilih : \n";
        for (int i = IndexMinMinuman; i <= IndexMaxMinuman; i++) {
            Kalimat = Kalimat + ListMinum.getModel().getElementAt(i).toString() + "\n";
        }

        MemoResume.setText(Kalimat); // Display the result in the JTextArea
    }

    public JPanel getPanel() {
        JPanel panel = new JPanel();
        GroupLayout layout = new GroupLayout(panel);
        panel.setLayout(layout);

        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);


        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(ScrollMakan, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(proses)
                                        .addComponent(refresh))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(33, 33, 33)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel3)
                                                        .addComponent(ScrolMinum, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(39, 39, 39)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel4)
                                                        .addComponent(ScrolOlah, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addContainerGap(78, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(3, 3, 3)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel1))
                                                .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(ScrolOlah, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                                        .addComponent(ScrolMinum)
                                        .addComponent(ScrollMakan))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(refresh))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(proses)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)))
        );

        return panel;
    }


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
            java.util.logging.Logger.getLogger(Workshop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Workshop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Workshop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Workshop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Workshop().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JList<String> ListMakan;
    private javax.swing.JList<String> ListMinum;
    private javax.swing.JList<String> ListOlahraga;
    private javax.swing.JTextArea MemoResume;
    private javax.swing.JScrollPane ScrolMinum;
    private javax.swing.JScrollPane ScrolOlah;
    private javax.swing.JScrollPane ScrollMakan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JButton proses;
    private javax.swing.JButton refresh;



}