package com.master.dearmaster.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateHelper {

    public static Date parseStripingSeparateDateString(String date) {
        Date parseRst = null;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            parseRst = sdf.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return parseRst;
    }

}