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

    private List<CauHoi> dscauhoi;
    private int giatricauhoi = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TVcauhoi = findViewById(R.id.TVcauhoi);
        rdgrcautraloi = findViewById(R.id.rdgrcautraloi);
        btnnop = findViewById(R.id.btnnop);
        btnsau = findViewById(R.id.btnsau);
        btntruoc = findViewById(R.id.btntruoc);

        dscauhoi = taodscauhoi();

        hienthich(dscauhoi.get(giatricauhoi));

        btnnop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kiemtrakq(dscauhoi.get(giatricauhoi));
            }
        });

        btnsau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (giatricauhoi < dscauhoi.size() - 1) {
                    giatricauhoi++;
                    hienthich(dscauhoi.get(giatricauhoi));
                }
            }
        });

        btntruoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (giatricauhoi > 0) {
                    giatricauhoi--;
                    hienthich(dscauhoi.get(giatricauhoi));
                }
            }
        });
    }



    private void hienthich(CauHoi c) {
        TVcauhoi.setText(c.ChonCauHoi());
        rdgrcautraloi.removeAllViews();
        for (int i = 0; i < c.ChonDapAn().size(); i++) {
            RadioButton rb = new RadioButton(this);
            rb.setText(Integer.toString(c.ChonDapAn().get(i)));
            rdgrcautraloi.addView(rb);
        }
    }


    private void kiemtrakq(CauHoi question) {
        int id = rdgrcautraloi.getCheckedRadioButtonId();
        if (id != -1) {
            RadioButton selectedRadioButton = findViewById(id);
            int n = Integer.parseInt(selectedRadioButton.getText().toString());
            if (n == question.ChonCauTraLoi()) {
                Toast.makeText(MainActivity.this, "Correct!", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(MainActivity.this, "Incorrect!", Toast.LENGTH_SHORT).show();
            }
        } else {
            Toast.makeText(MainActivity.this, "Please select an answer!", Toast.LENGTH_SHORT).show();
        }
    }
}




