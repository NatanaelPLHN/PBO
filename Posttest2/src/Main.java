import java.io.*;
import java.util.*;

public class Main {
    private static InputStreamReader p = new InputStreamReader (System.in);
    private static BufferedReader input = new BufferedReader(p);
    private static ArrayList<ToDoList> DataToDoList = new ArrayList<>();

    public static void main(String[] args) throws NumberFormatException, IOException {
        while (true){
            System.out.println("\nPilih Menu!");
            System.out.println("===========");
            System.out.println("1.Buat Data");
            System.out.println("2.Lihat Data");
            System.out.println("3.Ubah Data");
            System.out.println("4.Hapus Data");
            System.out.println("5.Exit\n");
            int pilih = Integer.parseInt(input.readLine());
            switch (pilih) {
                case 1:
                    buatData();
                    break;
                case 2:
                    lihatData();
                    break;
                case 3:
                    ubahData();
                    break;
                case 4:
                    hapusData();
                    break;
                case 5:
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
    static void buatData() throws NumberFormatException, IOException {
        System.out.println("Silahkan Masukkan Data!");
        System.out.println("=======================");
        
        
        int id = DataToDoList.size() + 1;
        System.out.print("Masukkan Judul tugas      : ");
        String tugas = input.readLine();
        System.out.print("Masukkan Deskripsi tugas  : ");
        String deskripsi = input.readLine();
        System.out.print("Masukkan Tenggat tugas    : ");
        String tenggat = input.readLine();
        ToDoList tdl = new ToDoList(id, tugas, deskripsi, tenggat, false);
        DataToDoList.add(tdl);
        
    }
    
    // Read/Display/Lihat data
    protected static void lihatData() {
        for(int i = 0; i<DataToDoList.size(); i++){
            DataToDoList.get(i).display();
            System.out.println("\n");
        }
    }
    
    // // Update/ubah/ganti data baru
    static void ubahData() throws IOException {
        lihatData();
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
        DataToDoList.get(targetId).set_tenggat(tenggatBaru);;
        System.out.println("Data berhasil di ubah!");
    }

    // Delete/Hapus data
    static void hapusData() throws IOException {
        lihatData();
        System.out.print("Masukkan ID tugas yang ingin di hapus : ");
        int targetId = Integer.parseInt(input.readLine()) - 1;

        DataToDoList.remove(targetId);    
        System.out.println("Data berhasil di hapus!");
    }
    
}