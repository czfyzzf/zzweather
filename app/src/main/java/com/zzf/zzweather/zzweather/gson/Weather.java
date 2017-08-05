package com.zzf.zzweather.zzweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by zzf on 2017/8/4.
 */

public class Weather {
    public String status;
    public Basic basic;
    public AQI aqi;
    public Now now;
    public Suggestion suggestion;

    @SerializedName("daily_fortcast")
    public List<Forecast> forecastList;
}
