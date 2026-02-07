import java.util.ArrayList;
import java.util.Scanner;

public class OyunMotoru {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Kahraman> kahramanlar = new ArrayList<>();
        ArrayList<Canavar> dusmanlar = new ArrayList<>();

        System.out.println("Kaç kahramanla gireceksin? ");
        int a = s.nextInt();
        for(int i = 0;i<a;i++){
            System.out.println((i+1) + " 1: Savaşçı , 2: Büyücü");
            int secim = s.nextInt();
            System.out.print("Kahramanın adı: ");
            String ad = s.next();
            if(secim==1){
                kahramanlar.add(new Savasci(ad));

            }else{
                kahramanlar.add(new Buyucu(ad));
            }


        }
        
        for(int i = 0;i<=3;i++){
        int rastgele = (int)(Math.random() * 2);
        if(rastgele == 0){
            dusmanlar.add(new Zombi("Zombi " + i));

        }else{
            dusmanlar.add(new Vampir("Vampir " + i));
        }


        }
        int turSayisi = 1;
        
        while(!kahramanlar.isEmpty() && !dusmanlar.isEmpty()){
            System.out.println("\n---TUR" + turSayisi + " ---");

            for(Kahraman k : kahramanlar){
                if(dusmanlar.isEmpty()){
                    break;

                }
                Canavar hedef = dusmanlar.get(0);
                System.out.println("\nSıra: " + k.getIsim() + " (Can: " + k.getCan() + ")");
                System.out.println("Hedef: " + hedef.getIsim() + " (Can: " + hedef.getCan() + ")");
                System.out.println("1-Saldır | 2-Özel Yetenek | 3-İyileş");
                int hamle = s.nextInt();

                if(hamle == 1){
                    k.saldir(hedef);

                }else if(hamle==2){
                    if(k instanceof Savasci){
                        ((Savasci)k).kalkanVurusu(hedef);

                    }else if(k instanceof Buyucu){
                        ((Buyucu)k).atesTopu(hedef);
                    }

                }

                    else if(hamle ==3){
                        k.iyiles();
                    }

                    if(!hedef.isHayattaMi()){
                        dusmanlar.remove(hedef);
                        System.out.println("Bir düşman öldü.");
                    }

            }
            kahramanlar.removeIf(h->!h.isHayattaMi());

            if(!dusmanlar.isEmpty() && !kahramanlar.isEmpty()){
                System.out.println("\n--- DÜŞMAN SALDIRISI ---" );
                for(Canavar c : dusmanlar){
                    if(kahramanlar.isEmpty()){
                        break;
                    }
                    int rastgeleIndex = (int)(Math.random()*kahramanlar.size());
                    Kahraman kurban = kahramanlar.get(rastgeleIndex);

                    c.saldir(kurban);
                }

            }
            kahramanlar.removeIf(h->!h.isHayattaMi());
            turSayisi++;
        }
        System.out.println("\n=========================");
        if (kahramanlar.isEmpty()) {
            System.out.println("Kaybettiniz.");
        } else {
            System.out.println("Kazandınız, tüm canavarlar temizlendi.");
        }

        s.close();
    }
}