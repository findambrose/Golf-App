package net.ambrose.golf_90105;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.support.v7.widget.Toolbar;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import net.ambrose.golf_90105.Helper.LocaleHelper;

public class GoogleMapActivity extends AppCompatActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.profile, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.view_profile:
                startActivity(new Intent(getApplicationContext(), ProfileActivity.class));;
                return true;
            case R.id.choose_language:
                startActivity(new Intent(getApplicationContext(), chooseLanguage.class));
                return true;

            case R.id.view_services:
                startActivity(new Intent(getApplicationContext(), ClubServices.class));
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_google_map);




        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.g_map);
        mapFragment.getMapAsync(this);
    }




    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Royal Nairobi Golf Club coordinates
        LatLng royalNairobi = new LatLng(0.1545604, 37.908383);
        mMap.addMarker(new MarkerOptions().position(royalNairobi).title("Royal Nairobi Golf Club"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(royalNairobi));

        // The Cascades at Soma Bay
        LatLng theCascades = new LatLng(26.8596989, 33.9840652);
        mMap.addMarker(new MarkerOptions().position(theCascades).title("The Cascades at Soma Bay"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(theCascades));

        // Heritage Golf Club, Bel Ombre, Mauritius
        LatLng heritageGolf = new LatLng(-20.5030817,57.3992122);
        mMap.addMarker(new MarkerOptions().position(heritageGolf).title("Heritage Golf Club, Bel Ombre, Mauritius"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(heritageGolf));

        // Mazagan Golf Club, El Jadida
        LatLng mazaganGolf = new LatLng(33.2647006,-8.5782503);
        mMap.addMarker(new MarkerOptions().position(mazaganGolf).title("Mazagan Golf Club, El Jadida"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(mazaganGolf));

        // Windhoek Golf & Country Club, Namibia
        LatLng windhoekGolf = new LatLng(-22.617732,17.0635646);
        mMap.addMarker(new MarkerOptions().position(windhoekGolf).title("Windhoek Golf & Country Club, Namibia"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(windhoekGolf));

        // Fancourt Links, George, Western Cape
        LatLng fancourtLinks = new LatLng(-33.9587013,22.3941263);
        mMap.addMarker(new MarkerOptions().position(fancourtLinks).title("Fancourt Links, George, Western Cape"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(fancourtLinks));


    }

}
