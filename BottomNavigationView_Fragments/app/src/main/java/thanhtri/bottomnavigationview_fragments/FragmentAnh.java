package thanhtri.bottomnavigationview_fragments;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import java.util.ArrayList;

public class FragmentAnh extends Fragment {

    private LandScapeAdapter landScapeAdapter;
    private ArrayList<LandScape> viewPagerDatas;
    private ViewPager2 viewPager2Land;

    public FragmentAnh() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_anh, container, false);

        viewPagerDatas = getDataForViewPager();
        viewPager2Land = view.findViewById(R.id.vp2Land);
        landScapeAdapter = new LandScapeAdapter(requireContext(), viewPagerDatas);
        viewPager2Land.setAdapter(landScapeAdapter);

        return view;
    }

    private ArrayList<LandScape> getDataForViewPager() {
        ArrayList<LandScape> dsDuLieu = new ArrayList<>();
        LandScape landScape1 = new LandScape("ronaldo", "Ronaldo siuuuuu");
        dsDuLieu.add(landScape1);
        dsDuLieu.add(new LandScape("messi", "Messi"));
        dsDuLieu.add(new LandScape("mbappe", "Mbappe"));
        dsDuLieu.add(new LandScape("neymar", "Neymar"));
        return dsDuLieu;
    }
}
