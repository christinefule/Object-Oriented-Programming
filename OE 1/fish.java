public class fish extends animal {
    private String owner, name, gender;
    private double weight;

    public fish(String name, String breed, double weight, String color, String owner, String gender) {
        super(breed, color);
        this.owner = owner;
        this.name = name;
        this.gender = gender;
        this.weight = weight;

    }

    public void setFish(String name, double wt) {
        this.name = name;
    }

    public void getFish() {
        System.out.println("Fish's Owner  : " + owner);
        System.out.println("Fish's Name   : " + name);
        System.out.println("Fish's Gender : " + gender);
        System.out.println("Fish's Breed  : " + getBreed());
        System.out.println("Fish's Color  : " + getColor());
        System.out.println("Fish's Weight : " + getweight() + " pounds");
        System.out.println("\n");

    }

    private double getweight() {
        return weight;
    }
}
