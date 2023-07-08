package chl.ancud.m5_individual5;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import chl.ancud.m5_individual5.databinding.FragmentPalabraBinding;

public class AdapterPalabras extends RecyclerView.Adapter <AdapterPalabras.ViewHolder> {

    private List<String> palabras;

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        FragmentPalabraBinding binding = FragmentPalabraBinding.inflate(LayoutInflater.from(parent.getContext()));
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        String item = palabras.get(position);
        holder.mostrar(item);

    }

    @Override
    public int getItemCount() {
        return 0;
    }



    public class ViewHolder extends RecyclerView.ViewHolder {

        private FragmentPalabraBinding bindingVH;
        public ViewHolder(@NonNull FragmentPalabraBinding binding) {
            super(binding.getRoot());
            bindingVH = binding;
        }

        public void mostrar(String palabra) {
            bindingVH.txvPalabra.setText(palabra);
        }

    }

}

