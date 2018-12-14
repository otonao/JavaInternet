package com.example.ninomiya.javainternet;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{

    private TextView textView;
    String[] urls;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Resources res = getResources();
        urls = res.getStringArray(R.array.kosen_url);

        textView = findViewById(R.id.myTextView);

        Button getButton = findViewById(R.id.htmlGetButton);
        getButton.setOnClickListener(v -> asyncProcess(this));

        Button clearButton = findViewById(R.id.clearButton);
        clearButton.setOnClickListener(v -> textView.setText(null));
    }

    public void asyncProcess(Context context){
        long start = System.currentTimeMillis();

        try {
            MyAsyncTask task = new MyAsyncTask(context, new AsyncTaskCallbacks() {
                @Override
                public void onTaskFinished() {
                    long end = System.currentTimeMillis();
                    Toast.makeText(context, (end - start) + "ms", Toast.LENGTH_LONG).show();
                }
            });
            task.execute(urls[0]);
        } catch (Exception e) {
            textView.append("ERROR");
            e.printStackTrace();
        }
    }
}