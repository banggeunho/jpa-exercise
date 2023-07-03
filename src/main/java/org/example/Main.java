package org.example;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();

        try {
//            Member member = em.find(Member.class, 2L);
            List<Member> memberList = em.createQuery("select m from Member as m", Member.class)
                    .setFirstResult(1) // offset
                    .setMaxResults(10) // limit
                    .getResultList();

            for (Member member : memberList) {
                System.out.println("member.getName() = " + member.getName());
            }

//            em.persist(member);
            tx.commit();
        } catch (Exception e) {
            tx.rollback();
        } finally {
            em.close();
        }
        emf.close();
    }
}