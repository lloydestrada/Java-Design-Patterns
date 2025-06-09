import java.util.*;
public class User {
    protected final String firstName;
    protected final String lastName;
    protected final String email;
    protected final String address;
    protected final String phone;
    protected  final Integer age;

    public User(UserBuilder UserBuilder) {
        this.firstName = UserBuilder.firstName;
        this.lastName = UserBuilder.lastName;
        this.email = UserBuilder.email;
        this.address = UserBuilder.address;
        this.phone = UserBuilder.phone;
        this.age = UserBuilder.age;
    }


    protected static class UserBuilder{
        private String firstName;
        private String lastName;
        private String email;
        private String address;
        private String phone;
        private Integer age;

        public UserBuilder firstName(String firstName){
            this.firstName = firstName;
            return this;
        }

        public UserBuilder lastName(String lastName){
            this.lastName = lastName;
            return this;
        }

        public UserBuilder email(String email){
            this.email = email;
            return this;
        }

        public UserBuilder address(String address){
            this.address = address;
            return this;
        }

        public UserBuilder phone(String phone){
            this.phone = phone;
            return this;
        }

        public UserBuilder age(Integer age){
            this.age = age;
            return this;
        }

        public User build(){
            return new User(this);
        }


    }
    @Override
    public String toString() {
        return "FirstName= " + firstName + "\n" +
                "LastName= " + lastName + "\n" +
                "Email= " + email + "\n" +
                "Address= " + address + "\n" +
                "Phone= " + phone + "\n" +
                "Age= " + age + "\n";
    }

}
