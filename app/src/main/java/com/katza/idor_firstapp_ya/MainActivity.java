package com.katza.idor_firstapp_ya;


import static android.view.View.INVISIBLE;
import static android.view.View.VISIBLE;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button btnFB,btnSF;

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
    }

        @Override
        public void onCheckChanged(@NonNull CompoundButton compoundButton, boolean b)
        {
            if(b) {
                btnFB.setVisibility(VISIBLE);
                Toast.makeText(this, "true", Toast.LENGTH_SHORT).show();
            }else {
                btnSF.setVisibility(INVISIBLE);
                Toast.makeText(this, "false", Toast.LENGTH_SHORT).show();
            }
        }
    }
}