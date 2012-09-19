public class Biblioteca {
    public String startupMsg;

    Biblioteca(){
        startupMsg="Welcome";
    }

    public String showStartupMsg(){
        System.out.println(startupMsg);
        return startupMsg;
    }
}
