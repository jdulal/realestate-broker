package com.ngocketit.realestatebroker.receiver;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.TaskStackBuilder;
import android.widget.RemoteViews;

import com.ngocketit.realestatebroker.R;
import com.ngocketit.realestatebroker.activity.AppointmentFormFragmentActivity;
import com.ngocketit.realestatebroker.activity.AppointmentViewFragmentActivity;
import com.ngocketit.realestatebroker.fragment.AppointmentFormFragment;
import com.ngocketit.realestatebroker.fragment.BaseItemFragment;

public class AppointmentAlarmReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Bundle extra = intent.getExtras();
        if (extra != null && extra.containsKey(BaseItemFragment.ITEM_ID)) {
            long itemId = extra.getLong(BaseItemFragment.ITEM_ID);
            String itemTitle = extra.getString(AppointmentFormFragment.ITEM_TITLE);
            String itemTime = extra.getString(AppointmentFormFragment.ITEM_TIME);
            String itemLocation = extra.getString(AppointmentFormFragment.ITEM_LOCATION);

            RemoteViews view = new RemoteViews(context.getPackageName(),
                    R.layout.nofication_item_appointment);

            Uri alarmSound = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);
            long[] vibrate = { 0, 100, 200, 300 };

            Intent appointmentIntent = new Intent(context, AppointmentViewFragmentActivity.class);
            appointmentIntent.putExtra(BaseItemFragment.ITEM_ID, itemId);

            TaskStackBuilder stackBuilder = TaskStackBuilder.create(context);
            stackBuilder.addParentStack(AppointmentFormFragmentActivity.class);
            stackBuilder.addNextIntent(appointmentIntent);
            PendingIntent resultPendingIntent = stackBuilder.getPendingIntent( 0, PendingIntent.FLAG_UPDATE_CURRENT );

            NotificationCompat.Builder mBuilder =
                    new NotificationCompat.Builder(context)
                            .setSmallIcon(R.drawable.ic_appointment_white)
                            .setAutoCancel(true)
                            .setSound(alarmSound)
                            .setVibrate(vibrate)
                            .setContentTitle(itemTitle)
                            .setContentText(itemLocation)
                            .setContentIntent(resultPendingIntent);

            NotificationManager mNotificationManager =
                    (NotificationManager)context.getSystemService(Context.NOTIFICATION_SERVICE);
            mNotificationManager.notify(0, mBuilder.build());
        }
    }
}
