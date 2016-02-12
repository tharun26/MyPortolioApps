package com.tharun26.tharun_gowrishankar.myappportfolio;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button my_own_app_button =(Button) findViewById(R.id.id_sixth_app);
        my_own_app_button.setOnClickListener(new View.OnClickListener()
                {
                public void onClick(View view)
                {
                    Context app_context = getApplicationContext();
                    Resources r = getResources();
                    String app_name = r.getString(R.string.sixth_app_name);
                    CharSequence toast_msg = "Clicked -" + app_name;
                    int duration = Toast.LENGTH_SHORT;
                    Toast toaster = Toast.makeText(app_context, toast_msg, duration);
                    toaster.show();
                }
                }
                );
    }

    @Override
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
    }
    public void click_first_app(View view)
    {
        Context app_context = getApplicationContext();
        Resources r = getResources();
        String app_name = r.getString(R.string.first_app_name);
        CharSequence toast_msg = "Clicked -" + app_name;
        int duration = Toast.LENGTH_SHORT;
        Toast toaster = Toast.makeText(app_context, toast_msg, duration);
        toaster.show();
    }
    public void click_second_app(View view)
    {
        Context app_context = getApplicationContext();
        Resources r = getResources();
        String app_name = r.getString(R.string.second_app_name);
        CharSequence toast_msg = "Clicked -" + app_name;
        int duration = Toast.LENGTH_SHORT;
        Toast toaster = Toast.makeText(app_context, toast_msg, duration);
        toaster.show();
    }
    public void click_third_app(View view)
    {
        Context app_context = getApplicationContext();
        Resources r = getResources();
        String app_name = r.getString(R.string.third_app_name);
        CharSequence toast_msg = "Clicked -" + app_name;
        int duration = Toast.LENGTH_SHORT;
        Toast toaster = Toast.makeText(app_context, toast_msg, duration);
        toaster.show();
    }
    public void click_fourth_app(View view)
    {
        Context app_context = getApplicationContext();
        Resources r = getResources();
        String app_name = r.getString(R.string.fourth_app_name);
        CharSequence toast_msg = "Clicked -" + app_name;
        int duration = Toast.LENGTH_SHORT;
        Toast toaster = Toast.makeText(app_context, toast_msg, duration);
        toaster.show();
    }
    public void click_fifth_app(View view)
    {
        Context app_context = getApplicationContext();
        Resources r = getResources();
        String app_name = r.getString(R.string.fifth_app_name);
        CharSequence toast_msg = "Clicked -" + app_name;
        int duration = Toast.LENGTH_SHORT;
        Toast toaster = Toast.makeText(app_context, toast_msg, duration);
        toaster.show();
    }

}
