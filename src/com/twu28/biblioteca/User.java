public class User {
    public String libraryNumber;
    public String password;
    public String name;
    public boolean logInStatus=false;

    User(){

    }
    User(String libraryNumber, String password, String name){
        this.libraryNumber=libraryNumber;
        this.password=password;
        this.name=name;
    }

    public void getDetails() {
        System.out.println("Please Contact the Librarian..Thank You");
    }

    public boolean isUserLoggedIn() {
        return logInStatus;
    }
}
