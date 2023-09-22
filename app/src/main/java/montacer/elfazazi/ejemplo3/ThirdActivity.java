package montacer.elfazazi.ejemplo3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("Estado: ","7- estoy en el metodo restart third");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("Estado: ","6- estoy en el metodo destroy third");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("Estado: ","5- estoy en el metodo stop third");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("Estado: ","4- estoy en el metodo pause third");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("Estado: ","3- estoy en el metodo resume third");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("Estado: ","2- estoy en el metodo start third");

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
    }
}