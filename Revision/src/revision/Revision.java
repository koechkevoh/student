/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revision;

import static javax.swing.JOptionPane.*;
import java.util.*;
import java.text.DecimalFormat;

public class Revision {

    
    public static void main(String[] args) {
        Calendar now =new GregorianCalendar();
        DecimalFormat twoDigits = new DecimalFormat("00");
        int year = now.get(Calendar.YEAR);
        int month = now.get(Calendar.MONTH);
        int day = now.get(Calendar.DATE);
        int hour = now.get(Calendar.HOUR_OF_DAY);
        int minute = now.get(Calendar.MINUTE);
        int second = now.get(Calendar.SECOND);
        
        showMessageDialog(null,"It is now " +twoDigits.format(hour)+":"
                +twoDigits.format(minute)+":"
                +twoDigits.format(second)+" on "
                +twoDigits.format(day)+"/"
                +twoDigits.format(month)+"/"+
                year);
}
}