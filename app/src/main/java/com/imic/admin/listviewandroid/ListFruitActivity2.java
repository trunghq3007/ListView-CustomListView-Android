package com.imic.admin.listviewandroid;

import android.app.Activity;
import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ListFruitActivity2 extends ListActivity implements AdapterView.OnItemClickListener {

    static final String[] FRUITS = new String[]{"Apple", "Avocado", "Banana",
            "Blueberry", "Coconut", "Durian", "Guava", "Kiwifruit",
            "Jackfruit", "Mango", "Olive", "Pear", "Sugar-apple"};

    //ListView listView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ///setContentView(R.layout.listview_layout); //android.R.layout.simple_list_item_1
        ArrayAdapter<String> stringArrayAdapter = new ArrayAdapter<String>(this, R.layout.item_list,
                FRUITS);
        setListAdapter(stringArrayAdapter);
        getListView().setOnItemClickListener(this);

        //listView.setTextFilterEnabled(true);

		/*listView.setOnItemClickListener(new OnItemClickListener() {
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				// When clicked, show a toast with the TextView text
				Toast.makeText(getApplicationContext(),
						((TextView) view).getText(), Toast.LENGTH_SHORT).show();
			}
		});*/

    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(ListFruitActivity2.this, String.valueOf(position), Toast.LENGTH_SHORT).show();
    }
}