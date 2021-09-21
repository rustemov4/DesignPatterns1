package com.company;
import java.util.ArrayList;
import java.util.Scanner;
public class Warrior {
    String weapons[] = new String[]{"Sword","Spear","Bow"};
    Scanner in = new Scanner(System.in);

    protected ArrayList<Fight> attacks = new ArrayList<Fight>();
    String name;
    String armour;

    public Warrior(String armour, String name){
        setArmour(armour);
        setName(name);
    }

    public void setArmour(String armour){
        this.armour = armour;
    }
    public void setName(String name){
        this.name = name;
    }

    public void ByWeapon(){
        
        System.out.println("Choose the new weapon");
        for(int i =0; i < weapons.length; i++){
            System.out.println(weapons[i]);
        }
        String NewWeapon = in.nextLine();
        if(NewWeapon.equalsIgnoreCase("Sword")){
            attacks.add(new FightWithSword());
        }
        else if (NewWeapon.equalsIgnoreCase("Bow")){
            attacks.add(new FightWithBow());
        }
        else if (NewWeapon.equalsIgnoreCase("Spear")){
            attacks.add(new FightWithSpear());
        }
    }
    public void getAllWeapons(){
        for(Fight item: attacks){
            System.out.println(item.fight());
        }
    }
}

