package mvc;

import mvc.controller.TemperatureCelsiusController;
import mvc.controller.TemperatureFarenheitController;
import mvc.model.TemperatureModel;
import mvc.view.TemperatureCelsiusView;
import mvc.view.TemperatureFarenheitView;

public class Main {

    public static void main(String[] args) {
        TemperatureModel temperatureModel = new TemperatureModel();

        // Montrer avec un seul controller
        TemperatureCelsiusController temperatureCelsiusController = new TemperatureCelsiusController(temperatureModel);
        TemperatureFarenheitController temperatureFarenheitController = new TemperatureFarenheitController(temperatureModel);

        TemperatureCelsiusView temperatureCelsiusView = new TemperatureCelsiusView(temperatureCelsiusController);
        TemperatureFarenheitView temperatureFarenheitView = new TemperatureFarenheitView(temperatureFarenheitController);

        temperatureModel.addObserver(temperatureCelsiusView);
        temperatureModel.addObserver(temperatureFarenheitView);
    }
}
