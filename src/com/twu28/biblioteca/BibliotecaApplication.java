import java.io.IOException;

public class BibliotecaApplication {
    public static void main(String args[]) throws IOException{
        Biblioteca biblioteca=new Biblioteca();
        Menu menu=new Menu();
        User user =new User();
        Book book=new Book();


        biblioteca.showStartupMsg();
        menu.showMenu();
        menu.chooseOption();
        if(menu.isValidOption()){
            if(menu.menuOption==1)
                user.reserve(book);
            else if(menu.menuOption==3)
                user.getUserDetails();
        }
        else
            System.out.println("Invalid Option");
    }

}
