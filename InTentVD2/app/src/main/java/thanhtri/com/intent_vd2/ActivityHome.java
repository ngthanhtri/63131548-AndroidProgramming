package thanhtri.com.intent_vd2;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ActivityHome extends AppCompatActivity {

    private TextView TVWelcome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        TVWelcome = findViewById(R.id.TVChaoMung);

        Intent intent = getIntent();
        if(intent != null && intent.hasExtra("USERNAME")) {
            String username = intent.getStringExtra("USERNAME");
            TVWelcome.setText("Chào mừng " + username);
        }
    }
    public void ChuyenManHinhQuiz(View v){
        Intent iQuiz = new Intent(this, ActivityQuiz.class);
        startActivity(iQuiz);
    }
}
