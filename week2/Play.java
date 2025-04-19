package week2;

import java.util.Scanner;

public class Play {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Character player = new Character();
        Character enemy = new Character();
        enemy.setData("Musuh");

        System.out.print("Masukkan nama karakter: ");
        String nama = scanner.nextLine();
        player.setData(nama);

        int choice;
        do {
            System.out.println("\n===== Menu =====");
            System.out.println("1. Tampilkan Status Karakter");
            System.out.println("2. Serang Musuh");
            System.out.println("3. Diserang Musuh");
            System.out.println("4. Minum Ramuan");
            System.out.println("5. Tampilkan Status Musuh");
            System.out.println("6. Musuh Menyerang Player");
            System.out.println("0. Keluar");
            System.out.print("Pilihan Anda: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\n=== Status Karakter ===");
                    System.out.println("Nama: " + player.getNama());
                    System.out.println("Level: " + player.getLevel());
                    System.out.println("HP: " + player.getHp());
                    System.out.println("EXP: " + player.getExp());
                    break;
                case 2:
                    player.attack();
                    enemy.attacked();
                    System.out.println("EXP bertambah! Musuh terkena serangan!");
                    if (enemy.getHp() <= 0) {
                        System.out.println("Musuh telah mati! Anda mendapatkan bonus 3 EXP!");
                        player.expUp();
                        player.expUp();
                        player.expUp();
                        Character enemy1 = new Character();
                        enemy1.setData("Musuh");
                    }
                    break;
                case 3:
                    player.attacked();
                    System.out.println("Karakter diserang! HP berkurang!");
                    break;
                case 4:
                    player.minumRamuan();
                    System.out.println("Karakter minum ramuan! HP bertambah!");
                    break;
                case 5:
                    System.out.println("\n=== Status Musuh ===");
                    System.out.println("Nama: " + enemy.getNama());
                    System.out.println("HP: " + enemy.getHp());
                    break;
                case 6:
                    enemy.attack();
                    player.attacked();
                    System.out.println("Musuh menyerang! HP Player berkurang!");
                    break;
                case 0:
                    System.out.println("Terima kasih telah bermain!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid! Coba lagi.");
            }
        } while (choice != 0);
        
        scanner.close();
    }
}
