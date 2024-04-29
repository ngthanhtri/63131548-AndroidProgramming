package thanhtri.bottomnavigationview_fragments;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNav = findViewById(R.id.bottom_navigation);
        bottomNav.setOnNavigationItemSelectedListener(navListener);

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new FragmentGioithieu()).commit();
    }

    private final BottomNavigationView.OnNavigationItemSelectedListener navListener = item -> {
        Fragment fragmentDaChon = null;
        int itemId = item.getItemId();
        if (itemId == R.id.navigation_gioithieu) {
            fragmentDaChon = new FragmentGioithieu();
        } else if (itemId == R.id.navigation_music) {
            fragmentDaChon = new FragmentMusic();
        } else if (itemId == R.id.navigation_quiz) {
            fragmentDaChon = new FragmentQuiz();
        } else if (itemId == R.id.navigation_anh) {
            fragmentDaChon = new FragmentAnh();
        }
        if (fragmentDaChon != null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, fragmentDaChon).commit();
        }
        return true;
    };
}

