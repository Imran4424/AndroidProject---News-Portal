package com.example.imu.broughttoday;

import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by Imu on 1/25/17.
 */
public class MyWebClient extends WebViewClient{
    @Override

    public boolean shouldOverrideUrlLoading(WebView view, String url) {

        view.loadUrl(url);

        return true;
    }


}


