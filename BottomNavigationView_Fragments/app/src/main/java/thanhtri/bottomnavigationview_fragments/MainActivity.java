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

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new FragmentTrangchu()).commit();
    }

    private final BottomNavigationView.OnNavigationItemSelectedListener navListener = item -> {
        Fragment selectedFragment = null;
        int itemId = item.getItemId();
        if (itemId == R.id.navigation_trangchu) {
            selectedFragment = new FragmentTrangchu();
        } else if (itemId == R.id.navigation_gioithieu) {
            selectedFragment = new FragmentGioithieu();
        } else if (itemId == R.id.navigation_quiz) {
            selectedFragment = new FragmentQuiz();
        } else if (itemId == R.id.navigation_anh) {
            selectedFragment = new FragmentAnh();
        }
        if (selectedFragment != null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, selectedFragment).commit();
        }
        return true;
    };
}

