package com.yanzhen.annotation.aop;

public class MathCalculator {
    public int div(int i ,int j ){
        System.out.println("div方法被调用");
        return i/j;
    }
}
