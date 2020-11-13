public class Dog extends Pet {
    // Instance variable(s)
    private String breed;

    // Constructors
    public Dog(String a, int b, String c) {
        super(a, b);
        this.breed = c;
    }

    // Default Constructor
    public Dog() {
        super("Marly", 2);
        this.breed = "Black Labrador";
    }

    public void makeNoise() {
        System.out.println("Woof!");
    }
    
    public String toString() {
        String str = "Name: " + this.getName() + ", Age: " + this.getAge() + ", Breed: " + this.breed;
        return str;
    }

    // Getter
    public String getBreed() {
        return this.breed;
    }

    // Setter
    public void setBreed(String breed) {
        if (breed.trim().length() != 0) {
            this.breed = breed;
        }
    }
}