package com.nfll.cox;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void tips(View view) {

        Intent intent = new Intent(getApplicationContext(), DetailsActivity.class);
        intent.putExtra("status", 1);
        startActivity(intent);

    }

    public void guide(View view) {
        Intent intent = new Intent(getApplicationContext(), DetailsActivity.class);
        intent.putExtra("status", 2);
        startActivity(intent);
    }

    public void gems(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/chJPE3"));
        startActivity(browserIntent);
    }

    public void banner(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/chJPE3"));
        startActivity(browserIntent);
    }

}
