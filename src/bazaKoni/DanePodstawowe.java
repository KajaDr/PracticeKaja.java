package bazaKoni;

public class DanePodstawowe {

    public Integer rokUrodzenia;
    public String masc;
    public String imieMatki;
    public String imieOjca;

    public DanePodstawowe(){
        rokUrodzenia = 0;
        masc ="";
        imieMatki ="";
        imieOjca = "";
    }

    public DanePodstawowe(Integer rokUrodzenia, String masc, String imieMatki, String imieOjca){
        this.rokUrodzenia=rokUrodzenia;
        this.masc =masc;
        this.imieMatki=imieMatki;
        this.imieOjca = imieOjca;
    }
    public String toString(){
        return "rok urodzenia : " + this.rokUrodzenia
                + "maść : " + this.masc
                + " imie matki :" + this.imieMatki
                + "imie ojca : " + this.imieOjca;
    }
    public String getMasc(){return masc;}
    public String getImieMatki() {return imieMatki;}
    public String getImieOjca() {return imieOjca;}
    public Integer getRokUrodzenia(){return rokUrodzenia;}

}


