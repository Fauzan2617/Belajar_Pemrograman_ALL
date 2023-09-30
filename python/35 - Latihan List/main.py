list = []


while True :
    print("MASUKKAN DATA BUKU")
    buku = input("Masukkan buku : ")
    penulis = input("Masukkan Penulis :")
    print(f"buku yang anda masukkan :{buku}|{penulis}")

    data_buku = [buku,penulis]
    list.append(data_buku)

    print("no.\t\tbuku\t\tpenulis")
    for index,buku in enumerate(list):
        
        print(f"{index}\t\t{buku[0]}\t\t{buku[1]}")
    
    user = input("apakah dilanjut (y/n)")
    if user == "y" : 
        continue
    elif user == "n":
        break

print("="*20)
print("AKHIR PROGRAM")