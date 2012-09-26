public class Login {
    public String startupMsg;
    private String loginUserName;
    private String loginPassword;
    public User users[];

    Login(){
        startupMsg="Welcome";
        users=new User[2];
    }

    public void showStartupMsg(){
        System.out.println(startupMsg);
    }

    public void dispayLoginMessage() {
        System.out.println("Enter Login User Name and Password");
    }

    public void acceptLoginDetails() {
        loginUserName="111-1111";
        loginPassword="nikita";
    }

    public boolean isLoginSuccesful() {
        for(int i=0;i<2;i++)
            if(loginUserName.equals(users[i].libraryNumber))
                if(loginPassword.equals(users[i].password)){
                    users[i].logInStatus=true;
                    return true;
                }
                else
                    return false;

        return false;
    }

    public String createUser(int userno) {
        if(userno==1){
            users[userno-1]=new User("111-1111","nikita","nikita");
            return users[userno-1].libraryNumber;
        }
        else if(userno==2){
            users[userno-1]=new User("111-1112","namita","namita");
            return users[userno-1].libraryNumber;
        }
        else
            return null;

    }
}
