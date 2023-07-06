//package org.shop.domain;
//
//import javax.persistence.*;
//import java.time.LocalDateTime;
//
//@Entity
//public class MemberProduct {
//
//    @Id @GeneratedValue
//    private Long id;
//
//    private int count;
//    private int price;
//
//    private LocalDateTime orderDateTime;
//
//    @ManyToOne
//    @JoinColumn(name = "MEMBER _ID")
//    private Member member;
//
//    @ManyToOne
//    @JoinColumn(name = "PRODUCT_ID")
//    private Product product;
//
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public int getCount() {
//        return count;
//    }
//
//    public void setCount(int count) {
//        this.count = count;
//    }
//
//    public int getPrice() {
//        return price;
//    }
//
//    public void setPrice(int price) {
//        this.price = price;
//    }
//
//    public LocalDateTime getOrderDateTime() {
//        return orderDateTime;
//    }
//
//    public void setOrderDateTime(LocalDateTime orderDateTime) {
//        this.orderDateTime = orderDateTime;
//    }
//
//    public Member getMember() {
//        return member;
//    }
//
//    public void setMember(Member member) {
//        this.member = member;
//    }
//
//    public Product getProduct() {
//        return product;
//    }
//
//    public void setProduct(Product product) {
//        this.product = product;
//    }
//}
