package opensource.com.sampleopensource;

import android.Manifest;
import android.accounts.Account;
import android.accounts.AccountManager;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.AsyncTask;
import android.os.Build;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.WindowManager;
import android.widget.Toast;

import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.opensource.OpenListeners.OpenDataCallbacks;
import com.opensource.OpendataApp;

import java.io.IOException;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements OpenDataCallbacks {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    //Replace with your keys
        OpendataApp.initialize(MainActivity.this, "YOUR_API_KEY", "USER_EMAIL", "USER_GOOGLE_ADVERTISER_ID");
    }

    //Callback methods
    @Override
    public void onDataSuccess(String message, String data) {
        Log.i("onDataSuccess",""+data);

    }

    @SuppressLint("WrongConstant")
    @Override
    public void onDataFailure(String message) {
        Log.i("onDataFailure",""+message);
    }
}
