package observers;

import sensors.LightSensor;
import sensors.Sensor;
import sensors.TemperatureSensor;

public class Alarm implements Observer {
    @Override
    public void update(Sensor sensor) {
        if (sensor instanceof TemperatureSensor) {
            TemperatureSensor tempSensor = (TemperatureSensor) sensor;
            if (tempSensor.getTemperature() > 30) {
                System.out.println("Alarm! Temperatur zu hoch: " + tempSensor.getTemperature() + "°C");
            }
        } else if (sensor instanceof LightSensor) {
            LightSensor lightSensor = (LightSensor) sensor;
            if (lightSensor.getLightLevel() < 50) {
                System.out.println("Alarm! Lichtlevel zu niedrig: " + lightSensor.getLightLevel() + " Lumen");
            }
        }
    }
}
