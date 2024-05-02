abstract class ToDoList {
    private int id;
    protected int prioritas; 
    private String judul, deskripsi, tenggat;
    private boolean status;

    public ToDoList(int id, String judul, String deskripsi, String tenggat, boolean status) {
        this.id = id;
        this.judul = judul;
        this.deskripsi = deskripsi;
        this.tenggat = tenggat;
        this.status = status;
    }

    // Getter methods
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

    public boolean get_status() {
        return status;
    }

    public int get_prioritas() {
        return prioritas;
    }

    // Setter methods
    public void set_judul(String judul) {
        this.judul = judul;
    }

    public void set_deskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public void set_tenggat(String tenggat) {
        this.tenggat = tenggat;
    }

    public void set_id(int id) {
        this.id = id;
    }

    public void set_status(boolean status) {
        this.status = status;
    }
    
    public abstract void set_prioritas(int prioritas);

    public void display() {
        System.out.println("ID Tugas        :\t" + this.id);
        System.out.println("Judul Tugas     :\t" + this.judul);
        System.out.println("Deskripsi Tugas :\t" + this.deskripsi);
        System.out.println("Tenggat  Tugas  :\t" + this.tenggat);

        if (status == true) {
            System.out.println("Status Tugas    :\t Selesai!");
        } else {
            System.out.println("Status Tugas    :\t Belum selesai");
        }
    }
}