package view;

import controller.TemperatureFahrenheitController;
import model.TemperatureModel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

public class TemperatureFahrenheitView implements Observer {
    private final JTextField temperatureTextField;
    private TemperatureFahrenheitController temperatureFarenheitController;

    public TemperatureFahrenheitView(TemperatureFahrenheitController temperatureFarenheitController) {
        JFrame jFrame = new JFrame();
        jFrame.setVisible(true);

        // Center JFrame
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        jFrame.setLocation(dim.width / 2 - jFrame.getSize().width / 2, dim.height / 2 - jFrame.getSize().height / 2);

        BorderLayout borderLayout = new BorderLayout();
        jFrame.setLayout(borderLayout);

        jFrame.add(new JLabel("Température (°F)"), BorderLayout.PAGE_START);
        temperatureTextField = new JTextField();
        jFrame.add(temperatureTextField, BorderLayout.CENTER);

        JButton temperatureSetButton = new JButton("Set Temperature");
        jFrame.add(temperatureSetButton, BorderLayout.PAGE_END);

        // Bien faire le setSize à la fin
        jFrame.setSize(150, 150);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Montrer en implémentant dans la classe (en tant qu'interface)
        temperatureSetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                temperatureFarenheitController.updateTemperature(getTemperature());
            }
        });
    }

    public void display(String temperature) {
        this.temperatureTextField.setText(temperature);
    }

    public double getTemperature() {
        double result = 0;
        try {
            result = Double.parseDouble(temperatureTextField.getText());
        } catch (NumberFormatException e) {
            System.out.println("Error with input temperature");
        }

        return result;
    }

    @Override
    public void update(Observable o, Object arg) {
        display("" + ((TemperatureModel) arg).getTemperatureFahrenheit());
    }
}
