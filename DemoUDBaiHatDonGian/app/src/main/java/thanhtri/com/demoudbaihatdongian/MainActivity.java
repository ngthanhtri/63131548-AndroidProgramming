package thanhtri.com.demoudbaihatdongian;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        //hien thi du lieu len listview
        ArrayList<String> data = new ArrayList<String>();
        data.add("Ngày em đẹp nhất");
        data.add("Suýt nữa thì");
        data.add("Lạ lùng");
        data.add("Cũng đành thôi");
        ListView ListViewBH = (ListView)findViewById(R.id.lvDSBaiHat);
        ArrayAdapter<String> BHAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, data);
        ListViewBH.setAdapter(BHAdapter);

        // xu ly su kien
        ListViewBH.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String value = BHAdapter.getItem(position);
                Toast.makeText(MainActivity.this,value, Toast.LENGTH_LONG).show();
            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}