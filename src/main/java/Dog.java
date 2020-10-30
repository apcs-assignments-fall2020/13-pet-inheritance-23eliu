public class Dog extends Pet {
    // Instance variable(s)
    private String breed;

    // Constructors
    public Dog(String a, int b, String c) {
        super(a, b);
        this.breed = c;
    }

    public Dog() {
        super("Marly", 2);
        this.breed = "Black Labrador";
    }

    public Dog(String c) {
        super();
        this.breed = c;
    }

    public String toString() {
        String str = "Name: " + this.getName() + ", Age: " + this.getAge() + ", Breed: " + this.breed;

        return str;
    }

    // makeNoise() method


    // toString method


    // Getter


    // Setter
}