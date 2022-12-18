import java.util.Scanner;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) throws Exception {

        System.out.println("Bir şirketteki üç mertebeden birer çalışanın bilgileri girilmiştir...");
        ArrayList<Hademe> HademeListesi = new ArrayList<>();
        ArrayList<Yonetici> YoneticiListesi = new ArrayList<>();
        ArrayList<Sekreter> SekreterListesi = new ArrayList<>();


        Scanner input = new Scanner(System.in);
        Personel_Islemleri islem = new Personel_Islemleri();

        Hademe h1 = new Hademe("Elif",4500,40);
        System.out.println("Hademe bilgileri");
        h1.bilgi_goster();
        HademeListesi.add(h1);

        Yonetici y1 = new Yonetici( "Nilay",12000, 20 );
        System.out.println("Yönetici bilgileri");
        y1.bilgi_goster();
        YoneticiListesi.add(y1);

        Sekreter s1 = new Sekreter("Ayşe",5400,28);
        System.out.println("Sekreter bilgileri");
        s1.bilgi_goster();
        SekreterListesi.add(s1);

        System.out.println("Personel işlemleri : "+ "1-Yönetici " + "2-Hademe " + "3-Sekreter ");
        System.out.println("işlem yapılacak personelin mertebesini giriniz, çıkmak için 0'ı tuşlayınız : " );
        int ilkSecim = input.nextInt();

        while (ilkSecim!=0){
            if (ilkSecim==1){
                System.out.println("Yönetici mertebesindeki personel için işlem seçiniz : " + "1-Ekleme " + "2-Silme " + "3-Güncelleme");
                int ikinciSecim=input.nextInt();

                if(ikinciSecim==1){
                    System.out.println("Eklenecek kişinin adını maaşını ve yaşını srıasıyla giriniz : ");
                    String ad = input.next();
                    input.nextLine();
                    int maas = input.nextInt();
                    int yas = input.nextInt();
                    YoneticiListesi.add(new Yonetici(ad,maas,yas));
                    islem.personel_ekle();

                } else if (ikinciSecim==2) {
                    System.out.println("Silinecek kişinin adını giriniz");
                    String ad = input.next();
                    input.nextLine();
                    for (int i = 0; i < YoneticiListesi.size(); i++) {
                        if(ad.equals(YoneticiListesi.get(i).getIsim())){
                            YoneticiListesi.remove(i);
                            islem.personel_sil();
                        }
                    }
                }

                else {
                    System.out.println("Guncellenecek kişinin adını giriniz");
                    String ad = input.next();
                    input.nextLine();
                    for (int i = 0; i < YoneticiListesi.size(); i++) {
                        if(ad.equals(YoneticiListesi.get(i).getIsim())){
                            System.out.println("Yeni yaş ve maaşı sırasıyla giriniz");
                            int yas = input.nextInt();
                            int maas = input.nextInt();
                            YoneticiListesi.get(i).setYas(yas);
                            YoneticiListesi.get(i).setMaas(maas);

                        }
                    }
                }
            }
            else if(ilkSecim==2){
                System.out.println("Hademe mertebesindeki personel için işlem seçiniz : " + "1-Ekleme " + "2-Silme " + "3-Güncelleme ");
                int ikinciSecim=input.nextInt();

                if(ikinciSecim==1){
                    System.out.println("Eklenecek kişinin adını maaşını ve yaşını srıasıyla giriniz : ");
                    String ad = input.next();
                    input.nextLine();
                    int maas = input.nextInt();
                    int yas = input.nextInt();
                    HademeListesi.add(new Hademe(ad,maas,yas));
                    islem.personel_ekle();
                }
                else if (ikinciSecim==2) {
                    System.out.println("Silinecek kişinin adını giriniz");
                    String ad = input.next();
                    input.nextLine();
                    for (int i = 0; i < HademeListesi.size(); i++) {
                        if(ad.equals(HademeListesi.get(i).getIsim())){
                            HademeListesi.remove(i);
                            islem.personel_sil();
                        }
                    }
                }

                else {
                    System.out.println("Guncellenecek kişinin adını giriniz");
                    String ad = input.next();
                    input.nextLine();
                    for (int i = 0; i < HademeListesi.size(); i++) {
                        if(ad.equals(HademeListesi.get(i).getIsim())){
                            System.out.println("Yeni yaş ve maaşı sırasıyla giriniz");
                            int yas = input.nextInt();
                            int maas = input.nextInt();
                            HademeListesi.get(i).setYas(yas);
                            HademeListesi.get(i).setMaas(maas);

                        }
                    }
                }
            }
            else {
                System.out.println("Sekreter mertebesindeki personel için işlem seçiniz : " + "1-Ekleme " + "2-Silme " + "3-Güncelleme ");
                int ikinciSecim=input.nextInt();

                if(ikinciSecim==1){
                    System.out.println("Eklenecek kişinin adını maaşını ve yaşını srıasıyla giriniz : ");
                    String ad = input.next();
                    input.nextLine();
                    int maas = input.nextInt();
                    int yas = input.nextInt();
                    SekreterListesi.add(new Sekreter(ad,maas,yas));
                    islem.personel_ekle();


                } else if (ikinciSecim==2) {
                    System.out.println("Silinecek kişinin adını giriniz");
                    String ad = input.next();
                    input.nextLine();
                    for (int i = 0; i < SekreterListesi.size(); i++) {
                        if(ad.equals(SekreterListesi.get(i).getIsim())){
                            SekreterListesi.remove(i);
                            islem.personel_sil();
                        }
                    }
                }

                else {
                    System.out.println("Guncellenecek kişinin adını giriniz");
                    String ad = input.next();
                    input.nextLine();
                    for (int i = 0; i < SekreterListesi.size(); i++) {
                        if(ad.equals(SekreterListesi.get(i).getIsim())){
                            System.out.println("Yeni yaş ve maaşı sırasıyla giriniz");
                            int yas = input.nextInt();
                            int maas = input.nextInt();
                            SekreterListesi.get(i).setYas(yas);
                            SekreterListesi.get(i).setMaas(maas);

                        }
                    }
                }
            }
            System.out.println("Personel işlemleri : "+ "1-Yönetici " + "2-Hademe " + "3-Sekreter ");
            System.out.println("işlem yapılacak personelin mertebesini giriniz, çıkmak için 0'ı tuşlayınız : " );
            ilkSecim = input.nextInt();
        }



        System.out.println("Yeni yönetici listesi : ");
        for (int i = 0; i < YoneticiListesi.size(); i++) {
            System.out.println((i+1)+". "+YoneticiListesi.get(i).getIsim());
        }

        System.out.println("Yeni hademe listesi : ");
        for (int i = 0; i < HademeListesi.size(); i++){
            System.out.println((i+1)+". "+ HademeListesi.get(i).getIsim());
        }
        System.out.println("Yeni sekreter listesi : ");
        for (int i = 0; i < SekreterListesi.size(); i++) {
            System.out.println((i+1)+". "+ SekreterListesi.get(i).getIsim());
        }

        System.out.println("Personellere zam yapmak isterseniz 7'yi tuşlayınız : ");
        int zam_istegi = input.nextInt();

        if (zam_istegi==7){
            System.out.println("Hangi personele zam yapmak istediğinizi seçiniz : "+"1-Yönetici " + "2-Hademe " + "3-Sekreter ");
            int zamlı_personel = input.nextInt();

            if(zamlı_personel==1){
                try {
                    System.out.println("Yöneticinin maaşına yapılacak zam miktarını giriniz : ");
                    int yeniMaas= input.nextInt()+ h1.getMaas();
                    System.out.println("Yöneticinin yeni maaşı : " + yeniMaas);
                }
                catch (Exception e){
                    System.out.println("Hatalı giriş yaptınız yeniden giriniz");
                }
            }
            if(zamlı_personel==2){
                try {
                    System.out.println("Hademenin maaşına yapılacak zam miktarını giriniz : ");
                    int yeniMaas= input.nextInt()+ h1.getMaas();
                    System.out.println("Hademenin yeni maaşı : " + yeniMaas);
                }
                catch (Exception e){
                    System.out.println("Hatalı giriş yaptınız yeniden giriniz");
                }
            }
            else{
                try {
                    System.out.println("Sekreterin maaşına yapılacak zam miktarını giriniz : ");
                    int yeniMaas= input.nextInt()+ h1.getMaas();
                    System.out.println("Sekreterin yeni maaşı : " + yeniMaas);
                }
                catch (Exception e){
                    System.out.println("Hatalo giriş yaptınız yeniden giriniz");
                }
            }

        }

    }

}