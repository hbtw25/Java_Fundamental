import java.util.Scanner;

public class PassingGradeSMK79{
public static void main ( String [] args) {
int matematika, bhsInggris, bhsIndonesia, ipa; //Variable untuk Menyimpan nilai Ijian.
int passingGradeSMK, passingGradeSastra, passingGradeTIK; //Variablesyarat kelulusan.
boolean isPassingSMK, isPassingSastra, isPassingTIK;
//Variable Bertipe boolean untuk meyimpan hasil ujian
double averageUjian, averageBahasa;
Scanner input = new Scanner (System.in);
//Inisialisasi dulu nilai variable untuk syarat kelulusan
passingGradeSMK = 73;
passingGradeSastra = 75;
passingGradeTIK = 80;
System.out.println("Masukan nilai Ujian Matematika :");
matematika = input.nextInt ();
System.out.println("Masukan nilai Ujian Bhs.Indonesia :");
bhsIndonesia = input.nextInt ();
System.out.println("Masukan nilai Ujian Bhs.Inggris :");
bhsInggris = input.nextInt ();
System.out.println("Masukan nilai Ujian IPA :");
ipa = input.nextInt ();
//menghitung rata-rata nilai ujian
averageUjian = (matematika + bhsIndonesia + bhsInggris + ipa)/4;
//menghitung nilai bahasa
averageBahasa = ( bhsIndonesia + bhsInggris)/2;
//menentukan kelulusan masuk SMK
isPassingSMK = averageUjian >= passingGradeSMK;
//menentukan kelulusan masuk Jurusan sastra 
isPassingSastra = averageBahasa >= passingGradeSastra;
//menentukan kelulusan masuk Jurusan Teknik Komputer Jaringan
isPassingTIK = matematika > passingGradeTIK;
System.out.println("\n\nHasil dari simulasi Untuk Persyartan Penerimaan Siswa Di SMK Padepokan 79 Adalah Sebagai Berikut ;");
System.out.println("=====================================================================================================");
System.out.println("Apakah Anda Memenuhi Syarat Untuk Masuk ke SMK Padepokan 79 :" + isPassingSMK);
System.out.println("Apakah Anda Memenuhi Syarat Untuk Masuk ke Jurusan Sastra :" + isPassingSastra);
System.out.println("Apakah Anda Memenuhi Syarat Untuk Masuk ke Jurusan Teknik Komputer Jaringan :" + isPassingTIK);
}}