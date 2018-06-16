package com.example.kholis.dropdownlist;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Spinner spinner1, spinner2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner1 = (Spinner)findViewById(R.id.spinner1);
        spinner2 = (Spinner)findViewById(R.id.spinner2);

        spinner1.setOnItemSelectedListener(new ItemSelectedListener());
       // spinner2.setOnItemSelectedListener(new ItemSelectedListener());
    }

    public class ItemSelectedListener implements AdapterView.OnItemSelectedListener{
        String firstItem = String.valueOf(spinner1.getSelectedItem());
        //String secondItem = String.valueOf(spinner2.getSelectedItem());

        public void onItemSelected(AdapterView<?> parent, View view, int pos, long id){
            if(firstItem.equals(String.valueOf(spinner1.getSelectedItem()))){
                //ToDo when first item selected
            }
            else {
                Toast.makeText(parent.getContext(),
                        "You have selected : "+parent.getItemIdAtPosition(pos),Toast.LENGTH_LONG).show();
            }
        }

        @Override
        public void onNothingSelected(AdapterView<?> parent) {

        }
    }
}
