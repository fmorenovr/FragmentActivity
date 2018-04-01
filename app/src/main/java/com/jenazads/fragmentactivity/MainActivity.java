package com.jenazads.fragmentactivity;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

import com.jenazads.fragmentactivity.Fragments.FirstFragment;
import com.jenazads.fragmentactivity.Fragments.SecondFragment;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_main);
    }

    public void ChangeFragment(View view){

        if(view == findViewById(R.id.btn_frg_1)){
            getSupportFragmentManager().beginTransaction()
                    .setCustomAnimations(R.anim.enter,R.anim.exit,R.anim.pop_enter,R.anim.pop_exit)
                    .replace(R.id.fragment_place, new FirstFragment()).addToBackStack(null).commit();
        }
        if(view == findViewById(R.id.btn_frg_2)){
            getSupportFragmentManager().beginTransaction()
                    .setCustomAnimations(R.anim.enter,R.anim.exit,R.anim.pop_enter,R.anim.pop_exit)
                    .replace(R.id.fragment_place, new SecondFragment()).addToBackStack(null).commit();
        }
    }
}
