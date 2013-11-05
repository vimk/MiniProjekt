
package control;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Course;
import model.Database;

public class CourseList {
    private Database db;
    private ArrayList<Course> courseList;
    
    public CourseList (Database database, String season) {
        String query = "";
        if (season.equals("Forår")) {
            query = "SELECT *,WEEKDAY(startDate) AS weekday FROM Course WHERE `startDate` BETWEEN '2013-01-01' AND '2013-06-31' ";
        } else if (season.equals("Efterår")) {
            query = "SELECT *,WEEKDAY(startDate) AS weekday FROM Course WHERE `startDate` BETWEEN '2013-07-01' AND '2013-12-31' ";
        }
        
        try {
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
        } catch (SQLException ex) {
            Logger.getLogger(CourseList.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ArrayList getCourseList() {
        return courseList;
    }
}
