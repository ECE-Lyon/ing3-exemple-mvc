package controller;

import model.TemperatureModel;

public class TemperatureFarenheitController {
    private final TemperatureModel temperatureModel;

    public TemperatureFarenheitController(TemperatureModel temperatureModel) {
        this.temperatureModel = temperatureModel;
    }

    public void updateTemperature(double temperature) {
        temperatureModel.setTemperatureFahrenheit(temperature);
    }
}
