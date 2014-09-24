package com.example.chenimage;

import com.example.Jinx.JinxActivity;
import com.example.Kat.KatActivity;
import com.example.Teemo.TeemoActivity;
import com.example.simplefeng.Simplefrg;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;



public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    
    public void simple(View v){
    	Intent intent = new Intent(getApplicationContext(), Simplefrg.class);
    	startActivity(intent);
    }
    
    public void Teemo(View v){
    	Intent intent = new Intent(getApplicationContext(), TeemoActivity.class);
    	startActivity(intent);
    }
    
    public void Jinx(View v){
    	Intent intent = new Intent(getApplicationContext(), JinxActivity.class);
    	startActivity(intent);
    }
    
    public void Kat(View v){
    	Intent intent = new Intent(getApplicationContext(), KatActivity.class);
    	startActivity(intent);
    }
}
