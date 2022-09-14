package ru.skypro;

public class Kogtevran extends Hogwarts{
    private int um;
    private int mudrost;
    private int ostroumiye;
    private int tvorchestvo;

    public void compareStudents(Kogtevran studentSecond) {
        int silaOne = this.um + this.mudrost + this.ostroumiye + this.tvorchestvo;
        int silaTwo = studentSecond.mudrost + studentSecond.ostroumiye + studentSecond.ostroumiye + studentSecond.tvorchestvo;
        if (silaOne > silaTwo) {
            System.out.println(this.fullName + " сильнее чем " + this.fullName);
        } else if (silaTwo > silaOne) {
            System.out.println(studentSecond.fullName + " сильнее чем " + this.fullName);
        } else {
            System.out.println(this.fullName + " такой же сильный, ка " + studentSecond);
        }
    }

    public Kogtevran (String fullName, int silaMagi, int rasstoyaniyeTransgresi, int um, int mudrost, int ostroumiye, int tvorchestvo) {
        this.fullName = fullName;
        this.silaMagi = silaMagi;
        this.rasstoyaniyeTransgresi = rasstoyaniyeTransgresi;
        this.um = um;
        this.mudrost = mudrost;
        this.ostroumiye = ostroumiye;
        this.tvorchestvo = tvorchestvo;
    }

    public int getUm() {
        return um;
    }

    public int getMudrost() {
        return mudrost;
    }

    public int getOstroumiye() {
        return ostroumiye;
    }

    public int getTvorchestvo() {
        return tvorchestvo;
    }

    @Override
    public String toString()
    {
        return "Student Kogtevran"
                + " fullName=" + fullName
                + " silaMagi=" + silaMagi
                + " rasstoyaniyeTransgresi=" + rasstoyaniyeTransgresi
                + " um=" + um
                + " mudrost=" + mudrost
                + " ostroumiye=" + ostroumiye
                + " tvorchestvo=" + tvorchestvo;
    }
}
