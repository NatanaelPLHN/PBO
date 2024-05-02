public class TugasPriority extends ToDoList {
    private int id;
    private String tugas;
    private String deskripsi;
    private String tenggat;
    private boolean status;

    public TugasPriority(int id, String tugas, String deskripsi, String tenggat, boolean status) {
        this.id = id;
        this.tugas = tugas;
        this.deskripsi = deskripsi;
        this.tenggat = tenggat;
        this.status = status;
    }

    @Override
    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Tugas: " + tugas);
        System.out.println("Deskripsi: " + deskripsi);
        System.out.println("Tenggat: " + tenggat);
        System.out.println("Status: " + (status? "Done" : "Not Done"));
    }

    @Override
    public void set_status(boolean status) {
        this.status = status;
    }

}