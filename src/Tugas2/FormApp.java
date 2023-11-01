package Tugas2;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class FormApp extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Form App");

        // Membuat input NIM
        Label nimLabel = new Label("NIM:");
        TextField nimTextField = new TextField();

        // Membuat input Nama
        Label namaLabel = new Label("Nama:");
        TextField namaTextField = new TextField();

        // Membuat ComboBox untuk Agama
        Label agamaLabel = new Label("Agama:");
        ComboBox<String> agamaComboBox = new ComboBox<>();
        agamaComboBox.getItems().addAll("Islam", "Kristen", "Budha");

        // Membuat ComboBox untuk Jenis Kelamin
        Label jenisKelaminLabel = new Label("Jenis Kelamin:");
        ComboBox<String> jenisKelaminComboBox = new ComboBox<>();
        jenisKelaminComboBox.getItems().addAll("Pria", "Wanita");

        // Membuat Button untuk Proses
        Button prosesButton = new Button("Proses");

        // Membuat TextField untuk menampilkan hasil seleksi
        TextArea hasilTextArea = new TextArea();
        hasilTextArea.setEditable(false);

        // Membuat Button untuk Clear
        Button clearButton = new Button("Clear");
        clearButton.setOnAction(e -> {
            nimTextField.clear();
            namaTextField.clear();
            agamaComboBox.setValue(null);
            jenisKelaminComboBox.setValue(null);
            hasilTextArea.clear();
        });

        // Membuat Button untuk Exit
        Button exitButton = new Button("Exit");
        exitButton.setOnAction(e -> primaryStage.close());

        // Event handler untuk tombol Proses
        prosesButton.setOnAction(e -> {
            String nim = nimTextField.getText();
            String nama = namaTextField.getText();
            String agama = agamaComboBox.getValue();
            String jenisKelamin = jenisKelaminComboBox.getValue();

            String hasil = "NIM: " + nim + "\n" +
                    "Nama: " + nama + "\n" +
                    "Agama: " + agama + "\n" +
                    "Jenis Kelamin: " + jenisKelamin;

            hasilTextArea.setText(hasil);
        });

        // Membuat layout dan menambahkan komponen-komponen ke dalamnya
        VBox layout = new VBox(10);
        layout.setPadding(new Insets(10));
        layout.getChildren().addAll(nimLabel, nimTextField, namaLabel, namaTextField, agamaLabel, agamaComboBox,
                jenisKelaminLabel, jenisKelaminComboBox, prosesButton, clearButton, exitButton, hasilTextArea);

        Scene scene = new Scene(layout, 400, 300);
        primaryStage.setScene(scene);

        primaryStage.show();
    }
}

