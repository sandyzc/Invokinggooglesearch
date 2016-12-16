package com.sandyz.invokinggooglesearch;

import android.app.SearchManager;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.UriMatcher;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button bt1;
    EditText et1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt1= (Button)findViewById(R.id.btn1);
        et1 = (EditText)findViewById(R.id.et1);
        bt1.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        if(v.getId()== R.id.btn1){

            String q = et1.getText().toString();
            Intent intent = new Intent(Intent.ACTION_WEB_SEARCH );
            intent.putExtra(SearchManager.QUERY, q);
            startActivity(intent);

//            Intent sendTntent = new Intent();
//            sendTntent.setAction(Intent.ACTION_WEB_SEARCH, Uri.parse(String.valueOf(et1)));
        }

    }
}
