package thanhtri.com.intent_vd2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class ActivityLogin extends AppCompatActivity {

    private EditText edtUserName, edtPass, edtEmail;
    private Button btnOK;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        edtUserName = findViewById(R.id.edtUserName);
        edtPass = findViewById(R.id.edtPass);
        edtEmail = findViewById(R.id.edtEmail);
        btnOK = findViewById(R.id.btnOK);

        btnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = edtUserName.getText().toString().trim();
                String password = edtPass.getText().toString().trim();
                String email = edtEmail.getText().toString().trim();
                if (username.equals("thanhtri") && password.equals("ABCDEF")) {
                    ChuyenManHinhHome(username);
                } else {
                    Toast.makeText(ActivityLogin.this, "Thông tin đăng nhập không chính xác hãy thử lại", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }

    public void ChuyenManHinhHome(String username){
        Intent intent = new Intent(this, ActivityHome.class);
        intent.putExtra("USERNAME", username);
        startActivity(intent);
    }
}


