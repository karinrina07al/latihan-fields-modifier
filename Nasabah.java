
public class nasabah {
    private String  namaNasabah;
    private int saldo;
    private String pesan;
    int noUrut=0;
    
    public void nasabah(String nama){
        namaNasabah=nama;
        System.out.println("Nama Nasabah : " + namaNasabah);
    }
    public int  tabungan(int jumlah){
        return saldo=saldo+jumlah;
    }
     public int getSaldo(){
        return saldo;
    }
     public String getPesan(){
         return pesan;
     }
    public int ambilUang(int uang){
        if(saldo- uang < 50 ){
            System.out.println("Maaf Tidak Ada Saldo.");
            return saldo;
        }else{
            System.out.println("Penarikan " + uang + " sukses.");
            noUrut++;
           return saldo-=uang;
        }
        
    }
     public int ambilUang(int uang, String isi){
        if(saldo - uang < 50 ){
            System.out.println("Maaf Tidak Ada Saldo.");
            return saldo;
        }else{
            System.out.println("Penarikan " + uang + " sukses.");
            noUrut++;
            pesan=isi;
           return saldo-=uang;
           
        }
        
    }
   
}
