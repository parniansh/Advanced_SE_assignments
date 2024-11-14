package org.example;

public class CharacterProperty {

private Font font;
private Color color;
private int size;

    public CharacterProperty(Font font, Color color, int size) {
        this.font = font;
        this.color = color;
        this.size = size;
    }

    public Font getFont() {
        return font;
    }

    public Color getColor() {
        return color;
    }

    public int getSize() {
        return size;
    }

}
