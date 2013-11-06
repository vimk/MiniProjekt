/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package control;

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
    
    public void insertBooking() {
        if (course != null) {
            String sql = "INSERT INTO bookingcourse values ('"+ user.getCprnr() +"', "+ course.getId() +")";
            System.out.println(sql);
            database.insertQuery(sql);
        } else if (arrangement != null) {
            database.insertQuery("INSERT INTO bookingarrangement values ('"+ user.getCprnr() +"', "+ arrangement.getId() +")");
        }
    }
}
