public class Kahraman extends OyunKarakteri{
   protected int mana;

   public Kahraman(String isim, int can, int guc, int mana){
    super(isim, can, guc);
    this.mana = mana;
   }

   public void iyiles(){
    int manaBedeli = 20;
    int iyilesmeMiktari = 30;
   if(this.mana>=manaBedeli){
    this.can += iyilesmeMiktari;
    this.mana -= manaBedeli;
    System.out.println(isim + "Mana yeterli, 30 can arttırıldı." );
    System.out.println("Kalan mana: " + mana + "\nGüncel can: " + can);
    }else{
        System.out.println("Yeterli mana yok, mana miktarı: " + mana);
    }

   }
}
