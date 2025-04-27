package com.example.kotlin_ders.nesne_tabanli_programlama

fun main() {
    val f = Odev2()

    // Birinci ödev seti testleri
    println("50 derece = ${f.dereceToFahrenheit(50.0)} Fahrenheit")
    println("Dikdortgen cevresi (5,8): ${f.dikdortgenCevresi(5, 8)}")
    println("6 faktoriyel: ${f.faktoriyelHesapla(6)}")
    println("'Antalya' kelimesindeki a sayisi: ${f.aHarfiSayisi("Antalya")}")

    // İkinci ödev seti testleri
    println("8 kenarli cokgenin ic acilari toplami: ${f.icAcilariToplami(8)}")
    println("25 gunluk maas: ${f.maasHesapla(25)} ₺")
    println("30 GB kota ucreti: ${f.kotaUcretiHesapla(30)} ₺")
}