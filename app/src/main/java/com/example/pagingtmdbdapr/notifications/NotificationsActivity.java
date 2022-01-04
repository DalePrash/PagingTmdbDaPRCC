package com.example.pagingtmdbdapr.notifications;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import androidx.core.app.TaskStackBuilder;

import com.example.pagingtmdbdapr.R;

public class NotificationsActivity extends AppCompatActivity {


    private Button buttonX;

    String cnl_id = "cnd_id";
    String cnl_name = "cnl_name";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification_message);
    buttonX = findViewById(R.id.xButton);
    buttonX.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            setNotification();
        }
    });

    }

    void setNotification()
    {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){

            NotificationChannel z = new NotificationChannel(cnl_id,cnl_name, NotificationManager.IMPORTANCE_DEFAULT);


            NotificationManager manager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);

            manager.createNotificationChannel(z);




            NotificationManagerCompat x = NotificationManagerCompat.from(this);
      /*  NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(this);
       mBuilder.setSmallIcon(R.drawable.iconb);
        mBuilder.setContentTitle("Dalesh's title");
        mBuilder.setContentText("Dalesh's Message");
                mBuilder.setPriority(NotificationCompat.PRIORITY_HIGH);
                mBuilder.build();

       */



            Notification y = new NotificationCompat.Builder(this,cnl_id)
               .setSmallIcon(R.drawable.iconb)
        .setContentTitle("Cake").
        setContentText("Pastry").
                            setCategory(NotificationCompat.CATEGORY_MESSAGE)
                            .build();


        x.notify(1,y);


       /* Intent resultIntent = new Intent(this, SomePendingActivtity.class);
        TaskStackBuilder stackBuilder = TaskStackBuilder.create(this);
        stackBuilder.addParentStack(SomePendingActivtity.class);



// Adds the Intent that starts the Activity to the top of the stack
        stackBuilder.addNextIntent(resultIntent);
        PendingIntent resultPendingIntent = stackBuilder.getPendingIntent(0,PendingIntent.FLAG_UPDATE_CURRENT);

   */
     //   mBuilder.setContentIntent(resultPendingIntent);
    }}



}
