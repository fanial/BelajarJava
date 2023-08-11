import java.util.Scanner;

public class JobVacancy {
    public static void main(String[] args){
        //Deklarasi variabel
        int umur, pengalaman;
        double penampilan;
        String lulusan, nama, jk;
        boolean reqKoor1, reqKoor2, reqAdmin1, reqAdmin2;
        boolean isPassingKoor, isPassingAdmin;
        Scanner input = new Scanner(System.in);

        //Input Value
        System.out.println("Selamat Datang di PT. Secret Semut 79");
        System.out.println("====================================");
        System.out.println("Silahkan Input Data Anda");
        System.out.println("Nama    : ");
        nama = input.next();
        System.out.println("Umur    : ");
        umur = input.nextInt();
        System.out.println("Jenis kelamin (P/L): ");
        jk = input.next();
        System.out.println("Lulusan (SMK/D3/S1): ");
        lulusan = input.next();
        System.out.println("Pengalaman: ");
        pengalaman = input.nextInt();
        System.out.println("Penampilan: ");
        penampilan = input.nextDouble();


        //Koor
        reqKoor1 = jk.equalsIgnoreCase("L") && umur >= 21 && umur <= 30 && (lulusan.equalsIgnoreCase("SMK") || lulusan.equalsIgnoreCase("D3")) && pengalaman >= 2;
        reqKoor2 = jk.equalsIgnoreCase("L") && umur > 30 && lulusan.equalsIgnoreCase("S1") && pengalaman >= 5;

        isPassingKoor = reqKoor1 || reqKoor2;

        //Admin
        reqAdmin1 = jk.equalsIgnoreCase("P") && umur >= 20 && umur <= 25 && lulusan.equalsIgnoreCase("D3") && (penampilan >= 8.5 || pengalaman >= 1);
        reqAdmin2 = jk.equalsIgnoreCase("P") && umur > 25 && lulusan.equalsIgnoreCase("S1") &&  penampilan >= 8.5 && pengalaman >= 3;

        isPassingAdmin = reqAdmin1 || reqAdmin2;

        //Hasil
        System.out.println("\n" + nama + " Terimakasih sudah mengikuti lowongan kerja di PT. Secret Semut 79.\n");
        System.out.println("Berikut adalah hasil dari rekrutment untuk Koordinator dan Admin: ");
        System.out.println("Hasil kelulusan untuk Koordinator: " + isPassingKoor);
        System.out.println("Hasil kelulusan untuk Admin: " + isPassingAdmin);
    }
}