package com.android.calculator;

import android.app.Activity;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class LogMessage extends Activity implements View.OnClickListener{

    private static final String TAG = "myLogs";
    TextView tvOut;
    Button btnOk;
    Button btnCancel;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.log_message);

        Log.d(TAG,"найдем View-элементы");
        tvOut = (TextView) findViewById(R.id.tvOut);
        btnOk = (Button) findViewById(R.id.btnOk);
        btnCancel = (Button) findViewById(R.id.btnCancel);

        Log.d(TAG,"присваиваем обработчик кнопкам");
        btnOk.setOnClickListener(this);
        btnCancel.setOnClickListener(this);
    }

    public void onClick(View view) {
        Log.d(TAG,"по id определяем кнопку, вызвавшую этот обработчик");
        switch (view.getId()) {
            case R.id.btnOk:
                Log.d(TAG,"кнопка OK");
            tvOut.setText("Press OK button");
                Toast.makeText(this,"Нажата кнопка OK", Toast.LENGTH_LONG).show();
            break;
            case R.id.btnCancel:
                Log.d(TAG,"кнопка Cancel");
            tvOut.setText("Press Cancel button");
                Toast.makeText(this,"Нажата кнопка Cancel", Toast.LENGTH_LONG).show();
            break;
        }

    }
}
