public class cat extends animal {
    private String owner, name, gender;
    private double weight;

    public cat(String name, String breed, double weight, String color, String owner, String gender) {
        super(breed, color);
        this.owner = owner;
        this.name = name;
        this.gender = gender;
        this.weight = weight;

    }

    public void setCat(String name, double wt) {
        this.name = name;
    }

    public void getCat() {
        System.out.println("Cat's Owner  : " + owner);
        System.out.println("Cat's Name   : " + name);
        System.out.println("Cat's Gender : " + gender);
        System.out.println("Cat's Breed  : " + getBreed());
        System.out.println("Cat's Color  : " + getColor());
        System.out.println("Cat's Weight : " + getweight() + " pounds");
        System.out.println("\n");

    }

    private double getweight() {
        return weight;
    }
}
