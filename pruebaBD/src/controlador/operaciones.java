/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.List;
import javax.swing.JOptionPane;
import modelo.Alumno;
import net.sf.ehcache.hibernate.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Usuario
 */
public class operaciones {
    public void AltaAlumno(Alumno auxAlumno)
    {
        SessionFactory Nuevasesion= NewHibernateUtil.getSessionFactory();
        Session session;
        session=Nuevasesion.openSession();
        Transaction tx = session.beginTransaction();
        session.save(auxAlumno);
        tx.commit();
        session.close();
        JOptionPane.showMessageDialog(null, "funciono");
    }
     public void BajaAlumno(Alumno auxAlumno)
    {
        SessionFactory Nuevasesion= NewHibernateUtil.getSessionFactory();
        Session session;
        session=Nuevasesion.openSession();
        Transaction tx = session.beginTransaction();
        session.delete(auxAlumno);
        tx.commit();
        session.close();
        JOptionPane.showMessageDialog(null, "lo borro");
    }
      public void TraerAlumnos()
    {
        SessionFactory Nuevasesion= NewHibernateUtil.getSessionFactory();
        Session session;
        session=Nuevasesion.openSession();
        Transaction tx = session.beginTransaction();
        Query query =session.createQuery("SELECT a FROM Alumno a ");
        List<Alumno> listadoAlumnos = query.list();
        tx.commit();
        session.close();
        listadoAlumnos.forEach((aux) -> {
            JOptionPane.showMessageDialog(null, aux.getId());
        });
       
    }
}
