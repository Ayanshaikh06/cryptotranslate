package com.example.cryptotranslate;

import android.app.AlertDialog;
import android.app.Application;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.util.Log;
import android.widget.Toast;

import java.util.Locale;

public class app extends Application {

    @Override
    public void  onCreate() {
        super.onCreate();
        Configuration newConfig = new Configuration();
        newConfig.locale= Locale.ENGLISH;
        super.onConfigurationChanged(newConfig);
        Locale.setDefault(newConfig.locale);
        getBaseContext().getResources().updateConfiguration(newConfig,getResources().getDisplayMetrics());

    }
    public static  void Loger(String m)
    {
        Log.e("mip tag",m);
    }
    public static void ToastMaker(Context c, String m ){
        Toast.makeText(c,m,Toast.LENGTH_LONG).show();
    }
    public static void  DiologMaker(Context c, String title,String mes){
        AlertDialog.Builder Alert=new AlertDialog.Builder(c);
        Alert.setCancelable(true);
        Alert.setTitle(title);
        Alert.setMessage(mes);
        Alert.setPositiveButton("ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
        Alert.show();

    }

}
