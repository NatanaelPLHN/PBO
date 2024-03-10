public class ToDoList {
    int id;
    String judul;
    String deskripsi;
    String tenggat;
    boolean selesai;

    public ToDoList(int dataId, String dataTugas, String dataDeskripsi, String dataTenggat, boolean dataSelesai){
        this.id = dataId;
        this.judul = dataTugas;
        this.deskripsi = dataDeskripsi;
        this.tenggat = dataTenggat;
        this.selesai = dataSelesai;
    }

    void display(){
        System.out.println("ID Tugas        :\t" + this.id);
        System.out.println("Judul Tugas     :\t" + this.judul);
        System.out.println("Deskripsi Tugas :\t" + this.deskripsi);
        System.out.println("Tenggat  Tugas  :\t" + this.tenggat);
        System.out.println("Status Tugas    :\t" +  this.selesai);
    }

    public int getId(){
        return this.id;
    }
}