/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kata1;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author usuario
 */
public class Kata1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hola mundo");
        Person p1;
        Calendar f1;
        f1 = GregorianCalendar.getInstance();
        f1.set(1995, 3, 20);
        p1 = new Person("Jose", "Lorenzo", f1);
        System.out.println(p1.getFullName());
        System.out.println(p1.getBirthday().getTime());
        System.out.println(p1.getAge());
    }
}
