package SzemelyMain;

import Input.Input;
import Szemely.Szemely;

public class SzemelyMain {
    public static void main(String[] args) {
        Szemely szemely = readPerson();
        System.out.println("\nTulajdonsagok:");
        System.out.println(szemely.toString());
    }
    private static Szemely readPerson()
    {
        Input input = new Input();
        System.out.println("\nKerem adjon egy szemely nevet!");
        String name = input.readString();
        System.out.println("Adja meg a szemely sulyat!");
        int weight = input.readInteger();
        System.out.println("Adja meg a szemely magassagat!");
        double height = input.readDouble();
        Szemely person = new Szemely(name, weight, height);
        return person;
    }
}
