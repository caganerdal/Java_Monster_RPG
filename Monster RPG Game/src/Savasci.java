public class Savasci extends Kahraman {
    public Savasci(String isim){
        super(isim, 150, 20, 60);

    }

@Override
public void hasarAl(int hasar) {
    int netHasar = hasar - 5;
    
    if (netHasar < 0) {
        netHasar = 0;
    }
    
    super.hasarAl(netHasar);
}

    public void kalkanVurusu(OyunKarakteri hedef){
        int manaBedeli = 25;
        if(mana>=25){
            this.mana -= manaBedeli;
            hedef.hasarAl(guc*2);

        }else{
            saldir(hedef);
        }

    }
}
