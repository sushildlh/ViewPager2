package sam.com.sampleviewpager2;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

class MyHolder extends RecyclerView.ViewHolder {
    
    public TextView mText;
    
    public MyHolder(@NonNull View itemView) {
        super(itemView);
        mText = itemView.findViewById(R.id.text);
    }
}
