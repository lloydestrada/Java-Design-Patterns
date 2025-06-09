public class ecommApp {
    public static void main(String[] args) {

        User user = new User.UserBuilder()
                .firstName("John Lloyd")
                .lastName("Estrada")
                .email("Lloyd.estrada@gmail.com")
                .address("587 Manila St")
                .phone("424625-2422-222")
                .age(19)
                .build();

        User user1 = new User.UserBuilder()
                .firstName("Grace")
                .lastName("Hemington")
                .email("Grace.H@example.com")
                .address("768 New York St.")
                .phone("23245-24242-567")
                .age(25)
                .build();

        System.out.println(user);
        System.out.println(user1);

    }
}
