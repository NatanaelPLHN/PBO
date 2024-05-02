class TugasBiasa extends ToDoList {

    public TugasBiasa(int id, String judul, String deskripsi, String tenggat, boolean status) {
        super(id, judul, deskripsi, tenggat, status);
        set_prioritas(2);
    }

    @Override
    public void set_prioritas(int prioritas) {
        this.prioritas = prioritas;
    }
}