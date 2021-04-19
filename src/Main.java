import controller.TemperatureCelsiusController;
import controller.TemperatureFahrenheitController;
import model.TemperatureModel;
import view.TemperatureCelsiusView;
import view.TemperatureFahrenheitView;

public class Main {
    public static void main(String[] args) {
        TemperatureModel temperatureModel = new TemperatureModel();

        TemperatureCelsiusController temperatureCelsiusController = new TemperatureCelsiusController(temperatureModel);
        TemperatureFahrenheitController temperatureFahrenheitController = new TemperatureFahrenheitController(temperatureModel);

        TemperatureCelsiusView temperatureCelsiusView = new TemperatureCelsiusView(temperatureCelsiusController);
        TemperatureFahrenheitView temperatureFahrenheitView = new TemperatureFahrenheitView(temperatureFahrenheitController);

        temperatureModel.addObserver(temperatureCelsiusView);
        temperatureModel.addObserver(temperatureFahrenheitView);
    }
}
