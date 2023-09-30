# Operasi Aritmatika

# Penjumlahan
a = int(input("Masukkan Data : "))
b = int(input("Masukkan Data : "))

hasil = a + b
print(a, "+", b, "=", hasil)

# Pembagian
hasil = a / b
print(a, "/", b, "=", hasil)

# Perkalian
hasil = a * b
print(a, "*", b, "=", hasil)

# Pengurangan
hasil = a - b
print(a, "-", b, "=", hasil)

# Eksponen/Berpangkat
hasil = a**b
print(a, "**", b, "=", hasil)

# sisa bagi modulus
hasil = a % b
print(a, "%", b, "=", hasil)

# sisa bagi floor division
hasil = a // b
print(a, "//", b, "=", hasil)

# Prioritas Operasi
# urutan 1-akhir kiri ke kanan (),eksponen,perkalian,pertambahan
hasil = a // b**a - b + a * a / b
print(hasil)
# Dalam kurung akan dikerjakan terlebih dahulu
