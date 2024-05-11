package thanhtri.com.csdlsqlite_vidu;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SQLiteDatabase db = openOrCreateDatabase("QLNhac.db",
                MODE_PRIVATE, null
        );

        String sqlXoaBangNeuDaCo = "DROP TABLE IF EXISTS Musics;";
        String sqlTaoBang = "CREATE TABLE Musics( MusicID integer PRIMARY KEY, " +
                "MusicName text, " +
                "Author text, " +
                "ReleaseYear double, " +
                "TypeOfMusic text);";
        db.execSQL(sqlXoaBangNeuDaCo);
        db.execSQL(sqlTaoBang);
        String sqlThem1 = "INSERT INTO Musics VALUES(1, 'Lạ lùng', 'Vũ', 2017, 'Nhạc trẻ');";
        String sqlThem2 = "INSERT INTO Musics VALUES(2, 'Phút ban đầu', 'Vũ', 2018, 'Nhạc trẻ');";
        String sqlThem3 = "INSERT INTO Musics VALUES(3, 'Đông kiếm em', 'Vũ', 2018, 'Nhạc trẻ');";
        String sqlThem4 = "INSERT INTO Musics VALUES(4, 'Yêu 5', 'Rhymastic', 2017, 'Nhạc trẻ');";
        String sqlThem5 = "INSERT INTO Musics VALUES(5, 'Túy âm', 'Xesi', 2017, 'Nhạc trẻ');";
        String sqlThem6 = "INSERT INTO Musics VALUES(5, 'Nơi này có anh', 'Sơn Tùng MTP', 2017, 'Nhạc trẻ');";
        db.execSQL(sqlThem1);
        db.execSQL(sqlThem2);
        db.execSQL(sqlThem3);
        db.execSQL(sqlThem4);
        db.execSQL(sqlThem5);
        db.execSQL(sqlThem6);
    }
}
