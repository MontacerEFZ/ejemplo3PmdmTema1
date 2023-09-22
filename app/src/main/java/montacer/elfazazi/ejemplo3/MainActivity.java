package montacer.elfazazi.ejemplo3;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btnAbrir;

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("Estado: ","7- estoy en el metodo restart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("Estado: ","6- estoy en el metodo destroy");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("Estado: ","5- estoy en el metodo stop");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("Estado: ","4- estoy en el metodo pause");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("Estado: ","3- estoy en el metodo resume");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("Estado: ","2- estoy en el metodo start");

    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAbrir = findViewById(R.id.btnAbrirMain);

        btnAbrir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class); //intent nos permitira viajar entre las actividades
                startActivity(intent);
            }
        });

        Log.e("Estado: ","1- estoy en el metodo create");
        //EN EL LOGCAT SE VERA LOS PROCESOS POR LOS QUE PASA PERO PARA ESO
            //EL PACKAGE TIENE QUE TENER EL MISMO NOMBRE QUE LAS ETIQUETASS

    }
}