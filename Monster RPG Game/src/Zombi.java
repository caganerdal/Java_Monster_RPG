public class Zombi extends Canavar {
    public Zombi(String isim){
        super(isim, 80, 15);

    }
    @Override
    public void hasarAl(int hasar){
        super.hasarAl(hasar);

        if(!hayattaMi){
           int x = (int)(Math.random()*2);
           if(x == 1){
            this.can = 20;
            this.hayattaMi = true;
            System.out.println("Zombi mezardan geri çıktı!");
           }
        }

    }
}
