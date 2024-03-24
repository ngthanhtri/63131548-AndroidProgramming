package ntu.thanhtri63131548;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView TVcauhoi;
    private RadioGroup rdgrcautraloi;
    private Button btnnop;
    private Button btnsau;
    private Button btntruoc;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TVcauhoi = findViewById(R.id.TVcauhoi);
        rdgrcautraloi = findViewById(R.id.rdgrcautraloi);
        btnnop = findViewById(R.id.btnnop);
        btnsau = findViewById(R.id.btnsau);
        btntruoc = findViewById(R.id.btntruoc);

    }
}



