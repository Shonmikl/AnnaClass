package com;

import com.java.player.Player;

public class Test {
    public static void main(String[] args) {
        Player player = new Player();

        System.out.print("У игрока: [" + player.getLotsCount() + "] слотов с оружием,\n"
                + "введите номер, чтобы выстрелить,\n"
                + "-1 чтобы выйти.\n"
        );
        player.shotWithWeapon();
    }
}