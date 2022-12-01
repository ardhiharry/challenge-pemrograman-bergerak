fun main() {

    val namaDosen = "Adi"
    val dpa = true

    val sksWajib = 6

    println("======================================")
    println("          PROGRAM GAJI DOSEN          ")
    println("======================================")

    print("SKS Mata Kuliah A: ")
    val sksMatkulA = Integer.valueOf(readln())

    print("Jumlah Kelas Mata Kuliah A: ")
    val kelasMatkulA = Integer.valueOf(readln())

    print("SKS Mata Kuliah B: ")
    val sksMatkulB = Integer.valueOf(readln())

    print("Jumlah Kelas Mata Kuliah B: ")
    val kelasMatkulB = Integer.valueOf(readln())

    val sksLebih = ((sksMatkulA * kelasMatkulA) + (sksMatkulB * kelasMatkulB)) - sksWajib
    val bayaranSksLebih = sksLebih * 28_000

    print("Total waktu mengajar (pertemuan): ")
    val estimasiMengajar = Integer.valueOf(readln())

    val sksPertemuan = sksLebih / (kelasMatkulA + kelasMatkulB).toFloat()
    val sksMasuk = sksPertemuan * estimasiMengajar
    val bayaranEstimasiMengajar = sksMasuk * 16_000

    if( dpa ) {
        print("Jumlah Mahasiswa DPA: ")
        val mahasiswaDPA = Integer.valueOf(readln())
        val hasilMahasiswaDPA = mahasiswaDPA * 5_000

        val gajiBruto = bayaranSksLebih + bayaranEstimasiMengajar + hasilMahasiswaDPA
        val infaq = gajiBruto * 0.05f
        val gajiNetto = gajiBruto - infaq
        println("--------------------------------------")
        println("\n")

        println("======================================")
        println("              HASIL GAJI              ")
        println("======================================")

        println("Nama Dosen: $namaDosen")
        println("Gaji SKS Lebih: Rp. $bayaranSksLebih")
        println("Gaji Jumlah Masuk: Rp. $bayaranEstimasiMengajar")
        println("Gaji DPA: Rp. $hasilMahasiswaDPA")
        println("Infaq: Rp. $infaq")
        println("Gaji Kotor: Rp. $gajiBruto")
        println("Gaji Bersih: Rp. $gajiNetto")
        println("--------------------------------------")
    } else {
        val gajiBruto = bayaranSksLebih + bayaranEstimasiMengajar
        val infaq = gajiBruto - (gajiBruto * 0.05f)
        val gajiNetto = gajiBruto - infaq

        println()

        println("Nama Dosen: $namaDosen")
        println("Gaji SKS Lebih: Rp. $bayaranSksLebih")
        println("Gaji Jumlah Masuk: Rp. $bayaranEstimasiMengajar")
        println("Infaq: Rp. $infaq")
        println("Gaji Kotor: Rp. $gajiBruto")
        println("Gaji Bersih: Rp. $gajiNetto")
        println("--------------------------------------")
    }

}