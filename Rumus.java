package latihan1;

// Raihanah
// 19630476
// 4M Reguler Pagi Banjarbaru

public class Rumus {
    
  private  int sisi, panjang, lebar; 
  int hasil;
  
    Rumus(int sisi, int panjang, int lebar, int hasil) {
        this.sisi = sisi;
        this.panjang = panjang;
        this.lebar = lebar;
        this.hasil = hasil;
    }
    Rumus() {
      
    } 
    // L = s x s
    int getLuasPersegi(int s, int s2){
       hasil = s * s2;
        return hasil;
    }
     // L = p x l
    int getLuasPersegiPanjang(int p, int l){
         hasil = p * l;
        return hasil;
    }
}
