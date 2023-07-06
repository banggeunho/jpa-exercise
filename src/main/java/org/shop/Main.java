//package org.shop;
//
////import org.shop.domain.Member;
//
//import org.shop.domain.Member;
//import org.shop.domain.Order;
//import org.shop.domain.OrderItem;
//
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.EntityTransaction;
//import javax.persistence.Persistence;
//
//public class Main {
//    public static void main(String[] args) {
////        em.flush(); // 변경감지 -> 쓰기 지연 SQL 저장소에 있는 SQL을 db에 반영, 1차 캐시는 지우지 않음.
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
//        EntityManager em = emf.createEntityManager();
//        EntityTransaction tx = em.getTransaction();
//        tx.begin();
//
//        try {
////            Member member = new Member();
////            member.setName("geunho");
////            em.persist(member);
////
//            Order order = new Order();
//            em.persist(order);
//
//            OrderItem orderItem = new OrderItem();
//            orderItem.setOrder(order);
//
//            em.persist(orderItem);
//
//
//
//
//            tx.commit(); // 이떄 db에 쿼리가 날라간다.
//        } catch (Exception e) {
//            tx.rollback();
//        } finally {
//            em.close();
//        }
//        emf.close();
//    }
//}