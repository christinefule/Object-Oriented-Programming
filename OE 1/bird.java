public class bird extends animal {
    private String owner, name, gender;
    private double weight;

    public bird(String name, String breed, double weight, String color, String owner, String gender) {
        super(breed, color);
        this.owner = owner;
        this.name = name;
        this.gender = gender;
        this.weight = weight;

    }

    public void setBird(String name, double wt) {
        this.name = name;
    }

    public void getBird() {
        System.out.println("Bird's Owner  : " + owner);
        System.out.println("Bird's Name   : " + name);
        System.out.println("Bird's Gender : " + gender);
        System.out.println("Bird's Breed  : " + getBreed());
        System.out.println("Bird's Color  : " + getColor());
        System.out.println("Bird's Weight : " + getweight() + " grams");
    }

    private double getweight() {
        return weight;
    }
}
