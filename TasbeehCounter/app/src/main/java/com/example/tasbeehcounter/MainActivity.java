package com.example.tasbeehcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String[] zikar={"Kalma Tayyaba","Ayat Karima","Subhanallah","Surah Ikhlaas"};

    TextView show;
    int result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Spinner spin = (Spinner) findViewById(R.id.simpleSpinner);
        ArrayAdapter aa = new ArrayAdapter(this,android.R.layout.simple_spinner_item,zikar);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin.setAdapter(aa);


        spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                ImageView simpleImageView=(ImageView) findViewById(R.id.simpleImageView);
                if(zikar[position].equals("Subhanallah")) {
                    simpleImageView.setImageResource(R.drawable.subhanallah_wabihamdihi);
                }
                else if (zikar[position].equals("Ayat Karima")){
                    simpleImageView.setImageResource(R.drawable.ayat_karima);
                }
                else if (zikar[position].equals("Kalma Tayyaba")){
                    simpleImageView.setImageResource(R.drawable.kalma);
                }
                else if (zikar[position].equals("Surah Ikhlaas")){
                    simpleImageView.setImageResource(R.drawable.surah_ikhlas);
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                spin.setPrompt("Select zikar");
            }
        });
//        ImageView simpleImageView=(ImageView) findViewById(R.id.simpleImageView);
//        simpleImageView.setImageResource(R.drawable.subhanallah_wabihamdihi);

        show=(TextView)findViewById(R.id.countText);


    }


    public void Increment (View view){
        result++;
        show.setText(Integer.toString(result));
    }
    public void Clear (View view){
        result=0;
        show.setText(Integer.toString(result));
    }
}
