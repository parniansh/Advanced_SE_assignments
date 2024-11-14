package org.example;

import java.util.HashMap;
import java.util.Map;

public class CharacterPropertyFactory {
    private static final Map<String,CharacterProperty> characterProperties =new HashMap<>();

    public static CharacterProperty getCharacterProperty(Font font, Color color, int size) {
        String key = font + "_" + color + "_" + size;
        if(!characterProperties.containsKey(key)){
            characterProperties.put(key,new CharacterProperty(font,color,size));
        }
        return characterProperties.get(key);
    }

    public static Map<String, CharacterProperty> getAllCharacterProperties(){
        return characterProperties;
    }
}
