package com.example.coolwheather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2018/6/13 0013.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("text")
        public String info;
    }
}
