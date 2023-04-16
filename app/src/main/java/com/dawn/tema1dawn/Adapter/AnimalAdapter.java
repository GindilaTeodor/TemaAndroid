package com.dawn.tema1dawn.Adapter;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.NavController;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;
import androidx.recyclerview.widget.RecyclerView;

import com.dawn.tema1dawn.R;
import com.dawn.tema1dawn.fragments.Continent;
import com.dawn.tema1dawn.fragments.RecycleViewDirections;
import com.dawn.tema1dawn.models.animal_af;
import com.dawn.tema1dawn.models.animal_am;
import com.dawn.tema1dawn.models.animal_as;
import com.dawn.tema1dawn.models.animal_au;
import com.dawn.tema1dawn.models.animals;
import com.temadawn.models.Entertainment;
import com.temadawn.models.Type;

import java.util.List;

public class AnimalAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{
    private List<Entertainment>animals;
    Continent frag=new Continent();

    public AnimalAdapter(List<Entertainment> animals){this.animals=animals;}
    @Override
    public int getItemViewType(int position){ return animals.get(position).getType().getKey();}
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Log.e("Test","eroare");
       if(viewType== Type.animals.getKey())
       {
           View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_animal, parent, false);
           AnimalViewHolder viewHolder=new AnimalViewHolder(view);
           return viewHolder;
       }
       else if(viewType== Type.animal_af.getKey())
       {
           View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_animal_af, parent, false);
           Animal_afViewHolder viewHolder=new Animal_afViewHolder(view);
           return viewHolder;
       }
       else if(viewType== Type.animal_au.getKey())
       {
           View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_animal_au, parent, false);
           Animal_auViewHolder viewHolder=new Animal_auViewHolder(view);
           return viewHolder;
       }
       else if(viewType== Type.animal_am.getKey())
       {
           View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_animal_am, parent, false);
           Animal_amViewHolder viewHolder=new Animal_amViewHolder(view);
           return viewHolder;
       }
       else if(viewType== Type.animal_as.getKey())
       {
           View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_animal_as, parent, false);
           Animal_asViewHolder viewHolder=new Animal_asViewHolder(view);
           return viewHolder;
       }
       Log.e("Error","Probelma");
       return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

      if(holder instanceof AnimalViewHolder){
          animals model=(animals) animals.get(position);
          ((AnimalViewHolder)holder).bind(model);
      }
      else if(holder instanceof Animal_afViewHolder)
      {
          animal_af model=(animal_af) animals.get(position);
          ((Animal_afViewHolder)holder).bind(model);
      }
      else if(holder instanceof Animal_amViewHolder)
      {
          animal_am model=(animal_am) animals.get(position);
          ((Animal_amViewHolder)holder).bind(model);
      }
      else if(holder instanceof Animal_auViewHolder)
      {
          animal_au model=(animal_au) animals.get(position);
          ((Animal_auViewHolder)holder).bind(model);
      }
      else if(holder instanceof Animal_asViewHolder)
      {
          animal_as model=(animal_as) animals.get(position);
          ((Animal_asViewHolder)holder).bind(model);}
        Log.e("Adapter", "onBindViewHolder; position=" + position);
    }
    @Override
    public int getItemCount() {
        return animals.size();
    }

    class AnimalViewHolder extends RecyclerView.ViewHolder{

        TextView animalTextView;
        TextView regionTextView;
        Button button;
        public AnimalViewHolder(@NonNull View itemView) {
            super(itemView);
            animalTextView = itemView.findViewById(R.id.animal);
            regionTextView = itemView.findViewById(R.id.region);
            button=itemView.findViewById(R.id.animal_button);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Log.e("Button","pRESSE");
                }
            }
            );

        }
        public void bind(com.dawn.tema1dawn.models.animals model) {
            animalTextView.setText(model.getTitle());
            regionTextView.setText(model.getRegion());
        }
    }
    class Animal_afViewHolder extends  RecyclerView.ViewHolder{TextView animalTextView;
        TextView regionTextView;
        Button button;
        public Animal_afViewHolder(@NonNull View itemView) {
            super(itemView);
            animalTextView = itemView.findViewById(R.id.animal);
            regionTextView = itemView.findViewById(R.id.region);
            button=itemView.findViewById(R.id.animal_button);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {Log.e("Button5","Was Clicked");}
            }
            );
        }
        public void bind(animal_af model){
            animalTextView.setText(model.getTitle());
            regionTextView.setText(model.getRegion());
        }
    }
    class Animal_amViewHolder extends  RecyclerView.ViewHolder{TextView animalTextView;
        TextView regionTextView;
        Button button;
        public Animal_amViewHolder(@NonNull View itemView) {
            super(itemView);
            animalTextView = itemView.findViewById(R.id.animal);
            regionTextView = itemView.findViewById(R.id.region);
            button=itemView.findViewById(R.id.animal_button);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Log.e("Button2","Was Clicked");
                }
            }
            );
        }
        public void bind(animal_am model){
            animalTextView.setText(model.getTitle());
            regionTextView.setText(model.getRegion());
        }
    }
    class Animal_auViewHolder extends  RecyclerView.ViewHolder{TextView animalTextView;
        TextView regionTextView;
        Button button;
        public Animal_auViewHolder(@NonNull View itemView) {
            super(itemView);
            animalTextView = itemView.findViewById(R.id.animal);
            regionTextView = itemView.findViewById(R.id.region);
            button=itemView.findViewById(R.id.animal_button);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {Log.e("Button3","Was Clicked");}
            }
            );
        }
        public void bind(animal_au model){
            animalTextView.setText(model.getTitle());
            regionTextView.setText(model.getRegion());
        }
        public void Onclick(View view)
        {

        }
    }
    class Animal_asViewHolder extends  RecyclerView.ViewHolder {
        TextView animalTextView;
        TextView regionTextView;
        Button button;

        public Animal_asViewHolder(@NonNull View itemView) {
            super(itemView);
            animalTextView = itemView.findViewById(R.id.animal);
            regionTextView = itemView.findViewById(R.id.region);
            button=itemView.findViewById(R.id.animal_button);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Log.e("Button4","Was Clicked");
                }
            }
            );
        }

        public void bind(animal_as model) {
            animalTextView.setText(model.getTitle());
            regionTextView.setText(model.getRegion());
        }
    }
}
