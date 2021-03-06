
package com.example.amblogin.ui.response.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DriverCommentModel {

    @SerializedName("pk")
    @Expose
    private int pk;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("userlocation")
    @Expose
    private String userlocation;
    @SerializedName("hospitalocation")
    @Expose
    private String hospitalocation;
    @SerializedName("arealocation")
    @Expose
    private String arealocation;
    @SerializedName("status")
    @Expose
    private boolean status;
    @SerializedName("receverid")
    @Expose
    private int receverid;
    @SerializedName("senderid")
    @Expose
    private List<Senderid> senderid;
    @SerializedName("recever_user")
    @Expose
    private List<ReceverUser> receverUser = null;

    public int getPk() {
        return pk;
    }

    public void setPk(int pk) {
        this.pk = pk;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getUserlocation() {
        return userlocation;
    }

    public void setUserlocation(String userlocation) {
        this.userlocation = userlocation;
    }

    public String getHospitalocation() {
        return hospitalocation;
    }

    public void setHospitalocation(String hospitalocation) {
        this.hospitalocation = hospitalocation;
    }

    public String getArealocation() {
        return arealocation;
    }

    public void setArealocation(String arealocation) {
        this.arealocation = arealocation;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getReceverid() {
        return receverid;
    }

    public void setReceverid(int receverid) {
        this.receverid = receverid;
    }

    public List<Senderid> getSenderid() {
        return senderid;
    }

    public void setSenderid(List<Senderid> senderid) {
        this.senderid = senderid;
    }

    public List<ReceverUser> getReceverUser() {
        return receverUser;
    }

    public void setReceverUser(List<ReceverUser> receverUser) {
        this.receverUser = receverUser;
    }
}
