import java.io.Serializable;
import java.util.Date;

public class Album implements Serializable {

    private String artist_name;
    private String record_name;
    private Date release_date;
    private char gender;
    private double sales;

    public Album(){};


//============== getters =========================|
    public String getArtist_name() {
        return artist_name;
    }

    public String getRecord_name() {
        return record_name;
    }

    public Date getRelease_date() {
        return release_date;
    }

    public char getGender() {
        return gender;
    }

    public double getSales() {
        return sales;
    }
//======================= setters ===================================|
    public void setArtist_name(String artist_name) {
        this.artist_name = artist_name;
    }

    public void setRecord_name(String record_name) {
        this.record_name = record_name;
    }

    public void setRelease_date(Date release_date){
        this.release_date = release_date;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setSales(double sales) {
        this.sales = sales;
    }
}
