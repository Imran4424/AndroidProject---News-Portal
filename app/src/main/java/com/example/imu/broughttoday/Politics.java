package com.example.imu.broughttoday;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

/**
 * Created by Imu on 1/31/17.
 */
public class Politics extends Activity {

    WebView myWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_go);


        myWebView = (WebView) findViewById(R.id.webview_go);

        myWebView.loadUrl("http://www.prothom-alo.com/bangladesh-politics");

        myWebView.setWebViewClient(new MyWebClient());

        WebSettings webSettings = myWebView.getSettings();

        webSettings.setJavaScriptEnabled(true);

    }
}
