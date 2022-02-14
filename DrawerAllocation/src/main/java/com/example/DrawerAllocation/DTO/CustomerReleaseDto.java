package com.example.DrawerAllocation.DTO;

import lombok.Data;

import java.sql.Time;

@Data
public class CustomerReleaseDto {

    private Long lckrid;
    private String drwerid;
    private String acnumber;
    private String actitle;
    private String deproduct;
    private String fcvalue;
    private String mvalue;
    private String cvalue;
    private String ctype;
    private String ctypedes;
    private String customername;
    private String address1;
    private String address2;
    private String house;
    private String cityno;
    private String phoneno;
    private String allotime;
    private String  expiretime;
    private String status;

    public Long getLckrid() {
        return lckrid;
    }

    public void setLckrid(Long lckrid) {
        this.lckrid = lckrid;
    }

    public String getDrwerid() {
        return drwerid;
    }

    public void setDrwerid(String drwerid) {
        this.drwerid = drwerid;
    }

    public String getAcnumber() {
        return acnumber;
    }

    public void setAcnumber(String acnumber) {
        this.acnumber = acnumber;
    }

    public String getActitle() {
        return actitle;
    }

    public void setActitle(String actitle) {
        this.actitle = actitle;
    }

    public String getDeproduct() {
        return deproduct;
    }

    public void setDeproduct(String deproduct) {
        this.deproduct = deproduct;
    }

    public String getFcvalue() {
        return fcvalue;
    }

    public void setFcvalue(String fcvalue) {
        this.fcvalue = fcvalue;
    }

    public String getMvalue() {
        return mvalue;
    }

    public void setMvalue(String mvalue) {
        this.mvalue = mvalue;
    }

    public String getCvalue() {
        return cvalue;
    }

    public void setCvalue(String cvalue) {
        this.cvalue = cvalue;
    }

    public String getCtype() {
        return ctype;
    }

    public void setCtype(String ctype) {
        this.ctype = ctype;
    }

    public String getCtypedes() {
        return ctypedes;
    }

    public void setCtypedes(String ctypedes) {
        this.ctypedes = ctypedes;
    }

    public String getCustomername() {
        return customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public String getCityno() {
        return cityno;
    }

    public void setCityno(String cityno) {
        this.cityno = cityno;
    }

    public String getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno;
    }

    public String getAllotime() {
        return allotime;
    }

    public void setAllotime(String allotime) {
        this.allotime = allotime;
    }

    public String getExpiretime() {
        return expiretime;
    }

    public void setExpiretime(String expiretime) {
        this.expiretime = expiretime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
