package com.example.android.thepantry;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ThePantry extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_the_pantry);

        Button buttonred = (Button) findViewById(R.id.buttonred);
        Button buttonblue = (Button) findViewById(R.id.buttonblue);

        buttonred.setOnClickListener(this);
        buttonblue.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()) {
            case R.id.buttonred:
                i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://thepantrydc.com/"));
                startActivity(i);
                break;
            case R.id.buttonblue:
                i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/thepantrydc/"));
                startActivity(i);
                break;
        }

    }
}





