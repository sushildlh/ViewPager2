package sam.com.sampleviewpager2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewPagerAdapter extends RecyclerView.Adapter<MyHolder> {
    
    private Context context;
    
    public MyViewPagerAdapter(Context context) {
        this.context=context;
    }
    
    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyHolder(LayoutInflater.from(context).inflate(R.layout.cell_item, parent, false));
    }
    
    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, int position) {
      holder.mText.setText("Page "+(position+1));
    }
    
    @Override
    public int getItemCount() {
        return 10;
    }
}
