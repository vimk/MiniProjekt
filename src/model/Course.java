
package model;

public class Course {
    private int id;
    private String name;
    private String startDate;
    private String startTime;
    private String weekDay;
    private int maxValue;
    private String endDate;
    private String endTime;
    private int count;

    public Course(int id, String name, String startDate, String startTime, String weekDay, int maxValue, String endDate, String endTime) {
        this.id = id;
        this.name = name;
        this.startDate = startDate;
        this.startTime = startTime;
        this.weekDay = weekDay;
        this.maxValue = maxValue;
        this.endDate = endDate;
        this.endTime = endTime;
        this.count = 0;
    }

    public Course(String name, String startDate, String startTime, String weekDay, int maxValue, String endDate, String endTime) {
        this.name = name;
        this.startDate = startDate;
        this.startTime = startTime;
        this.weekDay = weekDay;
        this.maxValue = maxValue;
        this.endDate = endDate;
        this.endTime = endTime;
    }

    public int getId() {
        return id;
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

    public int getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(int maxValue) {
        this.maxValue = maxValue;
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

    @Override
    public String toString() {
        return name;
    }
    
    public int count(){
        
        return count+1;
    }
    
    
}