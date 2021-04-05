package com.company;
public class SP20_BSE_o96_lab4_assignment {
    public static void main(String[] args) {
        HotDogStand dog1 = new HotDogStand(1111, 23);
        dog1.justSold();
        dog1.getsold();

        HotDogStand dog2 = new HotDogStand(2222, 4);
        dog2.justSold();
        dog2.justSold();
        dog2.justSold();
        dog2.getsold();

        HotDogStand dog3 = new HotDogStand(3333, 96);
        dog3.justSold();
        dog3.justSold();
        dog3.justSold();
        dog3.justSold();
        dog3.justSold();
        dog3.getsold();
    }
}
