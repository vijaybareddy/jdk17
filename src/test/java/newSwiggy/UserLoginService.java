package newSwiggy;

public class UserLoginService {
    String userName="Vijay@143";
    String password="12345";

    public boolean loginValidate(String localUserName,String localPassword) {
        if (localUserName.equals(userName) && localPassword.equals(password)) {
            System.out.println("login successful");
            return true;

        }
        else {
            System.out.println("please enter valid credentials");
            return false;

        }

    }

}
