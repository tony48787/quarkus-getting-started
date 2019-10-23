package org.acme.quickstart;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;

@ApplicationScoped
public class GreetingService {

    @Inject
    EntityManager em;

    public String greeting(String name) {
        return "hello " + name;
    }

    @Transactional
    public void createGreeting(String name) {
        System.out.println(name);
        Greeting greeting = new Greeting(name, name);
        em.persist(greeting);
    }

    public List getGreetingByName(String name) {
        String hql = "FROM Greeting G WHERE G.name = :name";
        Query query = em.createQuery(hql);
        query.setParameter("name", name);
        List results = query.getResultList();
        return results;
    }

}
