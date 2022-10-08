package com.example.akasztofa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    private Button pluszBtn;
    private Button minuszBtn;
    private Button tippBtn;
    private TextView valasztottBetu;
    private TextView kitalalt;
    private ImageView eletek;
    private String[] alphabet;
    private Character abc;
    private int alphabetSzamlalo;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        addListener();
    }

    private void addListener()
    {
        pluszBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                if (alphabetSzamlalo > alphabet.length)
                {
                    alphabetSzamlalo = 0;
                    valasztottBetu.setText(String.valueOf(alphabet[alphabetSzamlalo]));
                }
                else
                {
                    alphabetSzamlalo++;
                    valasztottBetu.setText(String.valueOf(alphabet[alphabetSzamlalo]));
                }

            }
        });

        minuszBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                if (alphabetSzamlalo < 0)
                {
                    alphabetSzamlalo = alphabet.length;
                    valasztottBetu.setText(String.valueOf(alphabet[alphabetSzamlalo]));
                }
                else
                {
                    alphabetSzamlalo--;
                    valasztottBetu.setText(String.valueOf(alphabet[alphabetSzamlalo]));
                }

            }
        });
    }

    private void init()
    {
        pluszBtn = findViewById(R.id.plusz_btn);
        minuszBtn = findViewById(R.id.minusz_btn);
        tippBtn = findViewById(R.id.tipp_btn);
        valasztottBetu = findViewById(R.id.valasztottBetu);
        kitalalt = findViewById(R.id.kitalalt);
        eletek = findViewById(R.id.eletek);
        alphabet = new String[]{"A","B","C","D","E","F","G","H","I", "J", "K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        //abc = new Character("d", "d");
        alphabetSzamlalo = 0;

    }
}