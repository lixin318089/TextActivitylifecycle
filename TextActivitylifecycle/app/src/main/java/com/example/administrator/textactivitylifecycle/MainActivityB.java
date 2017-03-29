package com.example.administrator.textactivitylifecycle;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;
import android.widget.Button;

/**
 * Created by Administrator on 2017/3/29.
 */

public class MainActivityB extends Activity {

    private Button bt1;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainb);
        bt1= (Button) findViewById(R.id.button1);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.e("qwe","这里是BOnStart方法");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("qwe","这里是BOnPause方法");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("qwe","这里是BOnStop方法");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("qwe","这里是BOnRestart方法");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("qwe","这里是BOnResume方法");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("qwe","这里是BOnDestroy方法");
    }
}
