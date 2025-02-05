package app.persistence;

import app.entities.Courses;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

public class CoursesDAO
{
    private EntityManagerFactory emf;

    public CoursesDAO(EntityManagerFactory emf)
    {
        this.emf = emf;
    }

    public void createCourse(Courses course)
    {
        try (EntityManager em = emf.createEntityManager()){

            em.getTransaction().begin();
            em.persist(course);
            em.getTransaction().commit();

        } catch (Exception e)
        {
            e.printStackTrace();
        }

    }

}
