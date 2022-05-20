public class my_animal {

    public static void main(String[] args) {
        dog dog1 = new dog("Skybear", "Siberian Husky", 23, "White and Black", "Barry Allen", "Female");
        dog1.getDog();

        cat cat1 = new cat("Kitty", "Savannah Cat", 25, "Brown and little touch of Black", "Caitlin Snow", "Female");
        cat1.getCat();

        fish fish1 = new fish("Koi-Koi", "Koi", 35, "White and Orange", "Ange Denver", "Male");
        fish1.getFish();

        bird bird1 = new bird("Twitty", "Gouldian Finch", 12, "Rainbow", "Christine Fule", "Male");
        bird1.getBird();
    }
}
