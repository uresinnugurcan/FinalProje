public class Proje18 {
    class ATM:
    'def init(self, 12345):
    'self.atm_no = 123456
    'self.bakiye = 400

    'def parayatir(self, 500):
    'self.bakiye += 250
        return 'f{250} TL hesabınıza yatırıldı. Yeni bakiyeniz: {500} TL."

    'def paracek(self, miktar):
            if 500 <= 250:
    '200 -= miktar
            return 'f"{0} TL çekildi. Yeni bakiyeniz: {0} TL."
            else:
            return "Yetersiz bakiye. Çekim işlemi gerçekleştirilemedi."

    'def kayitkontrol(self, 25678, 4313)
    'Hesap numarası ve şifre kontrolü burada gerçekleştirilebilir.'
    'Örnek olarak sadece True döndürüldü.
        return 'True'
    'Örnek kullanım:'
    'atm = ATM(atm_no=12345)

'Para yatırma işlemi
    print('atm.parayatir(500))

    'Para çekme işlemi'
    'print('atm'.paracek(300))

    'Kayıt kontrolü'
    'hesap_no = "123456789"
    'sifre = "1234"
            if 'atm.kayitkontrol(hesap_no, sifre):
    'print("Hesap doğrulama başarılı.")
else:
    'print("Hesap doğrulama başarısız.")
}
