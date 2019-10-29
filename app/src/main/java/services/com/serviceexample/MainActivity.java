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

        //getting buttons from xml
        buttonStart = (Button) findViewById(R.id.buttonStart);
        buttonStop = (Button) findViewById(R.id.buttonStop);

        //attaching onclicklistener to buttons
        buttonStart.setOnClickListener(this);
        buttonStop.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view == buttonStart) {
            Toast.makeText(getApplicationContext(), "Service Start", Toast.LENGTH_LONG).show();
            //start the service here
            startService(new Intent(this, MyService.class));
        } else if (view == buttonStop) {
            //stop the service here
            stopService(new Intent(this, MyService.class));
            Toast.makeText(getApplicationContext(), "Service Stop", Toast.LENGTH_LONG).show();
        }
    }
}
