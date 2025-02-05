package app.persistence;

import app.entities.Person;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Query;

public class PersonDAO
{
    private EntityManagerFactory emf;

    public PersonDAO(EntityManagerFactory emf)
    {
        this.emf = emf;
    }

    public void createPerson(Person person)
    {
        try (EntityManager em = emf.createEntityManager()){

            em.getTransaction().begin();
            em.persist(person);
            em.getTransaction().commit();

        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public void updateStdInfo(Person person, String info)
    {
        EntityManager em = emf.createEntityManager();
        Query q1 = em.createQuery(info);
    }

}
