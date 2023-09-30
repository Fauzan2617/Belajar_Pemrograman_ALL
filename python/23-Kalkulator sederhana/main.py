# LATIHAN KALKULATOR

angka1 = int(input("Masukkan Angka\t :"))
angka2 = int(input("Masukkan Angka\t :"))
Operator = input("Masukkan Operator\t :")

if Operator == "+":
    hasil_jumlah = angka1 + angka2
    print("Hasil Penjumlahan :", hasil_jumlah)
elif Operator == "-":
    hasil_kurang = angka1 - angka2
    print("Hasil kurang :", hasil_kurang)
elif Operator == "*":
    hasil_kali = angka1 * angka2
    print("Hasil kali :", hasil_kali)
elif Operator == "/":
    hasil_bagi = float(angka1 / angka2)
    print("Hasil bagi :", hasil_bagi)
else:
    print("yang anda masukkan salah !!!!")
