package com.example.estructuradedatos;

import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
class Nodo {
    int dato;
    Nodo siguiente;

    public Nodo(int dato) {
        this.dato = dato;
        this.siguiente = null;
    }
}
public class MainActivity3 extends AppCompatActivity {

    private Nodo cabeza;
    private EditText inputEditText;
    private TextView textView;
    private Button addButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        cabeza = null;

        inputEditText = findViewById(R.id.inputEditText3);
        textView = findViewById(R.id.outputTextView3);
        addButton = findViewById(R.id.button3);

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
            nuevoNodo.siguiente = nuevoNodo;  // Hace que el nuevo nodo apunte a sí mismo en una lista circular vacía
        } else {
            nuevoNodo.siguiente = cabeza.siguiente;
            cabeza.siguiente = nuevoNodo;
            cabeza = nuevoNodo;
        }
    }

    private void mostrarLista() {
        if (cabeza != null) {
            StringBuilder resultado = new StringBuilder();
            Nodo actual = cabeza.siguiente;

            do {
                resultado.append(actual.dato).append(" ");
                actual = actual.siguiente;
            } while (actual != cabeza.siguiente);

            textView.setText(resultado.toString());
        }
        
    }
    public void cambio9(View view)
    {
        Intent intent = new Intent(this, MainActivity7.class);
        // Toast.makeText(this, "Ejecutando", Toast.LENGTH_SHORT.show());
        startActivity(intent);
    }

}