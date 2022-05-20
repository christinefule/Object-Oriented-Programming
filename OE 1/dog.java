public class dog extends animal {
    private String owner, name, gender;
    private double weight;

    public dog(String name, String breed, double weight, String color, String owner, String gender) {
        super(breed, color);
        this.owner = owner;
        this.name = name;
        this.gender = gender;
        this.weight = weight;

    }

    public void setDog(String name, double wt) {
        this.name = name;
        this.weight = weight;
    }

    public void getDog() {
        System.out.println("Dog's Owner  : " + owner);
        System.out.println("Dog's Name   : " + name);
        System.out.println("Dog's Gender : " + gender);
        System.out.println("Dog's Breed  : " + getBreed());
        System.out.println("Dog's Color  : " + getColor());
        System.out.println("Dog's Weight : " + getweight() + " kg");
        System.out.println("\n");

    }

    private double getweight() {
        return weight;
    }
}
