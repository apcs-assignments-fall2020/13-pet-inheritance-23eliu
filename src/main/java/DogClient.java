public class DogClient {
    public static void main(String[] args) {
        Dog s1 = new Dog("Mark", 5, "teacup dog");

        Dog s2 = new Dog();
        
        System.out.println(s1.getName());
        System.out.println(s1.getAge());
        System.out.println(s1); 
        s1.makeNoise();
        System.out.println(s2);
    }
}