package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Document {
    private final List<Character> characters = new ArrayList<>();

    public Document() {

    }

    public Document loadFromFile(String filename) throws IOException {
        System.out.println("Loading the document from file: ");
        characters.clear();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 4) {
                    char character = parts[0].charAt(0);
                    String font = parts[1];
                    String color = parts[2];
                    int size = Integer.parseInt(parts[3]);
                    addCharacter(character, Font.valueOf(font), Color.valueOf(color), size);
                }
            }
        }
        return this;
    }

    public String save(String filename) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (Character character : characters) {
                writer.write(character.getCharacter() + "," +
                        character.getCharacterProperty().getFont() +","+
                        character.getCharacterProperty().getColor() + "," +
                        character.getCharacterProperty().getSize() + "\n");
            }
        }catch (IOException e){
            System.out.println("File saving failed");
        }

        return filename + " is saved successfully";
    }

    public void addCharacter(char c, Font font, Color color, int size){
        CharacterProperty properties = CharacterPropertyFactory.getCharacterProperty(font, color, size);
        characters.add(new Character(c, properties));
    }

    public List<Character> getCharacters() {
        return characters;
    }


    @Override
    public String toString() {
        String doc = "";
        for(Character c: characters){
            doc = doc + c.getCharacter();
        }
        return doc;
    }
}
