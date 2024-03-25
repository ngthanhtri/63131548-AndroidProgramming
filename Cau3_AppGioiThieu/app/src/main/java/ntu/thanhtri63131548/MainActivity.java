package ntu.thanhtri63131548;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView[] textViewArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView ttct0 = findViewById(R.id.ttct0);
        final TextView ttct1 = findViewById(R.id.ttct1);
        final TextView ttct2 = findViewById(R.id.ttct2);
        final TextView ttct3 = findViewById(R.id.ttct3);
        textViewArray = new TextView[]{ttct0, ttct1, ttct2, ttct3};

        Button btn1 = findViewById(R.id.btnttsinhvien);
        Button btn2 = findViewById(R.id.btnttcanhan);
        Button btn3 = findViewById(R.id.btnttlienlac);
        Button btn4 = findViewById(R.id.btnttkhac);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hienthittct(0);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hienthittct(1);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hienthittct(2);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hienthittct(3);
            }
        });
    }

    private void hienthittct(int index) {
        for (int i = 0; i < textViewArray.length; i++) {
            if (i == index) {
                textViewArray[i].setVisibility(View.VISIBLE);
            } else {
                textViewArray[i].setVisibility(View.GONE);
            }
        }
    }
}
