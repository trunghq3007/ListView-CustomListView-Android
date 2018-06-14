package com.imic.admin.listviewandroid;

import android.app.Activity;
import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;

public class ListFruitActivity extends Activity {

    static final String[] FRUITS = new String[]{"Apple", "Avocado", "Banana",
            "Blueberry", "Coconut", "Durian", "Guava", "Kiwifruit",
            "Jackfruit", "Mango", "Olive", "Pear", "Sugar-apple"};
   /* static final Integer[] FRUITS1 = new Integer[]{
            1,2,3,4
    };*/

    ListView listView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview_layout); //android.R.layout.simple_list_item_1
        ArrayAdapter<String> stringArrayAdapter = new ArrayAdapter<String>(this, R.layout.item_list,
                FRUITS);


        listView = findViewById(R.id.listId);
        listView.setAdapter(stringArrayAdapter);
        listView.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(ListFruitActivity.this, String.valueOf(position), Toast.LENGTH_SHORT).show();
            }
        });
        //findViewById();
        // no more this
        //setContentView(R.layout.list_fruit);

        //setListAdapter(new ArrayAdapter<String>(this, R.layout.list_fruit,
        //		FRUITS));

        //ListView listView = getListView();
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

}