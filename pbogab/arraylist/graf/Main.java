package arraylist.graf;
public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph();

        // Menambahkan beberapa pengguna ke dalam graf
        graph.addVertex("user1");
        graph.addVertex("user2");
        graph.addVertex("user3");
        graph.addVertex("user4");

        // Menambahkan beberapa pertemanan antara pengguna
        graph.addEdge("user1", "user2");
        graph.addEdge("user1", "user3");
        graph.addEdge("user2", "user4");
        graph.addEdge("user3", "user4");

        // Mendapatkan daftar teman dari sebuah pengguna
        System.out.println("Daftar teman dari user1: " + graph.getFriends("user1"));
        System.out.println("Daftar teman dari user2: " + graph.getFriends("user2"));
        System.out.println("Daftar teman dari user3: " + graph.getFriends("user3"));
        System.out.println("Daftar teman dari user4: " + graph.getFriends("user4"));
    }
}
