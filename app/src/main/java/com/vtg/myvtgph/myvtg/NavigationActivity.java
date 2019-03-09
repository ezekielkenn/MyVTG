//package com.vtg.myvtgph.myvtg;
//
//import android.content.Intent;
//import android.support.annotation.NonNull;
//import android.support.design.widget.NavigationView;
//import android.support.v4.view.GravityCompat;
//import android.support.v4.widget.DrawerLayout;
//import android.support.v7.app.ActionBarDrawerToggle;
//import android.support.v7.app.AppCompatActivity;
//import android.os.Bundle;
//import android.support.v7.widget.Toolbar;
//import android.view.Menu;
//import android.view.MenuItem;
//
//import com.google.firebase.auth.FirebaseAuth;
//
//public class NavigationActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
//
//    //FIREBASE
//    FirebaseAuth firebaseAuth;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate( savedInstanceState );
//        setContentView( R.layout.activity_dashboard );
//        Toolbar toolbar = (Toolbar) findViewById( R.id.toolbar );
//        setSupportActionBar( toolbar );
//        DrawerLayout drawer = (DrawerLayout) findViewById( R.id.drawer_layout );
//
//        NavigationView navigationView = (NavigationView) findViewById( R.id.nav_view );
//        navigationView.setNavigationItemSelectedListener( this );
//
//        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
//                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close );
//        drawer.addDrawerListener( toggle );
//        toggle.syncState();
//
//        if (savedInstanceState == null) {
//            getSupportFragmentManager().beginTransaction().replace( R.id.fragment_container,
//                    new HomeFragment() ).commit();
//            navigationView.setCheckedItem( R.id.nav_home );
//        }
//        firebaseAuth = FirebaseAuth.getInstance();
//
//    }
//
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        return super.onCreateOptionsMenu( menu );
//    }
//
//    @Override
//    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
//        int id = menuItem.getItemId();
//        switch (id) {
//            case R.id.nav_logout:
//                firebaseAuth.signOut();
//                finish();
//                startActivity( new Intent( this, LoginActivity.class ) );
//                break;
//        }
//
//        if (id == R.id.nav_home) {
//            getSupportFragmentManager().beginTransaction().replace( R.id.fragment_container,
//                    new HomeFragment() ).commit();
//        } else if (id == R.id.nav_touristspot) {
//            getSupportFragmentManager().beginTransaction().replace( R.id.fragment_container,
//                    new ListFragment() ).commit();
//        } else if (id == R.id.nav_date) {
//            getSupportFragmentManager().beginTransaction().replace( R.id.fragment_container,
//                    new LogsFragment() ).commit();
//        } else if (id == R.id.nav_logout) {
//            // Navigate back to Login ActivityLogout
//            Intent intentRegister = new Intent( NavigationActivity.this, LoginActivity.class );
//            startActivity( intentRegister );
//            finish();
//        }
//        {
////
//////        } else if (id == R.id.nav_share) {
//////
//////        } else if (id == R.id.nav_send) {
//////
//////        }
////
//            DrawerLayout drawer = (DrawerLayout) findViewById( R.id.drawer_layout );
//            drawer.closeDrawer( GravityCompat.START );
//            return false;
//        }
//    }
//}