package tempconverter;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                ConverterGUI gui = new ConverterGUI();
                gui.setTitle("Temperature Converter");
                gui.setSize(400, 200);
                gui.setLocationRelativeTo(null);
                gui.setVisible(true);
                gui.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
            }
        });
    }
}
