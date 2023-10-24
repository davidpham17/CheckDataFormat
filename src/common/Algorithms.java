/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Algorithms {

    public String checkPhoneNumberFormat(String phoneNumber) {
        if (!phoneNumber.matches("^[0-9]+$")) {
            return "Phone number must be number";
        }
        if (!phoneNumber.matches("^\\d{10}$")) {
            return "Phone number must be 10 digits";
        }

        return "";
    }

    public String checkEmailFormat(String email) {
        if (!email.matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
            return "Email must be correct format";
        }
        return "";
    }

    public String checkDateFormat(String date) {
        SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
        f.setLenient(false);
        try {
            f.parse(date);
            return "";
        } catch (ParseException e) {
            return "Date to correct format(dd/MM/yyyy)";
        }
    }

}
