# oeprasi disctionary


data_dict = {
    'zan':'fauzan',
    'van':'novan',
    'mal':'hikmal',
    'fin':'refin'
}


# panjang dictionary
LENDICT = len(data_dict)
print(f"panjang nya adalah : {LENDICT}")

# mengecek key

KEY = "fin"
CHECKKEY = KEY in data_dict
print (f"apakah ada : {CHECKKEY}")

# Mengakses value dengan get
print(data_dict['fin'])
print(data_dict.get('zan'))

# Update data
data_dict["mal"] = "Hikmal papua"
print (data_dict)

data_dict.update({"van" : "novan ayam"})
print(data_dict)
data_dict.update({'tang': 'bintang'})
print(data_dict)

# Delete data pada dictionary
del data_dict['zan']
print(data_dict)