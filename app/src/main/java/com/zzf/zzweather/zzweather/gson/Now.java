package com.zzf.zzweather.zzweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by zzf on 2017/8/4.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;
    public class More{
        @SerializedName("txt")
        public String info;
    }
}
