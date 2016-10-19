package com.example.oscar.testinggabriela;

import android.app.Application;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import android.widget.EditText;
import android.widget.TextView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity {
    protected TextView _label = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        _label = (TextView) findViewById(R.id.textView);

    }


    // Button functions
    public void click0(View view) {
        _label.setText("1");
    }

    public void click1(View view) {

    }

    public void click2(View view) {

    }

    public void click3(View view) {

    }

    public void click4(View view) {

    }

    public void click5(View view) {

    }

    public void click6(View view) {

    }

    public void click7(View view) {

    }

    public void click8(View view) {

    }

    public void click9(View view) {

    }

    public void clickPlus(View view) {

    }

    public void clickAdd(View view) {

    }

    public void clickMinus(View view) {

    }

    public void clickDelete(View view) {

    }

    public void clickDiv(View view) {

    }

    public void clickEquals(View view) {

    }

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    public Action getIndexApiAction() {
        Thing object = new Thing.Builder()
                .setName("Main Page") // TODO: Define a title for the content shown.
                // TODO: Make sure this auto-generated URL is correct.
                .setUrl(Uri.parse("http://[ENTER-YOUR-URL-HERE]"))
                .build();
        return new Action.Builder(Action.TYPE_VIEW)
                .setObject(object)
                .setActionStatus(Action.STATUS_TYPE_COMPLETED)
                .build();
    }
}
