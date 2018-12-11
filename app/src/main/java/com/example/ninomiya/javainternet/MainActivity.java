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
    String viewText = null;

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
        try {
            MyAsyncTask task = new MyAsyncTask(context, new AsyncTaskCallbacks() {
                @Override
                public void onTaskFinished() {
                    viewText = textView.getText().toString();
                    try {
                        MyAsyncTask task = new MyAsyncTask(context, new AsyncTaskCallbacks() {
                            @Override
                            public void onTaskFinished() {
                                viewText = textView.getText().toString();
                                try {
                                    MyAsyncTask task = new MyAsyncTask(context, new AsyncTaskCallbacks() {
                                        @Override
                                        public void onTaskFinished() {
                                            viewText = textView.getText().toString();
                                            try {
                                                MyAsyncTask task = new MyAsyncTask(context, new AsyncTaskCallbacks() {
                                                    @Override
                                                    public void onTaskFinished() {
                                                        viewText = textView.getText().toString();
                                                        try {
                                                            MyAsyncTask task = new MyAsyncTask(context, new AsyncTaskCallbacks() {
                                                                @Override
                                                                public void onTaskFinished() {
                                                                    viewText = textView.getText().toString();
                                                                    try {
                                                                        MyAsyncTask task = new MyAsyncTask(context, new AsyncTaskCallbacks() {
                                                                            @Override
                                                                            public void onTaskFinished() {
                                                                                viewText = textView.getText().toString();
                                                                                try {
                                                                                    MyAsyncTask task = new MyAsyncTask(context, new AsyncTaskCallbacks() {
                                                                                        @Override
                                                                                        public void onTaskFinished() {
                                                                                            viewText = textView.getText().toString();
                                                                                            try {
                                                                                                MyAsyncTask task = new MyAsyncTask(context, new AsyncTaskCallbacks() {
                                                                                                    @Override
                                                                                                    public void onTaskFinished() {
                                                                                                        viewText = textView.getText().toString();
                                                                                                        try {
                                                                                                            MyAsyncTask task = new MyAsyncTask(context, new AsyncTaskCallbacks() {
                                                                                                                @Override
                                                                                                                public void onTaskFinished() {
                                                                                                                    viewText = textView.getText().toString();
                                                                                                                    try {
                                                                                                                        MyAsyncTask task = new MyAsyncTask(context, new AsyncTaskCallbacks() {
                                                                                                                            @Override
                                                                                                                            public void onTaskFinished() {
                                                                                                                                viewText = textView.getText().toString();
                                                                                                                                try {
                                                                                                                                    MyAsyncTask task = new MyAsyncTask(context, new AsyncTaskCallbacks() {
                                                                                                                                        @Override
                                                                                                                                        public void onTaskFinished() {
                                                                                                                                            viewText = textView.getText().toString();
                                                                                                                                            try {
                                                                                                                                                MyAsyncTask task = new MyAsyncTask(context, new AsyncTaskCallbacks() {
                                                                                                                                                    @Override
                                                                                                                                                    public void onTaskFinished() {
                                                                                                                                                        viewText = textView.getText().toString();
                                                                                                                                                        try {
                                                                                                                                                            MyAsyncTask task = new MyAsyncTask(context, new AsyncTaskCallbacks() {
                                                                                                                                                                @Override
                                                                                                                                                                public void onTaskFinished() {
                                                                                                                                                                    viewText = textView.getText().toString();
                                                                                                                                                                    try {
                                                                                                                                                                        MyAsyncTask task = new MyAsyncTask(context, new AsyncTaskCallbacks() {
                                                                                                                                                                            @Override
                                                                                                                                                                            public void onTaskFinished() {
                                                                                                                                                                                viewText = textView.getText().toString();
                                                                                                                                                                                try {
                                                                                                                                                                                    MyAsyncTask task = new MyAsyncTask(context, new AsyncTaskCallbacks() {
                                                                                                                                                                                        @Override
                                                                                                                                                                                        public void onTaskFinished() {
                                                                                                                                                                                            viewText = textView.getText().toString();
                                                                                                                                                                                            try {
                                                                                                                                                                                                MyAsyncTask task = new MyAsyncTask(context, new AsyncTaskCallbacks() {
                                                                                                                                                                                                    @Override
                                                                                                                                                                                                    public void onTaskFinished() {
                                                                                                                                                                                                        viewText = textView.getText().toString();
                                                                                                                                                                                                        try {
                                                                                                                                                                                                            MyAsyncTask task = new MyAsyncTask(context, new AsyncTaskCallbacks() {
                                                                                                                                                                                                                @Override
                                                                                                                                                                                                                public void onTaskFinished() {
                                                                                                                                                                                                                    viewText = textView.getText().toString();
                                                                                                                                                                                                                    try {
                                                                                                                                                                                                                        MyAsyncTask task = new MyAsyncTask(context, new AsyncTaskCallbacks() {
                                                                                                                                                                                                                            @Override
                                                                                                                                                                                                                            public void onTaskFinished() {
                                                                                                                                                                                                                                viewText = textView.getText().toString();
                                                                                                                                                                                                                                try {
                                                                                                                                                                                                                                    MyAsyncTask task = new MyAsyncTask(context, new AsyncTaskCallbacks() {
                                                                                                                                                                                                                                        @Override
                                                                                                                                                                                                                                        public void onTaskFinished() {
                                                                                                                                                                                                                                            viewText = textView.getText().toString();
                                                                                                                                                                                                                                            try {
                                                                                                                                                                                                                                                MyAsyncTask task = new MyAsyncTask(context, new AsyncTaskCallbacks() {
                                                                                                                                                                                                                                                    @Override
                                                                                                                                                                                                                                                    public void onTaskFinished() {
                                                                                                                                                                                                                                                        viewText = textView.getText().toString();
                                                                                                                                                                                                                                                        Toast.makeText(context, "FINISH", Toast.LENGTH_LONG).show();
                                                                                                                                                                                                                                                        System.out.print("FINISH\n\n");
                                                                                                                                                                                                                                                        System.out.print(viewText);
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                });
                                                                                                                                                                                                                                                task.execute(urls[19]);
                                                                                                                                                                                                                                            } catch (Exception e) {
                                                                                                                                                                                                                                                textView.append("ERROR");
                                                                                                                                                                                                                                                e.printStackTrace();
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                    });
                                                                                                                                                                                                                                    task.execute(urls[18]);

                                                                                                                                                                                                                                } catch (Exception e) {
                                                                                                                                                                                                                                    textView.append("ERROR");
                                                                                                                                                                                                                                    e.printStackTrace();
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                        });
                                                                                                                                                                                                                        task.execute(urls[17]);
                                                                                                                                                                                                                    } catch (Exception e) {
                                                                                                                                                                                                                        textView.append("ERROR");
                                                                                                                                                                                                                        e.printStackTrace();
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                }
                                                                                                                                                                                                            });
                                                                                                                                                                                                            task.execute(urls[16]);

                                                                                                                                                                                                        } catch (Exception e) {
                                                                                                                                                                                                            textView.append("ERROR");
                                                                                                                                                                                                            e.printStackTrace();
                                                                                                                                                                                                        }
                                                                                                                                                                                                    }
                                                                                                                                                                                                });
                                                                                                                                                                                                task.execute(urls[15]);
                                                                                                                                                                                            } catch (Exception e) {
                                                                                                                                                                                                textView.append("ERROR");
                                                                                                                                                                                                e.printStackTrace();
                                                                                                                                                                                            }
                                                                                                                                                                                        }
                                                                                                                                                                                    });
                                                                                                                                                                                    task.execute(urls[14]);

                                                                                                                                                                                } catch (Exception e) {
                                                                                                                                                                                    textView.append("ERROR");
                                                                                                                                                                                    e.printStackTrace();
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                        });
                                                                                                                                                                        task.execute(urls[13]);

                                                                                                                                                                    } catch (Exception e) {
                                                                                                                                                                        textView.append("ERROR");
                                                                                                                                                                        e.printStackTrace();
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            });
                                                                                                                                                            task.execute(urls[12]);
                                                                                                                                                        } catch (Exception e) {
                                                                                                                                                            textView.append("ERROR");
                                                                                                                                                            e.printStackTrace();
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                });
                                                                                                                                                task.execute(urls[11]);

                                                                                                                                            } catch (Exception e) {
                                                                                                                                                textView.append("ERROR");
                                                                                                                                                e.printStackTrace();
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    });
                                                                                                                                    task.execute(urls[10]);
                                                                                                                                } catch (Exception e) {
                                                                                                                                    textView.append("ERROR");
                                                                                                                                    e.printStackTrace();
                                                                                                                                }
                                                                                                                            }
                                                                                                                        });
                                                                                                                        task.execute(urls[9]);

                                                                                                                    } catch (Exception e) {
                                                                                                                        textView.append("ERROR");
                                                                                                                        e.printStackTrace();
                                                                                                                    }
                                                                                                                }
                                                                                                            });
                                                                                                            task.execute(urls[8]);
                                                                                                        } catch (Exception e) {
                                                                                                            textView.append("ERROR");
                                                                                                            e.printStackTrace();
                                                                                                        }
                                                                                                    }
                                                                                                });
                                                                                                task.execute(urls[7]);

                                                                                            } catch (Exception e) {
                                                                                                textView.append("ERROR");
                                                                                                e.printStackTrace();
                                                                                            }
                                                                                        }
                                                                                    });
                                                                                    task.execute(urls[6]);

                                                                                } catch (Exception e) {
                                                                                    textView.append("ERROR");
                                                                                    e.printStackTrace();
                                                                                }
                                                                            }
                                                                        });
                                                                        task.execute(urls[5]);
                                                                    } catch (Exception e) {
                                                                        textView.append("ERROR");
                                                                        e.printStackTrace();
                                                                    }
                                                                }
                                                            });
                                                            task.execute(urls[4]);

                                                        } catch (Exception e) {
                                                            textView.append("ERROR");
                                                            e.printStackTrace();
                                                        }
                                                    }
                                                });
                                                task.execute(urls[3]);
                                            } catch (Exception e) {
                                                textView.append("ERROR");
                                                e.printStackTrace();
                                            }
                                        }
                                    });
                                    task.execute(urls[2]);

                                } catch (Exception e) {
                                    textView.append("ERROR");
                                    e.printStackTrace();
                                }
                            }
                        });
                        task.execute(urls[1]);
                    } catch (Exception e) {
                        textView.append("ERROR");
                        e.printStackTrace();
                    }
                }
            });
            task.execute(urls[0]);

        } catch (Exception e) {
            textView.append("ERROR");
            e.printStackTrace();
        }
    }
}