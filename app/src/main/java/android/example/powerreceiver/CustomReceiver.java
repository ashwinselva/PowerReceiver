package android.example.powerreceiver;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.widget.Toast;

import androidx.annotation.NonNull;

public class CustomReceiver<mPackageManager> extends BroadcastReceiver {
    private static final String ACTION_CUSTOM_BROADCAST =
            BuildConfig.APPLICATION_ID + ".ACTION_CUSTOM_BROADCAST";

    @Override
    public void onReceive(Context context, @NonNull Intent intent) {
        String intentAction = intent.getAction();
        String toastMessage = null;
        switch(intentAction){
            case ACTION_CUSTOM_BROADCAST:
                toastMessage = "Custom Broadcast Received";
                break;
            case Intent.ACTION_POWER_CONNECTED:
                toastMessage="Power connected";
                break;

            case Intent.ACTION_POWER_DISCONNECTED:
                toastMessage="Power disconnected";
                break;
        }
        Toast.makeText(context, toastMessage, Toast.LENGTH_SHORT).show();
    }
}