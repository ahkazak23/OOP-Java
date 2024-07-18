package lab7.pkg5;

class Album{
    String artist;
    String genre;
    
    Album(String artist,String genre){
        this.artist=artist;
        this.genre=genre;
    }
    
    boolean hasRockMusic(){
        return "Rock".equalsIgnoreCase(genre);
    }
}

class Song{
    String title;
    int lenInSeconds;
    Album onAlbum;
    
    Song(String title,int lenInSeconds,Album onAlbum){
        this.title=title;
        this.lenInSeconds=lenInSeconds;
        this.onAlbum=onAlbum;
    }
    
    boolean onSameAlbum(Song otherSong){
        return this.onAlbum==otherSong.onAlbum;
    }
}
    
public class Lab75 {

  
    public static void main(String[] args) {
        
        Album album1=new Album("Artist1", "Rock");
        Album album2=new Album("Artist2", "Rap");
        
        Song song1=new Song("Song1",180,album1);
        Song song2=new Song("Song2",170,album2);
        Song song3=new Song("Song3",200,album1);
        Song song4=new Song("Song4",150,album2);
       
        System.out.println("Are Song1 and Song2 on the same album? "+song1.onSameAlbum(song2));
        System.out.println("Are Song1 and Song3 on the same album? "+song1.onSameAlbum(song3));
        System.out.println("Are Song3 and Song4 on the same album? "+song3.onSameAlbum(song4));
        System.out.println("Are Song2 and Song4 on the same album? "+song4.onSameAlbum(song2));
        
        System.out.println("Does Album 1 have Rock music? "+album1.hasRockMusic());
        System.out.println("Does Album 2 have Rock music? "+album2.hasRockMusic());
    }
    
}
