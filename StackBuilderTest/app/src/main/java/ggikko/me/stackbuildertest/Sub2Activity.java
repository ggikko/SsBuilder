package ggikko.me.stackbuildertest;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.TaskStackBuilder;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Sub2Activity extends AppCompatActivity {

    public static void startSubActivity(Context context) {
        Intent intent = new Intent(context, Sub2Activity.class);
        TaskStackBuilder.create(context)
                .addNextIntentWithParentStack(intent)
                .startActivities();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub2);
    }
}
