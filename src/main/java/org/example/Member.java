//package org.example;
//
//import javax.persistence.*;
//
//@Entity
//public class Member {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//    @Column(name = "name", nullable = false, columnDefinition = "varchar(100) default 'EMPTY'")
//    private String name;
//
//    // TODO 시퀀스의 최적화 allocationSize는 대량 insert를 할 때 사용하면 좋을 것 같다.
//
//    public Long getId() {
//        return id;
//    }
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//
//    public Member() {};
//}
