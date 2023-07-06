//package org.mapping;
//
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.EntityTransaction;
//import javax.persistence.Persistence;
//import java.util.List;
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
//
//            Team team = new Team();
//            team.setName("team A ");
////            team.getMembers().add(team);
//            em.persist(team);
//
//            Member member = new Member();
//            member.setUsername("member");
////            member.changeTeam(team);
//            em.persist(member);
//
//            team.addMember(member);
////            em.flush();
////            em.clear();
//
//            Team findTeam = em.find(Team.class, team.getId());
//            List<Member> memberList = findTeam.getMembers();
////            System.out.println(memberList);
////            memberList.forEach(x -> System.out.println("x.getUsername() = " + x.getUsername()));
//
//
//
////
////            Team findTeam = findMember.getTeam();
////            System.out.println("findTeam.getName() = " + findTeam.getName());
//
//
//            tx.commit();
//        } catch (Exception e) {
//            tx.rollback();
//        } finally {
//            em.close();
//        }
//        emf.close();
//    }
//}