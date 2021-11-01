package ambilkomponen;



// import java.util.function.Function;

public class inikomponennya {
    private String jenis;
    private int toga,stok, harga, tosel;
    public void ViewHeader(String header) {
        System.out.println("---------- "+header+" ----------");
    }
    public void line() {
        System.out.println("-------------------------------------");
    }
    public void setter(String jenis, String stok, String harga) {
        this.jenis = jenis;
        this.stok =  Integer.parseInt(stok);
        this.harga = Integer.parseInt(harga);
        this.toga = Integer.parseInt(stok) * Integer.parseInt(harga);
        this.tosel +=this.toga;
    }
    public String getterJenis() {
        return this.jenis;
    }
    public int getterStok() {
        return this.stok;
    }
    public int getterHarga() {
        return this.harga;
    }
    public int getterToga() {
        return this.toga;
    }
    public int getterTosel() {
        return this.tosel;
    }

}