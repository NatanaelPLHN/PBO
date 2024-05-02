import java.io.*;

public final class Main {
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
            final int pilih = Integer.parseInt(input.readLine());
            switch (pilih) {
                case 1:
                    Function.buatTugas();
                    break;
                case 2:
                    Function.lihatTugas();
                    break;
                case 3:
                    System.out.println("\nUbah Berdasarkan?");
                    System.out.println("===========");
                    System.out.println("1.ID Tugas");
                    System.out.println("2.Judul Tugas");
                    int pilih2 = Integer.parseInt(input.readLine());

                    if (pilih2 == 1) {
                        Function.lihatTugas();
                        System.out.print("Masukkan ID tugas yang ingin di ubah : ");
                        int targetId = Integer.parseInt(input.readLine());
                        Function.ubahTugas(targetId);
                        break;
                    }
                    if (pilih2 == 2) {
                        Function.lihatTugas();
                        System.out.print("Masukkan JUDUL tugas yang ingin di ubah : ");
                        String targetJudul = input.readLine();
                        Function.ubahTugas(targetJudul);
                        break;
                    } else {
                        System.out.println("Pilihan tidak valid");
                        break;
                    }
                case 4:
                    System.out.println("\nHapus Berdasarkan?");
                    System.out.println("===========");
                    System.out.println("1.ID Tugas");
                    System.out.println("2.Judul Tugas");
                    int pilih3 = Integer.parseInt(input.readLine());

                    if (pilih3 == 1) {
                        Function.lihatTugas();
                        System.out.print("Masukkan ID tugas yang ingin di hapus : ");
                        int targetId = Integer.parseInt(input.readLine());
                        Function.hapusTugas(targetId);
                        break;
                    }
                    if (pilih3 == 2) {
                        Function.lihatTugas();
                        System.out.print("Masukkan JUDUL tugas yang ingin di hapus : ");
                        String targetJudul = input.readLine();
                        Function.hapusTugas(targetJudul);
                        break;
                    } else {
                        System.out.println("Pilihan tidak valid");
                        break;
                    }
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
