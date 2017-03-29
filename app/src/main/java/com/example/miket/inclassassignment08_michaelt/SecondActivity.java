package com.example.miket.inclassassignment08_michaelt;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public void updateName(View view) {
        FirebaseDatabase database = FirebaseDatabase.getInstance();

        EditText eName= (EditText) findViewById(R.id.name);
        String name= eName.getText().toString();
        DatabaseReference myRef = database.getReference("name");

        myRef.setValue(name);

        TextView tName= (TextView) findViewById(R.id.set_name);
        tName.setText(name);


    }
}
