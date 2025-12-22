package com.binita;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
//        Laptop l1=new Laptop();
//        l1.setBrand("Asus");
//        l1.setModel("Rog");
//        l1.setRam(16);
//
//        Alien a1 = new Alien();
//        a1.setAid(101);
//        a1.setAname("Navin");
//        a1.setAtech("Java");
//        a1.setLaptop(l1);

        Alien a1 = null;

        SessionFactory sf = new Configuration()
                .addAnnotatedClass(com.binita.Alien.class)
                .configure()
                .buildSessionFactory();
        Session session = sf.openSession();

//        Transaction transaction = session.beginTransaction();

        a1 = session.find(Alien.class, 101);
//        transaction.commit();

        sf.close();

        System.out.println(a1);
    }
}
