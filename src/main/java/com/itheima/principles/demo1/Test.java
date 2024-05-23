package com.itheima.principles.demo1;

/**
 * @Author: erenjaeger
 * @Date: 2024/5/23 22:24
 */
public class Test {
    public static void main(String[] args) {
        // new
        SouGouInput input = new SouGouInput();
        //input.setSkin(new DefaultSpecificSkin());
        input.setSkin(new HeimaSpecificSkin());
        input.display();
    }
}
