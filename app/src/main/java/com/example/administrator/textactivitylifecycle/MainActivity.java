package com.example.administrator.textactivitylifecycle;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button bt1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("qwe","这里是AOnCreate方法");
        bt1= (Button) findViewById(R.id.button1);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent(MainActivity.this,MainActivityB.class);
                startActivity(in);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("qwe","这里是AOnStart方法");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("qwe","这里是AOnPause方法");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("qwe","这里是AOnStop方法");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("qwe","这里是AOnRestart方法");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("qwe","这里是AOnResume方法");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("qwe","这里是AOnDestroy方法");
    }
}
