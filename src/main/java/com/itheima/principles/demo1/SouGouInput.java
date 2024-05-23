package com.itheima.principles.demo1;

/**
 * @Author: erenjaeger
 * @Date: 2024/5/23 22:20
 */
public class SouGouInput {

    private AbstractSkin skin;

    public void setSkin(AbstractSkin skin) {
        this.skin = skin;
    }

    public void display() {
        skin.display();
    }
}
