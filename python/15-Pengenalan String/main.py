data = "ini adalah string"
print(data)

# 1. Mmebuat String
"""
    1. Menggunakan single queto
    2. Menggunakan double queto 
"""

data = "single queto"
print(data)

data = "double queto"
print(data)

print("'Halo Apa Kabar ?'")
print('"Halo Apa Kabar ?"')

# 2. Menggunakan tanda \
# membuat tanda ' menjadi string
print("sholat jum'at")  # ----> Escape Karakter

# backslash (Harus Double)
print("C:\\user\\dwi")

# tab
print("dwi\t\t\tputera, Jauhannn")

# backspace
print("Ucup \botong")

# newline
print("baris pertama. \nbaris kedua.")  # LF  -> Line feed -> unix
print("baris pertama. \rbaris kedua.")  # CR -> Carriage return
print("baris pertama. \r\nbaris kedua.")  # CRLF -> line Feed carriage return -> Windows

# 3. String literal atau raw
# hati - hati
print("C:\new folder")  # Akan Salah

# Solusi Menggunakan Raw
print(r"C:\new folder")

# multiline literal string
print(
    """
Nama: dwi
kelas : 1SD

"""
)
