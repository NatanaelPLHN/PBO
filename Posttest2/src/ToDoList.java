public class ToDoList {

    private int id;
    private String judul, deskripsi, tenggat;
    private boolean selesai;

    public ToDoList(int id, String judul, String deskripsi, String tenggat, boolean selesai) {
        this.id = id;
        this.judul = judul;
        this.deskripsi = deskripsi;
        this.tenggat = tenggat;
        this.selesai = selesai;
    }

    // getter
    public String get_judul() {
        return judul;
    }

    public String get_deskripsi() {
        return deskripsi;
    }

    public String get_tenggat() {
        return tenggat;
    }

    public int get_id() {
        return id;
    }

    public boolean get_selesai() {
        return selesai;
    }

    // setter
    public void set_judul(String judul){
        this.judul = judul;
    }
    public void set_deskripsi(String deskripsi){
        this.deskripsi = deskripsi;
    }
    public void set_tenggat(String tenggat){
        this.tenggat = tenggat;
    }
    public void set_id(int id){
        this.id = id;
    }
    public void set_selesai(boolean selesai){
        this.selesai = selesai;
    }

    void display() {
        System.out.println("ID Tugas        :\t" + this.id);
        System.out.println("Judul Tugas     :\t" + this.judul);
        System.out.println("Deskripsi Tugas :\t" + this.deskripsi);
        System.out.println("Tenggat  Tugas  :\t" + this.tenggat);
        System.out.println("Status Tugas    :\t" + this.selesai);
    }

    public int getId() {
        return this.id;
    }
}