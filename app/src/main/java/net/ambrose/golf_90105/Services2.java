package net.ambrose.golf_90105;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Services2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_services2);

        ListView listView;



            listView = (ListView) findViewById(R.id.services2);

            String[] values = new String[]{"Par 72 from the back tees","Majestic views of the Indian Ocean", "Course start from $205 a round.",




            };



            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,

                    android.R.layout.simple_list_item_1, android.R.id.text1, values);



            listView.setAdapter(adapter);
        }



    }

