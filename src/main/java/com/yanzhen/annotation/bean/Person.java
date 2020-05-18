package com.yanzhen.annotation.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    @Value("yz")
    private String name;
    @Value("#{20-2}")
    private Integer age;

    @Value("${person.nickname}")
    private String nickName;
}
