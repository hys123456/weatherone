package com.example.coolwheather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2018/6/12 0012.
 */

public class Province extends DataSupport{
    private int id;
    private int provinceCode;
    private String provinceName;

    public int getId(){
        return id;
    }

    private void setId(int id){
        this.id = id;
    }

    public int getProvinceCode(){
        return provinceCode;
    }

    private void setProvinceCode(int provinceCode){
        this.provinceCode = provinceCode;
    }

    public String getProvinceName(){
        return provinceName;
    }

    private void setProvinceName(String provinceName){
        this.provinceName = provinceName;
    }

}
