package es.travelworld.viewscomplejasydinamicas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;


import es.travelworld.viewscomplejasydinamicas.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setListeners();
    }

    public void setListeners() {
        binding.mainBtn.setOnClickListener(view->
                Snackbar.make(view, "Login...",Snackbar.LENGTH_LONG).show());

        binding.mainGetNewPassword.setOnClickListener(view ->
                Snackbar.make(view, "Función disponible próximamente...",Snackbar.LENGTH_LONG).show());

        binding.mainCreateNewAccount.setOnClickListener(view ->
                Snackbar.make(view, "Función disponible próximamente...", Snackbar.LENGTH_LONG).show());
    }

}