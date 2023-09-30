# Looping dictionary

teman_teman = {
    'zan':'fauzan',
    'van':'novan',
    'mal':'hikmal',
    'fin':'refin'
}

print(teman_teman)

# Looping first try (yang keluar adalah key)
print("\n")
for teman in teman_teman:
    print(teman)

# Operator untuk mengambil item / value
print("\n")
keys = teman_teman.keys()
print(keys)

for key in teman_teman.keys():
    print(teman_teman.get(key))


# Mengambil valuesnya saja
print("\n")
for value in teman_teman.values():
 print(value)

# Memnculkan key dan value dengan fitur item
print("\n")
items = teman_teman.items()
print (items)

for key,value in teman_teman.items():
   print(f"key = {key} \t value = {value}")