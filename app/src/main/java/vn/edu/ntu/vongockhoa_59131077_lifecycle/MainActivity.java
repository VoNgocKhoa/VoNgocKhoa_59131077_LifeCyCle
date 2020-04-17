package vn.edu.ntu.vongockhoa_59131077_lifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Date;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("LifeCycle","onCreate");
        Toast.makeText (this,"onCreate", Toast.LENGTH_SHORT)
                .show ();
        TextView txtTG;
        txtTG=findViewById(R.id.txtTG);
        SimpleDateFormat spF=new SimpleDateFormat("HH:mm:ss");
        String date = spF.format(new Date());
        txtTG.setText(date);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("LifeCycle","onStart Called");
        Toast.makeText (this,"onStart", Toast.LENGTH_SHORT)
                .show ();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("LifeCycle","onRestart Called");
        Toast.makeText (this,"onRestart", Toast.LENGTH_SHORT)
                .show ();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("LifeCycle","onStop Called");
        Toast.makeText (this,"onStop", Toast.LENGTH_SHORT)
                .show ();
    }

    @Override
    protected void onResume() {
        Toast.makeText (this,"onResume", Toast.LENGTH_SHORT)
        .show ();
        super.onResume ();
        Log.d("LifeCycle","onResume Called");
    }

    @Override
    protected void onPause() {
        super.onPause ();
        Log.d("LifeCycle","onPause Called");
        Toast.makeText (this,"onPause", Toast.LENGTH_SHORT)
                .show ();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy ();
        Log.d("LifeCycle","onPause Called");
        Toast.makeText (this,"onDestroy", Toast.LENGTH_SHORT)
                .show ();
    }
}

