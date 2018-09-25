package com.markeisjones.actionbar;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class ActivityTWO extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        TextView title = (TextView) findViewById(R.id.activity_two);
        title.setText("Activity two");

        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.btmNaviBar);
        BottomNaviHelper.disableShiftMode(bottomNavigationView);
        Menu menu = bottomNavigationView.getMenu();
        MenuItem  menuItem= menu.getItem(2);
        menuItem.setChecked(true);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                switch(item.getItemId()){

                    case R.id.ic_delivery:
                        Intent intent = new Intent(ActivityTWO.this, MainActivity.class);
                        startActivity(intent);

                        break;

                    case R.id.ic_golf:
                        Intent intent1 = new Intent(ActivityTWO.this, ActivityTWO.class);
                        startActivity(intent1);

                        break;
                    case R.id.ic_translate:

                        break;
                    case R.id.ic_android:
                        Intent intent2 = new Intent(ActivityTWO.this, ActivityThree.class);
                        startActivity(intent2);

                        break;
                }

                return false;
            }
        });

    }
}
