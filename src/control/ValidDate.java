/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package control;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Joseph
 */
public class ValidDate {
    public static String weekDay (int wd) {
        String weekDay = "";
        switch (wd) {
            case 0:  weekDay = "Mandag";       break;
            case 1:  weekDay = "Tirsdag";      break;
            case 2:  weekDay = "Onsdag";         break;
            case 3:  weekDay = "Torsdag";         break;
            case 4:  weekDay = "Fredag";           break;
            case 5:  weekDay = "Lørdag";          break;
            case 6:  weekDay = "Søndag";          break;
            default: weekDay = "Ugyldig dag"; break;
        }
        return weekDay;
    }
    public static String monthName (int mm) {
        String monthString = "";
        switch (mm) {
            case 1:  monthString = "Januar";       break;
            case 2:  monthString = "Febuar";      break;
            case 3:  monthString = "Marts";         break;
            case 4:  monthString = "April";         break;
            case 5:  monthString = "Maj";           break;
            case 6:  monthString = "Juni";          break;
            case 7:  monthString = "Juli";          break;
            case 8:  monthString = "August";        break;
            case 9:  monthString = "September";     break;
            case 10: monthString = "October";       break;
            case 11: monthString = "November";      break;
            case 12: monthString = "December";      break;
            default: monthString = "Ugyldig måned"; break;
        }
        return monthString;
    }
    
    public static boolean leapYear (int year) {
        boolean isLeapYear;

        // deligt med 4
        isLeapYear = (year % 4 == 0);

        // deligt med 4 og ikke 100
        isLeapYear = isLeapYear && (year % 100 != 0);
        
        // deligt med 4 og ikke 100 nu mindre deligt med 400
        isLeapYear = isLeapYear || (year % 400 == 0);
        
        return isLeapYear;
    }
    
    private static boolean isValidDate(String date) {

        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        String errorMessage = "";
        
        boolean result = true;

        Date testDate = null;

        try {
            testDate = sdf.parse(date);
        } 
        catch (ParseException e) {
            errorMessage = "the date you provided is in an invalid date"
                    + " format.";
            return false;
        }

        if (!sdf.format(testDate).equals(date)) {
            errorMessage = "The date that you provided is invalid.";
            result = false;
        }

        return result;

    }
}
