package com.errorlab.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.errorlab.Others.BitmapCustomCorner;
import com.errorlab.R;

/**
 * Created by Md.Zahidul on 05-Sep-15.
 */
public class PostMainAdapter extends RecyclerView.Adapter<PostMainAdapter.PostAdapter> {
    private Context context;
    int[] imgList = {
            R.drawable.two,
            R.drawable.one,
            R.drawable.three,
            R.drawable.four,
            R.drawable.five,
            R.drawable.six,
            R.drawable.seven,
            R.drawable.eight,
            R.drawable.nine,
            R.drawable.ten
        };
    String[] nameList = {"One", "Two", "Three", "Four", "Five", "Six",
            "Seven", "Eight", "Nine", "Ten"};
    public PostMainAdapter(Context context) {
        this.context = context;
    }
    @Override
    public PostAdapter onCreateViewHolder(ViewGroup parent, int viewType) {
        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.post_adapter, parent, false);
        PostAdapter masonryView = new PostAdapter(layoutView);
        return masonryView;
    }

    @Override
    public void onBindViewHolder(PostAdapter holder, int position) {
        Bitmap singleImage = BitmapFactory.decodeResource(context.getResources(),imgList[position]);
        holder.imageView.setImageBitmap(BitmapCustomCorner.getRoundedCornerBitmap(singleImage));
        holder.textView.setText("This is Number "+nameList[position]);
    }

    @Override
    public int getItemCount() {
        return nameList.length;
    }
    class PostAdapter extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView;
        public PostAdapter(View view) {
            super(view);
            imageView= (ImageView) view.findViewById(R.id.postImg);
            textView= (TextView) view.findViewById(R.id.postDesc);
        }
    }

}