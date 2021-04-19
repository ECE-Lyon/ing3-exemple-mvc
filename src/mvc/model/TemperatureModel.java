package mvc.model;

import java.util.Observable;

public class TemperatureModel extends Observable {

    private double temperatureCelsius = 0;

    public double getTemperatureCelsius() {
        return temperatureCelsius;
    }

    public double getTemperatureFahrenheit() {
        return temperatureCelsius * 9 / 5 + 32;
    }

    public void setTemperatureCelsius(double temperatureCelsius) {
        this.temperatureCelsius = temperatureCelsius;
        setChanged();
        notifyObservers(this);
    }

    public void setTemperatureFahrenheit(double temperatureFahrenheit) {
        this.temperatureCelsius = (temperatureFahrenheit - 32) * 5 / 9;
        setChanged();
        notifyObservers(this);
    }
}
