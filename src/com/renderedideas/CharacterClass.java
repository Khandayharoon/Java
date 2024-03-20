package com.renderedideas;

class Character {
    int ID;
    String name;
    static int positionX, positionY;
}

public class CharacterClass {
    public static void main(String[] args) {
        // Creating an object of Character
        Character c = new Character();
        System.out.println(c);
    }
}
