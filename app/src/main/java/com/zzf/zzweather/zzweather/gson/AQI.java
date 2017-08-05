package com.zzf.zzweather.zzweather.gson;

/**
 * Created by zzf on 2017/8/4.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String api;
        public String pm25;
    }
}
