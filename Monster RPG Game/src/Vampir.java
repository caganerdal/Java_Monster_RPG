public class Vampir extends Canavar {
    public Vampir(String isim){
        super(isim, 120, 25);
    }


@Override
public void saldir(OyunKarakteri hedef) {
    super.saldir(hedef);
    
    // Sonucu (int) parantezine alarak yuvarla
    this.can += (int)(this.guc * 0.2); 
    
    System.out.println("Vampir kan emdi, canı arttı.");
}
}
