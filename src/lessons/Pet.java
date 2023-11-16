package lessons;

import java.util.Arrays;

public class Pet {
    public Pet(String species, String nickname) {

    }
    public Pet(String species, String nickname, int age, int trickLevel, String[] habits) {

    }
    public Pet(){

    }





    private String species;
    private String nickname;
    private int age;
    private int trickLevel;
    private String[] habits;
    public String getSpecies(){
    return species;
    }
    public String getNickname(){
        return nickname;
    }
    public int getAge(){
        return age;
    }
    public int getTricklavel(){
        return trickLevel;
    }

    public int getTrickLevel() {
        return trickLevel;
    }

    public String[] getHabits() {
        return habits;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setTrickLevel(int trickLevel) {
        this.trickLevel = trickLevel;
    }

    public void setHabits(String[] habits) {
        this.habits = habits;
    }

    public void eat(){
        System.out.println("Я ї'м!");
    }
 public void respond(){
     System.out.println("Привіт, хазяїн. Я - " + nickname + ". Я скучив!)");
 }
 public void foul(){
     System.out.println("Потрібно добре замести сліди...");
 }


    @Override
    public String toString() {
        return "Pet{" +
                "species='" + species + '\'' +
                ", nickname='" + nickname + '\'' +
                ", age=" + age +
                ", trickLevel=" + trickLevel +
                ", habits=" + Arrays.toString(habits) +
                '}';
    }


    public static void main(String[] args) {
        Pet pet = new Pet();
        pet.eat();
        pet.respond();
        pet.foul();
    }
}
