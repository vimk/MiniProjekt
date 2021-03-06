/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Joseph
 */
public class Arrangement {

    private int id;
    private String name;
    private String startDate;
    private String startTime;
    private String weekDay;
    private String endDate;
    private String endTime;

    public Arrangement(int id, String name, String startDate, String startTime, String weekDay, String endDate, String endTime) {
        this.id = id;
        this.name = name;
        this.startDate = startDate;
        this.startTime = startTime;
        this.weekDay = weekDay;
        this.endDate = endDate;
        this.endTime = endTime;
    }

    public Arrangement(String name, String startDate, String startTime, String weekDay, String endDate, String endTime) {
        this.name = name;
        this.startDate = startDate;
        this.startTime = startTime;
        this.weekDay = weekDay;
        this.endDate = endDate;
        this.endTime = endTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getWeekDay() {
        return weekDay;
    }

    public void setWeekDay(String weekDay) {
        this.weekDay = weekDay;
    
    }
    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public int getId() {
        return id;
    }
        @Override
    public String toString() {
        return name;
    }
    
}
