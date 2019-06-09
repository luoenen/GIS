package com.csu.gis;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.widget.TextView;


import androidx.core.content.res.ResourcesCompat;
import com.csu.gis.R;
import cn.bmob.v3.Bmob;

public class WelcomeActivity extends Activity {
    private TextView welcome_txt;
    private final Handler handler = new Handler();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_welcome);
        Bmob.initialize(this, "debc12fd0c47cf201ab6bcb4c81f29fa");
        welcome_txt = findViewById(R.id.welcome_text);
        Typeface typeface = ResourcesCompat.getFont(this, R.font.font);
        welcome_txt.setTypeface(typeface);
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(intent);
                finish();
            }
        },2000);
    }
}
