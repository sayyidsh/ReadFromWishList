package pro.nanosystems.readfromwishlist;

import android.database.Cursor;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    private Cursor mCursor;
    private ListView wishList;
    private WishAdapter wishAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        wishList = findViewById(R.id.wishList);
        mCursor = getContentResolver().query(WishContract.MyWish.CONTENT_URI ,WishContract.MyWish.PROJECTION_ALL,null,null,WishContract.MyWish.SORT_ORDER_BY  );
        wishAdapter = new WishAdapter(this , mCursor);
        wishList.setAdapter(wishAdapter);
    }
}
