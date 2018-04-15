package matriks;

import java.util.Scanner;

public class Matriks {
    int baris1, kolom1; //menyimpan jumlah baris dan kolom
    int baris2, kolom2; //menyimpan jumlah baris dan kolom
    int [][] matriks1; //Array matriks
    int [][] matriks2; //Array matriks
    int [][] hasilMatriks; //Array matriks untuk menampilkan hasil
    Scanner sc;
    //Konstruktor dari class. Berisikan instansiasi class Scanner
    public Matriks() {
        sc = new Scanner(System.in);
    }
    
    //Input matriks untuk operasi penjumlahan atau pengurangan
    void inputDuaMatriks() {
        //Input matriks pertama
        System.out.println("----Anda akan melakukan operasi penjumlahan atau pengurangan----");
        System.out.println("\nInput matriks 1");
        System.out.println("-----------------");
        System.out.print("Jumlah baris: ");
        baris1 = sc.nextInt();
        System.out.print("Jumlah kolom: ");
        kolom1 = sc.nextInt();
        
        matriks1 = new int [baris1][kolom1];
        for (int i=0; i<baris1; i++){
            for (int j=0; j<kolom1; j++) {
                System.out.print("Matriks["+i+','+j+']'+"= ");
                matriks1[i][j] = sc.nextInt();
            }
        }
        
        //Matriks kedua. 
        //Jumlah baris dan kolom pada matriks kedua otomatis mengikuti jumlah baris dan kolom dari matriks pertama. 
        System.out.println("\nInput matriks 2");
        System.out.println("-----------------");
        System.out.println("Jumlah baris: "+baris1);
        System.out.println("Jumlah kolom: "+kolom1);
        matriks2 = new int [baris1][kolom1];
        for (int i=0; i<baris1; i++){
            for (int j=0; j<kolom1; j++) {
                System.out.print("Matriks["+i+','+j+']'+"= ");
                matriks2[i][j] = sc.nextInt();
            }
        }
    }
    
    //Input matriks untuk operasi skalar atau transpose.
    void inputSatuMatriks() { 
        //Input matriks.
        System.out.println("----Anda akan melakukan operasi skalar atau transpose----");
        System.out.println("\nInput matriks");
        System.out.println("-----------------");
        System.out.print("Jumlah baris: ");
        baris1 = sc.nextInt();
        System.out.print("Jumlah kolom: ");
        kolom1 = sc.nextInt();
        
        matriks1 = new int [baris1][kolom1];
        for (int i=0; i<baris1; i++){
            for (int j=0; j<kolom1; j++) {
                System.out.print("Matriks["+i+','+j+']'+"= ");
                matriks1[i][j] = sc.nextInt();
            }
        }   
    }
    
    //Input matriks untuk operasi perkalian
    void inputMultMatriks() {
        //Input matriks pertama
        System.out.println("----Anda akan melakukan operasi perkalian----");
        System.out.println("\nInput matriks 1");
        System.out.println("-----------------");
        System.out.print("Jumlah baris: ");
        baris1 = sc.nextInt();
        System.out.print("Jumlah kolom: ");
        kolom1 = sc.nextInt();
        matriks1 = new int [baris1][kolom1];
        for (int i=0; i<baris1; i++){
            for (int j=0; j<kolom1; j++) {
                System.out.print("Matriks["+i+','+j+']'+"= ");
                matriks1[i][j] = sc.nextInt();
            }
        }
        
        //Input matriks kedua
        System.out.println("\nInput matriks 2");
        System.out.println("-----------------");
        //Baris pada matriks kedua otomatis memiliki nilai yang sama dengan kolom pada matriks pertama.
        baris2 = kolom1;
        System.out.println("Jumlah baris: "+baris2);
        System.out.print("Jumlah kolom: ");
        kolom2 = sc.nextInt();
        matriks2 = new int [baris2][kolom2];
        for (int i=0; i<baris2; i++){
            for (int j=0; j<kolom2; j++) {
                System.out.print("Matriks["+i+','+j+']'+"= ");
                matriks2[i][j] = sc.nextInt();
            }
        }
    }
    
    //Menghitung perkalian matriks dengan bilangan skalar
    void countSkalar() {
        //input angka skalar
        System.out.println("----Anda sedang melakukan operasi skalar----");
        hasilMatriks = new int [baris1][kolom1];
        System.out.print("\nBilangan skalar: ");
        int sk = sc.nextInt();
        
        for (int i=0; i<baris1; i++){
            for (int j=0; j<kolom1; j++) {
                hasilMatriks[i][j] = matriks1[i][j]*sk;
            }
        }
    }
    
    //Mengubah matriks ke bentuk transpose
    void countTranspose() {
        System.out.println("----Anda sedang melakukan operasi transpose----");
        hasilMatriks = new int [kolom1][baris1];
        int tmp;
        for (int i=0; i<baris1; i++){
            for (int j=0; j<kolom1; j++) {
                tmp = matriks1[i][j];
                hasilMatriks[j][i] = tmp;
            }
        }
    }   

    //Menghitung penjumlahan dua matriks
    void countAddMatriks() {
        System.out.println("----Anda sedang melakukan operasi penjumlahan----");
        hasilMatriks = new int [baris1][kolom1];
        for (int i=0; i<baris1; i++){
            for (int j=0; j<kolom1; j++) {
                hasilMatriks[i][j] = matriks1[i][j] + matriks2[i][j];
            }
        }
    }
    
    //Menghitung Perkalian dua Matriks
    void countMultMatriks() {
        System.out.println("----Anda sedang melakukan operasi perkalian----");
        hasilMatriks = new int [baris1][kolom2];
        for (int i=0; i<baris1; i++){
            for (int j=0; j<kolom2; j++) {
                int hasilKali;
                int temp = 0;
                for (int k=0; k<baris2; k++) {
                    hasilKali = matriks1[i][k]*matriks2[k][j];
                    temp = temp + hasilKali;
                }
                hasilMatriks[i][j] = temp;
            }
        }
    }
    
    //Menghitung pengurangan dua matriks
    void countSubstractMatriks() {
        System.out.println("----Anda sedang melakukan operasi pengurangan----");
        hasilMatriks = new int [baris1][kolom1];
//       System.out.println();
        for (int i=0; i<baris1; i++){
            for (int j=0; j<kolom1; j++) {
                hasilMatriks[i][j] = matriks1[i][j] - matriks2[i][j];
            }
        }
    }
    
    //Display hasil penjumlahan, pengurangan, transpose, atau perkalian skalar matriks
    void diplay(){
        System.out.println("Hasil: ");
        for (int i=0; i<baris1; i++){
            for (int j=0; j<kolom1; j++) {
                System.out.printf("%4d", hasilMatriks[i][j]);
            }
            System.out.println();
        }
    }
    
    //Display hasil perkalian matriks
    void displayMultMatriks() {
        System.out.println("Hasil: ");
        for (int i=0; i<baris1; i++){
            for (int j=0; j<kolom2; j++) {
                System.out.printf("%4d", hasilMatriks[i][j]);
            }
            System.out.println();
        }
    }
    
    //Display hasil dari transpose matriks
    void displayTranspose() {
        System.out.println("Hasil: ");
        for (int i=0; i<kolom1; i++){
            for (int j=0; j<baris1; j++) {
                System.out.printf("%4d", hasilMatriks[i][j]);
            }
            System.out.println();
        }
    }
    
    //main program
    public static void main(String[] args) {
        Matriks mt = new Matriks(); //Objek kelas Matriks.
        mt.inputDuaMatriks();
        mt.countAddMatriks();
        mt.diplay();
        mt.countSubstractMatriks();
        mt.diplay();
        mt.inputMultMatriks();
        mt.countMultMatriks();
        mt.displayMultMatriks();
        mt.inputSatuMatriks();
        mt.countSkalar();
        mt.diplay();
        mt.inputSatuMatriks();
        mt.countTranspose();
        mt.displayTranspose();
    }
    
}
