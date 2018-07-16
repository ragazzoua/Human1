package com.company;

/**
 * created by FAMILY 15.07.2018
 */

public class Woman extends Human {

    Human woman = new Human(false);

    public Woman(boolean sex) {
        super(sex);
    }

    public Woman() {

    }

    public Human born() {
        int sex = random.nextInt(1);
        Human newHuman;
        if (sex == 0) {
            newHuman = new Woman();
        } else {
            newHuman = new Man();
        }
        return newHuman;
    }

}
