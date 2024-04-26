public class TugasPriority extends ToDoList {

    public TugasPriority(int id, String judul, String deskripsi, String tenggat, boolean status) {
        super(id, judul, deskripsi, tenggat, status);
        setPrioritas(1);
    }

    @Override
    public void display() {
        System.out.println("Tugas Prioritas!");
        super.display();
    }

    @Override
    public void setPrioritas(int prioritas) {
        this.prioritas = prioritas;
    }
}
