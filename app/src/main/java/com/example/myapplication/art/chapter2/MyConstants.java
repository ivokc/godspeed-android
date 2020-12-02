package com.example.myapplication.art.chapter2;

import android.os.Environment;

/**
 * @name My Application
 * @class describe
 * @anthor jijiaming
 * @time 2020/10/13 4:16 PM
 **/
public class MyConstants {
    public static final String CHAPTER_2_PATH = Environment
            .getExternalStorageDirectory().getPath()
            + "/singwhatiwanna/chapter_2/";

    public static final String CACHE_FILE_PATH = CHAPTER_2_PATH + "usercache";

    public static final int MSG_FROM_CLIENT = 0;
    public static final int MSG_FROM_SERVICE = 1;

    public static final String REMOTE_ACTION = "com.example.myapplication.action_REMOTE";
    public static final String EXTRA_REMOTE_VIEWS = "extra_remoteViews";


}
