// This is the class for the 'User' table. Go to App -> Java -> com.example.[projectname]
// Right click on the folder, click 'new', and add a new Java class

public class User {
    String userId;
    String userName;
    String userEmail;
    String userPassword;
    String userPhoneNo;
    String userAddress;
    String userCity;
    String userPostcode;
    String userDOB;

    public User() {

    }

    public User(String userId, String userName, String userEmail,
                String userPassword, String userPhoneNo, String userAddress, String userCity,
                String userPostcode, String userDOB) {

        this.userId = userId;
        this.userName = userName;
        this.userEmail = userEmail;
        this.userPassword = userPassword;
        this.userPhoneNo = userPhoneNo;
        this.userAddress = userAddress;
        this.userCity = userCity;
        this.userPostcode = userPostcode;
        this.userDOB = userDOB;
    }

    public String getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public String getUserPhoneNo() {
        return userPhoneNo;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public String getUserCity() {
        return userCity;
    }

    public String getUserPostcode() {
        return userPostcode;
    }

    public String getUserDOB() {
        return userDOB;
    }
}
