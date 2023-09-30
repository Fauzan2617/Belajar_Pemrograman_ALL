# Input data dari User

# Data yang dimasukkan pasti string
data = input("Masukkan Data : ")
print("DATA : ", data, ",type", type(data))

# Mengubah ke INT

data_int = int(input("Masukkan Data :"))
print("DATA : ", data_int, ",type", type(data_int))

# Mengubah ke bool
# Untuk Bool harus diubah ke int dulu
data_bool = bool(int(input("Masukkan Data :")))
print("DATA : ", data_bool, ",type", type(data_bool))
