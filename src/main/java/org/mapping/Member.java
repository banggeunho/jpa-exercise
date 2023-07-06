//package org.mapping;
//
//import javax.persistence.*;
//
//@Entity
//public class Member {
//
//    @Id
//    @GeneratedValue
//    @Column(name = "MEMBER_ID")
//    private Long id;
//    @Column(name = "USERNAME")
//    private String username;
////    @Column(name = "TEAM_ID")
////    private Long teamId;
//
//    // 연관관계의 주인 디비 상의 외래키를 관리한다. (등록, 수정)
//    // 주인이 아닌 쪽은 읽기만 가능
//    // 주인은 mappedBy 속성 사용하지 않는다. 얘는 가짜 매핑
//    // 주인이 아니면 mappedBy 속성으로 지정
//    // 그러면 누가 주인인가?
//    // foreign key를 갖고 있는 곳이 진짜 주인 (즉, N 쪽인 곳)
//    @ManyToOne
//    @JoinColumn(name = "TEAM_ID")
//    private Team team;
//
//    public Long getId() {
//
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getUsername() {
//        return username;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//    }
//
//    public Team getTeam() {
//        return team;
//    }
//
//    public void setTeam(Team team) {
//        this.team = team;
//    }
//
//    //    public void changeTeam(Team team) {
////        this.team = team;
////        team.getMembers().add(this); // 퍈의 메소드를 만들자.
////    }
////    public Long getTeamId() {
////        return teamId;
////    }
////
////    public void setTeamId(Long teamId) {
////        this.teamId = teamId;
////    }
//}
