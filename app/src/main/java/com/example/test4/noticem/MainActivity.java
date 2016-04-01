package com.example.test4.noticem;

import android.app.NotificationManager;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends ActionBarActivity {
    int notification_id =1;
    int message_count=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
public void notification(View view)
{
this.notificationOperation(notification_id,message_count);
}
    public void issuenotification(View view)
    {
        message_count++;
        this.notificationOperation(notification_id,message_count);

    }
    public void newnotification(View view)
    {
       notification_id++;
        message_count=1;
        this.notificationOperation(notification_id,message_count);

    }

    public void notificationOperation(int id, int count)
    {
        NotificationCompat.Builder  builder= new NotificationCompat.Builder(this);
        builder.setSmallIcon(R.drawable.wifi);
        builder.setContentTitle("My notification");
        builder.setContentText("you have " + count + "Messages");
        NotificationManager Nm= (NotificationManager)getSystemService(Context.NOTIFICATION_SERVICE);
        Nm.notify(id,builder.build());
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
