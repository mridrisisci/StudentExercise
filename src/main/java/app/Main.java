package app;

import app.config.HibernateConfig;
import app.entities.Courses;
import app.entities.Person;
import app.persistence.CoursesDAO;
import app.persistence.PersonDAO;
import jakarta.persistence.EntityManagerFactory;

public class Main
{
    private final static EntityManagerFactory emf = HibernateConfig.getEntityManagerFactory();


    public static void main(String[] args)
    {

        PersonDAO personDAO = new PersonDAO(emf);
        Person person = new Person("John", 20);
        /*
        *
        Person person = new Person("John", 20);
        Person person = new Person("John", 20);
        Person person = new Person("John", 20);
        Person person = new Person("John", 20);
        Person person = new Person("John", 20);
        Person person = new Person("John", 20);
        Person person = new Person("John", 20);
        Person person = new Person("John", 20);
        Person person = new Person("John", 20);
        Person person = new Person("John", 20);

         *
        * */

        // save to db
        personDAO.createPerson(person);

        CoursesDAO coursesDAO = new CoursesDAO(emf);

        Courses course = new Courses("Biologi", "Johnson", "5. semester", "7E.C4", 11);
        Courses course2 = new Courses("Chemistry", "Alex", "7. semester", "3D.C4", 1);
        Courses course3 = new Courses("Mathematics", "Matthew", "1. semester", "3D.C4", 2);
        Courses course4 = new Courses("Science", "Sarah", "6. semester", "1D.C2", 5);
        Courses course5 = new Courses("Economics", "Alice", "6. semester", "3D.C1", 3);
        Courses course6 = new Courses("Innovation", "Melissa", "6. semester", "3D.C1", 2);
        Courses course7 = new Courses("Science", "Andrew", "3. semester", "3D.C1", 1);
        Courses course8 = new Courses("P.E", "Hans", "8. semester", "5D.C5", 12);
        Courses course9 = new Courses("Physics", "Luigi", "8. semester", "5D.C6", 11);

        // save to db
        coursesDAO.createCourse(course);
        coursesDAO.createCourse(course2);
        coursesDAO.createCourse(course3);
        coursesDAO.createCourse(course4);
        coursesDAO.createCourse(course5);
        coursesDAO.createCourse(course6);
        coursesDAO.createCourse(course7);
        coursesDAO.createCourse(course8);
        coursesDAO.createCourse(course9);

        personDAO.updateStdInfo(person, "something");

        emf.close();
    }
}