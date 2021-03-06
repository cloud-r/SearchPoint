package com.smart.go.content;

import java.util.Date;

/**
 * Description 保存一个人的轨迹记录（ 按照时间段 ）
 * Author cloudr
 * Date 2020/5/15 22:41
 * Version 1.0
 **/
public class PathInfo1 {
    private String peopleId;
    private String peopleName;
    private String department;
    private String locationFrom;
    private String locationTo;
    private Date startTime;
    private Date endTime;

    public PathInfo1() {
    }

    public PathInfo1(String peopleId, String peopleName, String department, String locationFrom, String locationTo, Date startTime, Date endTime) {
        this.locationFrom = locationFrom;
        this.locationTo = locationTo;
        this.startTime = startTime;
        this.endTime = endTime;
        this.peopleId = peopleId;
        this.peopleName = peopleName;
        this.department = department;
    }

    public PathInfo1(String peopleId, String peopleName, String department) {
        this.peopleId = peopleId;
        this.peopleName = peopleName;
        this.department = department;
    }

    public String getLocationFrom() {
        return locationFrom;
    }

    public void setLocationFrom(String locationFrom) {
        this.locationFrom = locationFrom;
    }

    public String getLocationTo() {
        return locationTo;
    }

    public void setLocationTo(String locationTo) {
        this.locationTo = locationTo;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getPeopleId() {
        return peopleId;
    }

    public void setPeopleId(String peopleId) {
        this.peopleId = peopleId;
    }

    public String getPeopleName() {
        return peopleName;
    }

    public void setPeopleName(String peopleName) {
        this.peopleName = peopleName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "PathInfo{" +
                "locationFrom='" + locationFrom + '\'' +
                ", locationTo='" + locationTo + '\'' +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                '}';
    }
}
