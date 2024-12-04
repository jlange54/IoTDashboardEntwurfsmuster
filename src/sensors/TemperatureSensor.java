package sensors;

import observers.Observer;

import java.util.ArrayList;
import java.util.List;

public class TemperatureSensor extends Sensor {
    private float temperature;

    public void setTemperature(float temperature) {
        this.temperature = temperature;
        notifyObservers();
    }

    public float getTemperature() {
        return temperature;
    }
}
