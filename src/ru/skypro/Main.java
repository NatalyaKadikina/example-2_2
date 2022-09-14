package ru.skypro;

public class Main {

    public static void main(String[] args) {

        Griffindor GP = new Griffindor("Garri Potter", 41,12, 53, 44,75);
        Griffindor RU = new Griffindor("Ron Uizli", 6,2, 1, 4,2);
        Kogtevran СС = new Kogtevran("Chzhou Chang", 3,7,8,4,3,8);
        Kogtevran PP = new Kogtevran("Padma Patil", 32,3,4,1,33,12);
        Slizerin DM = new Slizerin("Drako Malfoy",2,3,4,6,8,9,3);
        Slizerin GM = new Slizerin("Grekhem Montegyu",12,32,41,5,1,5,9);
        Puffenduy ZS = new Puffenduy("Zakhariya Smit",5,7,8,9,3);
        Puffenduy SD = new Puffenduy("Sedrik Diggori",15,17,38,19,43);

        System.out.println();
        System.out.println(GP);

        GP.compareStudents(DM);
    }
}
