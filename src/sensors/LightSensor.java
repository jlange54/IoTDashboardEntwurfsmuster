package sensors;

import observers.Observer;

import java.util.ArrayList;
import java.util.List;

public class LightSensor extends Sensor {
    private int lightLevel; // Helligkeit in Lumen

    public void setLightLevel(int lightLevel) {
        this.lightLevel = lightLevel;
        notifyObservers();
    }

    public int getLightLevel() {
        return lightLevel;
    }


}
