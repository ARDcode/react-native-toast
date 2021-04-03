package com.reactnativetoast

import android.widget.Toast
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod
import com.facebook.react.bridge.Promise
import es.dmoral.toasty.Toasty

class ToastModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule(reactContext) {
  private val mContext = reactContext;

  override fun getName(): String {
    return "Toast"
  }

  @ReactMethod
  fun multiply(a: Int, b: Int, promise: Promise) {

    promise.resolve(a * b)

  }

  @ReactMethod
  fun show(message: String) {
    Toasty.error(mContext, message, Toast.LENGTH_SHORT, true).show();
  }


}
