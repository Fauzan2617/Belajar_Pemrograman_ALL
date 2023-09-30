# episode latihan logika dan komparasi

# membuat gabungan area rentang dari angka

# ++++++3--------10+++++++

# inputUser = float(
#     input("masukan angka yang bernilai\nkurang dari 3 \natau \nlebih besar dari 10\n:")
# )

# # ++++++3-----------------
# # Memeriksa angka kurang dari 3
# isKurangDari = inputUser < 3
# print("Kurang dari 3 =", isKurangDari)

# # ---------------10++++++++
# # Memeriksa angka lebih dari 10
# isLebihDari = inputUser > 10
# print("Lebih dari 10 =", isLebihDari)

# # ++++++3--------10+++++++

# isCorrect = isKurangDari or isLebihDari
# print("angka yang anda masukan: ", isCorrect)


# # -----3++++++++10--------
# # kasus irisan
# print("\n", 10 * "=", "\n")
# inputUser = float(
#     input("masukan angka yang bernilai\nlebih dari 3 \ndan \nkurang dari 10\n:")
# )

# # -----3++++++++++++++++++
# # lebih dari 3
# isLebihDari = inputUser > 3
# print("Lebih dari 3 = ", isLebihDari)

# # +++++++++++++++10-------
# # kurang dari 10
# isKurangDari = inputUser < 10
# print("Kurang dari 10 = ", isKurangDari)

# # -----3++++++++10--------
# isCorrect = isKurangDari and isLebihDari
# print("angka yang anda masukan: ", isCorrect)

# Tugas
inputuser = float(
    input(
        "masukkan angka antara 0 dan kurang dari 5 \n atau rentang 8 dan kurang dari 11 :"
    )
)
mengecek = inputuser > 0 or inputuser < 5 & inputuser > 8 or inputuser < 11
print(mengecek)

inputuser = float(
    input(
        "masukkan angka kurang dari 0 dan lebih dari 5 \n atau kurang dari 8 dan lebih dari 11 :"
    )
)
mengecek = inputuser < 0 and inputuser > 5 & inputuser < 8 and inputuser < 11
print(mengecek)
