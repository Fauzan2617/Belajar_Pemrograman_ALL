data_angka = [1,2,4,4,5,5,6,1,4,6,12,5]
data_int = ["fauzan","dwi","putera"]
jumlah_data_4 = data_angka.count(4)
jumlah_data_5 = data_angka.count(5)

print(f"jumlah data 4 = {jumlah_data_4}")
print(f"jumlah data 4 = {jumlah_data_5}")


# Mengambil data berdasarkan index
data = ["fauzan","dwi","putera"]
data_index = data.index("dwi")
print(data_index)


# Mengurutkan data List
data_angka.sort()
print(data_angka)

data_int.sort()
print(data_int)

# Membalik listnya
data_angka.reverse()
data_int.reverse()

print(data_angka)
print(data_int)



