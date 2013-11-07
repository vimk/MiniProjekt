package control;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Arrangement;
import model.Database;

public class ArrangementList {

    private Database db;
    private ArrayList<Arrangement> arrangementList;

    public ArrangementList(Database database, String season) throws SQLException {
        String query = "";
        if (season.equals("Forår")) {
            query = "SELECT *,WEEKDAY(startDate) AS weekday FROM Arrangement WHERE `startDate` BETWEEN '2013-01-01' AND '2013-06-31' ";
        } else if (season.equals("Efterår")) {
            query = "SELECT *,WEEKDAY(startDate) AS weekday FROM Arrangement WHERE `startDate` BETWEEN '2013-07-01' AND '2013-12-31' ";
        }
        db = database;
        arrangementList = new ArrayList<>();
        ResultSet rs = db.selectQuery(query);

        while (rs.next()) {
            arrangementList.add(new Arrangement(
                    rs.getInt("id"),
                    rs.getString("arrangementName"),
                    rs.getString("startDate"),
                    rs.getString("startTime"),
                    ValidDate.weekDay(rs.getInt("weekday")),
                    rs.getString("endDate"),
                    rs.getString("endTime")
            ));
        }
    }

    public ArrayList getArrangementList() {
        return arrangementList;
    }
}
