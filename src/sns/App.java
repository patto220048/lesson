package sns;

import sns.entity.User;

public class App {
    public static void main(String[] args) {
        User user = new User();
        user.setEmail("example@example.com");
        user.setName("P2T");
        user.setPassword("password");
    }
}
