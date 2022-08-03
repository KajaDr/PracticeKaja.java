package bazaKoni;

public class Kon extends DanePodstawowe {
    private String imieKonia= "";
    private String imieWlasciciela = "";
    private String nazwiskoWlasciciela = "";
    private Plec plec = null;
    private Rasy rasa = null;

    public Kon() {
        super();
        this.imieKonia= "";
        this.imieWlasciciela = "";
        this.nazwiskoWlasciciela = "";
        this.plec = null;
        this.rasa = null;
    }
    public Kon ( final String imieKonia,
            final String imieWlasciciela,
                 final String nazwiskoWlasciciela,
                 final Plec plec,
                 final Rasy rasa) {
        super(rokUrodzenia,
                masc,
                imieMatki,
                imieOjca);
       this.imieKonia= "";
        this.plec = null;
        this.rasa = null;
        this.imieWlasciciela = "";
        this.nazwiskoWlasciciela = "";
    }
    @Override
    public String toString() {
        return "Imie konia: " + this.imieKonia
                + "płec: " + this.plec
                + "rasa: " + this.rasa
                + "masc : " + getMasc()
                + " rok urodzenia : " + getRokUrodzenia()
                + "imie matki : " + getImieMatki()
                + "imie ojca : " + getImieOjca()
                + "imie i nazwisko własciciela : " + this.imieWlasciciela
                + " " + this.nazwiskoWlasciciela;
    }

    public String getImieKonia() {return imieKonia;}

    @Override
    public String getMasc() {
        return super.getMasc();
    }

    public Rasy getRasa() {
        return rasa;
    }

    public String getImieWlasciciela() {
        return imieWlasciciela;
    }

    public String getNazwiskoWlasciciela() {
        return nazwiskoWlasciciela;
    }
}

