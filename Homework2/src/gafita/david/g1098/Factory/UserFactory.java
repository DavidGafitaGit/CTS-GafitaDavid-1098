package gafita.david.g1098.Factory;

public class UserFactory {

    public static User createUser(Rank rank, String username, String email, String password, String country) {
        switch (rank) {
            case USER_NORMAL:
            	System.out.println("New *USER* account was created: " + username);
                return new NormalUser(username,email,password,country);
            case USER_ADMIN:
            	System.out.println("New *ADMIN* account was created: " + username);
                return new AdminUser(username,email,password,country);
            default:
                throw new UnsupportedOperationException("User rank not defined");
        }
    }

}
