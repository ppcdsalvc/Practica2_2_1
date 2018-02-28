package mx.edu.ittepic.practica2_2_1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MenuCliente extends AppCompatActivity {
    Button btnInsertar,btnConsultar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_cliente);
        btnInsertar = findViewById(R.id.Insertar);

        btnConsultar = findViewById(R.id.Consultar);



        btnInsertar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent insert = new Intent(MenuCliente.this,InsertarCliente.class);
                startActivity(insert);
            }
        });

        btnConsultar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent select = new Intent(MenuCliente.this,ConsultarCliente.class);
                startActivity(select);
            }
        });


    }
}
