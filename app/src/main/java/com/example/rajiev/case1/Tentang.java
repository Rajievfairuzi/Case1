package com.example.rajiev.case1;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

public class Tentang extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tentang);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.drawable.heartstonelogo);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
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
//        String kata1 = " Type :";
//        String kata2 = " minion";
//        SpannableString text = new SpannableString(kata1+kata2);
//        text.setSpan(new StyleSpan(Typeface.BOLD),0,kata1.length(),0);
//        TextView textView = (TextView) findViewById(R.id.matul);
//        textView.setText(text, TextView.BufferType.SPANNABLE);



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
