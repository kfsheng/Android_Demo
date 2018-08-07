package example.com.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    private WebView webview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //实例化WebView对象
        webview = new WebView(this);
        //设置WebView属性，能够执行Javascript脚本
        webview.getSettings().setJavaScriptEnabled(true);
        //加载需要显示的网页
        //webview.loadUrl("file:///android_asset/index.html");//显示本地网页
        webview.loadUrl("http://172.20.10.85:8080/");//显示远程网页
        getSupportActionBar().hide();//隐藏掉整个ActionBar，包括下面的Tabs
        //设置Web视图
        setContentView(webview);
        //setContentView(R.layout.activity_main);
    }
}
