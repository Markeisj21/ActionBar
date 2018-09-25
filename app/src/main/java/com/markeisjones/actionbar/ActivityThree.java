package com.markeisjones.actionbar;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ActivityThree extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);
        TextView title = (TextView) findViewById(R.id.activity_three);
        title.setText("This is Activity 3 ");


        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.btmNaviBar);
        BottomNaviHelper.disableShiftMode(bottomNavigationView);
        Menu menu = bottomNavigationView.getMenu();
        MenuItem  menuItem= menu.getItem(3);
        menuItem.setChecked(true);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                switch(item.getItemId()){

                    case R.id.ic_delivery:
                        Intent intent = new Intent(ActivityThree.this, MainActivity.class);
                        startActivity(intent);

                        break;

                    case R.id.ic_golf:
                        Intent intent1 = new Intent(ActivityThree.this, ActivityOne.class);
                        startActivity(intent1);

                        break;
                    case R.id.ic_translate:
                        Intent intent2 = new Intent(ActivityThree.this, ActivityTWO.class);
                        startActivity(intent2);
                        break;
                    case R.id.ic_android:


                        break;
                }

                return false;
            }
        });
    }
}
