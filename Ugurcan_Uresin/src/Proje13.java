public class Proje13 {
    'def ucgen_kontrol(a, b, c)':
            if 'a + b > c and a + c > b and b + c > a':
            return 'True'
    else:
            return 'False'

    'def kenar_tipi(a, b, c)':
            if 'a == b and b == c':
            return "Eşkenar üçgen"
    'elif a == b or b == c or a == c:
            return "İkizkenar üçgen"
    'elif a**2 + b**2 == c**2 or a**2 + c**2 == b**2 or b**2 + c**2 == a**2:
            return "Dik üçgen"
            else:
            return "Çeşitkenar üçgen"

            'Kullanıcıdan üç kenar uzunluğunu al'
    'a = float('input("1. Kenar uzunluğunu girin: "))
    'b = float('input("2. Kenar uzunluğunu girin: "))
    'c = float('input("3. Kenar uzunluğunu girin: "))

            'Üçgen kontrolü yap'
if 'ucgen_kontrol(a, b, c'):
    print("Bu kenar uzunluklarıyla bir üçgen oluşturulabilir.")
    print("Kenar tipi:", 'kenar_tipi(a, b, c))
            else:
    'print("Bu kenar uzunluklarıyla bir üçgen oluşturulamaz.")'
}
