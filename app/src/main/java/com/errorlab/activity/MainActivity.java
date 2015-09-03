package com.errorlab.activity;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;

import com.errorlab.Fragements.Dashbord;
import com.errorlab.R;

public class MainActivity extends AppCompatActivity implements FragmentDrawer.FragmentDrawerListener{

    private Toolbar toolbar;
    private FragmentDrawer drawerFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        try{
            drawerFragment = (FragmentDrawer) getSupportFragmentManager().findFragmentById(R.id.navigateDrawer);
            drawerFragment.setUp(R.id.navigateDrawer, (DrawerLayout) findViewById(R.id.drawer_layout), toolbar);
            //drawerFragment.setDrawerListener(this);
        }
        catch (Exception e){
            Log.e("Check",e.getMessage().toString());
        }
    }

    public void changeFragment(View view){
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        Dashbord dashbord = new Dashbord();
        fragmentTransaction.replace(R.id.mainWindow, dashbord);
        fragmentTransaction.commit();
    }

    @Override
    public void onDrawerItemSelected(View view, int position) {

    }


































    /*@Override
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
    }*/
}
