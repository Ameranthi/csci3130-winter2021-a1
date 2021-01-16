package ca.dal.cs.csci3130.a1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button squareButton = (Button)findViewById(R.id.squareButton);

        squareButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                EditText numberEditField = (EditText)findViewById(R.id.numberEditField);
                //TextView resultView = (TextView) findViewById((R.id.textViewResult));

                int numberToBeSquared =  Integer.parseInt(numberEditField.getText().toString());
                int squaredNumber = numberToBeSquared * numberToBeSquared;

                //resultView.setText(squaredNumber+"");
                String result = "The square of " + numberToBeSquared + " is: " + squaredNumber;

                Toast toast = Toast.makeText(MainActivity.this,result, Toast.LENGTH_LONG);
                toast.setGravity(Gravity.CENTER_HORIZONTAL,0,0);
                toast.show();



            }
        });

    }
}