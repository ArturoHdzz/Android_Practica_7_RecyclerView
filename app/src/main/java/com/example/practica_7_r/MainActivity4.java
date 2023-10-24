package com.example.practica_7_r;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.widget.Toast;
import android.view.View;
import android.widget.Button;

public class MainActivity4 extends AppCompatActivity {

    private static final int PERMISSION_REQUEST_CODE = 1;
    Button solicitarPermisosButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        solicitarPermisosButton = findViewById(R.id.solicitarPermisosButton);
        solicitarPermisosButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                verificar();
            }
        });
    }

    private void verificar() {
        int permiso = ContextCompat.checkSelfPermission(this, android.Manifest.permission.INTERNET);
        int Permiso2 = ContextCompat.checkSelfPermission(this, android.Manifest.permission.WRITE_EXTERNAL_STORAGE);
        if (permiso == PackageManager.PERMISSION_GRANTED && Permiso2 == PackageManager.PERMISSION_GRANTED) {
            Intent i = new Intent(this, MainActivity.class);
            startActivity(i);
        } else {
            String[] permisos = {Manifest.permission.INTERNET, Manifest.permission.WRITE_EXTERNAL_STORAGE};
            if (ActivityCompat.shouldShowRequestPermissionRationale(this, Manifest.permission.INTERNET) ||
                    ActivityCompat.shouldShowRequestPermissionRationale(this, Manifest.permission.WRITE_EXTERNAL_STORAGE)) {
                Toast.makeText(this, "Se necesitan permisos para realizar esta acción", Toast.LENGTH_SHORT).show();
            }
            ActivityCompat.requestPermissions(this, permisos, PERMISSION_REQUEST_CODE);
        }
    }
}
