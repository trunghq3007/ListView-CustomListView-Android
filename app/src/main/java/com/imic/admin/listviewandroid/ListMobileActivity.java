package com.imic.admin.listviewandroid;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import android.view.View;

import com.imic.admin.listviewandroid.adaptor.MobileArrayAdapter;
import com.imic.admin.listviewandroid.adaptor.MobileArrayAdapter22;

import java.util.ArrayList;

public class ListMobileActivity extends ListActivity {

    static final String[] MOBILE_OS = new String[]{"Android", "iOS",
            "WindowsMobile", "Blackberry"};

    static ArrayList<MobileEntity> MOBILE_ENTITIES = null;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //setListAdapter(new ArrayAdapter<String>(this, R.layout.list_mobile,
        //		R.id.label, MOBILE_OS));
        MOBILE_ENTITIES = new ArrayList<MobileEntity>();

        MobileEntity mobileEntity = new MobileEntity("Android", R.drawable.windowsmobile_logo);
        MOBILE_ENTITIES.add(mobileEntity);

        MobileEntity mobileEntity1 = new MobileEntity("Android",R.drawable.ios_logo);
        MOBILE_ENTITIES.add(mobileEntity1);

        MobileEntity mobileEntity2 = new MobileEntity("Android",R.drawable.blackberry_logo);
        MOBILE_ENTITIES.add(mobileEntity2);

        MobileEntity mobileEntity3 = new MobileEntity("Android",R.drawable.windowsmobile_logo);
        MOBILE_ENTITIES.add(mobileEntity3);


        setListAdapter(new MobileArrayAdapter22(this, MOBILE_ENTITIES));


    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {

        //get selected items
        String selectedValue = (String) getListAdapter().getItem(position);
        Toast.makeText(this, selectedValue, Toast.LENGTH_SHORT).show();

    }

}