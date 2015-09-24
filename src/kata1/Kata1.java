/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kata1;

import java.util.Date;

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
        Date f = new Date(95,3,20);
        p1 = new Person("Jose", "Lorenzo", f);
        System.out.println(p1.getFullName());
        System.out.println(p1.getBirth());
        System.out.println(p1.getAge());
        
        
    }
}
