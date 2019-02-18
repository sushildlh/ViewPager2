package sam.com.sampleviewpager2;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

public class MainActivity extends AppCompatActivity {
    
    private ViewPager mPager, viewpagerTop;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("View Pager 2");
        mPager = findViewById(R.id.pager);
        viewpagerTop = findViewById(R.id.viewpagerTop);
        viewpagerTop.setClipChildren(false);
        viewpagerTop.setPageMargin(getResources().getDimensionPixelOffset(R.dimen.pager_margin));
        viewpagerTop.setOffscreenPageLimit(3);
        viewpagerTop.setPageTransformer(false, new CarouselEffectTransformer(this)); // Set transformer
        
        MyViewAdapter pagerAdapter = new MyViewAdapter(this);
        mPager.setAdapter(pagerAdapter);
        viewpagerTop.setAdapter(pagerAdapter);
        mPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                int width = mPager.getWidth();
                mPager.scrollTo((int) (width * position + width * positionOffset), 0);
            }
            
            @Override
            public void onPageSelected(int position) {
            
            }
            
            @Override
            public void onPageScrollStateChanged(int state) {
            
            }
        });
    }
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }
    
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return super.onOptionsItemSelected(item);
    }
}
