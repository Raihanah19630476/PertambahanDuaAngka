
package latihan1;


public class RumusBeraksi {
    
    public static void main(String[] args) {
        Rumus r = new Rumus();
       r.getLuasPersegi(0,0);
       r.getLuasPersegiPanjang(0,0);
       RumusSakti rs = new RumusSakti();
       
        System.out.println("Luas Persegi = "+r.getLuasPersegi(12,12));
        System.out.println("Luas Persegi Panjang = "+r.getLuasPersegiPanjang(12,12));
        rs.Kubus(10,10,10);
     
    }
}
