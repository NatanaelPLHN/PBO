public class PriorityToDoList extends ToDoList {

    public PriorityToDoList(int id, String judul, String deskripsi, String tenggat, boolean status){
        super(id, judul, deskripsi, tenggat, status);
    }

    @Override
    public void display() {
        System.out.println("Tugas Prioritas!");
        super.display();
    }

}
