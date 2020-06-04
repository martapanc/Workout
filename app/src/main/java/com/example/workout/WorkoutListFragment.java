package com.example.workout;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.ListFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.ArrayList;
import java.util.List;

public class WorkoutListFragment extends ListFragment {

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        List<String> names = new ArrayList<>();
        for (Workout w : Workout.workouts) {
            names.add(w.getName());
        }
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(
                inflater.getContext(), android.R.layout.simple_list_item_1, names
        );
        setListAdapter(arrayAdapter);

        return super.onCreateView(inflater, container, savedInstanceState);
    }
}