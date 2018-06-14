package com.imic.admin.listviewandroid.adaptor;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.imic.admin.listviewandroid.MobileEntity;
import com.imic.admin.listviewandroid.R;

import java.util.ArrayList;

public class MobileArrayAdapter22 extends ArrayAdapter<MobileEntity> {
    private final Context context;
    private final ArrayList<MobileEntity> values;

    public MobileArrayAdapter22(Context context, ArrayList<MobileEntity> values) {
        super(context, R.layout.list_mobile22, values);
        this.context = context;
        this.values = values;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);


        View rowView = inflater.inflate(R.layout.list_mobile22, parent, false);


        TextView textView = (TextView) rowView.findViewById(R.id.label);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.logo);


        textView.setText(java.lang.String.valueOf(values.get(position).getTitle()));
        imageView.setImageResource(values.get(position).getResImg());


        return rowView;
    }
}
