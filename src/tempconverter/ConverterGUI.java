package tempconverter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ConverterGUI extends JFrame {
    private JTextField inputField;
    private JButton toCelsiusButton;
    private JButton toFahrenheitButton;
    private JLabel resultLabel;

    private TemperatureConverter converter;

    public ConverterGUI() {
        inputField = new JTextField(15);
        toCelsiusButton = new JButton("To Celsius");
        toFahrenheitButton = new JButton("To Fahrenheit");
        resultLabel = new JLabel("Result: ");


        converter = new TemperatureConverter();

        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        add(new JLabel("Enter Temperature:"));
        add(Box.createVerticalStrut(10));
        add(inputField);
        add(Box.createVerticalStrut(10));
        add(toCelsiusButton);
        add(Box.createVerticalStrut(10));
        add(toFahrenheitButton);
        add(Box.createVerticalStrut(10));
        add(resultLabel);

        setSize(400, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        toCelsiusButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double inputTemperature = Double.parseDouble(inputField.getText());
                    double convertedTemperature = converter.fahrenheitToCelsius(inputTemperature);
                    resultLabel.setText("Result: " + convertedTemperature + " °C");
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Invalid input! Please enter a valid number.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        toFahrenheitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double inputTemperature = Double.parseDouble(inputField.getText());
                    double convertedTemperature = converter.celsiusToFahrenheit(inputTemperature);
                    resultLabel.setText("Result: " + convertedTemperature + " °F");
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Invalid input! Please enter a valid number.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }
}
