package com.chenp.spring5.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * @author chenpi
 * @create 2022-10-16 22:28
 */
@NoArgsConstructor
@Setter
public class User {
    private String id;
    private String username;
    private BigDecimal money;

}
