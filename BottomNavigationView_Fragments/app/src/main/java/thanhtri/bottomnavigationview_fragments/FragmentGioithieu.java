package thanhtri.bottomnavigationview_fragments;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class FragmentGioithieu extends Fragment {

    private TextView[] textViewArray;

    public FragmentGioithieu() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_gioithieu, container, false);

        final TextView ttct0 = view.findViewById(R.id.ttct0);
        final TextView ttct1 = view.findViewById(R.id.ttct1);
        final TextView ttct2 = view.findViewById(R.id.ttct2);
        final TextView ttct3 = view.findViewById(R.id.ttct3);
        textViewArray = new TextView[]{ttct0, ttct1, ttct2, ttct3};

        Button btn1 = view.findViewById(R.id.btnttsinhvien);
        Button btn2 = view.findViewById(R.id.btnttcanhan);
        Button btn3 = view.findViewById(R.id.btnttlienlac);
        Button btn4 = view.findViewById(R.id.btnttkhac);

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

        return view;
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
