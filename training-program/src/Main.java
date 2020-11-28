
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("İdman Programına Hoşgeldiniz");
        String idmanlar = "Geçerli Hareketler\n"
                + "burpee\n"
                + "pushup\n"
                + "situp\n"
                + "squat\n"
                + "plank\n"
                + "core\n"
                + "mekik\n";
        System.out.println("***************************************************");
        System.out.println(idmanlar);
        System.out.println("***************************************************");
        System.out.println("Lütfen bir idman oluşturun...");
        System.out.println("***************************************************");

        System.out.println("burpee = ");
        int burpee = scn.nextInt();
        System.out.println("*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*");

        System.out.println("pushup= ");
        int pushup = scn.nextInt();
        System.out.println("*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*");

        System.out.println("situp = ");
        int situp = scn.nextInt();
        System.out.println("*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*");
        
        System.out.println("squat = ");
        int squat = scn.nextInt();
        System.out.println("*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*");
        
        System.out.println("plank = ");
        int plank = scn.nextInt();
        System.out.println("*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*");
                
        System.out.println("core = ");
        int core = scn.nextInt();
        System.out.println("*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*");
                
        System.out.println("mekik = ");
        int mekik = scn.nextInt();
        scn.nextLine();
        System.out.println("*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*");
        Idman idman = new Idman(burpee, pushup, situp, squat, plank, core, mekik);
        System.out.println("İdmanınız Başlıyor...!!!");
        while(idman.idmanBittiMi() == false){
            System.out.println("Haraket Türü(burpee,pushup,situp,squat,plank,core,mekik : ");
            String tur = scn.nextLine();
            System.out.println("Bu hareketten kaç tane yapacaksınız : ");
            int sayı = scn.nextInt();
            scn.nextLine();
            idman.hareket_yap(tur, sayı);
        
        }

    }
    
}
