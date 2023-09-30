// Materi Var
// var x = "10";
// console.log("fauzan");
// console.log("fauzan" + x);

// Materi Popup Box
// Alert
// alert("Woii Sahabat");
// alert("assallammulaikum");
// alert("asiiappppp");

// Prompt
// prompt("Passwordnya kakak :");
// Jika menambah sebuah variabel contohnya nama, maka ketika memanggil var nama akan muncul sesuai yang diisikan
// var nama = prompt("username:");
// alert(nama);

// confirm
// confirm("yakin dekk??");
// var kondisi = confirm("yakinn dekk ??");
// alert(kondisi);

// Control Flow
// var angka = prompt("kamu berani ? :");
// alert("Okeh silahkan masuk :" + angka);

// Materi Pengkodisian
// var ulang = true;
// while (ulang) {
//   var angka = prompt("Masukkan angka :");
//   if (angka % 2 === 0) {
//     alert(angka + "bilangan GENAP");
//   } else if (angka % 2 === 1) {
//     alert(angka + "bilangan GANJIL");
//   } else {
//     alert("Yang ada masukkan bukan nomer");
//   }
//   ulang = confirm("mau lagi ?");
// }
// Pengkondisian Part 2
// var ulang = true;
// while (ulang) {
//   console.log("hello World");
//   ulang = confirm("mau lagi ?");
// }
// Pengkondisian Part 3
// var jmlangkot = 10;
// var angkotberoperasi  = 6;
// var angkotawal = 1;
// // while (angkotawal <= angkotberoperasi) {
//   console.log("Angkot No." + angkotawal + "beroperasi dengan baik");
//   angkotawal++;
// }
// for (angkotawal = 7; angkotawal <= jmlangkot; angkotawal++) {
//   console.log("angkot No" + angkotawal + "tidak beroperasi");
// }
// for (angkotawal = 1; angkotawal <= angkotberoperasi; angkotawal++) {
//   console.log("angkot no" + angkotawal + "Beroprasi");
// }
// Pengkondisian Part 4 (IF ELSE)
// for (angkotawal = 1; angkotawal <= jmlangkot; angkotawal++) {
//   if (angkotawal <= 6 && angkotawal !== 5) {
//     console.log("angkot no" + angkotawal + "Beroprasi dengan baik");
//   } else if (angkotawal === 8 || angkotawal === 10 || angkotawal === 5) {
//     console.log("Angkot no" + angkotawal + "Sedang Lembur");
//   } else {
//     console.log("angkot no" + angkotawal + "Sedang tidak beroprasi");
//   }
// }

// Materi (SWITCH)
// Contoh Kasus Switch
// var item = prompt(
//   "Masukkan minuman/makanan CONTOH : humburger, nasi, soda, airputih"
// );

// switch (item) {
//   case "humberger":
//     alert("Makanan Kurang Sehat");
//     break;

//   case "nasi":
//     alert("Makanan Sehat");
//     break;

//   case "soda":
//     alert("minuman kurang sehat");
//     break;

//   case "airputih":
//     alert("minuman sehat");
//     break;

//   default:
//     alert("Anda memasukkan inputan yang salah");
//     break;
// }
// // Contoh Kasus Switch LEBIH SEDERHANA
// var item = prompt(
//   "Masukkan minuman/makanan CONTOH : humburger, nasi, soda, airputih"
// );

// switch (item) {
//   case "airputih":
//   case "nasi":
//     alert("Makanan Sehat");
//     break;

//   case "soda":
//   case "humberger":
//     alert("Makanan/Minuman Kurang Sehat");
//     break;

//   default:
//     alert("Anda memasukkan inputan yang salah");
//     break;
// }

// MATERI FUNCTION
// Membuat function dengan Deklarasi
// function jumlahvolumekubus(a, b, c, d) {
//   var total = a,
//     b,
//     c,
//     d;
//   total = total + b;

//   return total;
// }
// alert(jumlahduabilangan(5, 5));

// Membuat function dengan ekpresi
// var bil = function (a, b) {
//   var total = a;
//   total = total + b;

//   return total;
// };
// alert(jumlahduabilangan(5, 5));

// contoh function dalam kasus menghitung volume kubus
// function jumlahvolumekubus(a, b) {
//   var total;
//   var volumeA;
//   var volumeB;

//   volumeA = a * a * a;
//   volumeB = b * b * b;

//   total = volumeA + volumeB;
//   return total;
// }

// contoh function 3
// function tambah(a, b) {
//   return a + b;
// }
// var a = parseInt(prompt("masukkan nilai1:"));
// var b = parseInt(prompt("masukkan nilai2 :"));
// var hasil = tambah(a, b);
// console.log(hasil);

// contoh function 4
// function tambah(a, b) {
//   return a + b;
// }

// function kali(a, b) {
//   return a * b;
// }
// var a = parseInt(prompt("masukkan nilai1:"));
// var b = parseInt(prompt("masukkan nilai1:"));
// var c = parseInt(prompt("masukkan nilai1:"));
// var d = parseInt(prompt("masukkan nilai1:"));

// var hasil = kali(tambah(a, b), tambah(c, d));
// console.log(hasil);

// contoh function 5
// function tambah(a, b) {
//   return a + b;
// }
// var hasil = tambah(2, 5, 5);
// console.log(hasil);

// contoh function 6 dengan menggunakan arguments
// function tambah() {
//   var hasil = 0;
//   for (var i = 0; i <= arguments.length; i++) {
// }
// }

// MATERI SCOPE JAVASCRIPT
// global scope / windows scope
// var a = 1;
// function tes() {
//   /*Function Scope, ketika membuat sebuah variable di dalam function maka jika console.log berada di luar function ia tidak akan bisa memanggil variable yang di dalam function  */
//   /*name conflict*/
//   var a = 2;
//   console.log(window.a);
// }
// tes();

// var a = 1;
// function tes() {
//   /*Function Scope, ketika membuat sebuah variable di dalam function maka jika console.log berada di luar function ia tidak akan bisa memanggil variable yang di dalam function  */
//   /*name conflict*/
//   a = 2;
// }
// tes();
// console.log(a);

// function tes() {
//   /*Function Scope, ketika membuat sebuah variable di dalam function maka jika console.log berada di luar function ia tidak akan bisa memanggil variable yang di dalam function  */
//   /*name conflict*/
//   a = 2;
// }
// tes();
// console.log(a);

// var a = 1;
// function tes(a) {
//   /*Function Scope, ketika membuat sebuah variable di dalam function maka jika console.log berada di luar function ia tidak akan bisa memanggil variable yang di dalam function  */
//   /*name conflict*/
//   console.log(a);
// }
// tes(a);
// console.log(a);

// MATERI REKURSIF
// Akan terjadi sebuah looping tanpa berhenti karena tidak nilak akhir
// function Angka(n) {
//   console.log(n);
//   return Angka(n - 1);
// }

// Angka(10);

// Sebuah Rekursif dengan nilai akhir
// function Angka(n) {
//   if (n === 0) {
//     return;
//   }
//   console.log(n);
//   return Angka(n - 1);
// }

// Angka(10);
