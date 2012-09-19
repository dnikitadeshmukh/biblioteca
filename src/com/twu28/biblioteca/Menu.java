import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Menu {

    public int menuOption;

    Menu(){
        menuOption=1;
    }

    public Boolean showMenu(){
        System.out.println("1.Reserve Book\n2.Submit Book\n3.User Details\n4.Exit");
        return true;
    }

    public int chooseOption() throws IOException {
        //BufferedReader read=new BufferedReader(new InputStreamReader(System.in));
        //menuOption=Integer.parseInt(read.readLine());
        return menuOption;
    }

    public boolean isValidOption() {
        if(menuOption>=1 && menuOption<5)
            return true;
        else
            return false;

    }
}
