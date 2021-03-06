package com.smart.go.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Description AP实体
 * Author Cloudr
 * Date 2020/4/23 13:50
 **/
@Entity
@Table(name = "ap_info")
public class Ap {
    @Id
    @Column(name = "MAC_ADDRESS", length = 32)   //MAC地址
    private String macAddress;
    @Column(name = "AP_NAME")       //AP名字
    private String apName;
    @Column(name = "IP_ADDRESS")    //IP地址
    private String ipAddress;
    @Column(name = "CAMPUS")        // 校区
    private String campus;
    @Column(name = "BUILDING_NAME") //楼宇名称
    private String buildingName;
    @Column(name = "FLOOR_ID")      //楼层数
    private String floorId;
    @Column(name = "ROOM_ID")       //房间号
    private String roomId;
    @Column(name = "LAT")           //维度
    private String lat;
    @Column(name = "LNG")           //经度
    private String lng;
    @Column(name = "location")
    private String location;


    public String getApName() {
        return apName;
    }

    public void setApName(String apName) {
        this.apName = apName;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getMacAddress() {
        return macAddress;
    }

    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }

    public String getCampus() {
        return campus;
    }

    public void setCampus(String campus) {
        this.campus = campus;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    public String getFloorId() {
        return floorId;
    }

    public void setFloorId(String floorId) {
        this.floorId = floorId;
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
