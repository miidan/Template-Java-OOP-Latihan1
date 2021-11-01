import ambilkomponen.inikomponennya;
class Index extends inikomponennya{
    public static void main(String[] args){
        var a  =  new Index();
        String[][] itemnya = {{"Spandek","5","20000"},{"Dryfit","10","35000"},{"Katun","10","25000"}};
        a.line();
        a.ViewHeader("Toko Kain");
        a.line();
        for (int i = 0; i < itemnya.length; i++) {
            a.setter(itemnya[i][0],itemnya[i][1],itemnya[i][2]);
            System.out.println("Jenis Kain : "+a.getterJenis());
            System.out.println("Stock Kain : "+a.getterStok());
            System.out.println("Harga Permeter : "+a.getterHarga());
            System.out.println("Total Harga : "+a.getterToga());
            a.line();
        }
        a.line();
        System.out.println("Total Keseluruhan: "+a.getterTosel());
        a.line();
    }
} 