public class BuilderPatternDemo {
    public static void main(String[] args) {
        // Creating user with all fields
        User user1 = new User.UserBuilder()
                .setName("Vignesh")
                .setAge(25)
                .setEmail("vignesh@example.com")
                .setAddress("Hyderabad")
                .build();

        user1.display();

        System.out.println("\n---\n");

        // Creating user with only name and email
        User user2 = new User.UserBuilder()
                .setName("Ram")
                .setEmail("ram@example.com")
                .build();

        user2.display();
    }
}
