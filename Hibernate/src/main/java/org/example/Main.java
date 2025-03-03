package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setRollNo(3);
        s1.setsName("Krishna");
        s1.setAge(20);

        Student s2 = null;

        Student s3 = new Student();
        s3.setRollNo(2);
        s3.setsName("Sai New");
        s3.setAge(20);



        SessionFactory sf = new Configuration()
                .addAnnotatedClass(org.example.Student.class)
                .configure()
                .buildSessionFactory();
        Session session = sf.openSession();
                //Creating table and posting data
//        Transaction transaction = session.beginTransaction();
//        session.persist(s1);
//        transaction.commit();


            //Fetching the data
//        s2 = session.get(Student.class, 2);

            //Updating the data
//        Transaction transaction = session.beginTransaction();
//        session.merge(s3);
//        transaction.commit();


            //Deleting the data
        Transaction transaction = session.beginTransaction();
        Student s4 = session.get(Student.class,3);
        session.remove(s4);
        transaction.commit();

        session.close();
        sf.close();

        System.out.println(s2);
    }
}