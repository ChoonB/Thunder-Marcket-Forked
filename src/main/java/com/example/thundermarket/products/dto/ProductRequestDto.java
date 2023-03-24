package com.example.thundermarket.products.dto;

import lombok.Getter;

import javax.validation.constraints.Size;

@Getter
public class ProductRequestDto {
//    제약사항 나중에 추가 예정
    private String img;
    private String title;
    private int cateCode;
    private boolean used;
    private boolean exchange;
    private int price;
    private boolean deliveryFee;

//    추후 크기 조정
    @Size(min = 10, max = 2000)
    private String desc;
    private boolean isDone;
    private int quantity;
    private boolean thunderPay;
}
