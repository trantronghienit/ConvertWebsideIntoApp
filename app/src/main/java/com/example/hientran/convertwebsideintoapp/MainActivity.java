package com.example.hientran.convertwebsideintoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private WebView webView;
    private TextView txtv;
    private final String PATCH = "http://trantronghien.blogspot.com/";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView = (WebView) findViewById(R.id.webview);
        txtv = (TextView) findViewById(R.id.textView);

        txtv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Xin cám ơn bạn quan tâm", Toast.LENGTH_SHORT).show();
            }
        });
        WebSettings mywebseting = webView.getSettings();
        mywebseting.setJavaScriptEnabled(true);
        webView.loadUrl(PATCH);
        webView.setWebViewClient(new WebViewClient());
    }


    // để tránh chuyển vào brower khi nhấn chuyển hướng
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        if(webView.canGoBack()){
            webView.goBack();
        }
    }
}
