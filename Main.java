public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager("Luthfi Mahardika", 20, "Ubud, BALI", "EMP123", 3000000, "Marketing", 2);

        // Menampilkan informasi lengkap dari objek Manager
        manager.displayManagerInfo();

        // Menggunakan metode untuk memberi kenaikan gaji
        manager.giveRaise(10); 

        // Menambah anggota tim
        manager.addTeamMember();
    }
}
