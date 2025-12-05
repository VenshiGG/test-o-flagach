package com.example.testoflagach;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    int licznik;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        textView=findViewById(R.id.textView);;
    }

    public void klik(View view) {
        view.setVisibility(view.INVISIBLE);
        licznik++;
        if(licznik==4){
            //Toast.makeText(this, "Sigma wygrałeś", Toast.LENGTH_SHORT).show();
            textView.setText("Sigma wygrałeś");
        }
    }

    public void ok(View view) {
        Toast.makeText(this, "Ten kolor jest w fladze Polski", Toast.LENGTH_SHORT).show();
    }
}