package net.ambrose.golf_90105;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Services1 extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_services1);

        listView = (ListView) findViewById(R.id.services1);

        String[] values = new String[]{"par-72 Gary Player design","Nine-hole par three course", "Course start from $96 a round.",

                "A self-service bar"


        };



        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,

                android.R.layout.simple_list_item_1, android.R.id.text1, values);



        listView.setAdapter(adapter);
    }
}
