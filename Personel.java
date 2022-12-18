import java.util.Scanner;

public abstract class Personel implements BilgiGoster {
    Scanner input = new Scanner(System.in);
    private String isim;
    private int maas;
    private String mertebe;
    private int yas;

    public Personel(String isim, int maas, int yas) {
        this.setIsim(isim);
        this.setMaas(maas);
        this.setMertebe(mertebe);
        this.setYas(yas);
    }
    @Override
    public void bilgi_goster(){
        System.out.println("İsim: "+ this.getIsim());
        System.out.println("Maaş: "+ this.getMaas());
        System.out.println("Mertebesi: "+ this.getMertebe());
        System.out.println("Yas: "+ this.getYas());
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getMaas() {
        return maas;
    }

    public void setMaas(int maas) {
        this.maas = maas;
    }

    public String getMertebe() {
        return mertebe;
    }

    public void setMertebe(String mertebe) {
        this.mertebe = mertebe;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        if(yas<=0){
            System.out.println("yaş 0'dan büyük olmalı"+"Yaş 18 olarak otomatik eklenmiştir");
            this.yas = 18;
        }
        else{
            System.out.println();
            this.yas = yas;
        }
    }
}
