# Angka Satuan INT
data_int = 1
print(type(data_int))
print("data ini", data_int, ",tipenya", type(data_int))

# Float / Decimal
data_float = 1.5
print("data ini", data_float, ",tipenya", type(data_float))

# String
data_string = "fauzan"
print("data ini", data_string, ",tipenya", type(data_string))

# boolean true/false
data_bool = True
print(",tipenya", type(data_bool))

# bilangan kompleks
data_kompleks = complex(5.6)
print(",tipenya", data_kompleks, type(data_kompleks))

# Mengimpor data dari bahasa C
# Download package nya terlebih dahulu
from ctypes import c_double, c_float

data_c_double = c_double(10.5)
print(",tipenya", data_c_double, type(data_c_double))
