package Tabungan;
public class Tabungan {
    
    private final int saldo;
    
    
    public Tabungan(int saldo) {  
      this.saldo = saldo;
    }

    public int ambilUang (int jumlah){
        return saldo - jumlah;
    }
    
}
