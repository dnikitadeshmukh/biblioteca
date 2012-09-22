import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Menu {

    public int menuOption;

    Menu(){
        menuOption=1;
    }

    public void showMenu(){
        System.out.println("1.Reserve Book\n2.Submit Book\n3.User Details\n4.Exit");

    }

    public int chooseOption() throws IOException {
        return menuOption;
    }

    public boolean isValidOption() {
        return  (menuOption>=1 && menuOption<5);
    }

    public void printInvalidMessage(){
        System.out.println("Select a valid option");
    }
}
