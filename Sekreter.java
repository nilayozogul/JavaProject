public class Sekreter extends Personel {
    public Sekreter(String isim, int maas, int yas) {
        super(isim, maas, yas);
    }

    @Override
    public void setMertebe(String mertebe) {
        super.setMertebe("Sekreter");
    }
}
