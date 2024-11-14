package org.example;

import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {

       Document document = new Document();
       document.addCharacter('H', Font.Arial, Color.Black, 12);
       document.addCharacter('e',Font.Arial, Color.Red, 12);
       document.addCharacter('l', Font.Calibri, Color.Blue, 12);
       document.addCharacter('l', Font.Calibri, Color.Blue, 14);
       document.addCharacter('o', Font.Calibri, Color.Blue, 12);
       document.addCharacter('W', Font.Verdana, Color.Blue, 16);
       document.addCharacter('o', Font.Verdana, Color.Blue, 16);
       document.addCharacter('r', Font.Verdana, Color.Red, 14);
       document.addCharacter('l', Font.Verdana, Color.Red, 12);
       document.addCharacter('d', Font.Calibri, Color.Blue, 12);
       document.addCharacter('C', Font.Arial, Color.Blue, 14);
       document.addCharacter('S', Font.Calibri, Color.Black, 12);
       document.addCharacter('5', Font.Arial, Color.Black, 14);
       document.addCharacter('8', Font.Calibri, Color.Blue, 12);
       document.addCharacter('0', Font.Arial, Color.Black, 12);
       document.addCharacter('0', Font.Calibri, Color.Blue, 12);


        System.out.println(document.save("document"));

       Document document1 = new Document();
       document1.loadFromFile("doc1");
       System.out.println(document1);


    }
}