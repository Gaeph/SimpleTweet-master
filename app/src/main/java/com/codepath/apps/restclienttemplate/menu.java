package com.codepath.apps.restclienttemplate;

import android.view.Menu;

import androidx.appcompat.app.AppCompatActivity;

public class menu extends AppCompatActivity {
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return super.onCreateOptionsMenu(menu);
    }
}
