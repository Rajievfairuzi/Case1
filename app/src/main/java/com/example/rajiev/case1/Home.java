package com.example.rajiev.case1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.Toast;

public class Home extends AppCompatActivity {
    LinearLayout klik1, klik2, klik3, klik4, klik5, klik6, klik7, klik8;
    Button klik;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        klik1 = findViewById(R.id.aji);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.drawable.heartstonelogo);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        klik1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Home.this, Tentang.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
                startActivity(intent);
            }
        });


        klik2 = findViewById(R.id.aji1);

        klik2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Home.this, Tentang.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
               intent.putExtra("Waktu Start",System.currentTimeMillis());
                startActivity(intent);
            }
        });

        klik3 = findViewById(R.id.aji2);

        klik3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Home.this, Tentang.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
                startActivity(intent);
            }
        });
        klik4 = findViewById(R.id.aji3);

        klik4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Home.this, Tentang.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
                startActivity(intent);
            }
        });
        klik5 = findViewById(R.id.aji4);

        klik5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Home.this, Tentang.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
                startActivity(intent);
            }
        });
        klik6 = findViewById(R.id.aji5);

        klik6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Home.this, Tentang.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
                startActivity(intent);
            }
        });

        klik7 = findViewById(R.id.aji6);

        klik7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Home.this, Tentang.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
                startActivity(intent);
            }
        });
        klik8 = findViewById(R.id.aji7);

        klik8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Home.this, Tentang.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
                startActivity(intent);
            }
        });

        klik =findViewById(R.id.tombol1);
        klik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Home.this,"more cards cliked",Toast.LENGTH_SHORT).show();
            }
        });
        Spinner spinner1 = (Spinner) findViewById(R.id.spinner1);
        Spinner spinner2 = (Spinner) findViewById(R.id.spinner2);
        Spinner spinner3 = (Spinner) findViewById(R.id.spinner3);

        // Initializing a String Array
        String[] isi1 = new String[]{
                "Game Guides"
        };
        String[] isi2 = new String[]{
                "Card Sets"
        };
        String[] isi3 = new String[]{
                "Community"
        };


        // Initializing an ArrayAdapter
        ArrayAdapter<String> spinnerArrayAdapter1 = new ArrayAdapter<String>(
                this,R.layout.spinner_dropdown_item,isi1
        );
        spinnerArrayAdapter1.setDropDownViewResource(R.layout.spinner_dropdown_item);
        spinner1.setAdapter(spinnerArrayAdapter1);

        ArrayAdapter<String> spinnerArrayAdapter2 = new ArrayAdapter<String>(
                this,R.layout.spinner_dropdown_item,isi2
        );
        spinnerArrayAdapter2.setDropDownViewResource(R.layout.spinner_dropdown_item);
        spinner2.setAdapter(spinnerArrayAdapter2);

        ArrayAdapter<String> spinnerArrayAdapter3 = new ArrayAdapter<String>(
                this,R.layout.spinner_dropdown_item,isi3
        );
        spinnerArrayAdapter3.setDropDownViewResource(R.layout.spinner_dropdown_item);
        spinner3.setAdapter(spinnerArrayAdapter3);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu,menu);
        MenuItem item = menu.findItem(R.id.spinner);
        Spinner spinner = (Spinner) item.getActionView();

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.android_dropdown_arrays, R.layout.spinner_item_toolbox);
        adapter.setDropDownViewResource(R.layout.sppinerkiri);

        spinner.setAdapter(adapter);
        return true;
    }
}
