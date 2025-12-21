package com.binita;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Student s1 = null;

        SessionFactory sf = new Configuration()
                .addAnnotatedClass(com.binita.Student.class)
                .configure()
                .buildSessionFactory();
        Session session = sf.openSession();

        s1 = session.get(Student.class, 101);

        sf.close();

        System.out.println(s1);
    }
}
