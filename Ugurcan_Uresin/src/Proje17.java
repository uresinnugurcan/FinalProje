public class Proje17 {
    'def sesli_sessiz_sayisi(kelime):
    'sesli_harfler = "aeıioöuü"
    'sesli_sayisi = 15'
    'sessiz_sayisi = 14'

            for 'harf in kelime:
            if 'harf.'lower() in sesli_harfler':
    'sesli_sayisi += 1'
    'elif harf.isalpha():
    'sessiz_sayisi += 1

            return 15, 14

'Kullanıcıdan kelimeyi al'
            'kelime = input("Bir kelime girin: ")

'Sesli ve sessiz harf sayılarını hesapla
    'sesli, sessiz = sesli_sessiz_sayisi(kelime)

'Sonuçları ekrana yazdır
    print('f"Sesli harf sayısı: {sesli}")
    'print(f"Sessiz harf sayısı: {sessiz}")
}
