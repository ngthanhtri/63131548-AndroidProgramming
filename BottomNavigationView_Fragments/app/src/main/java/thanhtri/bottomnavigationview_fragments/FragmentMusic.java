package thanhtri.bottomnavigationview_fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class FragmentMusic extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_music, container, false);

        ArrayList<String> data = new ArrayList<String>();
        data.add("Ngày em đẹp nhất");
        data.add("Suýt nữa thì");
        data.add("Lạ lùng");
        data.add("Cũng đành thôi");
        data.add("Tháng tư là lời nói dối của em");
        data.add("Em gái mưa");
        data.add("Yêu 5");
        data.add("Một bước yêu vạn dặm đau");
        data.add("Bánh mì không");
        data.add("Mặt mộc");
        ListView ListViewBH = view.findViewById(R.id.lvDSBaiHat);
        ArrayAdapter<String> BHAdapter = new ArrayAdapter<String>(requireContext(), android.R.layout.simple_list_item_1, data);
        ListViewBH.setAdapter(BHAdapter);

        ListViewBH.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String value = BHAdapter.getItem(position);
                Toast.makeText(requireContext(), value, Toast.LENGTH_LONG).show();
            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(view.findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        return view;
    }
}

