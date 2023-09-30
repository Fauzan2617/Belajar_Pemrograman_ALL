# Dictionary

teman_teman = {
    'zan':'fauzan',
    'van':'novan',
    'mal':'hikmal',
    'fin':'refin'
}

teman = teman_teman
print(teman)


# Menggunakan copy untuk duplikat yg benar
teman = teman_teman.copy()
print(teman)
teman_teman['fin'] = "rama"
print(teman_teman)

# Memindahkan nilai ke variabel berbeda degn POP
data_mal = teman.pop('mal')
print(data_mal)
print(teman)

# Mengambil nilai terakhir dengan POPITEM
pop_item = teman.popitem()
print(pop_item)
print(teman)

