package services.com.serviceexample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //button objects
    private Button buttonStart;
    private Button buttonStop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonStart = findViewById(R.id.buttonStart);
        buttonStop = findViewById(R.id.buttonStop);
        buttonStart.setOnClickListener(this);
        buttonStop.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view == buttonStart) {
            Toast.makeText(getApplicationContext(), "Service Started", Toast.LENGTH_LONG).show();
            // Start the service here
            startService(new Intent(this, AmodService.class));
        } else if (view == buttonStop) {
            // Stop the service here
            stopService(new Intent(this, AmodService.class));
            Toast.makeText(getApplicationContext(), "Service Stoped", Toast.LENGTH_LONG).show();
        }
    }
}
