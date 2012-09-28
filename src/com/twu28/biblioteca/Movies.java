public class Movies {
    private String movieNames[]={"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O"};
    private String movieRatings[]={"1","2","3","4","5","N/A","2","3","4","5","1","N/A","3","4","5"};
    private int yearReleased[]={1965,1934,1990,2012,2010,1999,1890,1967,1989,2010,2011,2012,1999,1956,1990};
    private String movieDirectors[]={"P","O","N","M","L","K","J","I","H","G","F","E","D","C","B","A"};

    @Override
    public String toString(){

        String displayMovieList ="";
        for(int i=0;i<15;i++){
            displayMovieList=displayMovieList.concat(movieNames[i]+"\t\t"+movieRatings[i]+"\t\t"+yearReleased[i]+"\t\t"+movieDirectors[i]+"\n");
        }
        return displayMovieList;

    }
    public void diplayMovieList(Object movie) {
        System.out.println(movie);
    }


    public void displayListFormat() {
        System.out.println("Name\t\tRatings\t\tYear\t\tDirector");
    }
}
