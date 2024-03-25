package ntu.thanhtri63131548;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class StartManHinh extends AppCompatActivity {

    private Button btnstart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.manhinh_start);

        btnstart = findViewById(R.id.btnchoi);

        btnstart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StartManHinh.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
