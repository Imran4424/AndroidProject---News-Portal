package com.example.imu.broughttoday;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

/**
 * Created by Imu on 1/31/17.
 */
public class Sports extends Activity {

    WebView myWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_go);


        myWebView = (WebView) findViewById(R.id.webview_go);

        myWebView.loadUrl("http://www.somoynews.tv/pages/category/5/%E0%A6%96%E0%A7%87%E0%A6%B2%E0%A6%BE%E0%A6%B0-%E0%A6%B8%E0%A6%AE%E0%A7%9F");

        myWebView.setWebViewClient(new MyWebClient());

        WebSettings webSettings = myWebView.getSettings();

        webSettings.setJavaScriptEnabled(true);

    }
}
