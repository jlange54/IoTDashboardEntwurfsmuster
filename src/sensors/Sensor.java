package sensors;

import observers.Observer;

public interface Sensor {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
