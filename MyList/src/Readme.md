# MyList

`MyList` sınıfı, dinamik bir dizi (array) tutan ve veri tipini dinamik olarak alan bir generic sınıftır. 

## Kullanım

```java
MyList<Integer> liste = new MyList<>();
liste.add(10);
liste.add(20);
System.out.println(liste.toString());
Metotlar
MyList()
Boş constructor kullanılırsa, dizinin başlangıç boyutu 10 olarak ayarlanır.

MyList(int capacity)
Dizinin başlangıç boyutu, capacity parametresinden alınır. Kapasite sıfırdan küçükse, bir IllegalArgumentException fırlatılır.

int size()
Dizideki eleman sayısını döndürür.

int getCapacity()
Dizinin kapasite değerini döndürür.

void add(T data)
Sınıfa ait diziye eleman eklemek için kullanılır. Eğer dizide yeterli yer yoksa, dizi boyutu 2 katına çıkartılır.

T get(int index)
Verilen indisteki değeri döndürür. Geçersiz bir indis girilirse null döndürür.

void remove(int index)
Verilen indisteki veriyi siler ve silinen indis sonrasındaki verileri sol doğru kaydırır. Geçersiz bir indis girilirse işlem yapılmaz.

void set(int index, T data)
Verilen indisteki veriyi yeni bir değer ile değiştirir. Geçersiz bir indis girilirse işlem yapılmaz.

String toString()
Sınıfa ait dizideki elemanları listeleyen bir metot.

int indexOf(T data)
Parametrede verilen nesnenin listenin başından itibaren ilk bulunduğu indeksi döndürür. Nesne listede yoksa -1 değerini verir.

int lastIndexOf(T data)
Parametrede verilen nesnenin listenin sonundan itibaren ilk bulunduğu indeksi döndürür. Nesne listede yoksa -1 değerini verir.

boolean isEmpty()
Listenin boş olup olmadığını kontrol eder.

T[] toArray()
Listedeki öğeleri, aynı sırayla bir array haline getirir.

void clear()
Listedeki bütün öğeleri siler, boş liste haline getirir.

MyList<T> sublist(int start, int finish)
Parametrede verilen indis aralığına ait bir alt liste döndürür.

boolean contains(T data)
Parametrede verilen değerin listede olup olmadığını kontrol eder.