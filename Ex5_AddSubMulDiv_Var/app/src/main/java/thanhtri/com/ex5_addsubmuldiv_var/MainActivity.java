package thanhtri.com.ex5_addsubmuldiv_var;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText editTextSo1;
    EditText editTextSo2;
    EditText editTextKQ;
    Button nutCong, nutTru, nutNhan, nutChia;

    void TimDieuKhien() {
        editTextSo1 = findViewById(R.id.edtSo1);
        editTextSo2 = findViewById(R.id.edtSo2);
        editTextKQ = findViewById(R.id.edtKQ);
        nutCong = findViewById(R.id.btnCong);
        nutTru = findViewById(R.id.btnTru);
        nutNhan = findViewById(R.id.btnNhan);
        nutChia = findViewById(R.id.btnChia);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        TimDieuKhien();
        nutCong.setOnClickListener(BolangNgheCong);
        nutTru.setOnClickListener(BolangNgheTru);
        nutNhan.setOnClickListener(BolangNgheNhan);
        nutChia.setOnClickListener(BolangNgheChia);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    View.OnClickListener BolangNgheCong = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String strSo1 = editTextSo1.getText().toString();
            String strSo2 = editTextSo2.getText().toString();

            float So1 = Float.parseFloat(strSo1);
            float So2 = Float.parseFloat(strSo2);

            float tong = So1 + So2;

            String strKQ = String.valueOf(tong);
            editTextKQ.setText(strKQ);
        }
    };

    View.OnClickListener BolangNgheTru = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String strSo1 = editTextSo1.getText().toString();
            String strSo2 = editTextSo2.getText().toString();

            float So1 = Float.parseFloat(strSo1);
            float So2 = Float.parseFloat(strSo2);

            float hieu = So1 - So2;

            String strKQ = String.valueOf(hieu);
            editTextKQ.setText(strKQ);
        }
    };

    View.OnClickListener BolangNgheNhan = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String strSo1 = editTextSo1.getText().toString();
            String strSo2 = editTextSo2.getText().toString();

            float So1 = Float.parseFloat(strSo1);
            float So2 = Float.parseFloat(strSo2);

            float tich = So1 * So2;

            String strKQ = String.valueOf(tich);
            editTextKQ.setText(strKQ);
        }
    };

    View.OnClickListener BolangNgheChia = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String strSo1 = editTextSo1.getText().toString();
            String strSo2 = editTextSo2.getText().toString();

            float So1 = Float.parseFloat(strSo1);
            float So2 = Float.parseFloat(strSo2);

            float thuong = So1 / So2;

            String strKQ = String.valueOf(thuong);
            editTextKQ.setText(strKQ);
        }
    };
}
