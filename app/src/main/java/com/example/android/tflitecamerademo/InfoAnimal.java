package com.example.android.tflitecamerademo;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.widget.TextView;
import android.widget.Toast;

public class InfoAnimal extends Activity {

    private TextView txt_especie;
    private TextView txt_informacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_animal);

        txt_especie = (TextView) findViewById(R.id.textView2);
        txt_informacion = (TextView) findViewById(R.id.editText);

        final String sender=this.getIntent().getExtras().getString("SENDER_KEY");

        if(sender != null)
        {
            this.receiveData();
            Toast.makeText(this, "Received", Toast.LENGTH_SHORT).show();

        }

    }


    private void receiveData()
    {
        //RECEIVE DATA VIA INTENT
        Intent i = getIntent();
        String name = i.getStringExtra("NAME_KEY");
        String especie_animal = i.getStringExtra("ANIMAL");

        //SET DATA TO TEXTVIEWS
        txt_especie.setText(especie_animal);


        /*
        josue - Aqui va el codigo para que le agreges lo de la imagen y la
                info, no le pude quitar esa mierda de ms a la info que viene
                txt_especie & txt_informacion son los que se llenan con la info
                creo q solo eso
        * */

    }

}
