#Graph.java

Struktur data graf direpresentasikan sebagai Map dengan kunci berupa nama pengguna di Instagram dan nilai berupa daftar nama pengguna yang berteman dengan pengguna tersebut. Metode addVertex() digunakan untuk menambahkan sebuah simpul (vertex) ke dalam graf, sedangkan metode addEdge() digunakan untuk menambahkan sebuah sisi (edge) antara dua simpul yang ada.

Untuk setiap pengguna Instagram yang ditambahkan ke dalam graf, akan dibuat sebuah daftar kosong untuk merepresentasikan daftar teman-temannya. Ketika sebuah sisi ditambahkan antara dua pengguna, daftar teman masing-masing pengguna akan diperbarui dengan menambahkan nama pengguna lainnya.

Metode getFriends() digunakan untuk mendapatkan daftar teman dari sebuah pengguna. Metode ini mengambil kunci (nama pengguna) dari Map dan mengembalikan daftar nama pengguna yang terkait dengan kunci tersebut.

#Main.java

Pada file Main.java, pertama-tama kita membuat sebuah objek Graph. Kemudian kita menambahkan beberapa pengguna ke dalam graf menggunakan metode addVertex(), dan menambahkan beberapa pertemanan antara pengguna menggunakan metode addEdge().

Terakhir, kita mengambil daftar teman dari setiap pengguna menggunakan metode getFriends() dan mencetaknya di layar. Output dari program ini akan menampilkan daftar teman dari masing-masing pengguna yang telah ditambahkan ke dalam graf.