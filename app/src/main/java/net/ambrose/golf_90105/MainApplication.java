package net.ambrose.golf_90105;

import android.app.Application;
import android.content.Context;

import net.ambrose.golf_90105.Helper.LocaleHelper;

public class MainApplication extends Application {


    @Override

    protected void attachBaseContext(Context base) {

        super.attachBaseContext(LocaleHelper.onAttach(base, "en"));

    }
}
