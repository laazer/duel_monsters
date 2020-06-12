package com.laazer.duel_monsters.models;

/**
 * Created by Laazer
 */
public class Player {
    private String name;
    private int lifePoints;

    public Player(String name) {
        this.name = name;
        this.lifePoints = 8000;
    }

    public void increaseLifePoints(int increment) {
        this.lifePoints = this.lifePoints + increment;
    }

    public void decreaseLifePoints(int decrement) {
        this.lifePoints = this.lifePoints - decrement;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o instanceof Player) {
            Player p = (Player)o;
            return this.name.equals(p.name) && this.lifePoints == p.lifePoints;
        }
        return false;
    }
}