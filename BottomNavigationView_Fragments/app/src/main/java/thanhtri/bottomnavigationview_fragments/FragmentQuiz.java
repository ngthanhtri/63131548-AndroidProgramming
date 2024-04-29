package thanhtri.bottomnavigationview_fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import java.util.List;

public class FragmentQuiz extends Fragment {

    private TextView TVcauhoi;
    private RadioGroup rdgrcautraloi;
    private TextView TVdapan;
    private List<CauHoi> dscauhoi;
    private int thutuhientai = 0;
    private Button btncauhoiketiep;

    public FragmentQuiz() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_quiz, container, false);

        TVcauhoi = view.findViewById(R.id.TVcauhoi);
        rdgrcautraloi = view.findViewById(R.id.rdgrcautraloi);
        TVdapan = view.findViewById(R.id.TVdapan);
        btncauhoiketiep = view.findViewById(R.id.btncauhoiketiep);

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

        return view;
    }

    private void HienThiCauHoi() {
        TVdapan.setText("");

        CauHoi cauhoihientai = dscauhoi.get(thutuhientai);
        TVcauhoi.setText(cauhoihientai.LayCauHoi());

        rdgrcautraloi.removeAllViews();

        String[] dsdapan = cauhoihientai.LayDSDapAn();
        for (String dapan : dsdapan) {
            RadioButton radioButton = new RadioButton(getActivity());
            radioButton.setText(dapan);
            rdgrcautraloi.addView(radioButton);
        }

        rdgrcautraloi.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton selectedRadioButton = group.findViewById(checkedId);
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
