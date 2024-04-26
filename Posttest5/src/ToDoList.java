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
    public String getJudul() {
        return judul;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public String getTenggat() {
        return tenggat;
    }

    public int getId() {
        return id;
    }

    public boolean getStatus() {
        return status;
    }

    public int getPrioritas() {
        return prioritas;
    }

    // Setter methods
    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public void setTenggat(String tenggat) {
        this.tenggat = tenggat;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    public abstract void setPrioritas(int prioritas);

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