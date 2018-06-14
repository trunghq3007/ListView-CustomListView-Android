package com.imic.admin.listviewandroid;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

import com.imic.admin.listviewandroid.adaptor.MobileArrayAdapter22;

import java.util.ArrayList;

public class ListFruitActivity22 extends ListActivity implements AdapterView.OnItemClickListener {

    static ArrayList<MobileEntity> MOBILE_ENTITIES = null;

    //ListView listView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        MOBILE_ENTITIES = new ArrayList<MobileEntity>();

        MobileEntity mobileEntity = new MobileEntity("Android", R.drawable.windowsmobile_logo);
        MOBILE_ENTITIES.add(mobileEntity);

        MobileEntity mobileEntity1 = new MobileEntity("ios", R.drawable.ios_logo);
        MOBILE_ENTITIES.add(mobileEntity1);

        MobileEntity mobileEntity2 = new MobileEntity("blackberry_logo", R.drawable.blackberry_logo);
        MOBILE_ENTITIES.add(mobileEntity2);

        MobileEntity mobileEntity3 = new MobileEntity("windowsmobile_logo", R.drawable.windowsmobile_logo);
        MOBILE_ENTITIES.add(mobileEntity3);


        setListAdapter(new MobileArrayAdapter22(this, MOBILE_ENTITIES));

        getListView().setOnItemClickListener(this);

    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(ListFruitActivity22.this, String.valueOf(position), Toast.LENGTH_SHORT).show();
    }
}