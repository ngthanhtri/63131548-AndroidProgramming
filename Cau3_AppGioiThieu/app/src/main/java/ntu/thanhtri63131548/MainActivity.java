package ntu.thanhtri63131548;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private ConstraintSet constraintSet = new ConstraintSet();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnttsinhvien = findViewById(R.id.btnttsinhvien);
        Button btnttcanhan = findViewById(R.id.btnttcanhan);
        Button btnttlienlac = findViewById(R.id.btnttlienlac);
        Button btnttkhac = findViewById(R.id.btnttkhac);

        constraintSet.clone(this, R.layout.activity_main);

        btnttsinhvien.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                constraintSet.clear(R.id.btnttsinhvien);
                constraintSet.connect(R.id.btnttsinhvien, ConstraintSet.BOTTOM, ConstraintSet.PARENT_ID, ConstraintSet.BOTTOM);
                constraintSet.applyTo((ConstraintLayout) findViewById(R.id.constraint_layout));
            }
        });

        btnttcanhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                constraintSet.clear(R.id.btnttcanhan);
                constraintSet.connect(R.id.btnttcanhan, ConstraintSet.BOTTOM, ConstraintSet.PARENT_ID, ConstraintSet.BOTTOM);
                constraintSet.applyTo((ConstraintLayout) findViewById(R.id.constraint_layout));
            }
        });

        btnttlienlac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                constraintSet.clear(R.id.btnttlienlac);
                constraintSet.connect(R.id.btnttlienlac, ConstraintSet.BOTTOM, ConstraintSet.PARENT_ID, ConstraintSet.BOTTOM);
                constraintSet.applyTo((ConstraintLayout) findViewById(R.id.constraint_layout));
            }
        });

        btnttkhac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                constraintSet.clear(R.id.btnttkhac);
                constraintSet.connect(R.id.btnttkhac, ConstraintSet.BOTTOM, ConstraintSet.PARENT_ID, ConstraintSet.BOTTOM);
                constraintSet.applyTo((ConstraintLayout) findViewById(R.id.constraint_layout));
            }
        });
    }
}