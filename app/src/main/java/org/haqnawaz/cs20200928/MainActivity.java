package org.haqnawaz.cs20200928;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ShowMessage(View view) {

        EditText editText = findViewById(R.id.editText);
        TextView textView = findViewById(R.id.txtViewMessage);

        textView.setText(editText.getText().toString());
    }
}
