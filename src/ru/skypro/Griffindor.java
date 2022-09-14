package ru.skypro;

public class Griffindor extends Hogwarts{
    private int blagorodstvo;
    private int chest;
    private int khrabrost;


    public void compareStudents(Griffindor studentSecond) {
        int silaOne = this.blagorodstvo + this.chest + this.khrabrost;
        int silaTwo = studentSecond.blagorodstvo + studentSecond.chest + studentSecond.khrabrost;
        if (silaOne > silaTwo) {
            System.out.println(this.fullName + " сильнее чем " + this.fullName);
        } else if (silaTwo > silaOne) {
            System.out.println(studentSecond.fullName + " сильнее чем " + this.fullName);
        } else {
            System.out.println(this.fullName + " такой же сильный, ка " + studentSecond);
        }
    }

    public Griffindor (String fullName, int silaMagi, int rasstoyaniyeTransgresi, int blagorodstvo, int chest, int khrabrost) {
        this.fullName = fullName;
        this.silaMagi = silaMagi;
        this.rasstoyaniyeTransgresi = rasstoyaniyeTransgresi;
        this.blagorodstvo = blagorodstvo;
        this.chest = chest;
        this.khrabrost = khrabrost;
    }

    public int getBlagorodstvo() {
        return blagorodstvo;
    }

    public int getChest() {
        return chest;
    }

    public int getKhrabrost() {
        return khrabrost;
    }

    @Override
    public String toString()
    {
        return "Student Griffindor"
                + " fullName=" + fullName
                + " silaMagi=" + silaMagi
                + " rasstoyaniyeTransgresi=" + rasstoyaniyeTransgresi
                + " blagorodstvo=" + blagorodstvo
                + " chest=" + chest
                + " khrabrost=" + khrabrost;
    }
}
