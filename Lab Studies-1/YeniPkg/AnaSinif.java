package YeniPkg;

import java.util.Scanner;

class BirinciSinif {
    int daireSayisi;
    int katSayisi;
    String apartmanAdi;
    int aidatUcreti;
    

    public BirinciSinif(int daireSayisi, int katSayisi, String apartmanAdi, int aidatUcreti) {
        this.daireSayisi = daireSayisi;
        this.katSayisi = katSayisi;
        this.apartmanAdi = apartmanAdi;
        this.aidatUcreti = aidatUcreti;
    }

    public BirinciSinif(int daireSayisi, int katSayisi, int aidatUcreti) {
        this.daireSayisi = daireSayisi;
        this.katSayisi = katSayisi;
        this.aidatUcreti = aidatUcreti;
    }

    public BirinciSinif() {
        this.daireSayisi = 0;
        this.katSayisi = 0;
        this.apartmanAdi = "YOK";
    }
    
    static void inek(){
        int x = 5;
        System.out.println(x);
    }
    
    void ikinciSinifDegerYazdir(İkinciSinif iks){
        iks.setBaskaninAdi("Joe biden");
        iks.setIlSayisi(53);
        iks.setUlkeAdi("USA");
    }
    
    İkinciSinif ikinciSinifaDegerAta(String ulkeAdi, int ilSayisi, String baskaninAdi){
        İkinciSinif ulke1 = new İkinciSinif("AAB", 12, "KKAK");
        ulke1.setBaskaninAdi(baskaninAdi);
        ulke1.setIlSayisi(ilSayisi);
        ulke1.setUlkeAdi(ulkeAdi);
        
        return ulke1;
    }
    
}


public class AnaSinif {

    public static void main(String[] args) {

        BirinciSinif ev1 = new BirinciSinif(8,4,"Gülüm",200);
        BirinciSinif ev2 = new BirinciSinif(8,4,250); // Overload'lı constructorlar
        BirinciSinif ev3 = new BirinciSinif();
        
        İkinciSinif ulke = new İkinciSinif("AAB", 12, "KKAK");
        
        ev3.ikinciSinifDegerYazdir(ulke);
        
        Scanner scanner = new Scanner(System.in);
        
        BirinciSinif.inek();
        
        İkinciSinif[] ikinciSinifDizisi = new İkinciSinif[10];
        
        for(int i=0; i<10 ; i++){
            
            String k = scanner.nextLine();
            int efe = scanner.nextInt();
            String kk = scanner.nextLine();
            ikinciSinifDizisi[i] = new İkinciSinif(k,  efe , kk);
        }
        
        for (int i=0; i<10 ; i++) {
            ikinciSinifDizisi[i].ikinciSinifDegerYazdir();
            
        }

        
    }
}
