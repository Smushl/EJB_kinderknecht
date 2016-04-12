package com.mycompany;

import java.text.DateFormat;
import java.util.Date;
import javax.ejb.Stateless;

@Stateless
public class CurrentTimeBean {

    public String getTime() {
        Date date = new Date();
        DateFormat dateFormatter = DateFormat.getTimeInstance();
        System.out.println(dateFormatter.format(date));
        return dateFormatter.format(date);
    }
}
