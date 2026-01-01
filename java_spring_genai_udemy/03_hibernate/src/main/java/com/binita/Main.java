package com.binita;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        SessionFactory sf = new Configuration()
                .addAnnotatedClass(com.binita.Alien.class)
                .addAnnotatedClass(com.binita.Laptop.class)
                .configure()
                .buildSessionFactory();
        Session session = sf.openSession();

        Laptop l1 = session.find(Laptop.class, 2);
        System.out.println(l1);

        session.close();

        Session session1 = sf.openSession();

        Laptop l2 = session1.find(Laptop.class, 2);
        System.out.println(l2);

        session1.close();


        sf.close();
    }
}

