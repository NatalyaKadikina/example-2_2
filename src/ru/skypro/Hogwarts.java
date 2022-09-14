package ru.skypro;

public abstract class Hogwarts {
    int silaMagi;
    int rasstoyaniyeTransgresi;
    String fullName;

    public void SetSilaMagi(int silaMagi){
        this.silaMagi = silaMagi;
    }

    public void SetRasstoyaniyeTransgresi(int rasstoyaniyeTransgresi){
        this.rasstoyaniyeTransgresi = rasstoyaniyeTransgresi;
    }

    public void compareStudents(Hogwarts studentSecond) {
        int silaOne = this.silaMagi + this.rasstoyaniyeTransgresi;
        int silaTwo = studentSecond.silaMagi + studentSecond.rasstoyaniyeTransgresi;
        if (silaOne > silaTwo) {
            System.out.println(this.fullName + " сильнее чем " + this.fullName);
        } else if (silaTwo > silaOne) {
            System.out.println(studentSecond.fullName + " сильнее чем " + this.fullName);
        } else {
            System.out.println(this.fullName + " такой же сильный, ка " + studentSecond);
        }
    }


}
