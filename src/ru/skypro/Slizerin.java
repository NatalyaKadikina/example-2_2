package ru.skypro;

public class Slizerin extends Hogwarts{
    private int khitrost;
    private int reshitelnost;
    private int ambitsioznost;
    private int nakhodchivost;
    private int vlast;

    public void compareStudents(Slizerin studentSecond) {
        int silaOne = this.khitrost + this.reshitelnost + this.ambitsioznost + this.nakhodchivost + this.vlast;
        int silaTwo = studentSecond.khitrost + studentSecond.reshitelnost + studentSecond.ambitsioznost + studentSecond.nakhodchivost  + studentSecond.vlast;
        if (silaOne > silaTwo) {
            System.out.println(this.fullName + " сильнее чем " + this.fullName);
        } else if (silaTwo > silaOne) {
            System.out.println(studentSecond.fullName + " сильнее чем " + this.fullName);
        } else {
            System.out.println(this.fullName + " такой же сильный, ка " + studentSecond);
        }
    }

    public Slizerin (String fullName, int silaMagi, int rasstoyaniyeTransgresi, int khitrost, int reshitelnost, int ambitsioznost, int nakhodchivost, int vlast) {
        this.fullName = fullName;
        this.silaMagi = silaMagi;
        this.rasstoyaniyeTransgresi = rasstoyaniyeTransgresi;
        this.khitrost = khitrost;
        this.reshitelnost = reshitelnost;
        this.ambitsioznost = ambitsioznost;
        this.nakhodchivost = nakhodchivost;
        this.vlast = vlast;
    }

    public int getKhitrost() {
        return khitrost;
    }

    public int getReshitelnost() {
        return reshitelnost;
    }

    public int getAmbitsioznost() {
        return ambitsioznost;
    }

    public int getNakhodchivost() {
        return nakhodchivost;
    }
    public int getVlast() {
        return vlast;
    }

    @Override
    public String toString()
    {
        return "Student Slizerin"
                + " fullName=" + fullName
                + " silaMagi=" + silaMagi
                + " rasstoyaniyeTransgresi=" + rasstoyaniyeTransgresi
                + " khitrost=" + khitrost
                + " reshitelnost=" + reshitelnost
                + " ambitsioznost=" + ambitsioznost
                + " nakhodchivost=" + nakhodchivost
                + " vlast=" + vlast;
    }

}
