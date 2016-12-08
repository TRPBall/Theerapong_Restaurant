package com.ssru.theerapong.theerapong_restaurant;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class ProductAdapter extends BaseAdapter {
    private Context context;
    private String[] iconString , titleString , priceString;

    public ProductAdapter(Context context,
                          String[] iconString,
                          String[] titleString,
                          String[] priceString) {
        this.context = context;
        this.iconString = iconString;
        this.titleString = titleString;
        this.priceString = priceString;
    }

    @Override
    public int getCount() {
        return iconString.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.product_listview, parent, false);

        TextView titleTextView = (TextView) view.findViewById(R.id.txtListName);
        titleTextView.setText(titleString[position]);

        TextView priceTextView = (TextView) view.findViewById(R.id.txtListPrice);
        priceTextView.setText(priceString[position]);

        ImageView iconImageView = (ImageView) view.findViewById(R.id.imgListFood);
        Picasso.with(context).load(iconString[position]).resize(150,150).into(iconImageView);
        return view;
    }

}
