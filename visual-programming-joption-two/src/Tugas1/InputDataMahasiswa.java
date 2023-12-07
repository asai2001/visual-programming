package Tugas1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InputDataMahasiswa {
    public static void createAndShowGUI() {
        JFrame frame = new JFrame("Input Data Mahasiswa");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Membuat JTabbedPane
        JTabbedPane tabbedPane = new JTabbedPane();

        // Panel 1
        JPanel panel1 = new JPanel();
        panel1.setLayout(null); // Menggunakan layout null, sebaiknya dihindari jika memungkinkan
        JLabel nameLabel = new JLabel("Nama:");
        JLabel nimLabel = new JLabel("NIM:");
        JLabel addressLabel = new JLabel("Alamat:");
        JLabel phoneLabel = new JLabel("No. Telp:");
        JTextField nameField = new JTextField();
        JTextField nimField = new JTextField();
        JTextField addressField = new JTextField();
        JTextField phoneField = new JTextField();
        JButton showButton = new JButton("Tampilkan");
        JButton clearButton = new JButton("Clear");
        JButton exitButton = new JButton("Keluar");

        // Menentukan posisi dan ukuran komponen pada panel 1
        nameLabel.setBounds(10, 10, 80, 20);
        nimLabel.setBounds(10, 40, 80, 20);
        addressLabel.setBounds(10, 70, 80, 20);
        phoneLabel.setBounds(10, 100, 80, 20);
        nameField.setBounds(100, 10, 150, 20);
        nimField.setBounds(100, 40, 150, 20);
        addressField.setBounds(100, 70, 150, 20);
        phoneField.setBounds(100, 100, 150, 20);
        showButton.setBounds(10, 130, 130, 30);
        clearButton.setBounds(140, 130, 80, 30);
        exitButton.setBounds(210, 130, 80, 30);

        // Menambahkan komponen ke panel 1
        panel1.add(nameLabel);
        panel1.add(nimLabel);
        panel1.add(addressLabel);
        panel1.add(phoneLabel);
        panel1.add(nameField);
        panel1.add(nimField);
        panel1.add(addressField);
        panel1.add(phoneField);
        panel1.add(showButton);
        panel1.add(clearButton);
        panel1.add(exitButton);

        // Menambahkan panel 1 ke JTabbedPane dengan judul "Panel 1"
        tabbedPane.addTab("Panel 1", panel1);

        // Menambahkan JTabbedPane ke frame
        frame.add(tabbedPane);

        // Menampilkan frame
        frame.setVisible(true);

        // Tindakan saat tombol "Tampilkan" ditekan (sama seperti sebelumnya)
        showButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String nim = nimField.getText();
                String address = addressField.getText();
                String phone = phoneField.getText();

                String message = "Nama: " + name + "\nNIM: " + nim + "\nAlamat: " + address + "\nNo. Telp: " + phone;
                JOptionPane.showMessageDialog(frame, message, "Data Mahasiswa", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        // Tindakan saat tombol "Clear" ditekan (sama seperti sebelumnya)
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nameField.setText("");
                nimField.setText("");
                addressField.setText("");
                phoneField.setText("");
            }
        });

        // Tindakan saat tombol "Keluar" ditekan (sama seperti sebelumnya)
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                createAndShowGUI();
            }
        });
    }
}

