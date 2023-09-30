# OPERASI

data = ["Fauzan","dwi","putera"]

# Mangambil data pada list diatas
data_0 = data[0]
print(f"data pertama :  {data_0}")

data_terakhir = data[-1]
print(data_terakhir)



# Mengambil info jumlah data dalam list
info_data = len(data)
print(info_data)

#  Cara menambahkan data pada list
data.insert(1,"Muhammad")
print(data)

# Menambah di akhir di list
data.append("novan")
print(data)

# Menambah list dengan list
data_baru = ["hikmal","diaz"]
data.extend(data_baru)
print(data)

# merubah data 
data[3] = "bintang"
print(data)

# Data Remove
data.remove("Fauzan")
print(data)

# Remove data paling akhir
data.pop()
print(data)