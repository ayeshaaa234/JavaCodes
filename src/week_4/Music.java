package week_4;

import java.util.Objects;
public class Music {

    private String genre;
    private String title;
    private String duration;
    private Singer singer;
    private Date releasedate;

    Music(String duration, Singer singer, Date releasedate, String genre, String title) {
        this.duration = duration;
        this.singer = singer;
        this.releasedate = releasedate;
        this.genre = genre;
        this.title = title;
    }

    public String getDuration() {
        return duration;
    }

    public Singer getSinger() {
        return singer;

    }

    public String getGenre() {
        return genre;
    }

    public String getTitle() {
        return title;
    }

    public Date getReleasedate() {
        return releasedate;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setReleasedate(Date releasedate) {
        this.releasedate = releasedate;
    }

    public void setSinger(Singer singer) {
        this.singer = singer;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean equals(Object O){
        Music m1= (Music)O;
//            if(m1.singer!=this.singer){
//                return false;
//            }
        if(m1.singer.getName()!=this.singer.getName()){
            return false;
        }
//            else if(m1.singer.getGender()!=this.singer.getGender()){
//                return false;
//            }
        else
            return true;
    }

       // public Music clone(){
//
       // return new Music(this.getDuration(),this.getSinger(),this.getReleasedate(),this.getGenre().this.getTitle());
//
  //  }
    @Override
    public String toString() {
        return "Music{" +
                "genre='" + genre + '\'' +
                ", title='" + title + '\'' +
                ", duration='" + duration + '\'' +
                ", singer=" + singer +
                ", releasedate=" + releasedate +
                '}';
    }
}

