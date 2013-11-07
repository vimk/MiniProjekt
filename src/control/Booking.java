/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.sql.ResultSet;
import java.sql.SQLException;
import model.Arrangement;
import model.Course;
import model.Database;
import model.User;

/**
 *
 * @author Joseph
 */
public class Booking {

    private User user;
    private Course course;
    private Arrangement arrangement;
    private Database database;

    public Booking(User user, Object obj, Database database) {
        this.user = user;
        if (obj instanceof Course) {
            course = (Course) obj;
        } else if (obj instanceof Arrangement) {
            arrangement = (Arrangement) obj;
        }
        this.database = database;
    }
    
    public static int getAmountOfBooking (User user, int bookingtype, Database database, String season) throws SQLException {
        int result = 1;
        if (season.equals("Forår")) {
            season = " AND `startDate` BETWEEN '2013-01-01' AND '2013-06-31'";
        } else if (season.equals("Efterår")) {
            season = " AND `startDate` BETWEEN '2013-07-01' AND '2013-12-31' ";
        }
        ResultSet rs;
        if (bookingtype == 1) {
            rs = database.selectQuery("SELECT * FROM bookingcourse LEFT OUTER JOIN course ON bookingcourse.courseid = course.id WHERE ccprnr='" + user.getCprnr() + "'" + season);
            rs.last();
            result = rs.getRow();
        } else if (bookingtype == 2) {
            rs = database.selectQuery("SELECT * FROM bookingarrangement LEFT OUTER JOIN arrangement ON bookingarrangement.bookingarrangement = arrangement.id WHERE acprnr='" + user.getCprnr() + "'" + season);
            rs.last();
            result = rs.getRow();
        }
        return result;
    }

    public int insertBooking(String season) throws SQLException {
        int result = -1;
        if (season.equals("Forår")) {
            season = " AND `startDate` BETWEEN '2013-01-01' AND '2013-06-31'";
        } else if (season.equals("Efterår")) {
            season = " AND `startDate` BETWEEN '2013-07-01' AND '2013-12-31' ";
        }
        if (course != null) {
            String sql = "SELECT * FROM bookingcourse WHERE ccprnr='" + user.getCprnr() + "' AND courseid=" + course.getId();
            ResultSet rs = database.selectQuery(sql);
            if (!rs.next()) {
                rs.close();
                rs = database.selectQuery("SELECT * FROM bookingcourse LEFT OUTER JOIN course ON bookingcourse.courseid = course.id WHERE ccprnr='" + user.getCprnr() + "'" + season);
                rs.last();
                result = rs.getRow();
                if (result < 3) {
                    database.query("INSERT INTO bookingcourse values ('" + user.getCprnr() + "', " + course.getId() + ")");
                    result = 0;
                }
            }
        } else if (arrangement != null) {
            ResultSet rs = database.selectQuery("SELECT * FROM bookingarrangement WHERE acprnr='" + user.getCprnr() + "' AND bookingarrangement=" + arrangement.getId());
            if (!rs.next()) {
                rs.close();
                rs = database.selectQuery("SELECT * FROM bookingarrangement LEFT OUTER JOIN arrangement ON bookingarrangement.bookingarrangement = arrangement.id WHERE acprnr='" + user.getCprnr() + "'" + season);
                rs.last();
                result = rs.getRow();
                if (result < 3) {
                    database.query("INSERT INTO bookingarrangement values ('" + user.getCprnr() + "', " + arrangement.getId() + ")");
                    result = 0;
                }
            }
        }
        return result;
    }
}
