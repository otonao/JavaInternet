package com.example.ninomiya.javainternet;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

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

        Button cancelButton = findViewById(R.id.clearButton);
        cancelButton.setOnClickListener(v -> textView.setText(""));
    }


    public void asyncProcess(Context context){
        MyAsyncTask testTask = new MyAsyncTask(context,new AsyncTaskCallbacks(){
            @Override
            public void onTaskFinished() {
                MyAsyncTask testTask = new MyAsyncTask(context,new AsyncTaskCallbacks(){
                    @Override
                    public void onTaskFinished() {
                        MyAsyncTask testTask = new MyAsyncTask(context,new AsyncTaskCallbacks(){
                            @Override
                            public void onTaskFinished() {
                                MyAsyncTask testTask = new MyAsyncTask(context,new AsyncTaskCallbacks(){
                                    @Override
                                    public void onTaskFinished() {
                                        MyAsyncTask testTask = new MyAsyncTask(context,new AsyncTaskCallbacks(){
                                            @Override
                                            public void onTaskFinished() {
                                                MyAsyncTask testTask = new MyAsyncTask(context,new AsyncTaskCallbacks(){
                                                    @Override
                                                    public void onTaskFinished() {
                                                        MyAsyncTask testTask = new MyAsyncTask(context,new AsyncTaskCallbacks(){
                                                            @Override
                                                            public void onTaskFinished() {
                                                                MyAsyncTask testTask = new MyAsyncTask(context,new AsyncTaskCallbacks(){
                                                                    @Override
                                                                    public void onTaskFinished() {
                                                                        MyAsyncTask testTask = new MyAsyncTask(context,new AsyncTaskCallbacks(){
                                                                            @Override
                                                                            public void onTaskFinished() {
                                                                                MyAsyncTask testTask = new MyAsyncTask(context,new AsyncTaskCallbacks(){
                                                                                    @Override
                                                                                    public void onTaskFinished() {
                                                                                        System.out.println("FINISH");
                                                                                    }
                                                                                });
                                                                                testTask.execute(urls[9]);
                                                                            }
                                                                        });
                                                                        testTask.execute(urls[8]);
                                                                    }
                                                                });
                                                                testTask.execute(urls[7]);
                                                            }
                                                        });
                                                        testTask.execute(urls[6]);
                                                    }
                                                });
                                                testTask.execute(urls[5]);
                                            }
                                        });
                                        testTask.execute(urls[4]);
                                    }
                                });
                                testTask.execute(urls[3]);
                            }
                        });
                        testTask.execute(urls[2]);
                    }
                });
                testTask.execute(urls[1]);
            }
        });
        testTask.execute(urls[0]);
    }
}