package com.dawn.tema1dawn.fragments;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.dawn.tema1dawn.Adapter.AnimalAdapter;
import com.dawn.tema1dawn.R;
import com.dawn.tema1dawn.models.animal_as;
import com.dawn.tema1dawn.models.animals;
import com.dawn.tema1dawn.models.animal_af;
import com.dawn.tema1dawn.models.animal_am;
import com.dawn.tema1dawn.models.animal_au;
import com.temadawn.models.Entertainment;

import java.util.ArrayList;
import java.util.List;

public class RecycleView extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_animal_recycle, container, false);

        return view;
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        RecyclerView recyclerView = view.findViewById(R.id.rv_animals);
        List<Entertainment> animals=new ArrayList<>();
        animals.add(new animals("Cerb","Europe"));
        animals.add(new animal_am("Raton","America"));
        animals.add(new animal_au("Cangur","Australia"));
        animals.add(new animal_af("Papagal","Africa"));
        animals.add(new animal_as("Red Panda","Asia"));
        animals.add(new animals("Cerb","Europe"));
        animals.add(new animal_am("Raton","America"));
        animals.add(new animal_au("Cangur","Australia"));
        animals.add(new animal_af("Papagal","Africa"));
        animals.add(new animal_as("Red Panda","Asia"));
        animals.add(new animals("Cerb","Europe"));
        animals.add(new animal_am("Raton","America"));
        animals.add(new animal_au("Cangur","Australia"));
        animals.add(new animal_af("Papagal","Africa"));
        animals.add(new animal_as("Red Panda","Asia"));
        animals.add(new animals("Cerb","Europe"));
        animals.add(new animal_am("Raton","America"));
        animals.add(new animal_au("Cangur","Australia"));
        animals.add(new animal_af("Papagal","Africa"));
        animals.add(new animal_as("Red Panda","Asia"));
        animals.add(new animals("Cerb","Europe"));
        animals.add(new animal_am("Raton","America"));
        animals.add(new animal_au("Cangur","Australia"));
        animals.add(new animal_af("Papagal","Africa"));
        animals.add(new animal_as("Red Panda","Asia"));
        animals.add(new animals("Cerb","Europe"));
        animals.add(new animal_am("Raton","America"));
        animals.add(new animal_au("Cangur","Australia"));
        animals.add(new animal_af("Papagal","Africa"));
        animals.add(new animal_as("Red Panda","Asia"));
        animals.add(new animals("Cerb","Europe"));
        animals.add(new animal_am("Raton","America"));
        animals.add(new animal_au("Cangur","Australia"));
        animals.add(new animal_af("Papagal","Africa"));
        animals.add(new animal_as("Red Panda","Asia"));
        animals.add(new animals("Cerb","Europe"));
        animals.add(new animal_am("Raton","America"));
        animals.add(new animal_au("Cangur","Australia"));
        animals.add(new animal_af("Papagal","Africa"));
        animals.add(new animal_as("Red Panda","Asia"));
        animals.add(new animals("Cerb","Europe"));
        animals.add(new animal_am("Raton","America"));
        animals.add(new animal_au("Cangur","Australia"));
        animals.add(new animal_af("Papagal","Africa"));
        animals.add(new animal_as("Red Panda","Asia"));
        animals.add(new animals("Cerb","Europe"));
        animals.add(new animal_am("Raton","America"));
        animals.add(new animal_au("Cangur","Australia"));
        animals.add(new animal_af("Papagal","Africa"));
        animals.add(new animal_as("Red Panda","Asia"));animals.add(new animals("Cerb","Europe"));
        animals.add(new animal_am("Raton","America"));
        animals.add(new animal_au("Cangur","Australia"));
        animals.add(new animal_af("Papagal","Africa"));
        animals.add(new animal_as("Red Panda","Asia"));


        AnimalAdapter adapter = new AnimalAdapter(animals);
      recyclerView.setAdapter(adapter);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);
    }

}
