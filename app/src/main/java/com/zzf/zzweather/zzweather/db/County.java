package com.zzf.zzweather.zzweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by zzf on 2017/8/3.
 */

public class County extends DataSupport {
    private int id;
    private int cityId;
    private int countyCode;
    private String countyName;
    private String weatherId;

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getcityId() {
        return cityId;
    }

    public void setcityId(int cityId) {
        this.cityId = cityId;
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
