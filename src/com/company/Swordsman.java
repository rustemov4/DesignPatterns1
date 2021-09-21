package com.company;

public class Swordsman extends Warrior{

    public Swordsman(String armour, String name){
        super(armour, name);
        attacks.add(new FightWithSword());
    }
}
