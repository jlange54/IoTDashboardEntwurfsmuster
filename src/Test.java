import observers.Alarm;
import observers.Display;
import sensors.LightSensor;
import sensors.TemperatureSensor;

public class Test {
    public static void main(String[] args) {
        // Sensoren erstellen
        TemperatureSensor tempSensor = new TemperatureSensor();
        LightSensor lightSensor = new LightSensor();

        // Beobachter erstellen
        Display display = new Display();
        Alarm alarm = new Alarm();

        // Beobachter an die Sensoren binden
        tempSensor.addObserver(display);
        tempSensor.addObserver(alarm);

        lightSensor.addObserver(display);
        lightSensor.addObserver(alarm);

        // Sensoren auslösen
        System.out.println("Ändere Temperatur auf 25°C:");
        tempSensor.setTemperature(25);

        System.out.println("Ändere Temperatur auf 35°C:");
        tempSensor.setTemperature(35);

        System.out.println("Ändere Lichtlevel auf 80 Lumen:");
        lightSensor.setLightLevel(80);

        System.out.println("Ändere Lichtlevel auf 30 Lumen:");
        lightSensor.setLightLevel(30);
    }
}