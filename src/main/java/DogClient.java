public class DogClient {
    public static void main(String[] args) {
        Dog s1 = new Dog("Mark", 5, "teacup dog");
        System.out.println(s1);

        Dog s2 = new Dog();
        System.out.println(s2);

        s1.makeNoise();

        Dog s3 = new Dog("yorkshire terrier");
        System.out.println(s3);
    }
}