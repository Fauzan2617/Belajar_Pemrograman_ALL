# Belajar Casting
# Merubah tipe data ke tipe yg lain
# Tipe Data = int, float , str, bool

# INT
print("======INT=====")
data_int = 15
print("data awal : ", data_int)


data_float = float(data_int)
print("data ini dirubah ke : ", data_float, type(data_float))
data_bool = bool(data_int)
print("data ini dirubah ke : ", data_bool, type(data_bool))
data_str = str(data_int)
print("data ini dirubah ke : ", data_int, type(data_int))


# FLOAT
print("=====FLOAT======")
data_float = 1.5
print("data awal : ", data_float)


data_float = float(data_float)
print("data ini dirubah ke : ", data_float, type(data_float))
data_bool = bool(data_float)
print("data ini dirubah ke : ", data_bool, type(data_bool))
data_str = str(data_float)
print("data ini dirubah ke : ", data_str, type(data_str))

# bool
print("=====BOOL======")
data_bool = True
print("data awal : ", data_bool)


data_float = float(data_bool)
print("data ini dirubah ke : ", data_float, type(data_float))
data_int = bool(data_bool)
print("data ini dirubah ke : ", data_int, type(data_int))
data_str = str(data_bool)
print("data ini dirubah ke : ", data_str, type(data_str))

# string
print("=====STRING======")
data_string = "2"
print("data awal : ", data_string)


data_float = float(data_string)
print("data ini dirubah ke : ", data_float, type(data_float))
data_int = int(data_string)
print("data ini dirubah ke : ", data_int, type(data_int))
data_boole = bool(data_string)
print("data ini dirubah ke : ", data_boole, type(data_boole))
