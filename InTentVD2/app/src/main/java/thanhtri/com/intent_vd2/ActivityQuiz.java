package thanhtri.com.intent_vd2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.List;

public class ActivityQuiz extends AppCompatActivity {

    private TextView TVcauhoi;
    private RadioGroup rdgrcautraloi;
    private TextView TVdapan;
    private List<CauHoi> dscauhoi;
    private int thutuhientai = 0;
    private Button btncauhoiketiep;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        TVcauhoi = findViewById(R.id.TVcauhoi);
        rdgrcautraloi = findViewById(R.id.rdgrcautraloi);
        TVdapan = findViewById(R.id.TVdapan);
        btncauhoiketiep = findViewById(R.id.btncauhoiketiep);

        DSCauHoi ds = new DSCauHoi();
        dscauhoi = ds.LayDSCauHoi();

        HienThiCauHoi();

        btncauhoiketiep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (thutuhientai < dscauhoi.size() - 1) {
                    thutuhientai++;
                } else {
                    thutuhientai = 0;
                }
                HienThiCauHoi();
            }
        });
    }

    private void HienThiCauHoi() {
        CauHoi cauhoihientai = dscauhoi.get(thutuhientai);
        TVcauhoi.setText(cauhoihientai.LayCauHoi());

        rdgrcautraloi.removeAllViews();

        String[] dsdapan = cauhoihientai.LayDSDapAn();
        for (String dapan : dsdapan) {
            RadioButton radioButton = new RadioButton(this);
            radioButton.setText(dapan);
            rdgrcautraloi.addView(radioButton);
        }

        rdgrcautraloi.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton selectedRadioButton = findViewById(checkedId);
                String dapanDaChon = selectedRadioButton.getText().toString();
                String dapanDung = cauhoihientai.LayDapAnDung();
                if (dapanDaChon.equals(dapanDung)) {
                    TVdapan.setText("Bạn đã chọn đáp án đúng!");
                } else {
                    TVdapan.setText("Bạn đã chọn đáp án sai, đáp án đúng là " + dapanDung);
                }
            }
        });
    }
}
