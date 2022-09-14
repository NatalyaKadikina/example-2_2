package ru.skypro;

public class Puffenduy extends Hogwarts{
    private int trudolyubiye;
    private int vernost;
    private int chestnost;

    public void compareStudents(Puffenduy studentSecond) {
        int silaOne = this.trudolyubiye + this.vernost + this.chestnost;
        int silaTwo = studentSecond.trudolyubiye + studentSecond.vernost + studentSecond.chestnost;
        if (silaOne > silaTwo) {
            System.out.println(this.fullName + " сильнее чем " + this.fullName);
        } else if (silaTwo > silaOne) {
            System.out.println(studentSecond.fullName + " сильнее чем " + this.fullName);
        } else {
            System.out.println(this.fullName + " такой же сильный, ка " + studentSecond);
        }
    }

    public Puffenduy (String fullName, int silaMagi, int rasstoyaniyeTransgresi, int trudolyubiye, int vernost, int chestnost) {
        this.fullName = fullName;
        this.silaMagi = silaMagi;
        this.rasstoyaniyeTransgresi = rasstoyaniyeTransgresi;
        this.trudolyubiye = trudolyubiye;
        this.vernost = vernost;
        this.chestnost = chestnost;
    }

    public int getTrudolyubiye() {
        return trudolyubiye;
    }

    public int getVernost() {
        return vernost;
    }

    public int getChestnost() {
        return chestnost;
    }

    @Override
    public String toString()
    {
        return "Student Puffenduy"
                + " fullName=" + fullName
                + " silaMagi=" + silaMagi
                + " rasstoyaniyeTransgresi=" + rasstoyaniyeTransgresi
                + " trudolyubiye=" + trudolyubiye
                + " vernost=" + vernost
                + " chestnost=" + chestnost;
    }
}
