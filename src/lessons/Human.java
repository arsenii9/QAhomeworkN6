package lessons;

import java.util.Arrays;

public class Human {
    private String name;
    private String surname;
    private int age;
    private int iq;
    private Pet vanya;
    private Human mother;
    private Human father;
    private Pet vasya;
    private Family family;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getYear() {
        return age;
    }

    public int getIq() {
        return iq;
    }

    public Pet getVanya() {
        return vanya;
    }

    public Human getMother() {
        return mother;
    }

    public Human getFather() {
        return father;
    }

    public Pet getVasya() {
        return vasya;
    }

    public Family getFamily() {
        return family;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setYear(int year) {
        this.age = year;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public void setVanya(Pet vanya) {
        this.vanya = vanya;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public void setVasya(Pet vasya) {
        this.vasya = vasya;
    }

    public void setFamily(Family family) {
        this.family = family;
    }

    public void greetPet() {
        System.out.println("Привіт, " + vasya.getNickname());
    }

    public void describePet() {
        System.out.print("У мене є " + vasya.getSpecies() + "," + "їй " + vasya.getAge() + ",");
        if (vasya.getTrickLevel() > 50) {
            System.out.println("вона дуже хитра");
        } else {
            System.out.println("вона майже не хитра");
        }
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", iq=" + iq +
                ", vanya=" + vanya +
                ", mother=" + mother +
                ", father=" + father +
                ", vasya=" + vasya +
                ", family=" + family +
                '}';
    }
    public Human(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }


    public static void main(String[] args) {
        Human petya = new Human("petya", "Smith", 66);
        petya.greetPet();
        petya.describePet();
    }
}

