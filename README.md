# TUGAS-PBO_GUI
# Form Pengunjung Perpustakaan

| | |
|---|---|
| **Nama** | [MARDATILAH] |
| **NIM** | [F1D02510014] |

Aplikasi desktop sederhana berbasis **Java Swing** untuk mencatat data pengunjung perpustakaan. Pengguna mengisi nama, umur, tujuan kunjungan, dan status keanggotaan, lalu data ditampilkan dalam kotak dialog saat tombol **Simpan** diklik.

## Fitur

- Input nama pengunjung
- Input umur
- Pilihan tujuan kunjungan: *Membaca Buku*, *Meminjam Buku*, atau *Mengembalikan Buku*
- Centang status anggota perpustakaan
- Ringkasan data ditampilkan lewat dialog setelah klik **Simpan**
- Jendela tampil di tengah layar

## Tampilan Komponen

| Komponen | Jenis | Fungsi |
|---|---|---|
| Judul | `JLabel` | Menampilkan judul form |
| Nama Pengunjung | `JTextField` | Input nama |
| Umur | `JTextField` | Input umur |
| Tujuan Kunjungan | `JComboBox<String>` | Memilih tujuan kunjungan |
| Anggota Perpustakaan | `JCheckBox` | Menandai apakah pengunjung anggota |
| Simpan | `JButton` | Menampilkan data yang diisi dalam dialog |

## Prasyarat

- **JDK 8 atau lebih baru** (disarankan JDK 17 atau lebih baru)
- Terminal / Command Prompt, atau editor seperti VS Code dengan *Extension Pack for Java*

Cek instalasi Java dengan:

```bash
java -version
javac -version
```

## Struktur File

```
.
├── Main.java     # Kode sumber aplikasi
├── Main.class    # Hasil kompilasi (dibuat otomatis oleh javac)
└── README.md     # Dokumentasi ini
```

## Cara Menjalankan

### Lewat terminal

1. Buka terminal di folder yang berisi `Main.java`.
2. Kompilasi kode:

   ```bash
   javac Main.java
   ```

3. Jalankan aplikasi:

   ```bash
   java Main
   ```

### Lewat VS Code

1. Buka folder proyek di VS Code.
2. Buka file `Main.java`.
3. Klik tombol **Run** (▶) di kanan atas editor.

## Cara Penggunaan

1. Isi **Nama Pengunjung**.
2. Isi **Umur**.
3. Pilih **Tujuan Kunjungan** dari daftar.
4. Centang **Anggota Perpustakaan** jika pengunjung adalah anggota.
5. Klik **Simpan**.

Contoh hasil dialog:

```
Nama: Budi
Umur: 20
Tujuan: Meminjam Buku
Anggota: Ya
```

## Hasil Program

### 1. Tampilan awal form

![Tampilan awal form](tampilan-form.png)

Form menampilkan judul **FORM PENGUNJUNG PERPUSTAKAAN**, kolom *Nama Pengunjung*, kolom *Umur*, pilihan *Tujuan Kunjungan*, kotak centang *Anggota Perpustakaan*, dan tombol **Simpan**.

### 2. Form setelah diisi

![Form setelah diisi](form-terisi.png)

Contoh isian: nama **Budi**, umur **20**, tujuan **Meminjam Buku**, dan **Anggota Perpustakaan** dicentang.

### 3. Hasil setelah klik Simpan

![Dialog hasil](hasil-dialog.png)

Setelah tombol **Simpan** diklik, muncul dialog berisi data yang diisi:

```
Nama: Budi
Umur: 20
Tujuan: Meminjam Buku
Anggota: Ya
```

## Cara Kerja Singkat

- Jendela dibuat dengan `JFrame` berukuran 400 x 400 piksel dan `EXIT_ON_CLOSE`, sehingga program berhenti saat jendela ditutup.
- Layout memakai `setLayout(null)` (posisi absolut), dan setiap komponen diatur dengan `setBounds(x, y, lebar, tinggi)`.
- Tombol **Simpan** memiliki `ActionListener` (lambda) yang mengambil isi form dan menampilkannya dengan `JOptionPane.showMessageDialog`.
- Status anggota ditampilkan sebagai "Ya" atau "Tidak" sesuai kondisi `JCheckBox`.

## Keterbatasan Saat Ini

- Data **tidak disimpan** ke file atau database; hanya ditampilkan di dialog.
- Input **umur belum divalidasi**, sehingga huruf atau kolom kosong tetap diterima.
- Kolom nama boleh kosong.
- Layout absolut, sehingga tampilan tidak menyesuaikan jika ukuran jendela diubah.

## Ide Pengembangan

- Validasi input (nama wajib diisi, umur harus berupa angka)
- Menyimpan data ke file CSV atau database (misalnya SQLite)
- Menampilkan daftar pengunjung dalam tabel (`JTable`)
- Menambahkan tombol **Reset** untuk mengosongkan form
- Mengganti layout absolut dengan `GridBagLayout` atau `GroupLayout`
- Mencatat tanggal dan jam kunjungan secara otomatis
