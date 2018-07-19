package com.android.streye.pruebadatabinding;

import android.app.Application;
import android.content.Context;
import android.support.multidex.MultiDex;

/**
 * Created by djamb on 19/07/18.
 */

public class App extends Application {

  @Override
  protected void attachBaseContext(Context base) {
    super.attachBaseContext(base);
    MultiDex.install(this);
  }
}
