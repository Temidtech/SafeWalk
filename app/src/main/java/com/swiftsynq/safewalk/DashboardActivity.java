package com.swiftsynq.safewalk;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

import com.swiftsynq.safewalk.Fragment.HomeFragment;
import com.swiftsynq.safewalk.Fragment.ProfileFragment;

public class DashboardActivity extends AppCompatActivity {


    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment selectedFragment=null;
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    selectedFragment= HomeFragment.newInstance();
                    break;
                case R.id.navigation_dashboard:
                    selectedFragment= HomeFragment.newInstance();
                    break;
                case R.id.navigation_notifications:
                    selectedFragment= ProfileFragment.newInstance();
                    break;
            }
            FragmentManager manager = getSupportFragmentManager();
            manager.beginTransaction().replace(R.id.main_container,selectedFragment).commit();
            return true;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        FragmentManager manager = getSupportFragmentManager();
        manager.beginTransaction().replace(R.id.main_container, HomeFragment.newInstance()).commit();
    }

}
