//package org.shop.domain;
//
//import javax.persistence.*;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.concurrent.locks.Lock;
//
//@Entity
////TODO 가급적이면 제약사항, 길이 등 다 적어라
//public class Member {
//
//    @Id
//    @Column(name = "MEMBER_ID")
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private Long id;
//    private String name;
//    private String city;
//    private String zipCode;
//
//    @OneToMany(mappedBy = "member")
//    private List<Order> orders = new ArrayList<>();
//
//    @OneToMany(mappedBy = "member")
//    private List<MemberProduct> memberProducts = new ArrayList<>();
//
//    @OneToOne
//    @JoinColumn(name = "LOCKER_ID")
//    private Locker locker;
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
//    public String getCity() {
//        return city;
//    }
//
//    public void setCity(String city) {
//        this.city = city;
//    }
//
//    public String getZipCode() {
//        return zipCode;
//    }
//
//    public void setZipCode(String zipCode) {
//        this.zipCode = zipCode;
//    }
//}
