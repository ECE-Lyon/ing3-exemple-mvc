package mvc.controller;

import mvc.model.TemperatureModel;

public class TemperatureCelsiusController {

    private TemperatureModel temperatureModel;

    public TemperatureCelsiusController(TemperatureModel temperatureModel) {
        this.temperatureModel = temperatureModel;
    }

    public void updateTemperature(double temperature) {
        temperatureModel.setTemperatureCelsius(temperature);
    }
}
