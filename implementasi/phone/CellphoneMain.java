package implementasi.phone;

public class CellphoneMain {
    public static void main(String[] args){
        Cellphone cp = new Cellphone("Nokia", "3310");
        
        cp.topUpBalance(10000);
        System.out.println("Sisa pulsa: "+cp.getBalance());
        cp.insertContact("Harry", "078123545");
        cp.insertContact("Diana", "081234567890");
        cp.listContact();
        cp.getContact("Harry");
        cp.phoneInfo();

        Smartphone sp = new Smartphone("Samsung", "M10");
        sp.topUpBalance(50000);
        sp.phoneInfo();
    }
}
