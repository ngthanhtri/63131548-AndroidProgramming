package ntu.thanhtri63131548;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private ConstraintSet constraintSet = new ConstraintSet();
    private ConstraintLayout constraintLayout;

    private TextView ttct1, ttct2, ttct3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        constraintLayout = findViewById(R.id.constraint_layout);

        Button btnttsinhvien = findViewById(R.id.btnttsinhvien);
        Button btnttcanhan = findViewById(R.id.btnttcanhan);
        Button btnttlienlac = findViewById(R.id.btnttlienlac);
        Button btnttkhac = findViewById(R.id.btnttkhac);

        ttct1 = findViewById(R.id.ttct1);
        ttct2 = findViewById(R.id.ttct2);
        ttct3 = findViewById(R.id.ttct3);

        constraintSet.clone(constraintLayout);

        btnttsinhvien.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ttct1.setVisibility(View.GONE);
                ttct2.setVisibility(View.GONE);
                ttct3.setVisibility(View.GONE);

                ttct1.setVisibility(View.VISIBLE);
                ttct2.setVisibility(View.VISIBLE);
                ttct3.setVisibility(View.VISIBLE);
            }
        });

        btnttcanhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ttct1.setVisibility(View.GONE);
                ttct2.setVisibility(View.GONE);
                ttct3.setVisibility(View.GONE);

                ttct1.setVisibility(View.VISIBLE);
                ttct2.setVisibility(View.VISIBLE);
                ttct3.setVisibility(View.VISIBLE);
            }
        });

        btnttlienlac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ttct1.setVisibility(View.GONE);
                ttct2.setVisibility(View.GONE);
                ttct3.setVisibility(View.GONE);

                ttct1.setVisibility(View.VISIBLE);
                ttct2.setVisibility(View.VISIBLE);
                ttct3.setVisibility(View.VISIBLE);
            }
        });

        btnttkhac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ttct1.setVisibility(View.GONE);
                ttct2.setVisibility(View.GONE);
                ttct3.setVisibility(View.GONE);

                ttct1.setVisibility(View.VISIBLE);
                ttct2.setVisibility(View.VISIBLE);
                ttct3.setVisibility(View.VISIBLE);
            }
        });
    }
}
