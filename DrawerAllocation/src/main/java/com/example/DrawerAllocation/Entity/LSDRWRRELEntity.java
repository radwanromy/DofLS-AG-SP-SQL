package com.example.DrawerAllocation.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(
        name = "LSDRWRREL", uniqueConstraints = {@UniqueConstraint(columnNames = {"ACTNUM","LCKRID"})}
)
public class LSDRWRRELEntity {
    @Id
    @GeneratedValue(
            // strategy = GenerationType.IDENTITY
            strategy=GenerationType.SEQUENCE, generator = "id_Sequence"
    )
    @SequenceGenerator(name = "id_Sequence", sequenceName = "ID_SEQ")
    private Long RELID;
    @Column(nullable = false)
    private String OPRBRANCD;
    @Column(nullable = false)
    private String CUSCOD;
    @Column(nullable = false)
    private String  BRANCD;

    @Column(nullable = false)
    private String ACTYPE;
    @Column(nullable = false)
    private String ACTNUM;
    @Column(nullable = false)
    private String LCKRID;
    @Column(nullable = false)
    private String DRWRID;

    //@Column(nullable = false)
    private String RELDATE;
    @Column(nullable = false)
    private String PAYSTAT;
    @Column(nullable = false)
    private String REMARKS;
    @Column(nullable = false)
    private String OPRSTAMP;

   // @Column(nullable = false)
    private String OPRTIMSTAMP;
    @Column(nullable = false)
    private String UPDATE_BY;
   // @Column(nullable = false)
    private String UPDATE_DATE;
    @Column(nullable = false)
    private String APPFLG ;

    @Column(nullable = false)
    private String APPSTAMP;

//    @Column(nullable = false)
    private String DOB;

//    @Column(nullable = false)
    private String AGE;

    //@Column(nullable = false)
    private String ADDONE;

    //@Column(nullable = false)
    private String ADDTWO;

    //@Column(nullable = false)
    private String APPTIMSTAMP;

    //@Column(nullable = false)
    private String HOUSE;

    //@Column(nullable = false)
    private String CITY;

    //@Column(nullable = false)
    private String PHONE;

    //@Column(nullable = false)
    private String OCPATN;

    //@Column(nullable = false)
    private String EMAIL;

    //@Column(nullable = false)
    private String CNAME;


    public Long getRELID() {
        return RELID;
    }

    public void setRELID(Long RELID) {
        this.RELID = RELID;
    }

    public String getOPRBRANCD() {
        return OPRBRANCD;
    }

    public void setOPRBRANCD(String OPRBRANCD) {
        this.OPRBRANCD = OPRBRANCD;
    }

    public String getCUSCOD() {
        return CUSCOD;
    }

    public void setCUSCOD(String CUSCOD) {
        this.CUSCOD = CUSCOD;
    }

    public String getBRANCD() {
        return BRANCD;
    }

    public void setBRANCD(String BRANCD) {
        this.BRANCD = BRANCD;
    }

    public String getACTYPE() {
        return ACTYPE;
    }

    public void setACTYPE(String ACTYPE) {
        this.ACTYPE = ACTYPE;
    }

    public String getACTNUM() {
        return ACTNUM;
    }

    public void setACTNUM(String ACTNUM) {
        this.ACTNUM = ACTNUM;
    }

    public String getLCKRID() {
        return LCKRID;
    }

    public void setLCKRID(String LCKRID) {
        this.LCKRID = LCKRID;
    }

    public String getDRWRID() {
        return DRWRID;
    }

    public void setDRWRID(String DRWRID) {
        this.DRWRID = DRWRID;
    }

    public String getRELDATE() {
        return RELDATE;
    }

    public void setRELDATE(String RELDATE) {
        this.RELDATE = RELDATE;
    }

    public String getPAYSTAT() {
        return PAYSTAT;
    }

    public void setPAYSTAT(String PAYSTAT) {
        this.PAYSTAT = PAYSTAT;
    }

    public String getREMARKS() {
        return REMARKS;
    }

    public void setREMARKS(String REMARKS) {
        this.REMARKS = REMARKS;
    }

    public String getOPRSTAMP() {
        return OPRSTAMP;
    }

    public void setOPRSTAMP(String OPRSTAMP) {
        this.OPRSTAMP = OPRSTAMP;
    }

    public String getOPRTIMSTAMP() {
        return OPRTIMSTAMP;
    }

    public void setOPRTIMSTAMP(String OPRTIMSTAMP) {
        this.OPRTIMSTAMP = OPRTIMSTAMP;
    }

    public String getUPDATE_BY() {
        return UPDATE_BY;
    }

    public void setUPDATE_BY(String UPDATE_BY) {
        this.UPDATE_BY = UPDATE_BY;
    }

    public String getUPDATE_DATE() {
        return UPDATE_DATE;
    }

    public void setUPDATE_DATE(String UPDATE_DATE) {
        this.UPDATE_DATE = UPDATE_DATE;
    }

    public String getAPPFLG() {
        return APPFLG;
    }

    public void setAPPFLG(String APPFLG) {
        this.APPFLG = APPFLG;
    }

    public String getAPPSTAMP() {
        return APPSTAMP;
    }

    public void setAPPSTAMP(String APPSTAMP) {
        this.APPSTAMP = APPSTAMP;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getAGE() {
        return AGE;
    }

    public void setAGE(String AGE) {
        this.AGE = AGE;
    }

    public String getAPPTIMSTAMP() {
        return APPTIMSTAMP;
    }

    public void setAPPTIMSTAMP(String APPTIMSTAMP) {
        this.APPTIMSTAMP = APPTIMSTAMP;
    }

    public String getADDONE() {
        return ADDONE;
    }

    public void setADDONE(String ADDONE) {
        this.ADDONE = ADDONE;
    }

    public String getADDTWO() {
        return ADDTWO;
    }

    public void setADDTWO(String ADDTWO) {
        this.ADDTWO = ADDTWO;
    }

    public String getHOUSE() {
        return HOUSE;
    }

    public void setHOUSE(String HOUSE) {
        this.HOUSE = HOUSE;
    }

    public String getCITY() {
        return CITY;
    }

    public void setCITY(String CITY) {
        this.CITY = CITY;
    }

    public String getPHONE() {
        return PHONE;
    }

    public void setPHONE(String PHONE) {
        this.PHONE = PHONE;
    }

    public String getOCPATN() {
        return OCPATN;
    }

    public void setOCPATN(String OCPATN) {
        this.OCPATN = OCPATN;
    }

    public String getEMAIL() {
        return EMAIL;
    }

    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL;
    }


    public String getCNAME() {
        return CNAME;
    }

    public void setCNAME(String CNAME) {
        this.CNAME = CNAME;
    }
}
