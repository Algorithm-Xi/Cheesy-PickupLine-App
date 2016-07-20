package com.test.pickupline;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Grab clean button so we can do stuff with it;
        Button cleanButton = (Button) findViewById(R.id.cleanButton);
        final Button dirtyButton = (Button) findViewById(R.id.dirtyButton);

        final String pickLine = "You had me at hellow world";

        cleanButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                dirtyButton.setText(pickLine);
                





            }

        });

        //Event Handler



    }
}
