import java.util.Scanner;
public class PassingGradeSMK79 {
    public static void main(String[] args){
        int mtk, bhsInggris, bhsIndonesia, ipa; //Nilai Ujian
        int passingGradeSMK, passingGradeSastra, passingGradeTIK; //Nilai Syarat Kelulusan
        boolean isPassingSMK, isPassingSastra, isPassingTIK; //Hasil kelulusan
        double averageUjian, averageBahasa;
        Scanner input = new Scanner(System.in);

        //Inisialisasi
        passingGradeSMK = 73;
        passingGradeSastra = 75;
        passingGradeTIK = 80;

        //Input nilai Ujian
        System.out.println("Masukan nilai ujian Matematika: ");
        mtk = input.nextInt();
        System.out.println("Masukan nilai ujian Bhs. Indonesia: ");
        bhsIndonesia = input.nextInt();
        System.out.println("Masukan nilai ujian Bhs. Inggris: ");
        bhsInggris = input.nextInt();
        System.out.println("Masukan nilai ujian IPA: ");
        ipa = input.nextInt();

        //Hitung nilai rata-rata
        averageUjian = (mtk + bhsIndonesia + bhsInggris + ipa)/4;
        averageBahasa = (bhsIndonesia + bhsInggris)/2;

        //Menetukan hasil kelulusan
        isPassingSMK = averageUjian >= passingGradeSMK;
        isPassingSastra = averageUjian >= passingGradeSastra;
        isPassingTIK = mtk > passingGradeTIK;

        System.out.println("\n\nHasil dari Simulasi untuk Persyaratan Penerimaan Calon Siswa di SMK Padepokan 79 adalah sebagai berikut: ");
        System.out.println("====================================================================================");
        System.out.println("Apakah anda memenuhi syarat untuk masuk di SMK Padepokan 79: " + isPassingSMK);
        System.out.println("Apakah anda memenuhi syarat untuk masuk ke Jurusan Sastra: " + isPassingSastra);
        System.out.println("Apakah anda memenuhi syarat untuk masuk ke Jurusan Teknik Komputer dan Jaringan: " + isPassingTIK);
        

    }
}