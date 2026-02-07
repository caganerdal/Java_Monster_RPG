public class Buyucu extends Kahraman {
    public Buyucu(String isim){
        super(isim, 100, 10, 150);
    }
    @Override
    public void saldir(OyunKarakteri hedef){
        int sayi = (int)(Math.random()*101);

        if(sayi<30){
            hedef.hasarAl((int)(guc*1.5));
        }else{
            super.saldir(hedef);
        }
    }

    public void atesTopu(OyunKarakteri hedef){
        int manaBedeli = 50;
        if(mana>=50){
            this.mana -= manaBedeli;
            hedef.hasarAl(80);
        }else{
            saldir(hedef);
        }
    }
    
}
