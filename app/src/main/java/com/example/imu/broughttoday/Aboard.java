package com.example.imu.broughttoday;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

/**
 * Created by Imu on 1/31/17.
 */
public class Aboard extends Activity {

    WebView myWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_go);


        myWebView = (WebView) findViewById(R.id.webview_go);

        myWebView.loadUrl("http://www.somoynews.tv/pages/category/6/%E0%A6%86%E0%A6%A8%E0%A7%8D%E0%A6%A4%E0%A6%B0%E0%A7%8D%E0%A6%9C%E0%A6%BE%E0%A6%A4%E0%A6%BF%E0%A6%95-%E0%A6%B8%E0%A6%AE%E0%A7%9F");

        myWebView.setWebViewClient(new MyWebClient());

        WebSettings webSettings = myWebView.getSettings();

        webSettings.setJavaScriptEnabled(true);

    }
}
