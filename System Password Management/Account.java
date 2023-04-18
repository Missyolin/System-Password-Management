public class Account {
    
    private String media;
    private String email;
    private String password;

    public String getMedia(){
        return media;
    }

    public String setMedia(String media){
        return this.media=media;
    }

    public String getEmail(){
        return email;
    }

    public String setEmail(String email){
        return this.email=email;
    }

    public String getPassword(){
        return password;
    }

    public String setPassword(String password){
        return this.password=password;
    }

    public String viewListAccount(){
        return(String.format(this.getMedia()+"|"+ this.getEmail()+"|"+ this.getPassword()));
    }
}
