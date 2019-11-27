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
    
    // Payment Information Details
    String user16DigitNo;
    String userExpirationDate;
    String userCVVCode;

    public User() {

    }

    public User(String userId, String userName, String userEmail,
                String userPassword, String userPhoneNo, String userAddress, String userCity,
                String userPostcode, String userDOB, String user16DigitNo, String userExpirationDate,
                String userCVVCode) {

        this.userId = userId;
        this.userName = userName;
        this.userEmail = userEmail;
        this.userPassword = userPassword;
        this.userPhoneNo = userPhoneNo;
        this.userAddress = userAddress;
        this.userCity = userCity;
        this.userPostcode = userPostcode;
        this.userDOB = userDOB;
        
        // Payment Information; not needed for Registration
        this.user16DigitNo = user16DigitNo;
        this.userExpirationDate = userExpirationDate;
        this.userCVVCode = userCVVCode;
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
    
       public String getUser16DigitNo() {
        return user16DigitNo;
    }

    public String getUserExpirationDate() {
        return userExpirationDate;
    }

    public String getUserCVVCode() {
        return userCVVCode;
    }

}
