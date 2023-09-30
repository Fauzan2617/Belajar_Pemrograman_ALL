# Date and Time

import datetime as dt

# print(5 * "=" + "Latihan Sederhana" + 5 * "=")
# hari_ini = dt.date.today()
# print(hari_ini)

# tanggal = dt.date(2004, 3, 26)
# print(tanggal)
# print(f"Hari ini adalah hari : {hari_ini:%A}")

print(5 * "=" + "Aplikasi Sederhana Menghitung tanggal lahir" + 5 * "=")
print("\nMasukkan Tanggal,Bulan dan Tahun lahir anda")

tanggal = int(input("Masukkan Tanggal anda : "))
bulan = int(input("Masukkan Bulan anda : "))
tahun = int(input("Masukkan Tahun anda : "))

tanggal_lahir = dt.date(tahun, bulan, tanggal)
print(tanggal_lahir)
print(f"Hari lahir anda adalah {tanggal_lahir:%A}\n")

hari_sekarang = dt.date.today()
umur = hari_sekarang - tanggal_lahir
umur_mu = umur.days // 365
sisa_bulan = (umur.days % 365) // 30

print("Jumlah Hari Umur mu : ", umur, "hari")
print("umur mu adalah", umur_mu, "tahun")
print(f"sisa bulan mu : {sisa_bulan}", "Bulan")
