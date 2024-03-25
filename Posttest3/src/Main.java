import java.io.*;
import java.util.*;

public class Main {
    private static InputStreamReader p = new InputStreamReader (System.in);
    private static BufferedReader input = new BufferedReader(p);
    private static ArrayList<ToDoList> DataToDoList = new ArrayList<ToDoList>();

    public static void main(String[] args) throws NumberFormatException, IOException {
        while (true){
            System.out.println("\nPilih Menu!");
            System.out.println("===========");
            System.out.println("1.Buat Tugas");
            System.out.println("2.Lihat Tugas");
            System.out.println("3.Ubah Tugas");
            System.out.println("4.Hapus Tugas");
            System.out.println("5.Ubah Status");
            System.out.println("6.Exit\n");
            int pilih = Integer.parseInt(input.readLine());
            switch (pilih) {
                case 1:
                    buatTugas();
                    break;
                case 2:
                    lihatTugas();
                    break;
                case 3:
                    ubahTugas();
                    break;
                case 4:
                    hapusTugas();
                    break;
                case 5:
                    ubahStatus();
                    break;
                case 6:
                System.out.println("Program Selesai!");
                System.exit(0);
                    break;
                default:
                System.out.println("Pilihan tidak valid");
                    break;
            }
        }
    }

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
            System.out.print("A1");
            PriorityToDoList tdl = new PriorityToDoList(id, tugas, deskripsi, tenggat, false);
            DataToDoList.add(tdl);
        }else{
            System.out.print("B2");
            ToDoList tdl = new ToDoList(id, tugas, deskripsi, tenggat, false);
            DataToDoList.add(tdl);
        }
    }
    
    // Read/Display/Lihat data
    protected static void lihatTugas() {
        for(int i = 0; i<DataToDoList.size(); i++){
            DataToDoList.get(i).display();
            System.out.println("\n");
        }
    }
    
    // // Update/ubah/ganti data baru
    static void ubahTugas() throws IOException {
        lihatTugas();
        System.out.print("Masukkan ID tugas yang ingin di ubah : ");
        int targetId = Integer.parseInt(input.readLine()) - 1;

        System.out.print("Masukkan judul tugas baru     : ");
        String judulBaru = input.readLine();
        DataToDoList.get(targetId).set_judul(judulBaru);
        System.out.print("Masukkan deskripsi tugas baru : ");
        String deskripsiBaru = input.readLine();
        DataToDoList.get(targetId).set_deskripsi(deskripsiBaru);
        System.out.print("Masukkan tenggat tugas baru   : ");
        String tenggatBaru = input.readLine();
        DataToDoList.get(targetId).set_tenggat(tenggatBaru);
        System.out.println("Data berhasil di ubah!");
    }

    // Delete/Hapus data
    static void hapusTugas() throws IOException {
        lihatTugas();
        System.out.print("Masukkan ID tugas yang ingin di hapus : ");
        int targetId = Integer.parseInt(input.readLine()) - 1;

        DataToDoList.remove(targetId);    
        System.out.println("Data berhasil di hapus!");
    }

    static void ubahStatus() throws IOException {
        lihatTugas();
        System.out.print("Masukkan ID tugas yang ingin di ubah statusnya : ");
        int targetId = Integer.parseInt(input.readLine()) - 1;

        DataToDoList.get(targetId).set_status(true);
    }
    
}