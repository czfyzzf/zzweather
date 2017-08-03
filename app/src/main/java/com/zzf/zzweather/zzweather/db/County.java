package com.zzf.zzweather.zzweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by zzf on 2017/8/3.
 */

public class County extends DataSupport {
    private int id;
    private int cityCode;
    private int countyCode;
    private String countyName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getCountyCode() {
        return countyCode;
    }

    public void setCountyCode(int countyCode) {
        this.countyCode = countyCode;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }
}
