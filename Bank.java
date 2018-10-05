
public class Bank {

    public static void main(String[] args) {

        final String bank="Bank A";
        System.out.println("Nama Bank : " + bank);

        nasabah n=new nasabah();
        n.nasabah("Karina");
        n.tabungan(10000000);
        n.ambilUang(400000);
        n.ambilUang(50000,"Uang buat beli bunga");

        System.out.println(n.getSaldo());
        System.out.println(n.getSaldo() + "  " + n.getPesan());

        System.out.println();
        nasabah n1=new nasabah();
        n1.nasabah("Ayu");
        n1.tabungan(15500000);
        n1.ambilUang(4000000);
        
        System.out.println("\nTotal Transaksi Ambil Uang : " + n1.noUrut);
        
    }
    
}
