package com.laazer.duel_monsters.models;

/**
 * Created by Laazer
 */
public class MonsterCard {
    private String name;
    private int attack;
    private int defense;
    private String creatureTypes;
    private int level;
    private String attributeType;


    public MonsterCard(String name, int attack, int defense, String creatureTypes, int level, String attributeType) {
        this.name = name;
        this.attack = attack;
        this.defense = defense;
        this.creatureTypes = creatureTypes;
        this.level = level;
        this.attributeType = attributeType;
    }


    public String getName() {
        return name;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }

    public String getCreatureTypes() {
        return creatureTypes;
    }

    public int getLevel() {
        return level;
    }

    public String getAttributeType() {
        return attributeType;
    }

    public void increaseAttack(int increase) {
        this.attack = this.attack + increase;
    }
}