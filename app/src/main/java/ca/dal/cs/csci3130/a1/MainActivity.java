package ca.dal.cs.csci3130.a1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button squareButton = (Button)findViewById(R.id.squareButton);

        squareButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                EditText numberEditField = (EditText)findViewById(R.id.numberEditField);
                TextView resultView = (TextView) findViewById((R.id.textViewResult));

                int numberToBeSquared =  Integer.parseInt(numberEditField.getText().toString());
                int squaredNumber = numberToBeSquared * numberToBeSquared;

                resultView.setText(squaredNumber+"");

            }
        });

    }
}