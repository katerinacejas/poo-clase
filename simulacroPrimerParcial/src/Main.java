public class Main {
    public static void main(String[] args) {
        Brei brei = new Brei();
        Drus drus = new Drus();
        Flai flai = new Flai();

        System.out.println(flai.power());
        System.out.println(drus.size());
        System.out.println(flai.launch());
        System.out.println(flai.bye());
        System.out.println(flai.bye("Star"));
    }
}