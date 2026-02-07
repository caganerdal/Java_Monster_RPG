public class OyunKarakteri {
    protected String isim;
    protected int can;
    protected int guc;
    protected boolean hayattaMi = true;
    

    public OyunKarakteri(String isim, int can, int guc){
        this.isim = isim;
        this.can = can;
        this.guc = guc;
    }

    public String getIsim(){
        return isim;
    }

    public int getCan(){
        return can;
    }

    public boolean isHayattaMi(){
        return hayattaMi;
    }

public void saldir(OyunKarakteri hedef){
    System.out.println(isim + " saldırdı -> " + hedef.getIsim()); 
    hedef.hasarAl(this.guc);
}

public void hasarAl(int miktar){
    this.can -= miktar;
    
    if(this.can < 0) {this.can = 0;} 

    
    System.out.println(isim + " " + miktar + " hasar aldı. (Kalan Can: " + can + ")");

    
    if(this.can <= 0){
        this.hayattaMi = false;
        System.out.println(isim + " öldü.");
    }
}


}
