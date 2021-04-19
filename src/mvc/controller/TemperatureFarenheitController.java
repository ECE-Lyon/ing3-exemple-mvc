package mvc.controller;

import mvc.model.TemperatureModel;

public class TemperatureFarenheitController {

    private TemperatureModel temperatureModel;

    public TemperatureFarenheitController(TemperatureModel temperatureModel) {
        this.temperatureModel = temperatureModel;
    }

    public void updateTemperature(double temperature) {
        temperatureModel.setTemperatureFahrenheit(temperature);
    }
}
