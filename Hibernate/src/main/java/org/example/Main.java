package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setRollNo(1);
        s1.setsName("Nitin");
        s1.setAge(20);

        Configuration cf = new Configuration();

        SessionFactory sf = cf.buildSessionFactory();
        Session session = sf.openSession();

        System.out.println(s1);
    }
}