package edu.temple.coloractivity;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class ColorAdapter extends BaseAdapter
{
    Context context;

    String[] colors;

    public ColorAdapter(Context context, String[] colors) {
        this.context = context;
        this.colors = colors;
    }
    @Override
    public int getCount() {
        return colors.length;
    }

    @Override
    public Object getItem(int position) {
        return colors[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        TextView textView;

        if (convertView instanceof View){
            textView = (TextView) convertView;
        } else {
            textView = new TextView(context);
        }
        textView.setTextSize(23);
        textView.setTextColor(Color.BLACK);
        textView.setText(colors[position]);
        textView.setBackgroundColor(Color.WHITE);
        return textView;
    }

    @Override
    public View getDropDownView(int position, View convertView, ViewGroup parent) {
        TextView textView;

        if (convertView instanceof View){
            textView = (TextView) convertView;
        } else {
            textView = new TextView(context);
        }
        textView.setTextSize(23);
        textView.setTextColor(Color.BLACK);
        textView.setText(colors[position]);
        textView.setBackgroundColor(Color.parseColor(textView.getText().toString()));
        return textView;
    }
}

