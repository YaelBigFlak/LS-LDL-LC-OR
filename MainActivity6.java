package com.example.estructuradedatos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity6 extends AppCompatActivity {
    private EditText inputEditText;
    private TextView textView;
    private Button sortButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        inputEditText = findViewById(R.id.inputEditTex5);
        textView = findViewById(R.id.textView10);
        sortButton = findViewById(R.id.button42);

        sortButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ordenarQuicksort();
            }
        });
    }

    private void ordenarQuicksort() {
        // Obtén la cadena de texto desde el EditText
        String textoEntrada = inputEditText.getText().toString();

        // Divide la cadena en un array de strings utilizando el espacio como separador
        String[] elementos = textoEntrada.split(" ");

        // Convierte los strings en enteros y almacénalos en un array de enteros
        int[] arrayNumeros = new int[elementos.length];
        for (int i = 0; i < elementos.length; i++) {
            arrayNumeros[i] = Integer.parseInt(elementos[i]);
        }

        // Llama al método de ordenamiento Quicksort
        quicksort(arrayNumeros, 0, arrayNumeros.length - 1);

        // Muestra el resultado ordenado en el TextView
        mostrarResultado(arrayNumeros);
    }

    private void quicksort(int[] array, int bajo, int alto) {
        if (bajo < alto) {
            int indiceParticion = particion(array, bajo, alto);

            quicksort(array, bajo, indiceParticion - 1);
            quicksort(array, indiceParticion + 1, alto);
        }
    }

    private int particion(int[] array, int bajo, int alto) {
        int pivote = array[alto];
        int i = bajo - 1;

        for (int j = bajo; j < alto; j++) {
            if (array[j] <= pivote) {
                i++;
                intercambiar(array, i, j);
            }
        }

        intercambiar(array, i + 1, alto);
        return i + 1;
    }

    private void intercambiar(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private void mostrarResultado(int[] array) {
        StringBuilder resultado = new StringBuilder();
        for (int num : array) {
            resultado.append(num).append(" ");
        }
        textView.setText(resultado.toString());
    }



    public void cambio12(View view)
    {
        Intent intent = new Intent(this, MainActivity4.class);
        // Toast.makeText(this, "Ejecutando", Toast.LENGTH_SHORT.show());
        startActivity(intent);
    }
}