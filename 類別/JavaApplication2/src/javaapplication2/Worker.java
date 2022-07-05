/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author FH
 */
public class Worker {
    int id;
    String name;
    int level;
    int day = 22;
    
    public void info(){
        System.out.println(name + " 您好，您的職等為：" + level);
    }
    
    public void pay(){
        int salary = level * day * 1300;
        System.out.println("您的薪資為：" + salary);
    }
    
     public void pay(int bonus){  // 多載
        int salary = level * day * 1300 + bonus;
        System.out.println("您的薪資為：" + salary);
    }
}
