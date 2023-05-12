package com.example.fragmeth;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        navigateToFragment();
    }

    private void navigateToFragment() {
        getSupportFragmentManager().beginTransaction().add(R.id.fragment_container_view, new FeFragment()).commit();
    }
}