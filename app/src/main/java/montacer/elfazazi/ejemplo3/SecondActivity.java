package montacer.elfazazi.ejemplo3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("Estado: ","7- estoy en el metodo restart second");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("Estado: ","6- estoy en el metodo destroy second");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("Estado: ","5- estoy en el metodo stop second");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("Estado: ","4- estoy en el metodo pause second");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("Estado: ","3- estoy en el metodo resume second");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("Estado: ","2- estoy en el metodo start second");

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Log.e("Estado: ","1- estoy en el metodo create second");

    }
}