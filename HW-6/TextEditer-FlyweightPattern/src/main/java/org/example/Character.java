package org.example;

public class Character {

    private char character;
    private CharacterProperty characterProperty;

    public Character(char character, CharacterProperty characterProperty) {
        this.character = character;
        this.characterProperty = characterProperty;
    }

    public char getCharacter() {
        return character;
    }

    public CharacterProperty getCharacterProperty() {
        return characterProperty;
    }
}
