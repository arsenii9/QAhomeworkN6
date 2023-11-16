package lessons;

import java.util.Arrays;

public class Family {
    private String familyName;
    private Human mother;
    private Human father;
    private Human[] children;
    private Pet vasya;

    public Human getMother() {
        return mother;
    }

    public Human getFather() {
        return father;
    }

    public Human[] getChildren() {
        return children;
    }

    public Pet getVasya() {
        return vasya;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public void setChildren(Human[] children) {
        this.children = children;
    }

    public void setVasya(Pet vasya) {
        this.vasya = vasya;
    }

    public Family(String familyName, Human mother, Human father) {
        this.familyName = familyName;
        this.mother = mother;
        this.father = father;
        this.children = new Human[0];
    }

    public int countFamily() {
        return 2 + children.length;
    }

    public void addChild(Human newChild) {
        Human[] newArray = Arrays.copyOf(children, children.length + 1);
        newArray[children.length] = newChild;
        children = newArray;
        newChild.setFamily(this);
    }

    public boolean deleteChild(Human child) {
        int index = -1;
        for (int i = 0; i < children.length; i++) {
            if (children[i].equals(child)) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            children[index].setFamily(null);
            Human[] newArray = new Human[children.length - 1];
            int counter = 0;
            for (int i = 0; i < children.length; i++) {
                if (i == index) {
                    continue;
                }
                newArray[counter] = children[i];
                counter++;
            }
            children = newArray;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Family{" +
                "familyName='" + familyName + '\'' +
                ", mother=" + mother +
                ", father=" + father +
                ", children=" + Arrays.toString(children) +
                ", vasya=" + vasya +
                '}';
    }

    public static void main(String[] args) {
        Human mother = new Human("Ann", "Smith", 27);
        Human father = new Human("Mann", "Smith", 33);
        Family smith = new Family("Smith", mother, father);
        System.out.println(smith.countFamily());

        Human child1 = new Human("child1", "Smith", 1);
        Human child2 = new Human("child2", "Smith", 2);
        Human child3 = new Human("child3", "Smith", 3);

        smith.addChild(child1);
        smith.addChild(child2);
        smith.addChild(child3);
        System.out.println(smith.countFamily());
    }

    }

