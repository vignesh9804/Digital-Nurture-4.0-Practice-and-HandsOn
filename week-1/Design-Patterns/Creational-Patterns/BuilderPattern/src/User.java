public class User {
    // Fields (final for immutability)
    private final String name;
    private final int age;
    private final String email;
    private final String address;

    // Private constructor - only accessible via builder
    private User(UserBuilder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.email = builder.email;
        this.address = builder.address;
    }

    // Display method to print user info
    public void display() {
        System.out.println("Name    : " + name);
        System.out.println("Age     : " + age);
        System.out.println("Email   : " + email);
        System.out.println("Address : " + address);
    }

    // Static nested Builder class
    public static class UserBuilder {
        private String name;
        private int age;
        private String email;
        private String address;

        public UserBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public UserBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public UserBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public UserBuilder setAddress(String address) {
            this.address = address;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}
