package com.binita;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Student s1 = new Student();
        s1.setRollNo(104);
        s1.setName("Navin");
        s1.setMarks(94); // updating for Navin

        SessionFactory sf = new Configuration()
                .addAnnotatedClass(com.binita.Student.class)
                .configure()
                .buildSessionFactory();
        Session session = sf.openSession();

        Transaction transaction=session.beginTransaction();

        session.merge(s1);
        transaction.commit();

        sf.close();

        System.out.println(s1);
    }
}
