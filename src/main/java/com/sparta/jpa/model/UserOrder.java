package com.sparta.jpa.model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@Entity
@NoArgsConstructor
public class Order {
    // nullable: null 허용 여부
    // unique: 중복 허용 여부 (false 일때 중복 허용)
    @Id // 기본 테이블 번호
    @Column(name = "id", nullable = false, unique = true)
    private Long id;

    //restaurant id
    @Column(nullable = false, unique = true)
    private Long RestaurantID;

    //Order food list
    @Column(nullable = false, unique = false)
    private String FoodList;

    public Order(Long RestaurantID, String FoodList) {
        this.RestaurantID = RestaurantID;
        this.FoodList = FoodList;
    }



}
