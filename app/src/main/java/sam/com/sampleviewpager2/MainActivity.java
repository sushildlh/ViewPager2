package sam.com.sampleviewpager2;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

public class MainActivity extends AppCompatActivity {
    
    private ViewPager2 mPager;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("View Pager 2");
        mPager = findViewById(R.id.pager);
        mPager.setAdapter(new MyViewPagerAdapter(this));
    }
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }
    
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (R.id.change == item.getItemId()) {
            mPager.setOrientation(mPager.getOrientation() != ViewPager2.ORIENTATION_VERTICAL ? ViewPager2.ORIENTATION_VERTICAL : ViewPager2.ORIENTATION_HORIZONTAL);
        }
        return super.onOptionsItemSelected(item);
    }
}
