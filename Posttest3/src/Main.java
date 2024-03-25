import java.io.*;

public class Main {
    private static InputStreamReader p = new InputStreamReader(System.in);
    private static BufferedReader input = new BufferedReader(p);

    public static void main(String[] args) throws NumberFormatException, IOException {
        while (true) {
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
                    Function.buatTugas();
                    break;
                case 2:
                    Function.lihatTugas();
                    break;
                case 3:
                    Function.ubahTugas();
                    break;
                case 4:
                    Function.hapusTugas();
                    break;
                case 5:
                    Function.ubahStatus();
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

}