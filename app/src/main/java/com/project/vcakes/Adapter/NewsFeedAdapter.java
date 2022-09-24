package com.project.vcakes.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.project.vcakes.HomeFragment;
import com.project.vcakes.Model.NewsFeedModel;
import com.project.vcakes.R;

import java.util.ArrayList;

public class NewsFeedAdapter extends RecyclerView.Adapter<NewsFeedAdapter.ViewHolder> {

    public NewsFeedAdapter(Context context, ArrayList<NewsFeedModel> list, HomeFragment homeFragment) {
        this.context = context;
        this.list = list;
    }

    Context context;
    ArrayList<NewsFeedModel> list;

    @NonNull
    @Override
    public NewsFeedAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.news_feed_items, parent, false));

    }

    @Override
    public void onBindViewHolder(@NonNull NewsFeedAdapter.ViewHolder holder, int position) {
        holder.image.setImageResource(list.get(position).getImage());
        holder.amount.setText(list.get(position).getAmount());
        holder.header.setText(list.get(position).getHeader());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView image;
        TextView amount, header;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);


            image = itemView.findViewById(R.id.imageView6);
            amount = itemView.findViewById(R.id.date);
            header = itemView.findViewById(R.id.header1);
        }
    }
}

