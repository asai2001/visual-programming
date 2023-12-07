import Tugas3.Tugas;
import Tugas4.Workshop;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainApp extends JFrame {

    public MainApp() {
        setTitle("Rivaldo Diki_19533108");

        // Mengatur frame Java Swing
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);

        // Membuat JTabbedPane untuk Java Swing
        JTabbedPane tabbedPane = new JTabbedPane();
        JPanel panel1 = createPanelSatu();
        JPanel panel2 = createPanelDua();
        JPanel panel3 = createPanelTiga().getPanel();
        JFXPanel panel4 = new JFXPanel();
        Platform.runLater(() -> {
            BorderPane borderPane = createPanelEmpat();
            Scene scene = new Scene(borderPane, 300, 200);
            panel4.setScene(scene);
        });

        tabbedPane.addTab("Pertama", panel1);
        tabbedPane.addTab("Kedua", createJavaFXPanel());
        tabbedPane.addTab("Ketiga", panel3);
        tabbedPane.addTab("keempat", panel4);


        // Menambahkan JTabbedPane ke frame
        add(tabbedPane);

        setVisible(true);
    }

    private Tugas createPanelTiga() {
        return new Tugas();
    }

    private BorderPane createPanelEmpat() {
        Workshop workshop = new Workshop();
        return workshop.setupScene(); // Mengambil BorderPane dari kelas Workshop
    }



    private JPanel createPanelDua() {

        return null;
    }

    // Membuat panel pertama menggunakan Java Swing
    private JPanel createPanelSatu() {
        JPanel panel1 = new JPanel();
        panel1.setLayout(null);

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



        return panel1;
    }

    // Membuat panel kedua menggunakan JavaFX
    private JFXPanel createJavaFXPanel() {
        JFXPanel javafxPanel = new JFXPanel();

        // Menjalankan aplikasi JavaFX di JFXPanel
        SwingUtilities.invokeLater(() -> {
            // Membuat aplikasi JavaFX
            ComboExample javafxApp = new ComboExample();

            // Membuat stage untuk menampilkan JavaFXApp
            javafxPanel.setScene(javafxApp.createScene());
        });

        return javafxPanel;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MainApp());
    }
}

// Kelas ComboExample dari JavaFX
class ComboExample extends Application {
    private Scene scene;

    @Override
    public void start(Stage primaryStage) {
        // Kode dari ComboExample (JavaFX) yang digunakan sebelumnya
        // ...

        primaryStage.setTitle("Combo Selection App");
        primaryStage.setScene(scene);
    }

    // Membuat Scene dari ComboExample
    public Scene createScene() {

        // Membuat ComboBox untuk Makanan
        ComboBox<String> comboMakanan = new ComboBox<>();
        comboMakanan.getItems().addAll("Makanan ");

        // Membuat ComboBox untuk Minuman
        ComboBox<String> comboMinuman = new ComboBox<>();
        comboMinuman.getItems().addAll("Minuman ");

        // Membuat ComboBox untuk Sayuran
        ComboBox<String> comboSayuran = new ComboBox<>();
        comboSayuran.getItems().addAll("Sayuran ");

        // Membuat TextField untuk menampilkan hasil seleksi
        TextField hasilTextField = new TextField();
        hasilTextField.setEditable(false);

        // Membuat Button untuk menampilkan hasil seleksi
        Button tampilkanButton = new Button("Tampilkan Pilihan");

        tampilkanButton.setOnAction(e -> {
            String makananTerpilih = comboMakanan.getValue();
            String minumanTerpilih = comboMinuman.getValue();
            String sayuranTerpilih = comboSayuran.getValue();

            String hasilSeleksi = makananTerpilih + minumanTerpilih + sayuranTerpilih;
            hasilTextField.setText(hasilSeleksi);
        });

        // Membuat layout dan menambahkan komponen-komponen ke dalamnya
        VBox layout = new VBox(10);
        layout.setPadding(new Insets(10));
        layout.getChildren().addAll(comboMakanan, comboMinuman, comboSayuran, tampilkanButton, hasilTextField);

        scene = new Scene(layout, 300, 200);
        return scene;
    }

    public static void main(String[] args) {
        launch(args);
    }
}