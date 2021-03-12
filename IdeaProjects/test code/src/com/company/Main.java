package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    // Scanner
    Scanner sc = new Scanner(System.in);

    public static void exo1(Scanner sc) {

        // Se présenter en Java
        String firstName = "Clara";
        String lastName = "Beuzart";
        int age = 36;
        double size = 1.6;
        String motivation = "Apprendre et ouvrir de nouvelles portes";
        float bankingAccount = 1000000;
        // Une année est-elle bissextile? voir exo3
        // La couleur d'un jeu de cartes? = je ne comprends pas la question
        String color = "Les multiples variations de la mer";

        // Afficher la présentation
        System.out.println("\nQui suis-je? " + firstName + " " + lastName + " - " + age + " ans - " + size + "m");
        System.out.println("Mes motivations? " + motivation + "\nMa couleur favorite? " + color + "\n");
    }

    public static void exo21(Scanner sc) {

        // Calcul TVA
        System.out.println("Prix HT = ");
        double prixHT = sc.nextInt();
        double tauxTVA = 0.20;
        double prixTTC = (prixHT * (1 + tauxTVA));

        // Affichage
        System.out.println("Prix TTC = " + String.format("%.2f€", prixTTC));
        DecimalFormat tvaPercent = new DecimalFormat("#.#%");
        System.out.println("TVA:" + tvaPercent.format(tauxTVA) + "\n");
    }

    private static boolean isLeapYear(int year) {
        return ((year % 4) == 0 && ((year % 100) != 0) || ((year % 400) == 0));
    }

    public static void exo22(Scanner sc) {

        // Test année bissextile = année à tester (+ déclaration de la variable)
        System.out.println("Entrez l'année pour savoir si elle est bissextile");
        int year = sc.nextInt();

        // Test
        if (isLeapYear(year)) {
            System.out.println("Oui, c'est une année bissextile!\n");
        } else {
            System.out.print("Non, cette année n'est pas bissextile\n");
        }
    }

    public static void exo3(Scanner sc) {
        //Que fait le code mystère?
        System.out.println("Que fait le code mystère? \nD'après ma compréhension = public class Mystere = sert à définir une classe. " +
                "\nA l'intérieur de cette classe, il y a 3 fonctions");
        System.out.println("System.out.println(mystere(0.01f)); = permet d'afficher la valeur epsilon, " +
                "calculée par la fonction mystère, qui elle-même retourne la valeur d'une fonction mystère \n");
        System.out.println("boucle while = tant que max n'est pas égal à min, alors: " +
                "puis condition à l'intérieur de la boucle pour affecter une valeur max ou min ");
    }

    public static void exo4(Scanner sc) {

        //To do
        System.out.println("\nEssayez plus tard, celui-là n'est pas encore fait!");
    }

    public static void exo331(Scanner sc) {

        System.out.println("Quelle est la longeur de votre règle?");
        int size = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i != (size + 1); i++) {
            if (((i) % 6) == 0) {
                System.out.print("+");
                size++;
            } else {
                System.out.print("-");
            }
        }
        System.out.println();
    }

    public static void exo332(Scanner sc) {

        System.out.println("\nImpression d'une bordure de tableau");

        // Impression bordure tableau vide
        System.out.println("\nNombre de colonnes:");
        int colonne = sc.nextInt();
        sc.nextLine();
        System.out.println("Nombre de lignes:");
        int ligne = sc.nextInt();
        sc.nextLine();

        // impression haut du tableau
        for (int j = 0; j != (colonne + 2); j++) {
            if (j % (colonne + 1) == 0) {
                System.out.print("+");
            } else {
                System.out.print("-");
            }
        }
        System.out.println();

        // impression corps du tableau
        for (int j = 0; j != (ligne); j++) {
            for (int i = 0; i != (colonne + 2); i++) {
                if (i % (colonne + 1) == 0) {
                    System.out.print("|");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // impression bas du tableau
        for (int j = 0; j != (colonne + 2); j++) {
            if (j % (colonne + 1) == 0) {
                System.out.print("+");
            } else {
                System.out.print("-");
            }
        }
        System.out.println();
    }

    public static void exo34(Scanner sc) {

        // palindrome = texte qui peut se lire de gauche à droite ou inversement
        System.out.println("Le palindrome\n Texte qui peut se lire de gauche à droite ou inversement\n");
        System.out.println("Entrez un texte pour savoir s'il s'agit d'un palindrome:");


    }

    public static void exo37(Scanner sc) {

        System.out.println("Table de multiplication\n");

        //Déclaration des variables
        System.out.println("\nValeur1:");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println("Valeur2:");
        int m = sc.nextInt();
        sc.nextLine();
        int[][] calcul = new int[m + 1][n + 1];

        //Remplissage du tableau pour n*m
        for (int i = 1; i != (m + 1); i++) {
            for (int j = 1; j != (n + 1); j++) {
                System.out.print((calcul[i][j] = i * j) + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void exo381(Scanner sc) {

        System.out.println("\nImpression d'un tableau quadrillé");

        // Déclaration des paramètres du tableau
        System.out.println("\nNombre de colonnes:");
        int colonne = sc.nextInt();
        sc.nextLine();
        System.out.println("Nombre de lignes:");
        int ligne = sc.nextInt();
        sc.nextLine();

        // impression haut du tableau
        System.out.print("┏"); // coin gauche
        for (int i = 0; i != (colonne - 1); i++) {
            System.out.print(" ━ ┳"); // centre de la ligne
        }
        System.out.print(" ━ ┓\n"); //coin droit

        // impression corps du tableau
        for (int j = 0; j != ((ligne * 2) - 1); j++) {
            for (int i = 0; i != (colonne); i++) {
                //alternance des lignes | et T, en distinguant les bordures
                if (j % 2 == 0) {
                    System.out.print("┃   ");// lignes paires (index 0 ie 1ère ligne)
                } else { // lignes impaires (2ème ligne)
                    if (i == 0) {
                        System.out.print("┣"); //bordure gauche (= index 0)
                    }
                    if (i == (colonne - 1)) {//index colonne-1 pour affichage lors du dernier tour de boucle
                        System.out.print(" ━ ┫");//bordure droite
                    } else {
                        System.out.print(" ━ ╋"); // centre du tableau
                    }
                }
            }
            //alternance des retours à la ligne en | ou ┫ (déjà affiché au dessus, donc juste retour à la ligne)
            if (j % 2 == 0) {
                System.out.print("┃\n");
            } else {
                System.out.print("\n");
            }
        }

        // impression bas du tableau
        System.out.print("┗ "); // coin gauche
        // boucle pour le centre
        for (int j = 0; j != (colonne - 1); j++) {
            System.out.print("━ ┻ ");
        }
        System.out.print("━ ┛\n\n"); // coin droit
    }

    private static void switchExo(int exo, Scanner sc) {

        // fonction switch

        switch (exo) {
            case 1: {
                exo1(sc);
                break;
            }
            case 2: {
                System.err.println("Attention, précisez 21 ou 22");
                break;
            }
            case 21: {
                exo21(sc);
                break;
            }
            case 22: {
                exo22(sc);
                break;
            }
            case 3: {
                exo3(sc);
                break;
            }
            case 4: {
                exo4(sc);
                break;
            }
            case 5: {
                exo331(sc);
                break;
            }
            case 332: {
                exo332(sc);
                break;
            }
            case 37: {
                exo37(sc);
                break;
            }
            case 381: {
                exo381(sc);
                break;
            }
            default: {
                System.err.println("Cet exercice n'existe pas (encore)");

            }
        }
    }

    public static void main(String[] args) {
        // Scanner
        Scanner sc = new Scanner(System.in);

        // boucle do while avec la fonction switchExo
        int exo = 1;
        do {
            System.out.println("\nSaisir le numéro de l'exercice à exécuter (0 pour quitter): ");
            exo = sc.nextInt();
            switchExo(exo, sc);
        }
        while (exo > 0);

    }
}

