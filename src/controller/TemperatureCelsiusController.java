package controller;

import model.TemperatureModel;

public class TemperatureCelsiusController {
    private final TemperatureModel temperatureModel;

    public TemperatureCelsiusController(TemperatureModel temperatureModel) {
        this.temperatureModel = temperatureModel;
    }

    public void updateTemperature(double temperature) {
        temperatureModel.setTemperatureCelsius(temperature);
    }
}
