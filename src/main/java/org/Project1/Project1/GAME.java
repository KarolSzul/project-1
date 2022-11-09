package org.Project1.Project1;

import java.util.Scanner;

public class GAME {

    public static void main(String[] args) {

        settingPlayers(); // tworzenie graczy + ustalenie id, name i points

    }

    public static void settingPlayers() {
        System.out.println("Name of first player: "); //wczytywanie nazwy 1. gracza
        Scanner scanner1 = new Scanner(System.in);
        String name1 = scanner1.nextLine();
        Player player1 = new Player(1, name1, 0); // tworzenie 1. gracza
        System.out.println("Name of second player: "); //wczytywanie nazwy 2. gracza
        Scanner scanner2 = new Scanner(System.in);
        String name2 = scanner2.nextLine();
        Player player2 = new Player(2, name2, 0); // tworzenie 2. gracza
        System.out.println("Name of third player: "); //wczytywanie nazwy 3. gracza
        Scanner scanner3 = new Scanner(System.in);
        String name3 = scanner3.nextLine();
        Player player3 = new Player(3, name3, 0); // // tworzenie 3. gracza
        System.out.println("Player " + player1.getId() + " : " + player1.getName() + " Number of points: " + player1.getNumberOfPoints());
        System.out.println("Player " + player2.getId() + " : " + player2.getName() + " Number of points: " + player2.getNumberOfPoints());
        System.out.println("Player " + player3.getId() + " : " + player3.getName() + " Number of points: " + player3.getNumberOfPoints());
    }
}
