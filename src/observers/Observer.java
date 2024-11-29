package observers;

import sensors.Sensor;

public interface Observer {
    void update(Sensor sensor);
}
