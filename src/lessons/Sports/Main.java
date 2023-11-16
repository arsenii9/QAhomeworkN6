package lessons.Sports;

public class Main {
    public static void main(String[] args) {
      BodybuildingMan b =new BodybuildingMan();
      CalisthenicsMan c = new CalisthenicsMan();
      CrossFitMan cross = new CrossFitMan("abc");
      b.doSport();
      c.doSport();
      cross.doSport();

    }

}
