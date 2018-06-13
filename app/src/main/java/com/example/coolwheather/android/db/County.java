package com.example.coolwheather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2018/6/12 0012.
 */


public class County extends DataSupport {
    private int id;
    private int cityId;
    private String weatherId;
    private String countyName;

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getCityId(){
        return cityId;
    }

    public void setCityId(int cityId){
        this.cityId = cityId;
    }


    public String getWeatherId(){
        return weatherId;
    }

    public void setWeatherId(String weatherId){
        this.weatherId = weatherId;
    }

    public String getCountyName(){
        return countyName;
    }

    public void setCountyName(String countyName){
        this.countyName = countyName;
    }

}

