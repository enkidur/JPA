package com.sparta.jpa.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Setter
@Getter // get 함수를 일괄적으로 만들어줍니다.
@NoArgsConstructor // 기본 생성자를 만들어줍니다.
@Entity // DB 테이블 역할을 합니다.
public class Restaurant {
    // nullable: null 허용 여부
    // unique: 중복 허용 여부 (false 일때 중복 허용)
    @Id // 기본 테이블 번호
    @Column(name = "id", nullable = false, unique = true)
    private String id;

    //레스토랑 id
    @Column(nullable = false, unique = true)
    private String Restaurant_name;

    //최소 가격
    @Column(nullable = false, unique = false)
    private Long MinOrderPrice;

    //기본 배달비
    @Column(nullable = false, unique = false)
    private Long DeliveryFee;

    public Restaurant(String Restaurant_name, Long MinOrderPrice, Long DeliveryFee) {
        this.Restaurant_name = Restaurant_name;
        this.MinOrderPrice = MinOrderPrice;
        this.DeliveryFee = DeliveryFee;
    }
}