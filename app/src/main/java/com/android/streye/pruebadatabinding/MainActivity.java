package com.android.streye.pruebadatabinding;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.util.Log;
import com.android.streye.pruebadatabinding.databinding.ActivityMainBinding;

public class MainActivity extends Activity {
  private ActivityMainBinding binding;
  User user;
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    user=new User();
    binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
    binding.setUser(user);
    binding.setView(this);
    user.nombre.set("hola");



  }

  public void showList(){
    Log.e("aminano","pulso boton"+user.nombre.get());

  }
}
