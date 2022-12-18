public class Yonetici extends Personel {

    public Yonetici(String isim, int maas, int yas) {
        super(isim, maas, yas);
    }

    @Override
    public void setMertebe(String mertebe) {
        super.setMertebe("Yonetici");
    }
}
