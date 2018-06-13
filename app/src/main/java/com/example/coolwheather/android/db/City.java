package com.example.coolwheather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2018/6/12 0012.
 */


public class City  extends DataSupport {
    private int id;
    private int provinceId;
    private int cityCode;
    private String cityName;

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getProvinceIde(){
        return provinceId;
    }

    public void setProvinceId(int provinceId){
        this.provinceId = provinceId;
    }

    public int getCityCodee(){
        return cityCode;
    }

    public void setCityCode(int cityCode){
        this.cityCode = cityCode;
    }

    public String getCityName(){
        return cityName;
    }

    public void setCityName(String cityName){
        this.cityName = cityName;
    }

}
