import java.io.IOException;

public class User {
    public String libraryNumber;
    private String password;
    private String name;
    private boolean logInStatus;
    private String loginusername;
    private String loginpassword;

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

    public boolean isUserLoggedIn(User user) {
        return user.logInStatus;
    }

    public boolean isLoginSuccesful() {
        for(int i=0;i<2;i++)
            if(loginusername.equals(StartUpObject.users[i].libraryNumber))
                if(loginpassword.equals(StartUpObject.users[i].password)){
                    StartUpObject.users[i].logInStatus=true;
                    return true;
                }
                else
                    return false;

        return false;
    }

    public void logIn() throws IOException {
        StubInput input=new StubInput();
        loginusername=input.getUserInput("111-1111");
        loginpassword=input.getUserInput("nikita");
    }
}
