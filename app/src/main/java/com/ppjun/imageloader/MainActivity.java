package com.ppjun.imageloader;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.ppjun.magic.ImageLoader;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView = (ImageView) findViewById(R.id.imageaa);
        ImageLoader.build(MainActivity.this).bindBitmap("http://f.hiphotos.baidu.com/baike/w%3D268%3Bg%3D0/sign=b159a06791dda144da096bb48a8cb79f/a50f4bfbfbedab64bec149b4f136afc379311e16.jpg", imageView);
    }
}
