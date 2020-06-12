package com.laazer.duel_monsters.models.enums;

/**
 * Created by Laazer
 */
public enum DuelPhase {
    DRAW_PHASE(1),
    STANDBY_PhASE(2),
    MAIN_PHASE_1(3),
    BATTLE_PHASE(4),
    MAIN_PHASE_2(5),
    END_PHASE(6);

    public int order;

    DuelPhase(int order) {
        this.order = order;
    }
}