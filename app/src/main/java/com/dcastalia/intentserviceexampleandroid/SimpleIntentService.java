package com.dcastalia.intentserviceexampleandroid;

import android.app.IntentService;
import android.content.Intent;
import android.os.SystemClock;
import android.support.annotation.Nullable;

/**

 */
public class SimpleIntentService extends IntentService {

    public static  final String ACTION_1 = "MY_ACTION_1";


    public SimpleIntentService() {
        super("SimpleIntentService");
    }



    @Override
    protected void onHandleIntent(@Nullable Intent intent) {

        // Create Intent object (to broadcast).
        Intent broadcastIntent = new Intent();

        // Set Action name for this Intent.
        // A Intent can perform many different actions.
        broadcastIntent.setAction(SimpleIntentService.ACTION_1);


        // Loop 100 times broadcast of Intent.
        for (int i = 0; i <= 100; i++) {
            // Set data
            // (Percent of work)
            broadcastIntent.putExtra("percel", i);
            // Send broadcast
            sendBroadcast(broadcastIntent);
            // Sleep 100 Milliseconds.
            SystemClock.sleep(100);
        }

    }
}
