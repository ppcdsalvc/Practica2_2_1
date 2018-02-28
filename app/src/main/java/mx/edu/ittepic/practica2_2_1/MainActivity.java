package mx.edu.ittepic.practica2_2_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btncliente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btncliente = findViewById(R.id.Clientes);

        btncliente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent MenuCliente = new Intent(MainActivity.this, mx.edu.ittepic.practica2_2_1.MenuCliente.class);
                startActivity(MenuCliente);
            }
        });
    }
}
