#  Teknik Menduplikat List 

a = ["Fauzan","Dwi","Putera"]
print(f"a= {a}")

b = a
print (f"b = {b}")


# Akan Merubah kedua List
a[1] = "hikmal"
b.sort()
print(f"b = {b}")


# Address dari kedua list sama karena itu merubah keduanya
# b mengambil address a yang sama
print(f"Address A adalah {hex(id(a))}")
print(f"Address A adalah {hex(id(b))}")


#  Mendplikat List yg benar dengan fitur copy
c = a.copy()

print(f"c = {c}")
print(f"Address A adalah {hex(id(a))}")
print(f"Address A adalah {hex(id(b))}")
print(f"Address A adalah {hex(id(c))}")