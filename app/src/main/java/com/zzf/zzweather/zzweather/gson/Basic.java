package com.zzf.zzweather.zzweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by zzf on 2017/8/4.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
