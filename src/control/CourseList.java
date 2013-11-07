/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Course;
import model.Database;

/**
 *
 * @author Joseph
 */
public class CourseList {

    private Database db;
    private ArrayList<Course> courseList;

    public CourseList(Database database, String season) throws SQLException {
        String query = "";
        if (season.equals("Forår")) {
            query = "SELECT *,WEEKDAY(startDate) AS weekday FROM Course WHERE `startDate` BETWEEN '2013-01-01' AND '2013-06-31' ";
        } else if (season.equals("Efterår")) {
            query = "SELECT *,WEEKDAY(startDate) AS weekday FROM Course WHERE `startDate` BETWEEN '2013-07-01' AND '2013-12-31' ";
        }

        db = database;
        courseList = new ArrayList<>();
        ResultSet rs = db.selectQuery(query);

        while (rs.next()) {
            courseList.add(new Course(
                    rs.getInt("id"),
                    rs.getString("courseName"),
                    rs.getString("startDate"),
                    rs.getString("startTime"),
                    ValidDate.weekDay(rs.getInt("weekday")),
                    rs.getInt("maxParticipant"),
                    rs.getString("endDate"),
                    rs.getString("endTime")
            ));
        }
    }

    public ArrayList getCourseList() {
        return courseList;
    }
}
