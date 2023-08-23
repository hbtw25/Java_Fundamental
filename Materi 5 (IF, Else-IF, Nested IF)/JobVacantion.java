import java.util.Scanner;
public class JobVacantion {
public static void main(String[] args) {
//Deklarasi variable yang diperlukan.
int umur, pengalaman;
double penampilan;
String lulusan, nama, jeniskelamin;
boolean reqKoorl, reqKoor2, reqAdmin1, reqAdmin2;
boolean isPassingKoor, isPassingAdmin;
Scanner input = new Scanner (System.in);
//Buat output Text yang dibutuhkan
System.out.println ("Selamat datang di PT Semut 79");
System.out.println("==============================\n");
System.out.println("Silahkan input Data Anda");
System.out.println("Nama : ");
nama = input.next();
System.out.println ("Umur : ");
umur = input.nextInt();
System.out.println ("JenisKelamin (Pria/Wanita) :");
jeniskelamin = input.next();
System.out.println("Luluusan (SMK/D3/S1) : ");
lulusan = input.next();
System.out.println("Pengalaman : ");
pengalaman = input.nextInt();
System.out.println("Penampilan : ");
penampilan = input.nextDouble();
    //pengecakan data untuk persyaratan koordinator
    /* 
        Pria
        umur minimal 21 tahun dan maksimal 30 tahun
        lulusan SMK/D3
        Memiliki Pengalaman Minimal 2 tahun
        
        atau

        Pria
        umur 30 tahun keatas
        lulusan S1
        Memiliki pengalaman minial 5 tahun
    */
    reqKoorl = jeniskelamin.equalsIgnoreCase ("Pria") && umur >= 21 && umur <=30 && (lulusan.equalsIgnoreCase ("SMK") || lulusan.equalsIgnoreCase ("D3")) && pengalaman >= 2;
    reqKoor2 = jeniskelamin.equalsIgnoreCase ("Pria") && umur > 30 && (lulusan.equalsIgnoreCase ("S1")) && pengalaman >= 5;
    //Hasil koordinator
    isPassingKoor = reqKoorl || reqKoor2 ;

        //pengecakan data untuk persyaratan koordinator
    /* 
        Wanita
        umur minimal 20 tahun dan maksimal 25 tahun
        lulusan D3
        Memiliki Penampilan yang menarik atau pengalaman 1 Tahun
        
        atau

        Wanita
        umur 25 tahun keatas
        lulusan S1
        Memiliki Penampilan menarik
        Memiliki penglaman minimal 3 tahun
    */
    reqAdmin1 = jeniskelamin.equalsIgnoreCase ("Wanita") && umur >= 20 && umur <=25 && (lulusan.equalsIgnoreCase ("D3")) && (penampilan >=8.5 || pengalaman >= 1);
    reqAdmin2 = jeniskelamin.equalsIgnoreCase ("Wanita") && umur >25 && (lulusan.equalsIgnoreCase ("S1  ")) && (penampilan >=8.5 || pengalaman >= 3);
    //hasil dari Admin 
    isPassingAdmin = reqAdmin1 || reqAdmin2;
    //membuat output text hasil
    System.out.println();
    System.out.println(nama + "Terima kasih sudah mengikuti Lowongan kerja di PT. Secret semut 79.\n");
    System.out.println("Berikut adalah hasil dari reckrutmen untuk koordinator dan admin :");  
    System.out.println("Hasil kelulusan untuk koordinator :" + isPassingKoor);  
    System.out.println("Hasil kelulusan untuk admin :" + isPassingAdmin);  
}}
