package Pertemuan10.PolymorfismeDinamis.Gambar;

public class Lingkaran extends Bentuk {
    protected void gambar() {
        System.out.println("subclass -> Menggambar Lingkaran");
    }

    protected void hapus() {
        System.out.println("subclass -> Menghapus Gambar Lingkaran");
    }
}

