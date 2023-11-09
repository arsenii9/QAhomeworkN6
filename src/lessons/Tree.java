package lessons;

public class Tree {
    public String type;
    public String colour;
    public int height;
    public int coutOfsticks;

    public void tree() {

    }

    public Tree(String type, int height) {
        coutOfsticks = 13;
        colour = "зеленый";
    }

    public Tree(String colour, int height, int coutOfsticks) {
        type = "пихта";
    }

    public Tree() {
        height = 350;
        coutOfsticks = 29;
        colour = "Желтый";
    }

    public Tree(String type) {
        Tree a = new Tree();
        a.tree();
    }
}