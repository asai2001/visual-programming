package Tugas1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InputDataMahasiswa {
    public static void createAndShowGUI() {
        // Membuat JFrame
        JFrame frame = new JFrame("Input Data Mahasiswa");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(null);

        // Membuat komponen-komponen yang dibutuhkan
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

        // Menentukan posisi dan ukuran komponen
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

        // Menambahkan komponen ke frame
        frame.add(nameLabel);
        frame.add(nimLabel);
        frame.add(addressLabel);
        frame.add(phoneLabel);
        frame.add(nameField);
        frame.add(nimField);
        frame.add(addressField);
        frame.add(phoneField);
        frame.add(showButton);
        frame.add(clearButton);
        frame.add(exitButton);

        frame.setVisible(true);

        // Mengatur tindakan saat tombol "Tampilkan" ditekan
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

        // Mengatur tindakan saat tombol "Clear" ditekan
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nameField.setText("");
                nimField.setText("");
                addressField.setText("");
                phoneField.setText("");
            }
        });

        // Mengatur tindakan saat tombol "Keluar" ditekan
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
