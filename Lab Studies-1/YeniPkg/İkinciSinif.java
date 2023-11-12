package YeniPkg;

public class İkinciSinif {
    private String ulkeAdi;
    private int ilSayisi;
    private String baskaninAdi;

    public İkinciSinif(String ulkeAdi, int ilSayisi, String baskaninAdi) {
        this.ulkeAdi = ulkeAdi;
        this.ilSayisi = ilSayisi;
        this.baskaninAdi = baskaninAdi;
    }
    
    
    
    
    public String getUlkeAdi() {
        return ulkeAdi;
    }

    public void setUlkeAdi(String ulkeAdi) {
        this.ulkeAdi = ulkeAdi;
        System.out.println(this.ulkeAdi);
    }

    public int getIlSayisi() {
        return ilSayisi;
    }

    public void setIlSayisi(int ilSayisi) {
        this.ilSayisi = ilSayisi;
        System.out.println(this.ilSayisi);

    }

    public String getBaskaninAdi() {
        return baskaninAdi;
    }

    public void setBaskaninAdi(String baskaninAdi) {
        this.baskaninAdi = baskaninAdi;
        System.out.println(this.baskaninAdi);

    }
    
    void ikinciSinifDegerYazdir(){
        System.out.println(this.baskaninAdi);
        System.out.println(this.ilSayisi);
        System.out.println(this.ulkeAdi);
        
    }
    
    
}
