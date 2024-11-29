package sensors;

import observers.Observer;

import java.util.ArrayList;
import java.util.List;

public class LightSensor implements Sensor {
    private List<Observer> observers = new ArrayList<>();
    private int lightLevel; // Helligkeit in Lumen

    public void setLightLevel(int lightLevel) {
        this.lightLevel = lightLevel;
        notifyObservers();
    }

    public int getLightLevel() {
        return lightLevel;
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }
}
