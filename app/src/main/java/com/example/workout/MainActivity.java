package com.example.workout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WorkoutDetailFragment workoutDetailFragment =
                (WorkoutDetailFragment) getSupportFragmentManager().findFragmentById(R.id.detail_flag);
        workoutDetailFragment.setWorkout(1);
    }
}