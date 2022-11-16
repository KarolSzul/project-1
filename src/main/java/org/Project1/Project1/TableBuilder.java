package org.Project1.Project1;

public class TableBuilder {
    public static void main(String[] args) {
        Integer width = 4;
        Integer height = 4;
        String[][] board = getCleanBoard(width, height);
        displayBoard(board);
        System.out.println();
    }


    public static String[][] getCleanBoard(Integer width, Integer height) {
        String[][] board = new String[height][width];

        for (Integer i = 0; i < board.length; i++) {
            int points = 125;
            for (Integer j = 0; j < board[i].length; j++) {
                points += points;
                board[i][j] = String.valueOf(points);
            }

        }

        return board;
    }


    public static void displayBoard(String[][] board) {
        String formatCategory = "%1$16s";
        String formatTopLetterChoiceCategory = "%1$4s";
        System.out.print("\t" + "\t" + "\t" + "\t");

        for (Integer i = 0; i < board[0].length; i++) {
            char letter = (char) (i + 65);
            System.out.printf(formatTopLetterChoiceCategory, letter + "\t");
        }
        System.out.println();

        for (Integer i = 0; i < board.length; i++) {
            String[] categories = new String[]{"GEOGRAPHY", "CARS", "FAMOUS", "SPORTS"};

            System.out.printf(formatCategory, categories[i] + ": " + (i + 1) + " ");
            for (Integer j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

}
