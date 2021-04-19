package controller;

import model.TemperatureModel;

public class TemperatureFahrenheitController {
    private final TemperatureModel temperatureModel;

    public TemperatureFahrenheitController(TemperatureModel temperatureModel) {
        this.temperatureModel = temperatureModel;
    }

    public void updateTemperature(double temperature) {
        temperatureModel.setTemperatureFahrenheit(temperature);
    }
}
