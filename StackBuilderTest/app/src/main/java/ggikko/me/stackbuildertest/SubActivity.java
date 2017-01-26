package ggikko.me.stackbuildertest;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.TaskStackBuilder;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SubActivity extends AppCompatActivity {

    public static void startSubActivity(Context context) {
        Intent intent = new Intent(context, SubActivity.class);
        TaskStackBuilder.create(context)
                .addNextIntentWithParentStack(intent)
                .startActivities();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        findViewById(R.id.bb).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sub2Activity.startSubActivity(SubActivity.this);
            }
        });
    }
}
