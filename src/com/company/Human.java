package com.company;

import java.util.Random;

/**
 * created by FAMILY 15.07.2018
 */

public class Human {

    private boolean sex;
    private String name;
    private String surname;
    private float height;
    private float weight;
    Random random = new Random();

    public Human(boolean sex, String name, String surname, float height, float weight) {
        this.sex = sex;
        this.name = name;
        this.surname = surname;
        this.height = height;
        this.weight = weight;
    }

    public Human(boolean sex) {

    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Human{" +
                "sex=" + sex +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }

    public boolean talk(boolean x, boolean y) {
        if (x == false && y == false) {
            return true;
        } else if (x == true && y == false) {
            return true;
        } else if (x == false && y == true) {
            return true;
        } else if (x == true && y == true) {

            if (random.nextInt(100) < 50) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public boolean societyYes(boolean x, boolean y) {
        if (x == false && y == false) {

            if (random.nextInt(100) < 5) {
                return true;
            }
        } else if (x == false && y == true) {

            if (random.nextInt(100) < 70) {
                return true;
            }
        } else if (x == true && y == false) {

            if (random.nextInt(100) < 70) {
                return true;
            }
        } else if (x == true && y == true) {

            if (random.nextInt(100) < 5.6) {
                return true;
            }
        }
        {
            return false;
        }
    }

    public boolean spentTimeTogether(float m, float f) {
        if ((m <= f) && ((m * 1.1) > f)) {
            if (random.nextInt(100) < 85) {
                return true;
            } else if ((m >= f) && ((m * 1.1) < f)) {
                if (random.nextInt(100) < 95) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }
}
