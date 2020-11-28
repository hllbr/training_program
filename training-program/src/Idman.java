
public class Idman {
    private int burpee_sayısı ;
    private int pushup_sayısı ;
    private int situp_sayısı ;
    private int squat_sayısı ;
    private int plank_sayısı ;
    private int core ;
    private int mekik_sayısı ;

    public Idman(int burpee_sayısı, int pushup_sayısı, int situp_sayısı, int squat_sayısı, int plank_sayısı, int core, int mekik_sayısı) {
        this.burpee_sayısı = burpee_sayısı;
        this.pushup_sayısı = pushup_sayısı;
        this.situp_sayısı = situp_sayısı;
        this.squat_sayısı = squat_sayısı;
        this.plank_sayısı = plank_sayısı;
        this.core = core;
        this.mekik_sayısı = mekik_sayısı;
    }

    public int getBurpee_sayısı() {
        return burpee_sayısı;
    }

    public void setBurpee_sayısı(int burpee_sayısı) {
        this.burpee_sayısı = burpee_sayısı;
    }

    public int getPushup_sayısı() {
        return pushup_sayısı;
    }

    public void setPushup_sayısı(int pushup_sayısı) {
        this.pushup_sayısı = pushup_sayısı;
    }

    public int getSitup_sayısı() {
        return situp_sayısı;
    }

    public void setSitup_sayısı(int situp_sayısı) {
        this.situp_sayısı = situp_sayısı;
    }

    public int getSquat_sayısı() {
        return squat_sayısı;
    }

    public void setSquat_sayısı(int squat_sayısı) {
        this.squat_sayısı = squat_sayısı;
    }

    public int getPlank_sayısı() {
        return plank_sayısı;
    }

    public void setPlank_sayısı(int plank_sayısı) {
        this.plank_sayısı = plank_sayısı;
    }

    public int getCore() {
        return core;
    }

    public void setCore(int core) {
        this.core = core;
    }

    public int getMekik_sayısı() {
        return mekik_sayısı;
    }

    public void setMekik_sayısı(int mekik_sayısı) {
        this.mekik_sayısı = mekik_sayısı;
    }
   public void hareket_yap(String hareketTuru,int sayı){
        if(hareketTuru.equals("burpee")){
           burpeeYap(sayı);
       }else if(hareketTuru.equals("pushup")){
           pushupYap(sayı);
       }else if(hareketTuru.equals("situp")){
           situpYap(sayı);
       }else if(hareketTuru.equals("squat")){
           squatYap(sayı);
       }else if(hareketTuru.equals("plank")){
           plankYap(sayı);
       }else if(hareketTuru.equals("core")){
           coreYap(sayı);
       }else if(hareketTuru.equals("mekik")){
           mekikYap(sayı);
       }else{
           System.out.println("Geçersiz Yanlış yada Hatalı Tuşlama yaptınız...");
       }
   }
   //burpeeYap
   public void burpeeYap(int sayı){
       if(burpee_sayısı == 0){
           System.out.println("Yapılacak Burpee kalmadı...");
       }
       if(burpee_sayısı -sayı < 0){
           System.out.println("Hedeflediğin Burpee sayısını geçtiğin için Tebrik ederiz.");
           burpee_sayısı = 0;
           System.out.println("Kalan Burpee Sayısı : " +burpee_sayısı);
       }else {
           burpee_sayısı -=sayı;
           System.out.println("Kalan burpee Sayısı : " +burpee_sayısı);
       }
   }
   //pushupYap
    public void pushupYap(int sayı){
       if(pushup_sayısı == 0){
           System.out.println("Yapılacak pushup kalmadı...");
       }
       if(pushup_sayısı -sayı < 0){
           System.out.println("Hedeflediğin pushup sayısını geçtiğin için Tebrik ederiz.");
           pushup_sayısı = 0;
           System.out.println("Kalan pushup Sayısı : " +pushup_sayısı);
       }else {
           pushup_sayısı -=sayı;
           System.out.println("Kalan pushup Sayısı : " +pushup_sayısı);
       }
   }
      //situpYap
    public void situpYap(int sayı){
       if(situp_sayısı == 0){
           System.out.println("Yapılacak situp kalmadı...");
       }
       if(situp_sayısı -sayı < 0){
           System.out.println("Hedeflediğin situp sayısını geçtiğin için Tebrik ederiz.");
           situp_sayısı = 0;
           System.out.println("Kalan situp Sayısı : " +situp_sayısı);
       }else {
           situp_sayısı -=sayı;
           System.out.println("Kalan situp Sayısı : " +situp_sayısı);
       }
   }
    public void squatYap(int sayı){
       if(squat_sayısı == 0){
           System.out.println("Yapılacak squat kalmadı...");
       }
       if(squat_sayısı -sayı < 0){
           System.out.println("Hedeflediğin squat sayısını geçtiğin için Tebrik ederiz.");
           squat_sayısı = 0;
           System.out.println("Kalan squat Sayısı : " +squat_sayısı);
       }else {
           squat_sayısı -=sayı;
           System.out.println("Kalan squat Sayısı : " +squat_sayısı);
       }
   }
    public void plankYap(int sayı){
       if(plank_sayısı == 0){
           System.out.println("Yapılacak plank kalmadı...");
       }
       if(plank_sayısı -sayı < 0){
           System.out.println("Hedeflediğin plank sayısını geçtiğin için Tebrik ederiz.");
           plank_sayısı = 0;
           System.out.println("Kalan plank Sayısı : " +plank_sayısı);
       }else {
           plank_sayısı -=sayı;
           System.out.println("Kalan plank Sayısı : " +plank_sayısı);
       }
   }
    public void coreYap(int sayı){
       if(core == 0){
           System.out.println("Yapılacak core kalmadı...");
       }
       if(core -sayı < 0){
           System.out.println("Hedeflediğin core sayısını geçtiğin için Tebrik ederiz.");
           core = 0;
           System.out.println("Kalan core Sayısı : " +core);
       }else {
           core -=sayı;
           System.out.println("Kalan core Sayısı : " +core);
       }
   }
    //mekikYap
        public void mekikYap(int sayı){
       if(mekik_sayısı == 0){
           System.out.println("Yapılacak mekik kalmadı...");
       }
       if(mekik_sayısı -sayı < 0){
           System.out.println("Hedeflediğin mekik sayısını geçtiğin için Tebrik ederiz.");
           mekik_sayısı = 0;
           System.out.println("Kalan mekik Sayısı : " +mekik_sayısı);
       }else {
           mekik_sayısı -=sayı;
           System.out.println("Kalan mekik Sayısı : " +mekik_sayısı);
       }
   }
        public boolean idmanBittiMi(){
     
            return  (burpee_sayısı == 0) && (pushup_sayısı == 0) && (situp_sayısı == 0) && (squat_sayısı == 0) && (plank_sayısı == 0) && (core == 0) && (mekik_sayısı == 0);
        }
    
}
