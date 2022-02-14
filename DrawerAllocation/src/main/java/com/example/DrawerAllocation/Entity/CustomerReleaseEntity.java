package com.example.DrawerAllocation.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Time;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(
        name = "customerrelease", uniqueConstraints = {@UniqueConstraint(columnNames = {"drwerid","acnumber"})}
)
public class CustomerReleaseEntity {
    @Id
    private Long lckrid;
    @Column(nullable = false)
    private String drwerid;
    @Column(nullable = false)
    private String acnumber;
    @Column(nullable = false)
    private String actitle;
    @Column(nullable = false)
    private String deproduct;
    @Column(nullable = false)
    private String fcvalue;
    @Column(nullable = false)
    private String mvalue;
    @Column(nullable = false)
    private String cvalue;
    @Column(nullable = false)
    private String ctype;
    @Column(nullable = false)
    private String ctypedes;
    @Column(nullable = false)
    private String customername;
    @Column(nullable = false)
    private String address1;
    @Column(nullable = false)
    private String address2;
    @Column(nullable = false)
    private String house;
    @Column(nullable = false)
    private String cityno;
    @Column(nullable = false)
    private String phoneno;
    @Column(nullable = false)
    private String allotime;
    @Column(nullable = false)
    private String  expiretime;
    @Column(nullable = false)
    private String status;

    public long getLckrid() {
        return lckrid;
    }

    public void setLckrid(long lckrid) {
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
