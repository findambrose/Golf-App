package net.ambrose.golf_90105;

import android.app.Service;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ClubServices extends AppCompatActivity {

    ListView listView;



    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_club_services);



        listView = (ListView) findViewById(R.id.list);

        String[] values = new String[]{"Royal Nairobi Golf Club","The Cascades at Soma Bay", "Heritage Golf Club, Bel Ombre, Mauritius",

                "Mazagan Golf Club, El Jadida, Morocco", "Windhoek Golf & Country Club, Namibia","Fancourt Links, George, Western Cape, South Africa"


        };



        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,

                android.R.layout.simple_list_item_1, android.R.id.text1, values);



        listView.setAdapter(adapter);



        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            public void onItemClick(AdapterView<?> parent, View view,

                                    int position, long id) {

                if (position == 0) {

                    Intent myIntent = new Intent(view.getContext(), Services1.class);

                    startActivityForResult(myIntent, 0);

                }



                if (position == 1) {

                    Intent myIntent = new Intent(view.getContext(), Services2.class);

                    startActivityForResult(myIntent, 0);

                }



                if (position == 2) {

                    Intent myIntent = new Intent(view.getContext(), Services1.class);

                    startActivityForResult(myIntent, 0);

                }



                if (position == 3) {

                    Intent myIntent = new Intent(view.getContext(), Services2.class);

                    startActivityForResult(myIntent, 0);

                }



                if (position == 4) {

                    Intent myIntent = new Intent(view.getContext(), Services1.class);

                    startActivityForResult(myIntent, 0);

                }



                if (position == 5) {

                    Intent myIntent = new Intent(view.getContext(), Services2.class);

                    startActivityForResult(myIntent, 0);

                }



                if (position == 6) {

                    Intent myIntent = new Intent(view.getContext(), Services1.class);

                    startActivityForResult(myIntent, 0);

                }



                if (position == 7) {

                    Intent myIntent = new Intent(view.getContext(), Services2.class);

                    startActivityForResult(myIntent, 0);

                }

            }

        });

    }
}
