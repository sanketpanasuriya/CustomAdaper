package com.example.customadaper;

import android.content.Context;
import android.icu.text.Transliterator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class MyAdapter extends ArrayAdapter {
    private final Context context;
    private final ArrayList<Item> list;

    private final int[] images = {
            R.drawable.ic_one,
            R.drawable.ic_two,
            R.drawable.ic_three,
            R.drawable.ic_four
    };

    public MyAdapter(@NonNull Context context, ArrayList<Item> list) {
        super(context, R.layout.listitem,list);
        this.context = context;
        this.list = list;
    }
    @Override
    public int getCount() {
        return super.getCount();
    }

    @Nullable
    @Override
    public Object getItem(int position) {
        return super.getItem(position);
    }

    @Override
    public int getPosition(@Nullable Object item) {
        return super.getPosition(item);
    }

    @Override
    public long getItemId(int position) {
        return super.getItemId(position);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater =(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(R.layout.listitem,parent,false);

        TextView labelView = rowView.findViewById(R.id.label);
        TextView valueView = rowView.findViewById(R.id.value);
        ImageView imgView = rowView.findViewById(R.id.image);

        labelView.setText(list.get(position).getTitle());
        valueView.setText(list.get(position).getDescription());
        imgView.setBackgroundResource(images[position]);

        return rowView;
    }
}
/**

 */