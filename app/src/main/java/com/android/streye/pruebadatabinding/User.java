package com.android.streye.pruebadatabinding;

import android.databinding.ObservableField;
import android.databinding.adapters.TextViewBindingAdapter;
import android.text.Editable;
import android.util.Log;

/**
 * Created by djamb on 19/07/18.
 */

public class User {

  public final ObservableField<String> nombre = new ObservableField<>();
  public final ObservableField<String> apellido =  new ObservableField<>();


  public void imprimir() {
    Log.e("aminano", "" + nombre.get());
    nombre.set("ccachis");
  }

  public TextViewBindingAdapter.AfterTextChanged afterTextChanged =
      new TextViewBindingAdapter.AfterTextChanged() {
        @Override
        public void afterTextChanged(Editable s) {
          nombre.set(s.toString());
        }
      };
}
