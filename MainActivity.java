package com.example.estructuradedatos;
import android.widget.Button;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void cambio1(View view)
    {
        Intent intent = new Intent(this, MainActivity7.class);
        // Toast.makeText(this, "Ejecutando", Toast.LENGTH_SHORT.show());
        startActivity(intent);
    }
    public void cambio2(View view)
    {
        Intent intent = new Intent(this, MainActivity2.class);
        // Toast.makeText(this, "Ejecutando", Toast.LENGTH_SHORT.show());
        startActivity(intent);
    }
    public void cambio3(View view)
    {
        Intent intent = new Intent(this, MainActivity3.class);
        // Toast.makeText(this, "Ejecutando", Toast.LENGTH_SHORT.show());
        startActivity(intent);
    }
    public void cambio4(View view)
    {
        Intent intent = new Intent(this, MainActivity4.class);
        // Toast.makeText(this, "Ejecutando", Toast.LENGTH_SHORT.show());
        startActivity(intent);
    }
}