import controller.TemperatureCelsiusController;
import controller.TemperatureFarenheitController;
import model.TemperatureModel;
import view.TemperatureCelsiusView;
import view.TemperatureFarenheitView;

public class Main {
    public static void main(String[] args) {
        TemperatureModel temperatureModel = new TemperatureModel();

        TemperatureCelsiusController temperatureCelsiusController = new TemperatureCelsiusController(temperatureModel);
        TemperatureFarenheitController temperatureFarenheitController = new TemperatureFarenheitController(temperatureModel);

        TemperatureCelsiusView temperatureCelsiusView = new TemperatureCelsiusView(temperatureCelsiusController);
        TemperatureFarenheitView temperatureFarenheitView = new TemperatureFarenheitView(temperatureFarenheitController);

        temperatureModel.addObserver(temperatureCelsiusView);
        temperatureModel.addObserver(temperatureFarenheitView);
    }
}
