import java.util.Date;

public class Movies {
    private String movieNames[]={"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O"};
    private String movieRatings[]={"1","2","3","4","5","N/A","2","3","4","5","1","N/A","3","4","5"};
    private int yearReleased[]={1965,1934,1990,2012,2010,1999,1890,1967,1989,2010,2011,2012,1999,1956,1990};
    private String movieDirectors[]={"P","O","N","M","L","K","J","I","H","G","F","E","D","C","B","A"};
    public void diplayMovieList() {
        for(int i=0;i<15;i++)
            System.out.println(movieNames + "\t\t" + movieRatings + "\t\t" + yearReleased + "\t\t" + movieDirectors);
    }

    public void displayListFormat() {
        System.out.println("Name\t\tRatings\t\tYear\t\tDirector");
    }
}
