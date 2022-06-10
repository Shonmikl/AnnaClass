package com.java.player;

import com.java.weapon.*;

import java.util.Scanner;

public class Player {
    Scanner scanner = new Scanner(System.in);
    private final Weapon[] weaponSlots;

    int slot;

    public Player() {
        weaponSlots = new Weapon[]{
                new BigGun(),
                new WaterPistol(),
                new Gun(),
                new MachineGun(),
                new RPG(),
                new SlingShot()
        };
    }

    public int getLotsCount() {
        return weaponSlots.length;
    }

    public void shotWithWeapon() {

        while (true) {
            try {
                slot = scanner.nextInt();
                if (slot == -1) {
                    System.out.println("Game over!");
                    break;
                } else checkSlots(slot);

            } catch (Exception e) {
                System.out.println("!!!Incorrect command!!!");
                break;
            }
        }
    }

    public void checkSlots(int slot) {
        while (slot != -1) {
            if (slot < 0 && slot > getLotsCount() - 1) {
                System.out.println("Incorrect command. Please choose slots" +
                        " from " + "0 to " + getLotsCount() + " range");
            } else weaponSlots[slot].shot();
            break;
        }
    }
}