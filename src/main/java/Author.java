import java.io.Serializable;

public class Author implements Serializable {
    private String first_name;
    private String last_name;

    public Author(){};

//  ================ getters ==============|
    public String getFirst_name(){
        return this.first_name;
    }
    public String getLast_name(){
        return this.last_name;
    }

// ==================== setters ============================|

    public void setFirst_name(String first_name){
        this.first_name = first_name;
    }

    public void setLast_name(String last_name){
        this.last_name = last_name;
    }
}
