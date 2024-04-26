class TugasBiasa extends ToDoList {

    public TugasBiasa(int id, String judul, String deskripsi, String tenggat, boolean status) {
        super(id, judul, deskripsi, tenggat, status);
        setPrioritas(2);
    }

    @Override
    public void setPrioritas(int prioritas) {
        this.prioritas = prioritas;
    }
}