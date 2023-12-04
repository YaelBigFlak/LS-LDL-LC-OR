package com.example.estructuradedatos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity5 extends AppCompatActivity {

    private EditText inputEditText;
    private TextView textView;
    private Button Button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        inputEditText = findViewById(R.id.inputEditText4);
        textView = findViewById(R.id.textView8);
        Button = findViewById(R.id.button4,1,1);

        Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ordenarBurbuja();
            }
        });
    }

    private void ordenarBurbuja() {
        // Obtén la cadena de texto desde el EditText
        String textoEntrada = inputEditText.getText().toString();

        // Divide la cadena en un array de strings utilizando el espacio como separador
        String[] elementos = textoEntrada.split(" ");

        // Convierte los strings en enteros y almacénalos en un array de enteros
        int[] arrayNumeros = new int[elementos.length];
        for (int i = 0; i < elementos.length; i++) {
            arrayNumeros[i] = Integer.parseInt(elementos[i]);
        }

        // Llama al método de ordenamiento burbuja
        burbuja(arrayNumeros);

        // Muestra el resultado ordenado en el TextView
        mostrarResultado(arrayNumeros);
    }

    private void burbuja(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Intercambia array[j] y array[j+1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    private void mostrarResultado(int[] array) {
        StringBuilder resultado = new StringBuilder();
        for (int num : array) {
            resultado.append(num).append(" ");
        }
        textView.setText(resultado.toString());
    }

    public void cambio11(View view)
    {
        Intent intent = new Intent(this, MainActivity4.class);
        // Toast.makeText(this, "Ejecutando", Toast.LENGTH_SHORT.show());
        startActivity(intent);
    }
}