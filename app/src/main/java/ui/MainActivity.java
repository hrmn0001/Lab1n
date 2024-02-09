package ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.lab1n.R;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.lab1n.R;
import com.example.lab1n.R.ActivityMainBinding;


import data.MainViewmodel;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding variableBinding;
    private MainViewmodel model;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        variableBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(variableBinding.getRoot());



        setContentView(R.layout.activity_main);
         EditText myedit = findViewById(R.id.editTextText);
        Button mybutton = findViewById(R.id.button);
        //TextView mytext= findViewById (R.id.textview);

        TextView mytext = findViewById(R.id.txt);
        mybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String editTextContent = myedit.getText().toString();
                mytext.setText("Your Name Is: " + editTextContent);
            }
        });
        model = new ViewModelProvider(this).get(MainViewmodel.class);

        model.isSelected.observe(this,selected->{
            variableBinding.chk1.setChecked(selected);
            variableBinding.rd1.setChecked(selected);
            variableBinding.swt1.setChecked(selected);
        });


        variableBinding.chk1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                // Respond to the checked state change
                if (isChecked) {
                    // Checkbox is checked
                    Toast.makeText(MainActivity.this, "Checkbox Checked", Toast.LENGTH_SHORT).show();
                } else {
                    // Checkbox is unchecked
                    Toast.makeText(MainActivity.this, "Checkbox Unchecked", Toast.LENGTH_SHORT).show();
                }
            }
        });
        variableBinding.rd1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                // Respond to the checked state change
                if (isChecked) {
                    // Checkbox is checked
                    Toast.makeText(MainActivity.this, "Radio Button Checked", Toast.LENGTH_SHORT).show();
                } else {
                    // Checkbox is unchecked
                    Toast.makeText(MainActivity.this, "Radio Button Unchecked", Toast.LENGTH_SHORT).show();
                }
            }
        });

        variableBinding.swt1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                // Respond to the checked state change
                if (isChecked) {
                    // Checkbox is checked
                    Toast.makeText(MainActivity.this, "Switch Checked", Toast.LENGTH_SHORT).show();
                } else {
                    // Checkbox is unchecked
                    Toast.makeText(MainActivity.this, "Switch Unchecked", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}