##--- List 

# Kumpulan Data Angka

data_angka = [1,2,3]
print(data_angka)

# Kumpulan data string
data_string = ["ucup"]
print(data_string)

# kumpulan datang boolean
data_boolean = [True,False]
print (data_boolean)

# Membuat List
data_range = range(0,10,)   # range(start,stop,step)
data_list = list(data_range)
print (data_list)

# list menggunakan for loop dan mempangkat kan hasilnya
list_pake_for = [i**3 for i in  range(0,10)]
print (list_pake_for)

#list pake for pake dan if
list_pake_for_if = [i for i in range(0,10) if i != 5]
print (list_pake_for_if)

list_pake_for_if = [i for i in range(0,10) if i %2 == 2]
print (list_pake_for_if)

