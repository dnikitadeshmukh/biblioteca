public class StartUpObject {
    private String startupMsg;
    private String loginUserName;
    private String loginPassword;
    public static User users[];

    StartUpObject(){
        startupMsg="Welcome";
        users=new User[2];
    }

    public void showStartupMsg(){
        System.out.println(startupMsg);
    }

    public void dispayLoginMessage() {
        System.out.println("Enter Login User Name and Password");
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


