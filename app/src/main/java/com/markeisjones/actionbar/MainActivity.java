package com.markeisjones.actionbar;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "Main";
    private TabAdapter mTabAdapter;
    private ViewPager mViewPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTabAdapter = new TabAdapter(getSupportFragmentManager());
        mViewPage = (ViewPager) findViewById(R.id.container);
        setupViewPage(mViewPage);

        TabLayout tabLayout =(TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPage);
        tabLayout.getTabAt(0).setIcon(R.drawable.ic_videogame_asset_black_24dp);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_palette_black_24dp);
        tabLayout.getTabAt(2).setIcon(R.drawable.ic_store_black_24dp);


        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.btmNaviBar);
        BottomNaviHelper.disableShiftMode(bottomNavigationView);
        Menu menu = bottomNavigationView.getMenu();
        MenuItem  menuItem= menu.getItem(0);
        menuItem.setChecked(true);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                switch(item.getItemId()){

                    case R.id.ic_delivery:


                        break;

                    case R.id.ic_golf:

                        Intent intent = new Intent(MainActivity.this, ActivityOne.class);
                        startActivity(intent);
                        break;
                    case R.id.ic_translate:
                        Intent intent1 = new Intent(MainActivity.this, ActivityTWO.class);
                        startActivity(intent1);
                        break;
                    case R.id.ic_android:
                        Intent intent2 = new Intent(MainActivity.this, ActivityThree.class);
                        startActivity(intent2);

                        break;
                }

                return false;
            }
        });
    }

    private void setupViewPage(ViewPager viewPage) {
        TabAdapter adapter = new TabAdapter(getSupportFragmentManager());
        adapter.addFragment(new Tab1Fragment());
        adapter.addFragment(new Tab2Fragment());
        adapter.addFragment(new Tab3Fragment());
        viewPage.setAdapter(adapter);
    }
}
