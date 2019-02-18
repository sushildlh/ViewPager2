package sam.com.sampleviewpager2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.viewpager.widget.PagerAdapter;

public class MyViewAdapter extends PagerAdapter {
    private LayoutInflater layoutInflater;

    Context m;
    ImageView imageView;
    TextView textView;
    
    
    public MyViewAdapter(Context c) {
        m=c;
        layoutInflater=LayoutInflater.from(c);
    }
    
    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        View view = layoutInflater.inflate(R.layout.firstscreen, container, false);
        container.addView(view,0);
        return view;
    }
    
    @Override
    public int getCount() {
        return 10;
    }
    
    @Override
    public boolean isViewFromObject(View view, Object obj) {
        
        return view==obj;
    }
    
    
    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        View view = (View) object;
        container.removeView(view);
    }
}


