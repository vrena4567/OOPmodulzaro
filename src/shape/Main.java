package shape;

public class Main {
    public static void main(String[] args) {
        Circle kor = new Circle(5);
        System.out.println(kor.perimeter());
        System.out.println(kor.area());

        Square negyzet = new Square(2);
        System.out.println(negyzet.perimeter());
        System.out.println(negyzet.area());

        Rectangle teglalap = new Rectangle(2,3);
        System.out.println(teglalap.perimeter());
        System.out.println(teglalap.area());
    }
}
