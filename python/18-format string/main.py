# Format string

# Generic
nama = "fauzan"
format_str = f"dwi {nama}"
print(format_str)


# Angka
angka = 2004.03
format_str = f"angka = {angka}"
print(format_str)

# boolean
boolean = True
format_str = f"boolean = {boolean}"
print(format_str)

# bilangan bulat
angka = 15
format_str = f"bilangan bulat = {angka:d}"
print(format_str)

# bilangan ordo
angka = 2000000
format_str = f"jutaan = {angka:,}"
print(format_str)

# bilangan desimal
angka = 2005.54321
format_str = f"angka = {angka:.2f}"
print(format_str)

# bilangan leading zero
angka = 2005.54321
format_str = f"angka = {angka:010.2f}"  # angka 0 adalan menambahkan angka tambahan
print(format_str)  # angka 10 adalah angka yang akan ditampilkan

# menampilkan tanda + atau -
angka_minus = -10
angka_plus = 10.1234
format_minus = f"angka minus = {angka_minus:+d}"
format_plus = f"angka plus = {angka_plus:+f}"
print(format_minus)
print(format_plus)

# format persen
persentase = 0.045
format_str = f"persen = {persentase:.2%}"
print(format_str)

# melakukan operasi aritmatika di dalam placeholder
harga = 10000
jumlah = 5

format_string = f"harga total = Rp. {harga*jumlah:,}"
print(format_string)

# format angka lain (binary, octal, hexadecimal)

angka = 255
format_binary = f"binary = {bin(angka)}"
format_octal = f"octal = {oct(angka)}"
format_hex = f"hex = {hex(angka)}"

print(format_binary)
print(format_octal)
print(format_hex)
