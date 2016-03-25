package com.mihail.mycam;
import android.app.Activity;
import android.os.Bundle;
import android.text.style.UpdateLayout;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;

public class MainActivity extends Activity {

    ListView listItemView;

    // Define string array.
    String[] listItemsValue = new String[] {"Android","PHP","Web Development","Blogger","SEO","Photoshop", "1", "2", "3", "4", "5", "6"};

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listItemView = (ListView)findViewById(R.id.listView1);
        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_2, android.R.id.text1, listItemsValue);

        listItemView.setAdapter(adapter);

        // ListView setOnItemClickListener function apply here.

        listItemView.setOnItemClickListener(new OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                // TODO Auto-generated method stub
                listItemsValue[position] = "New!!";
                adapter.notifyDataSetChanged();
                //Toast.makeText(MainActivity.this, listItemsValue[position], Toast.LENGTH_SHORT).show();
            }
        });

    }


}