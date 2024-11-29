package observers;

import sensors.LightSensor;
import sensors.Sensor;
import sensors.TemperatureSensor;

public class Display implements Observer {
    @Override
    public void update(Sensor sensor) {
        if (sensor instanceof TemperatureSensor) {
            TemperatureSensor tempSensor = (TemperatureSensor) sensor;
            System.out.println("Temperaturanzeige: " + tempSensor.getTemperature() + "°C");
        } else if (sensor instanceof LightSensor) {
            LightSensor lightSensor = (LightSensor) sensor;
            System.out.println("Lichtanzeige: " + lightSensor.getLightLevel() + " Lumen");
        }
    }
}