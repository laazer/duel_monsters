package com.laazer.duel_monsters.models;

import com.laazer.duel_monsters.models.enums.AttributeType;

/**
 * Created by Laazer
 */
public class MonsterCard {
    private String name;
    private int attack;
    private int defense;
    private String creatureTypes;
    private int level;
    private AttributeType attributeType;


    public MonsterCard(String name, int attack, int defense, String creatureTypes, int level,
                       AttributeType attributeType) {
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

    public AttributeType getAttributeType() {
        return attributeType;
    }

    public void increaseAttack(int increase) {
        this.attack = this.attack + increase;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if(obj instanceof MonsterCard) {
            MonsterCard m = (MonsterCard)obj;
            return this.name.equals(m.name) && this.attack == m.attack &&
                    this.defense == m.defense && this.creatureTypes.equals(m.creatureTypes) &&
                    this.level == m.level && this.attributeType == m.attributeType;
        }
        return false;
    }
}