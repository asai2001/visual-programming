package Tugas2;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ComboExample extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Combo Selection App");

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

        Scene scene = new Scene(layout, 300, 200);
        primaryStage.setScene(scene);

        primaryStage.show();
    }
}


