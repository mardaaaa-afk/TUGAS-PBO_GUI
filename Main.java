
import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Form Pengunjung Perpustakaan");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel judul = new JLabel("FORM PENGUNJUNG PERPUSTAKAAN");
        judul.setBounds(65, 20, 300, 30);
        frame.add(judul);

        JLabel nama = new JLabel("Nama Pengunjung:");
        nama.setBounds(30, 70, 120, 25);
        frame.add(nama);

        JTextField inputNama = new JTextField();
        inputNama.setBounds(160, 70, 200, 25);
        frame.add(inputNama);

        JLabel umur = new JLabel("Umur:");
        umur.setBounds(30, 110, 120, 25);
        frame.add(umur);

        JTextField inputUmur = new JTextField();
        inputUmur.setBounds(160, 110, 200, 25);
        frame.add(inputUmur);

        JLabel tujuan = new JLabel("Tujuan Kunjungan:");
        tujuan.setBounds(30, 150, 130, 25);
        frame.add(tujuan);

        String[] pilihan = {
            "Membaca Buku",
            "Meminjam Buku",
            "Mengembalikan Buku"
        };

        JComboBox<String> pilihTujuan = new JComboBox<>(pilihan);
        pilihTujuan.setBounds(160, 150, 200, 25);
        frame.add(pilihTujuan);

        JCheckBox anggota = new JCheckBox("Anggota Perpustakaan");
        anggota.setBounds(160, 190, 200, 25);
        frame.add(anggota);

        JButton simpan = new JButton("Simpan");
        simpan.setBounds(140, 240, 100, 30);
        frame.add(simpan);

        simpan.addActionListener(e -> {
            JOptionPane.showMessageDialog(frame,
                "Nama: " + inputNama.getText() +
                "\nUmur: " + inputUmur.getText() +
                "\nTujuan: " + pilihTujuan.getSelectedItem() +
                "\nAnggota: " + (anggota.isSelected() ? "Ya" : "Tidak"));
        });

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
