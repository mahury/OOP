package oop;

public class WebMaster extends User {
    private String site;

    public void printUser(){
        System.out.println(   " login " + getLogin() + " site "  + site );
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public WebMaster(int id, String login, String password, String site) {
        super(id, login, password);
        this.site = site;
    }
}
