package Tugas4;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.Arrays;
import java.util.List;

public class Workshop extends Application {

    private TextArea areaKota;
    private ComboBox<String> cbMakanan;
    private ListView<String> listMinuman;

    @Override
    public void start(Stage primaryStage) {
        BorderPane root = new BorderPane();

        // Inisialisasi komponen GUI
        areaKota = new TextArea();
        areaKota.setPrefColumnCount(20);
        areaKota.setPrefRowCount(10);
        ScrollPane scrollPaneKota = new ScrollPane(areaKota);
        scrollPaneKota.setFitToWidth(true);
        VBox vboxKota = new VBox(new Label("Daftar Kota"), scrollPaneKota);

        cbMakanan = new ComboBox<>();
        cbMakanan.setPrefWidth(150);
        VBox vboxMakanan = new VBox(new Label("Daftar Makanan"), cbMakanan);

        listMinuman = new ListView<>();
        listMinuman.setPrefWidth(150);
        listMinuman.setPrefHeight(150);
        ScrollPane scrollPaneMinuman = new ScrollPane(listMinuman);
        scrollPaneMinuman.setFitToWidth(true);
        VBox vboxMinuman = new VBox(new Label("Daftar Minuman"), scrollPaneMinuman);

        // Tombol-tombol
        Button btTambah = new Button("Tambah");
        Button btSisip = new Button("Sisip");
        Button btHapus = new Button("Hapus");
        Button btUbah = new Button("Ubah");

        TextField eUbah = new TextField();
        eUbah.setPromptText("Masukkan teks");

        VBox vboxButtons = new VBox(10, btTambah, btSisip, btHapus, btUbah, eUbah);
        vboxButtons.setPadding(new Insets(10));

        // Setup aksi untuk tombol-tombol
        btTambah.setOnAction(e -> tambahData());
        btSisip.setOnAction(e -> sisipData());
        btHapus.setOnAction(e -> hapusData());

        VBox mainVBox = new VBox(vboxKota, vboxButtons);
        mainVBox.setSpacing(10);
        root.setLeft(mainVBox);
        root.setCenter(vboxMakanan);
        root.setRight(vboxMinuman);

        Scene scene = new Scene(root, 600, 400);
        primaryStage.setTitle("Rivaldo Diki_19533108");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    // Metode untuk menambahkan data ke komponen GUI
    private void tambahData() {
        List<String> daftarKota = Arrays.asList("Gresik", "Malang", "Surabaya");
        areaKota.setText(String.join("\n", daftarKota));

        List<String> daftarMakanan = Arrays.asList("Rujak", "Rawon", "Sate");
        cbMakanan.setItems(FXCollections.observableList(daftarMakanan));

        List<String> daftarMinuman = Arrays.asList("Sprite", "Fanta", "Es Batu", "Kopi");
        listMinuman.setItems(FXCollections.observableList(daftarMinuman));
    }

    // Metode untuk menyisipkan data ke komponen GUI
    private void sisipData() {
        // Data yang akan disisipkan
        String dataKotaBaru = "Ponorogo";
        String dataMakananBaru = "Nasi Padang";
        String dataMinumanBaru = "Es Campur";

        // Sisipkan data ke komponen GUI
        String existingData = areaKota.getText();
        areaKota.setText(existingData + "\n" + dataKotaBaru);

        cbMakanan.getItems().add(dataMakananBaru);

        listMinuman.getItems().add(dataMinumanBaru);
    }

    // Metode untuk menghapus data dari komponen GUI
    private void hapusData() {
        // Hapus kota pertama dari AreaKota
        String existingData = areaKota.getText();
        if (!existingData.isEmpty()) {
            int index = existingData.indexOf('\n');
            if (index != -1) {
                areaKota.setText(existingData.substring(index + 1));
            } else {
                areaKota.clear();
            }
        }

        // Hapus makanan pertama dari CbMakanan
        if (!cbMakanan.getItems().isEmpty()) {
            cbMakanan.getItems().remove(0);
        }

        // Hapus minuman pertama dari ListMinuman
        if (!listMinuman.getItems().isEmpty()) {
            listMinuman.getItems().remove(0);
        }
    }

    // Metode untuk mengembalikan BorderPane dari kelas Workshop
    public BorderPane setupScene() {
        BorderPane root = new BorderPane();
        // Inisialisasi komponen GUI
        areaKota = new TextArea();
        areaKota.setPrefColumnCount(20);
        areaKota.setPrefRowCount(10);
        ScrollPane scrollPaneKota = new ScrollPane(areaKota);
        scrollPaneKota.setFitToWidth(true);
        VBox vboxKota = new VBox(new Label("Daftar Kota"), scrollPaneKota);

        cbMakanan = new ComboBox<>();
        cbMakanan.setPrefWidth(150);
        VBox vboxMakanan = new VBox(new Label("Daftar Makanan"), cbMakanan);

        listMinuman = new ListView<>();
        listMinuman.setPrefWidth(150);
        listMinuman.setPrefHeight(150);
        ScrollPane scrollPaneMinuman = new ScrollPane(listMinuman);
        scrollPaneMinuman.setFitToWidth(true);
        VBox vboxMinuman = new VBox(new Label("Daftar Minuman"), scrollPaneMinuman);

        // Tombol-tombol
        Button btTambah = new Button("Tambah");
        Button btSisip = new Button("Sisip");
        Button btHapus = new Button("Hapus");
        Button btUbah = new Button("Ubah");

        TextField eUbah = new TextField();
        eUbah.setPromptText("Masukkan teks");

        VBox vboxButtons = new VBox(10, btTambah, btSisip, btHapus, btUbah, eUbah);
        vboxButtons.setPadding(new Insets(10));

        // Setup aksi untuk tombol-tombol
        btTambah.setOnAction(e -> tambahData());
        btSisip.setOnAction(e -> sisipData());
        btHapus.setOnAction(e -> hapusData());

        VBox mainVBox = new VBox(vboxKota, vboxButtons);
        mainVBox.setSpacing(10);
        root.setLeft(mainVBox);
        root.setCenter(vboxMakanan);
        root.setRight(vboxMinuman);
        return root;
    }

    public static void main(String[] args) {
        launch(args);
    }
}