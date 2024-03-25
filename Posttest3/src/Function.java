import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Function {

    private static InputStreamReader p = new InputStreamReader(System.in);
    private static BufferedReader input = new BufferedReader(p);
    private static ArrayList<ToDoList> DataToDoList = new ArrayList<ToDoList>();

    // Create/Buat/Tambah data
    static void buatTugas() throws NumberFormatException, IOException {
        System.out.println("Silahkan Masukkan Data!");
        System.out.println("=======================");

        int id = DataToDoList.size() + 1;
        System.out.print("Masukkan Judul tugas      : ");
        String tugas = input.readLine();
        System.out.print("Masukkan Deskripsi tugas  : ");
        String deskripsi = input.readLine();
        System.out.print("Masukkan Tenggat tugas    : ");
        String tenggat = input.readLine();

        System.out.print("Apakah tugas penting? (Y/N)");
        String urgent = input.readLine().toUpperCase();

        if (urgent.equals("Y")) {
            TugasPriority tdl = new TugasPriority(id, tugas, deskripsi, tenggat, false);
            DataToDoList.add(tdl);
        } else {
            TugasBiasa tdl = new TugasBiasa(id, tugas, deskripsi, tenggat, false);
            DataToDoList.add(tdl);
        }
    }

    // Read/Display/Lihat data
    protected static void lihatTugas() {
        if (DataToDoList.isEmpty()) {
            System.out.println("Data masih kosong!");
        } else {
            for (int i = 0; i < DataToDoList.size(); i++) {
                DataToDoList.get(i).display();
                System.out.println("\n");
            }
        }
    }

    // Update/ubah/ganti data baru
    static void ubahTugas() throws IOException {
        lihatTugas();
        System.out.print("Masukkan ID tugas yang ingin di ubah : ");
        int targetId = Integer.parseInt(input.readLine());

        if (targetId > DataToDoList.size()) {
            System.out.println("Data dengan ID " + targetId + " tidak ditemukan!");
        } else {
            System.out.print("Masukkan judul tugas baru     : ");
            String judulBaru = input.readLine();
            DataToDoList.get(targetId - 1).set_judul(judulBaru);
            System.out.print("Masukkan deskripsi tugas baru : ");
            String deskripsiBaru = input.readLine();
            DataToDoList.get(targetId - 1).set_deskripsi(deskripsiBaru);
            System.out.print("Masukkan tenggat tugas baru   : ");
            String tenggatBaru = input.readLine();
            DataToDoList.get(targetId - 1).set_tenggat(tenggatBaru);
            System.out.println("Data berhasil di ubah!");
        }

    }

    // Delete/Hapus data
    static void hapusTugas() throws IOException {
        lihatTugas();
        System.out.print("Masukkan ID tugas yang ingin di hapus : ");
        int targetId = Integer.parseInt(input.readLine());

        if (targetId > DataToDoList.size()) {
            System.out.println("Data dengan ID " + targetId + " tidak ditemukan!");
        } else {
            DataToDoList.remove(targetId - 1);
            System.out.println("Data berhasil di hapus!");
        }
    }

    static void ubahStatus() throws IOException {
        lihatTugas();
        System.out.print("Masukkan ID tugas yang ingin di ubah statusnya : ");
        int targetId = Integer.parseInt(input.readLine());

        if (targetId > DataToDoList.size()) {
            System.out.println("Data dengan ID " + targetId + " tidak ditemukan!");
        } else {
            boolean currStatus = DataToDoList.get(targetId - 1).get_status();
            DataToDoList.get(targetId - 1).set_status(!currStatus);
        }
    }

}
