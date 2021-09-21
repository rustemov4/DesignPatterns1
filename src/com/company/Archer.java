package com.company;

public class Archer extends Warrior{

    public Archer(String armour, String name){
        super(armour, name);
        attacks.add(new FightWithBow());

    }
}
