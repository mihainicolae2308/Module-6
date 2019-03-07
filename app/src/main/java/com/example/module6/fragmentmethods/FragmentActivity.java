package com.example.module6.fragmentmethods;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.module6.R;
import com.example.module6.utils.Logging;

public class FragmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);
        createFragment(new InfoFragment());

        Logging.show(this, getString(R.string.on_create));
    }

    private void createFragment(Fragment fragment) {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.frame_layout_container, fragment)
                .commit();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Logging.show(this, getString(R.string.on_start));
    }

    @Override
    protected void onResume() {
        super.onResume();
        Logging.show(this, getString(R.string.on_resume));
    }

    @Override
    protected void onPause() {
        super.onPause();
        Logging.show(this, getString(R.string.on_pause));
    }

    @Override
    protected void onStop() {
        super.onStop();
        Logging.show(this, getString(R.string.on_stop));
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Logging.show(this, getString(R.string.on_restart));
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Logging.show(this, getString(R.string.on_destroy));
    }
}
