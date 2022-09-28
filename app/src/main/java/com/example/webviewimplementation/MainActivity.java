package com.example.webviewimplementation;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {

    WebView webb;
    ProgressBar pgbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webb = findViewById(R.id.webb);

        webb.loadUrl("https://www.google.com");

        webb.setWebViewClient(new WebViewClient(){
            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                /*pgbar.setVisibility(View.VISIBLE);*/
                super.onPageStarted(view, url, favicon);
            }

            @Override
            public void onPageFinished(WebView view, String url) {
                /*pgbar.setVisibility(View.GONE);*/
                super.onPageFinished(view, url);
            }
        });
    }

    @Override
    public void onBackPressed() {
        if (webb.canGoBack()){
            webb.goBack();
        }else{
            super.onBackPressed();
        }
    }
}