package com.binita;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Laptop l1 = new Laptop();
        l1.setLid(1);
        l1.setLbrand("Asus");
        l1.setLmodel("Rog");
        l1.setLram(16);

        Laptop l2 = new Laptop();
        l2.setLid(2);
        l2.setLbrand("Dell");
        l2.setLmodel("XPS");
        l2.setLram(32);

        Laptop l3 = new Laptop();
        l3.setLid(3);
        l3.setLbrand("Apple");
        l3.setLmodel("Macbook");
        l3.setLram(8);

        Alien a1 = new Alien();
        a1.setAid(101);
        a1.setAname("Navin");
        a1.setAtech("Java");

        Alien a2 = new Alien();
        a2.setAid(102);
        a2.setAname("Telusko");
        a2.setAtech("Postgres");

        a1.setLaptops(List.of(l1, l2));
        a2.setLaptops(List.of(l1, l3));

        l1.setAliens(List.of(a1, a2));
        l2.setAliens(List.of(a1));

        SessionFactory sf = new Configuration()
                .addAnnotatedClass(com.binita.Alien.class)
                .addAnnotatedClass(com.binita.Laptop.class)
                .configure()
                .buildSessionFactory();
        Session session = sf.openSession();

        Transaction transaction = session.beginTransaction();

        session.persist(l1);
        session.persist(l2);
        session.persist(l3);

        session.persist(a1);
        session.persist(a2);

        transaction.commit();

        sf.close();

        System.out.println(a1);
        System.out.println(a2);
    }
}

