package com.coolweather.android.db;

/**
 * Created by Administrator on 2019/9/26 0026.
 */

public class Country {

    private int id;
    private String  countryName;
    private String weatherId;
    private int cityId;
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getCountryName(){
        return getCountryName();
    }
    public void setCountryName(String countryName){
        this.countryName = countryName;
    }
    public String getWeatherId(){
        return weatherId;
    }
    public void setWeatherId(String weatherId){
        this.weatherId = weatherId;
    }
    public int getCityId(){
        return cityId;
    }
    public void setCityId(int cityId){
        this.cityId = cityId;
    }
}
