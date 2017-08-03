package com.zzf.zzweather.zzweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by zzf on 2017/8/3.
 */

public class City extends DataSupport {
    private int id;
    private int provinceId;
    private int cityCode;
    private String cityName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getprovinceId() {
        return provinceId;
    }

    public void setprovinceId(int provinceId) {
        this.provinceId = provinceId;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
}
