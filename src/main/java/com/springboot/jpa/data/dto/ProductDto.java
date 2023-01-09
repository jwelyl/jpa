package com.springboot.jpa.data.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class ProductDto {
    private String name;
    private int price;
    private int stock;
}
