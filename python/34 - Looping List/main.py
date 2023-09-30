#  looping dari List

# For Loop

angka = [1,2,3,4,5,6]

for nomer in angka:
    print(f"angka = {nomer}")

# Menggunakan for dan range 
angka = [1,2,3,4,5,6]

panjang = len(angka)

for i in range(panjang):
    print(f"angka panjang : {angka[i]}")

# While
angka = [1,2,3,4,5,6]

panjang = len(angka)
i = 0

while i < panjang:
    print(f"angka sekarang :{angka[i]}")
    i += 1

# List Comprehension

angka = [1,2,3,4,5,6]

panjang = len(angka)
[print(f"angka = {i}")for i in angka]

# enumarate

data_list = ["fauzan",2,3,5,3,"dwi"]
for data,index in enumerate(data_list):
    print(f"data = {data}"f"\tindex ={index}")

