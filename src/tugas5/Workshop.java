package tugas5;


import javax.swing.*;
import java.awt.*;
import java.time.LocalDate;
import java.util.Scanner;

public class Workshop {

    public static void main(String[] args) {

        // Setup input for each student
        String[] inputNames = {"First", "Second", "Third", "Fourth", "Fifth"};
        String[] inputNIMs = {"NIM 1", "NIM 2", "NIM 3", "NIM 4", "NIM 5"};

        // Setup frame
        JFrame frame = new JFrame("Student Details");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setLayout(new GridLayout(0, 1));

        // Loop through each student
        for (int i = 0; i < inputNames.length; i++) {

            // Create labels
            JLabel nameLabel = new JLabel(inputNames[i]);
            JLabel nimLabel = new JLabel(inputNIMs[i]);

            // Add labels to frame
            frame.add(nameLabel);
            frame.add(nimLabel);
        }

        // Show frame
        frame.setVisible(true);
    }
}