package com.example.ninomiya.javainternet;

import android.content.Context;
import android.os.AsyncTask;
import android.widget.ScrollView;
import android.widget.TextView;

public class MyAsyncTask extends AsyncTask<String, Void, String> {

    private TextView textView;
    private ScrollView scrollView;
    private MainActivity mainActivity;

    private AsyncTaskCallbacks callback;

    MyAsyncTask(Context context, AsyncTaskCallbacks callback) {
        // 本メソッドは UI スレッドで処理されます。
        super();
        mainActivity = (MainActivity) context;
        textView = mainActivity.findViewById(R.id.myTextView);
        scrollView = mainActivity.findViewById(R.id.scroll);
        this.callback = callback;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
    }

    @Override
    protected String doInBackground(String... params) {
        String sb = HtmlGet.htmlGet(params[0]);
        return HtmlGet.titleGet(sb);
    }

    @Override
    protected void onPostExecute(String result) {
        super.onPostExecute(result);
        // 本メソッドは UI スレッドで処理されるため、ビューを操作できます。
        textView.append(result + "\n\n");
        scrollView.scrollTo(0, textView.getBottom());
        this.callback.onTaskFinished();
    }
}

interface AsyncTaskCallbacks {
    void onTaskFinished();
}