package com.example.estructuradedatos;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    public void cambio8(View view) {
        Intent intent = new Intent(this, MainActivity7.class);
        // Toast.makeText(this, "Ejecutando", Toast.LENGTH_SHORT.show());
        startActivity(intent);
    }
    class Nodo {
        int dato;
        Nodo prev, next;

        public Nodo(int dato) {
            this.dato = dato;
            this.prev = null;
            this.next = null;
        }
    }
    private Nodo cabeza, cola;
    private EditText inputEditText;
    private TextView textView;
    private Button addButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cabeza = null;
        cola = null;

        inputEditText = findViewById(R.id.intputEditText2);
        textView = findViewById(R.id.textView5);
        addButton = findViewById(R.id.button2);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                agregarNodo(Integer.parseInt(inputEditText.getText().toString()));
                mostrarLista();
            }
        });
    }

    private void agregarNodo(int dato) {
        Nodo nuevoNodo = new Nodo(dato);
        if (cabeza == null) {
            cabeza = nuevoNodo;
            cola = nuevoNodo;
        } else {
            cola.next = nuevoNodo;
            nuevoNodo.prev = cola;
            cola = nuevoNodo;
        }
    }

    private void mostrarLista() {
        StringBuilder resultado = new StringBuilder();
        Nodo actual = cabeza;
        while (actual != null) {
            resultado.append(actual.dato).append(" ");
            actual = actual.next;
        }
        textView.setText(resultado.toString());
    }
}






