package thanhtri.com.navigationdrawer;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.core.view.GravityCompat;
import com.google.android.material.navigation.NavigationView;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {
    private DrawerLayout drawerLayout;
    private NavigationView navigationView;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.nav_view);
        toolbar = findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);

        toolbar.setNavigationOnClickListener(v -> {
            if (drawerLayout.isDrawerOpen(navigationView)) {
                drawerLayout.closeDrawer(navigationView);
            } else {
                drawerLayout.openDrawer(navigationView);
            }
        });

        navigationView.setNavigationItemSelectedListener(item -> {
            int id = item.getItemId();
            switch (id) {
                case R.id.nav_trangchu:
                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.fragment_container, new FragmentTrangChu())
                            .commit();
                    break;
                case R.id.nav_thongtin:
                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.fragment_container, new FragmentThongTin())
                            .commit();
                    break;
                case R.id.nav_tieusu:
                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.fragment_container, new FragmentTieuSu())
                            .commit();
                    break;
                case R.id.nav_hinhanh:
                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.fragment_container, new FragmentHinhAnh())
                            .commit();
                    break;
                case R.id.nav_quiz:
                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.fragment_container, new FragmentQuiz())
                            .commit();
                    break;
            }
            drawerLayout.closeDrawer(GravityCompat.START);
            return true;
        });
    }
}
