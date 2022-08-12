package com.sezerogras.kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("hello kotlin!!")

        // variables

        var x = 5
        var y = 4
        println(x*y)

        // var değişken
        // val ise sabit (Constants)

        val  name = "sezer ogras!"

    //name = "atil"  // burada name sabit olduğu için değiştirwmiyorum

   // Integer
      var age = 35              // değişken
      val result = age / 7*5    // sabit
      println(result)
     // defining işlemi yani tanımlamak
     var myInteger : Int
     // alt kısımdaki işleme initialize işlemi denir yani başlatmak ilk degeri atamak
     myInteger = 46
        myInteger = 37

        val sezer : Int   // burada sadece sabit ve bir Integer deger atayabilirim
        sezer = 886

         val ogras : Int = 5  // aynı anda da yazılabilir


       // Float &6 Double    ---> kesirli sayılar

        val pi = 3.14
        println(pi*3)

        val myFloat = 3.3f  // f koyarak otomatik atanılan double olmuyor artık
        var myAge : Double
        myAge = 33.4          // kesirli tanımlamam lazım


        println("------------ String -------------")

        val myString = "sezer ogras"
        val names = "james"
        val surname = "henry"
        val ful_name = names +"   " + surname
        println(ful_name)
        println(myString.capitalize())  // ilk harfi büyütmeme yardımcı oldu

        println("------------ Boolean -------------")

        println(3>5)
        println(6<5)
        println(3==3)
        println(3!=5)

        println("------------ Conversion -------------")

       // Conversion
        var myNumber = 4
       var mrByte =  myNumber.toByte()  // döndürme işlemi yapıldı

        var input = "10"
        var inputInteger = input.toInt()  // burada integera dönüştürdüm
        println(inputInteger*3)


        // Collection

        println("------------ Array -------------")
        // Array

        val myArray = arrayOf("jammes", "sezer", "kirk","lars",6)
       println(myArray[1])
        myArray[1] = "sezer ogras"
        println(myArray[1])
        println(myArray)  // bu şekilde olursa adresini yazzdırmış olacak
        println(myArray[4])
        myArray.set(2,"kirk ismini ahmet yaptım")  // set methodu ile değiştirmiş oldum ayarlamış oldum
        println(myArray[2])

        val numberArray = arrayOf(1,2,3,4,5)
        println(numberArray[3])
        //println(numberArray[5])  // bu şekilde yazarsam fatal exception alırım  çünkü boyut dışına çıktım


        // list - ArrayList
        println("------------ ArrayList -------------")

        val myMusician = ArrayList<String>()  // Stringlerden oluşan bir arraylist tanımladım bunun içine direkkt deger atayamam
        //myMusician[0] = "sezer nasılsın"
        //println(myMusician[0])
        val myMusic = arrayListOf<String>("sezer","merhaba") // bu şekilde içiine deger atamış oldum
        println(myMusic[0])

        myMusic.add("lars")
        myMusic.add(0,"kemal")
        println(myMusic[0])


        myMusician.add("computer")
        println(myMusician[0])

        val myMixedArrayList = ArrayList<Any>()   // farklı veri tiplerini girebilirim
        myMixedArrayList.add("sez")
        myMixedArrayList.add(565.789)
        myMixedArrayList.add(true)
        println(myMixedArrayList[0])
        println(myMixedArrayList[1])
        println(myMixedArrayList[2])

        // Set              ---> dizi veri yapısınndan farkı : dizi içinde eleman bir defa olabilir daha doğrusu bir defa varmış gibi davranır
        println("------------ Set -------------")

        val myExampleArray = arrayOf(1,1,2,3,4)

        println("element 1 =  ${myExampleArray[0]}'dir")
        println("element 2 =  ${myExampleArray[1]}'dir")   // Burada görüldüğü üzre 1 değeri iki elelman içinde aynı

        val mySet = setOf<Int>(1,1,2,3,3,4)

        println(mySet.size)  // burada bana 4 degerini yazdıracak

        // For Each
        mySet.forEach { println(it * 5) } // her bir elemanı 5 ile çarpıp yazacak ama 1 değerini bir defa kullanacak

        val myStringSet = HashSet<String>()
        myStringSet.add("sezer")
        myStringSet.add("sezer")
        println(myStringSet.size)  // burada bana bir degerini yazacak

//        *************   Hash Map öenmli bir konu dikkat *************
        // Map - HashMap    -----> bize dizilerdeki verileri eşleştirmeyi sağlıyor

        println("------------ Map -------------")

        // Key - Value

        val fruitArray = arrayOf("Apple", "Banana")
        val caloriesArray = arrayOf(100, 940)

        println("${fruitArray[0]}  :  ${caloriesArray[0]}")   // HashMap olmasaydı böylle bir yöntem izleyecektik

        val fruitCaloriesMap = hashMapOf<String,Int>()
        fruitCaloriesMap.put("Apple",100)  // anahtara dgerini vermiş oldum
        fruitCaloriesMap.put("Banana",940)
        println(fruitCaloriesMap["Apple"])   // 100 degerini yazdırmış olcak


       // önemli not

        val myHashMap = HashMap<String,String>()  // buraya put ile değer ekleme işlemi yapıyorım
        val myNewMap = hashMapOf<String,Int>("sezer" to 20, "ahmet" to 40)  // to ile anahtarlamış oluyorum
        println(myNewMap["sezer"])  // burada çalıştırdığımda bana 20 degerini verecek


        // Operator
        println("------------ Operator -------------")

        var m = 5
        println(m)
        m = m +1
        println(m)
        m++
        println(m)
        m--

        var n = 7
        println(n > 7)

        // Remainder  ---->  kalan işlemi
        println(10%3)  // burada bana 1 degerinşi yazdırmış olcak



        // If bloğu
        println("------------ If Control -------------")

        val myNumberAge = 32
        if (myNumberAge < 40){
            println("girdiğiniz deger sayı 40 dan küçüktür")
        }

        // Switch - When
        println("------------ Switch -------------")


        val day = 3
        var dayString = ""

        /*
        if (day ==1){
            dayString = "Monday"
        }
        else if (day ==2){
            dayString = "Tuesday"
        }
        else if (day ==3){
            dayString = "Wednesday"
        }

        */


        // When ile yazma tekniği

        when(day){   // kontrol eddeceğim değeri parantez içine yazıyorum

            1 -> dayString = "Monday"   // meali : ne zaman day değeri 1 e eşitse o zaman dayStringe Monday değerini ata demek
            2 -> dayString = "Tuesday"
            3 -> dayString = "Wednesday"
            else -> dayString = "Maalesef bilmiyorum"
        }
        println(dayString)


        // Loops
        // For loop  dizilerle çok iyi çalışır bir yerde dizi varsa for loop vardrı demektir

        println("------------ For Loop -------------")

        val myArrayOfNumbers = arrayOf(12,15,18,21,24,27,30,33)
       /* val q = myArrayOfNumbers[0]/3*5
        println(q)

        */

        for(number in myArrayOfNumbers){  // bu blokta myArrayNumbers taki değerleri  tek tek number değişkenine ata demek sırayla ama
            val z = number/3*5
            println(z)              // burada sırayla yazmış olacak

        }


        myArrayOfNumbers.forEach { println(it) }



        for(i in myArrayOfNumbers.indices){     // burada sayısını i değişkenine atıyorum farklı bir kullanım bu da
            if (i<4) {
                val qz = myArrayOfNumbers[i] / 3 * 5
                println(qz)
            }
        }

        // farklı bir  kullanım daha

        for (b in 0..9){
            println(b)    // sıfırdan 9 a kadar yazdıracak
        }


        val myList = ArrayList<String>()
        myList.add("sezer")
        myList.add("ogras")
        myList.add("sero")

        for (str in myList){
            println(str)
        }
        // ya da For Each ile yazdıralım

        myList.forEach { println(it) }


        // While Loop
        println("------------ While Loop -------------")

        var j = 0

        while (j < 10){

            println(j)
            j++
        }


 



    }
}




















