package com.example.imu.broughttoday;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class Espn extends Activity {

    WebView myWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_go);


        myWebView = (WebView) findViewById(R.id.webview_go);

        myWebView.loadUrl("http://www.espncricinfo.com");

        myWebView.setWebViewClient(new MyWebClient());

        WebSettings webSettings = myWebView.getSettings();

        webSettings.setJavaScriptEnabled(true);
    }
}
