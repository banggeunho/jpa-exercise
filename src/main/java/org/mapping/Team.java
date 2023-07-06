//package org.mapping;
//
//import javax.persistence.*;
//import java.util.ArrayList;
//import java.util.List;
//
//@Entity
//public class Team {
//
//    @Id
//    @GeneratedValue
//    @Column(name = "TEAM_ID")
//    private Long id;
//
//    private String name;
//
//    @OneToMany(mappedBy = "team") // 연관관계 걸쳐있는 객체의 변수명을 적어준다.
//    private List<Member> members = new ArrayList<>(); // 관례
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public List<Member> getMembers() {
//
//        return members;
//    }
//
//    public void setMembers(List<Member> members) {
//        this.members = members;
//    }
//
//    public void addMember(Member member) {
//        member.setTeam(this);
//        members.add(member);
//    }
//}
