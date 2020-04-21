package net.ambrose.golf_90105;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import net.ambrose.golf_90105.Helper.LocaleHelper;

public class chooseLanguage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_language);
    }


    @Override

    protected void attachBaseContext(Context base) {

        super.attachBaseContext(LocaleHelper.onAttach(base));

    }



}
