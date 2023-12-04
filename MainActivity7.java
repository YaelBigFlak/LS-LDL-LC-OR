package com.example.estructuradedatos;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity7 extends AppCompatActivity {
    static class Nodo {
        public int dato;
        public Nodo siguiente;

        public Nodo(int valor) {
            dato = valor;
            siguiente = null;
        }
    }
    private Nodo inicio = null;
    private Nodo ultimo = null;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText inputEditText = findViewById(R.id.inputEditText);
        final TextView outputTextView = findViewById(R.id.outputTextView);
        Button addButton = findViewById(R.id.addButton);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int valor = Integer.parseInt(inputEditText.getText().toString());
                Nodo nuevoNodo = new Nodo(valor);
                if (inicio == null) {
                    inicio = nuevoNodo;
                    ultimo = nuevoNodo;
                } else {
                    ultimo.siguiente = nuevoNodo;
                    ultimo = nuevoNodo;
                }
                inputEditText.setText("");
                actualizarSalida();
            }
        });
    }
    private void actualizarSalida() {
        StringBuilder resultado = new StringBuilder();
        Nodo imp = inicio;
        while (imp != null) {
            resultado.append(imp.dato).append("\n");
            imp = imp.siguiente;
        }
        TextView outputTextView = findViewById(R.id.outputTextView);
        outputTextView.setText(resultado.toString());
    }
}



