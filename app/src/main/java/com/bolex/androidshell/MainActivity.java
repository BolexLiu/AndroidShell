package com.bolex.androidshell;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Thread(new Runnable() {
            @Override
            public void run() {
                String[] strings = {"input swipe 100 400 300 900 1200","dumpsys activity activities "};
                ShellUtils.CommandResult commandResult = ShellUtils.execCmd(strings, false, true);
                Log.e(MainActivity.this.getClass().getName(),"失败:"+commandResult.errorMsg+"成功："+commandResult.successMsg+commandResult.result);
            }
        }).start();
    }
}


