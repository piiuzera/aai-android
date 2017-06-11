package br.com.amarocorp.aaiandroid;

import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private SensorManager sensor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sensor = (SensorManager) getSystemService(SENSOR_SERVICE);

        for (Sensor objSensor : sensor.getSensorList(Sensor.TYPE_ALL)) {
            System.out.println(objSensor.getName());
        }
    }
}
