import java.io.Serializable;

public class Quote implements Serializable {

    private String author;
    private String content;

    public Quote(){};

    public String getContent(){
        return this.content;
    }

    public void setContent(String content){
        this.content = content;
    }

    public String getAuthor(){
        return this.author;
    }

    public void setAuthor(String author){
        this.author = author;
    }


}
