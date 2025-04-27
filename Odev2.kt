package com.example.kotlin_ders.nesne_tabanli_programlama

class Odev2
{
    // 1.Ödev Seti
    // 1) Dereceyi Fahrenheit'a dönüştürme
    fun dereceToFahrenheit(derece:Double): Double{
        return derece * 1.8 + 32
    }

    // 2) Dikdörtgen çevresi hesaplama
    fun dikdortgenCevresi(kenar1:Int,kenar2:Int): Int{
        return 2 * (kenar1+kenar2)
    }

    // 3) Faktöriyel hsaplama
    fun faktoriyelHesapla(sayi:Int): Int{
        var sonuc = 1
        for (i in 1..sayi){
            sonuc *= i
        }
        return sonuc
    }

    // 4) Kelimedeki "a" harfi sayısını bulma
    fun aHarfiSayisi(kelime:String): Int{
        var sayac = 0
        for(harf in kelime.lowercase()){
            if(harf == 'a'){
                sayac++
            }
        }
        return sayac
    }

    // 2.Ödev Seti
    // 1) İç içe açılar toplamı
    fun icAcilariToplami(kenarSayisi:Int): Int{
        return (kenarSayisi - 2 ) * 180
    }

    // 2) Maaş Ücreti
    fun maasHesapla(gunsayisi:Int): Double{
        val calismaSaati = gunsayisi * 8
        val normalSaat = if (calismaSaati > 160) 160 else calismaSaati
        val mesaiSaat = if (calismaSaati > 160) calismaSaati - 160 else 0
        return (normalSaat * 10.0) + (mesaiSaat * 20.0)
    }

    // 3. Kota ücreti hesaplama
    fun kotaUcretiHesapla(kotaMiktariGB: Int): Double {
        val sabitKotaLimiti = 50
        val sabitUcret = 100.0
        val asimBirimFiyati = 4.0

        val asimMiktariGB = if (kotaMiktariGB > sabitKotaLimiti) {
            kotaMiktariGB - sabitKotaLimiti
        } else {
            0
        }

        return sabitUcret + (asimMiktariGB * asimBirimFiyati)
    }

}