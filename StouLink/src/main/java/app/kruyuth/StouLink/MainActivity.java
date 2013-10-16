package app.kruyuth.StouLink;

import android.app.ListActivity;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends ListActivity {
    private String[] itemListview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        itemListview = getResources().getStringArray(R.array.itemList);
        ArrayAdapter<String> itemAdapter = new ArrayAdapter<String>(this, R.layout.activity_main,R.id.textView,itemListview);
        setListAdapter(itemAdapter);
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
