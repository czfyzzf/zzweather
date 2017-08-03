package com.zzf.zzweather.zzweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by zzf on 2017/8/3.
 */

public class Province extends DataSupport {
    private int id;
    private int provinceCode;
    private String provinceName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }
}
