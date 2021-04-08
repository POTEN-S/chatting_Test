package com.example.testapp;

import android.os.Bundle;

import android.support.v4.app.*;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.testapp.ui.chatting.ChattingFragment;
import com.example.testapp.ui.home.HomeFragment;
import com.example.testapp.ui.post.PostFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends FragmentActivity {

    ChattingFragment chattingFragment;
    PostFragment postFragment;
    HomeFragment homeFragment;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView navView = findViewById(R.id.nav_view);
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_chatting, R.id.navigation_home, R.id.navigation_post)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupWithNavController(navView, navController);
        chattingFragment = new ChattingFragment();
        postFragment = new PostFragment();
        homeFragment = new HomeFragment();




        getFragmentManager().beginTransaction().replace(R.id.mainactivity_framelayout,new HomeFragment()).commit();
    }


}
