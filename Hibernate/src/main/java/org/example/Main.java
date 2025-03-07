package org.example;

import jakarta.persistence.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Laptop l1 = new Laptop();
        l1.setLid(1);
        l1.setBrand("ASUS");
        l1.setModel("R1");
        l1.setRam(16);

        Laptop l2 = new Laptop();
        l2.setLid(2);
        l2.setBrand("dell");
        l2.setModel("R1");
        l2.setRam(16);

        Laptop l3 = new Laptop();
        l3.setLid(3);
        l3.setBrand("ASUS");
        l3.setModel("Rog");
        l3.setRam(8);

        Laptop l4 = new Laptop();
        l4.setLid(4);
        l4.setBrand("HP");
        l4.setModel("Pavillion");
        l4.setRam(32);


        Alien a1 = new Alien();
        a1.setAid(102);
        a1.setAname("Nitin");
        a1.setTech("Java");
        a1.setLaptops(Arrays.asList(l1,l2));

        a1.setLaptops(Arrays.asList(l1,l2));


//        Student s1 = new Student();
//        s1.setRollNo(3);
//        s1.setsName("Krishna");
//        s1.setAge(20);
//
//        Student s2 = null;
//
//        Student s3 = new Student();
//        s3.setRollNo(2);
//        s3.setsName("Sai New");
//        s3.setAge(20);



        SessionFactory sf = new Configuration()
                .addAnnotatedClass(org.example.Laptop.class)
//                .addAnnotatedClass(org.example.Alien.class)
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
//        Transaction transaction = session.beginTransaction();
//        Student s4 = session.get(Student.class,3);
//        session.remove(s4);
//        transaction.commit();

//        Transaction transaction = session.beginTransaction();
//
////        session.persist(l1);
////        session.persist(l2);
////        session.persist(a1);
//
//        session.persist(l3);
//        session.persist(l4);
//
//        transaction.commit();

//        Query query = session.createQuery("from Laptop where ram=16");
//        List<Laptop> laptops = query.getResultList();

        String brand = "Asus";
        Query query = session.createQuery("select brand, model from Laptop where brand like ?1");
        query.setParameter(1,brand);
        List<Object[]> laptops = query.getResultList();

        for(Object[] data : laptops)
            System.out.println((String)data[0] + " " + (String) data[1]);

        System.out.println(laptops);

        session.close();
        sf.close();

    }
}