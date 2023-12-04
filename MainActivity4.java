package com.example.estructuradedatos;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity4 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
    }
    public void cambio5(View view)
    {
        Intent intent = new Intent(this, MainActivity5.class);
        // Toast.makeText(this, "Ejecutando", Toast.LENGTH_SHORT.show());
        startActivity(intent);
    }
    public void cambio6(View view)
    {
        Intent intent = new Intent(this, MainActivity6.class);
        // Toast.makeText(this, "Ejecutando", Toast.LENGTH_SHORT.show());
        startActivity(intent);
    }
    public void cambio10(View view)
    {
        Intent intent = new Intent(this, MainActivity7.class);
        // Toast.makeText(this, "Ejecutando", Toast.LENGTH_SHORT.show());
        startActivity(intent);
    }
}