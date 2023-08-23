import java.util.Scanner;
public class JobVacancy{
    public static void main( String [] args){
        //deklarasi variable yang diperlukan
        int umur, pengalaman;
        double penampilan;
        String lulusan,nama,jeniskelamin,posisi,hasil;
        boolean reqKoor1,reqKoor2,reqAdmin1,reqAdmin2,reqAdmin3,reqSpv1,reqSpv2;
        Scanner input = new Scanner(System.in);

        System.out.println ("Selamat datang di PT Semut 79");
        System.out.println("==============================\n");
        System.out.println("Silahkan input Data Anda");
        System.out.println("Nama : ");
        nama = input.next();
        System.out.println ("Umur : ");
        umur = input.nextInt();
        System.out.println ("JenisKelamin (Pria/Wanita) :");
        jeniskelamin = input.next();
        System.out.println("Lulusan (SMK/D3/S1) : ");
        lulusan = input.next();
        System.out.println("Pengalaman (tahun): ");
        pengalaman = input.nextInt();
        System.out.println("Penampilan(1 s.d 10) : ");
        penampilan = input.nextDouble();
        System.out.println("Posisi uang dilamar (SPV,Admin,atau Koordinator) : ");
        posisi = input.next();
        //Kodisi if untuk menentukan posisi yang dipilih
        if(posisi.equalsIgnoreCase("Koordinator")){
            //Membuat kondisi setiap koordinator
            reqKoor1 = jeniskelamin.equalsIgnoreCase("Pria") && umur >=21 && umur <=30 && (lulusan.equalsIgnoreCase("SMK")|| lulusan.equalsIgnoreCase("D3")) && pengalaman >=2;
            reqKoor2 = jeniskelamin.equalsIgnoreCase("Pria") && umur >30 && lulusan.equalsIgnoreCase("S1") && pengalaman >=5;
            //kodisi if untuk menentukan  hasil kelulusan  posisi Koordinator
            if (reqKoor1 || reqKoor2){
                hasil = "Selamat, " + nama + ".\nAnda Memenuhi syarat sebagai" + posisi +". Dan akan masuk ke tahap selanjutnya.";
            }else{
                hasil = "Maaf, " + nama + ".\nAnda tidak memenuhi syarat sebagai" + posisi +". Dan tidak akan masuk ke tahap selanjutnya.";
            }
        }else if (posisi.equalsIgnoreCase("Admin")){
            reqAdmin1 = jeniskelamin.equalsIgnoreCase("Wanita") && umur >= 20 && umur <= 25 && lulusan.equalsIgnoreCase("D3") && (penampilan>=8.5 && pengalaman >=3);
            reqAdmin2 = jeniskelamin.equalsIgnoreCase("Wanita") && umur >= 25 && lulusan.equalsIgnoreCase("S1")
            && penampilan >=8.5 && pengalaman >= 3; 
            reqAdmin3 = jeniskelamin.equalsIgnoreCase("Pria") && umur  >= 20 && umur <=30 && penampilan >= 8.5 && (lulusan.equalsIgnoreCase("D3")||lulusan.equalsIgnoreCase("S1")) && pengalaman >= 2; 
                //kodisi if untuk menentukan  hasil kelulusan  posisi Koordinator
            if (reqAdmin1 || reqAdmin2 || reqAdmin3){
                hasil = "Selamat, " + nama + ".\nAnda Memenuhi syarat sebagai" + posisi +". Dan akan masuk ke tahap selanjutnya.";
            }else{
                hasil = "Maaf, " + nama + ".\nAnda tidak memenuhi syarat sebagai" + posisi +". Dan tidak akan masuk ke tahap selanjutnya.";
            }
        }else if (posisi.equalsIgnoreCase("SPV")){
            //membuat Kondisi setiap kriteria SPV
            reqSpv1 = umur >= 23 && umur <= 30 && lulusan.equalsIgnoreCase("S1") && pengalaman >1 ;
             reqSpv2 = umur >= 25 && umur <= 35 && lulusan.equalsIgnoreCase("D3") && pengalaman >4 ;
             //kondisi if untuk menentukan hasil kriteria posisi SPV
             if(reqSpv1||reqSpv2){
                 hasil = "Selamat, " + nama + ".\nAnda Memenuhi syarat sebagai" + posisi +". Dan akan masuk ke tahap selanjutnya.";
             }
             else {
                hasil = "Maaf, " + nama + ".\nAnda tidak memenuhi syarat sebagai" + posisi +". Dan tidak akan masuk ke tahap selanjutnya.";
             }
        }else {
            //Hasil ketika posisi yang ditemukan tidak sesuai atau tidak ada.
            hasil = "Maaf Posisi Yang Anda Cari Tidak Tersedia.";
        }
        System.out.println();
        System.out.println(nama +", Terimakasih Telah mengikuti Lowongan kerja di PT.Secret Semut 79.\n" );
        System.out.println("Berikut adalah Hasil dari Rekrutmen Untuk posisi " + posisi + " :");
        System.out.println(hasil);
    }
}