package thanhtri.com.vidulsmenumonan;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ListView lvDSMonAn = (ListView) findViewById(R.id.lvDSMonAn);
        ArrayList<MonAn> dsMonAn = new ArrayList<MonAn>();
        dsMonAn.add(new MonAn("Bánh Tráng Trộn", 20.000, "Ngon tuyệt vời",R.drawable.banhtrangtron));
        dsMonAn.add(new MonAn("Bánh Tráng Trứng", 15.000, "Ngon tuyệt vời",R.drawable.banhtrangtrung));
        dsMonAn.add(new MonAn("Mỳ Cay Hàn Quốc", 70.000, "Ngon tuyệt vời",R.drawable.mycay));
        dsMonAn.add(new MonAn("Pizza", 250.000, "Ngon tuyệt vời",R.drawable.pizza));
        dsMonAn.add(new MonAn("Coca Cola", 23.000, "Ngon tuyệt vời",R.drawable.cocacola));
        dsMonAn.add(new MonAn("Pepsi", 25.000, "Ngon tuyệt vời",R.drawable.pepsi));


        MonAnAdapter adapter = new MonAnAdapter(this,dsMonAn);
        lvDSMonAn.setAdapter(adapter);

        lvDSMonAn.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                MonAn monAnChon = dsMonAn.get(position);
                Toast.makeText(MainActivity.this, monAnChon.getTenMonAn(),Toast.LENGTH_SHORT).show();
            }
        });


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}