Struktur data Bag direpresentasikan sebagai Map dengan kunci berupa elemen (objek) dan nilai berupa jumlah kemunculan elemen tersebut dalam Bag.

Metode add() menambahkan sebuah elemen ke dalam Bag dengan cara mengambil nilai (jumlah kemunculan) saat ini dari Map, menambahkannya dengan 1, dan memasukkannya kembali ke Map.

Metode remove() mengurangi jumlah kemunculan sebuah elemen dalam Bag dengan cara mengambil nilai saat ini dari Map, menguranginya dengan 1, dan memasukkannya kembali ke Map. Jika jumlah kemunculan menjadi 0, maka elemen tersebut dihapus dari Map.

Metode count() mengembalikan jumlah kemunculan sebuah elemen dalam Bag.

Metode contains() mengembalikan true jika elemen tersebut ada dalam Bag, dan false jika tidak ada.

Metode size() mengembalikan jumlah total elemen dalam Bag, tidak termasuk jumlah kemunculan.

Metode clear() menghapus semua elemen dari Bag.

Dengan menggunakan struktur data Bag, kita bisa menyimpan sebuah koleksi objek dengan jumlah kemunculan yang tidak terbatas, dan bisa melakukan operasi seperti menambah, menghapus, dan menghitung jumlah kemunculan objek-objek tersebut