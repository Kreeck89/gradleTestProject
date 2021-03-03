import entity.User;

public class Main {
    public static void main(String[] args) {
        User user = new User("Alex", 22);
        System.out.println(user.getAge());
    }
}
