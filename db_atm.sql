-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 22 Bulan Mei 2019 pada 16.50
-- Versi server: 10.1.35-MariaDB
-- Versi PHP: 7.2.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_atm`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `data_pekerja`
--

CREATE TABLE `data_pekerja` (
  `id_pekerja` int(11) NOT NULL,
  `id_user` int(11) NOT NULL,
  `jenis_pekerjaan` enum('Karyawan','Wirausaha','Wiraswasta','Mahasiswa','Ibu Rumah Tangga','Lainnya') NOT NULL,
  `nama_kantor` varchar(255) NOT NULL,
  `jabatan` varchar(255) NOT NULL,
  `alamat_kantor` varchar(255) NOT NULL,
  `pendapatan` enum('1-3','3-5','5-7','<1','>7') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `data_pekerja`
--

INSERT INTO `data_pekerja` (`id_pekerja`, `id_user`, `jenis_pekerjaan`, `nama_kantor`, `jabatan`, `alamat_kantor`, `pendapatan`) VALUES
(1, 1, 'Karyawan', 'PT. Sejahtera', 'Team Leader Office Boy', 'Jl. Terus jadiann kaga ', '5-7');

-- --------------------------------------------------------

--
-- Struktur dari tabel `log`
--

CREATE TABLE `log` (
  `id_log` int(11) NOT NULL,
  `id_user` int(11) DEFAULT NULL,
  `tanggal` date DEFAULT NULL,
  `keterangan` text,
  `nominal` double DEFAULT NULL,
  `status` enum('pembelian','pembayaran','debit','kredit') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `log`
--

INSERT INTO `log` (`id_log`, `id_user`, `tanggal`, `keterangan`, `nominal`, `status`) VALUES
(1, 1, '2019-05-01', 'Test', 3000, 'pembelian'),
(2, 1, '2019-05-15', 'hebaaat', 7000, 'pembelian'),
(3, 1, '2019-02-11', 's', 9000, 'pembelian');

-- --------------------------------------------------------

--
-- Struktur dari tabel `nasabah`
--

CREATE TABLE `nasabah` (
  `id` int(11) NOT NULL,
  `id_user` int(11) NOT NULL,
  `nama_lengkap` varchar(255) DEFAULT NULL,
  `no_tlp` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `ibu_kandung` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `nasabah`
--

INSERT INTO `nasabah` (`id`, `id_user`, `nama_lengkap`, `no_tlp`, `email`, `ibu_kandung`) VALUES
(1, 1, 'wayan edi sudarma', '081311902630', 'wayan.sudarma@ti.ukdw.ac.id', 'asasaasasas');

-- --------------------------------------------------------

--
-- Struktur dari tabel `rekening`
--

CREATE TABLE `rekening` (
  `no_rekening` varchar(11) NOT NULL,
  `id_user` int(11) DEFAULT NULL,
  `id_pekerjaan` int(11) DEFAULT NULL,
  `jenis_rekening` enum('biasa','bisnis') DEFAULT NULL,
  `saldo` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `rekening`
--

INSERT INTO `rekening` (`no_rekening`, `id_user`, `id_pekerjaan`, `jenis_rekening`, `saldo`) VALUES
('10291092121', 1, 1, 'biasa', 1000000);

-- --------------------------------------------------------

--
-- Struktur dari tabel `usr`
--

CREATE TABLE `usr` (
  `id_user` int(11) NOT NULL,
  `username` varchar(16) DEFAULT NULL,
  `password` varchar(16) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `usr`
--

INSERT INTO `usr` (`id_user`, `username`, `password`) VALUES
(1, 'admin', '1234');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `data_pekerja`
--
ALTER TABLE `data_pekerja`
  ADD PRIMARY KEY (`id_pekerja`);

--
-- Indeks untuk tabel `log`
--
ALTER TABLE `log`
  ADD PRIMARY KEY (`id_log`);

--
-- Indeks untuk tabel `nasabah`
--
ALTER TABLE `nasabah`
  ADD PRIMARY KEY (`id`);

--
-- Indeks untuk tabel `rekening`
--
ALTER TABLE `rekening`
  ADD PRIMARY KEY (`no_rekening`);

--
-- Indeks untuk tabel `usr`
--
ALTER TABLE `usr`
  ADD PRIMARY KEY (`id_user`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `data_pekerja`
--
ALTER TABLE `data_pekerja`
  MODIFY `id_pekerja` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT untuk tabel `log`
--
ALTER TABLE `log`
  MODIFY `id_log` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT untuk tabel `usr`
--
ALTER TABLE `usr`
  MODIFY `id_user` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
