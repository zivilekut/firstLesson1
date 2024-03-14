import javax.lang.model.SourceVersion;
import javax.lang.model.element.NestingKind;
import java.math.RoundingMode;
import java.sql.SQLOutput;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        // Kintamieji

//        byte baitas = 10;
//        System.out.println(baitas);
//        baitas = 29;
//        System.out.println(baitas);
//        short sortai = 12345;
        int teisingasSkaicius = 123456789;
        long ilgasSkaicius = 1111111111111111111L;
//        float kaina = 40.46F;
        double PI = 3.1417;
        boolean willWeLearnSomething = true;
        boolean willItBeEasy = false;
//        char aLetter = 'a';
//        char numberChar = '7';
        String manoVardas = "Zivile";
        String miestas = "Vilnius";
        System.out.println("Labas " + manoVardas);


        //Salyginiai sakiniai

//        if(){}
//        else(){}
//        for(){}
//        while(){}
//        function(){}
//        switch (){}

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
// Užduotys
// 1. Sukurkite 4 kintamuosius, kurie saugotų jūsų vardą, pavardę, gimimo metus ir šiuos metus (nebūtinai tikrus).
// Parašykite kodą, kuris pagal gimimo metus paskaičiuotų jūsų amžių ir naudodamas vardo ir pavardės kintamuosius
// atspausdintų tokį sakinį :
//"Aš esu Vardenis Pavardenis. Man yra XX metai(ų)".
        String vardas = "Živilė";
        String pavarde = "Kutulytė";
        int gimimoMetai = 1995;
        int sieMetai = 2024;
        System.out.println("Aš esu " + vardas + " " + pavarde + ". Man šiais metais sueis " + (sieMetai - gimimoMetai) + " metai(ų).");

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

// 2. Sukurkite du kintamuosius ir naudodamiesi funkcija Math.random() jiems priskirkite atsitiktines reikšmes nuo
// 0 iki 4. Didesnę reikšmę padalinkite iš mažesnės. Atspausdinkite rezultatą jį suapvalinę iki 2 skaičių po kablelio.

        // reikėtų patobulinti, nes niekada nesugeneruos 4
        double num1 = Math.round(Math.random() * 4);
        double num2 = Math.round(Math.random() * 4);
        System.out.println(num1 + " " + num2);

        DecimalFormat f = new DecimalFormat("#.00");

        if (num1 > num2) {
            System.out.println(f.format(num1 / num2));
        } else {
            System.out.println(f.format(num2 / num1));
        }

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        //////////////// kitas variantas ///////////////////////////

        int rndNum1 = (int) Math.round(Math.random() * 4);
        int rndNum2 = (int) Math.round(Math.random() * 4);
        System.out.println(rndNum1 + " " + rndNum2);

        if (rndNum1 != 0 && rndNum2 != 0) {
            if (rndNum1 > rndNum2) {
                System.out.println(Math.round((double) rndNum1 / rndNum2 * 100) / 100.0);
            } else {
                System.out.println(Math.round((double) rndNum2 / rndNum1 * 100) / 100.0);
            }
        } else {
            System.out.println("Dalyba iš 0 negalima");
        }


        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

// 3. Naudokite funkcija Math.random(). Sukurkite tris kintamuosius ir naudodamiesi funkcija Math.random() jiems
// priskirkite atsitiktines reikšmes nuo 0 iki 25. Raskite ir atspausdinkite kintąmąjį turintį vidurinę reikšmę.

        int nr1 = (int) Math.round(Math.random() * 25);
        int nr2 = (int) Math.round(Math.random() * 25);
        int nr3 = (int) Math.round(Math.random() * 25);

        System.out.println(nr1);
        System.out.println(nr2);
        System.out.println(nr3);

        System.out.println("Mediana:");

        if ((nr1 > nr2 && nr1 < nr3) || (nr1 < nr2 && nr1 > nr3)) {
            System.out.println(nr1);
        }

        if ((nr2 > nr1 && nr2 < nr3) || (nr2 < nr1 && nr2 > nr3)) {
            System.out.println(nr2);
        }

        if (nr3 > nr1 && nr3 < nr2 || (nr3 < nr1 && nr3 > nr2)) {
            System.out.println(nr3);
        }

        if (nr1 == nr2 || nr2 == nr3 || nr1 == nr3) {
            System.out.println("Yra vienodų skaičių.");
        }

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

// 4. Įvedami skaičiai - a, b, c –kraštinių ilgiai, trys kintamieji (naudojame int) (naudokite Math.random() funkcija
// nuo 1 iki 10). Parašykite Java programą, kuri nustatytų, ar galima sudaryti trikampį ir atsakymą atspausdintų.

        int min = 1;
        int max = 10;

        int a = (int) (min + Math.round(Math.random() * (max - min)));
        int b = (int) (min + Math.round(Math.random() * (max - min)));
        int c = (int) (min + Math.round(Math.random() * (max - min)));

        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);

        // The sum of the length of any two sides of a triangle is greater than the length of the third side.

        if ((a + b) > c && (a + c) > b && (b + c) > a) {
            System.out.println("Galima sudaryti trikampį.");
        } else {
            System.out.println("Negalima sudaryti trikampio.");
        }

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

// 5. Sukurkite keturis kintamuosius ir Math.random() funkcija sugeneruokite jiems
//reikšmes nuo 0 iki 2. Suskaičiuokite kiek yra nulių, vienetų ir dvejetų. (sprendimui masyvo nenaudoti).
// (bus 12 if, 3 skaičiavimai, kur tikrins ar 0 ar 1 ar 2.)

        int r1 = (int) Math.round(Math.random() * 2);
        int r2 = (int) Math.round(Math.random() * 2);
        int r3 = (int) Math.round(Math.random() * 2);
        int r4 = (int) Math.round(Math.random() * 2);

        System.out.println(r1 + " " + r2 + " " + r3 + " " + r4);

        int countZeros = 0;
        int countOnes = 0;
        int countTwos = 0;

        if (r1 == 0) {
            countZeros++;
        }

        if (r2 == 0) {
            countZeros++;
        }

        if (r3 == 0) {
            countZeros++;
        }

        if (r4 == 0) {
            countZeros++;
        }

        if (r1 == 1) {
            countOnes++;
        }

        if (r2 == 1) {
            countOnes++;
        }

        if (r3 == 1) {
            countOnes++;
        }

        if (r4 == 1) {
            countOnes++;
        }

        if (r1 == 2) {
            countTwos++;
        }

        if (r2 == 2) {
            countTwos++;
        }

        if (r3 == 2) {
            countTwos++;
        }

        if (r4 == 2) {
            countTwos++;
        }

        System.out.println("Zeros: " + countZeros + " Ones: " + countOnes + " Twos: " + countTwos);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

// 6. Naudokite funkcija Math.random(). Sukurkite ir atspausdinkite 3 skaičius nuo -10 iki 10. Skaičiai mažesni už 0 turi
// būti  laužtiniuose skliaustuose [], 0 -  (), didesni už 0 {}.   [-4],  (0),  {7}

        int min2 = -10;
        int max2 = 10;

        int s1 = (int) (min2 + Math.round(Math.random() * (max2 - min2)));
        int s2 = (int) (min2 + Math.round(Math.random() * (max2 - min2)));
        int s3 = (int) (min2 + Math.round(Math.random() * (max2 - min2)));

        System.out.println(s1 + " " + s2 + " " + s3);

        if (s1 < 0) {
            System.out.println("[" + s1 + "]");
        } else if (s1 > 0) {
            System.out.println("{" + s1 + "}");
        } else {
            System.out.println("(" + s1 + ")");
        }

        if (s2 < 0) {
            System.out.println("[" + s2 + "]");
        } else if (s2 > 0) {
            System.out.println("{" + s2 + "}");
        } else {
            System.out.println("(" + s2 + ")");
        }

        if (s3 < 0) {
            System.out.println("[" + s3 + "]");
        } else if (s3 > 0) {
            System.out.println("{" + s3 + "}");
        } else {
            System.out.println("(" + s3 + ")");
        }

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

// 7. Įmonė parduoda žvakes po 1 EUR. Perkant daugiau kaip 1000 vienetų taikoma 3 % nuolaida, daugiau kaip 2000
// vienetų- 4 % nuolaida. Parašykite programą, kuri skaičiuos žvakių kainą ir atspausdintų atsakymą kiek žvakių ir
// kokia kaina perkama. Žvakių kiekį generuokite Math.random() funkcija nuo 5 iki 3000.

        int min3 = 5;
        int max3 = 3000;
        int kaina = 1;

        int zvakes = (int) (min3 + Math.round(Math.random() * (max3 - min3)));

        if (zvakes >= 2000) {
            System.out.println("Perkamų žvakių skaičius: " + zvakes + ". Nuolaida: 4%. Kaina: " + zvakes * kaina * 0.96);
        } else if (zvakes >= 1000) {
            System.out.println("Perkamų žvakių skaičius: " + zvakes + ". Nuolaida: 3%. Kaina: " + zvakes * kaina * 0.97);
        } else {
            System.out.println("Perkamų žvakių skaičius: " + zvakes + ". Nuolaidos nėra. Kaina: " + zvakes * kaina);
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

// 8. Naudokite funkcija Math.random(). Sukurkite tris kintamuosius su atsitiktinėm reikšmėm nuo 0 iki 100.
// Paskaičiuokite jų aritmetinį vidurkį. Ir aritmetinį vidurkį atmetus tas reikšmes, kurios yra mažesnės nei 10
// arba didesnės nei 90. Abu vidurkius atspausdinkite. Rezultatus apvalinkite iki sveiko skaičiaus.

        int k1 = (int) Math.round(Math.random() * 100);
        int k2 = (int) Math.round(Math.random() * 100);
        int k3 = (int) Math.round(Math.random() * 100);

        System.out.println(k1);
        System.out.println(k2);
        System.out.println(k3);


        System.out.println("Vidurkis1: " + Math.round((k1 + k2 + k3) / 3.0));


/*        if ((k1 < 10 || k1 > 90) && (k2 < 10 || k2 > 90) && (k3 < 10 || k3 > 90)) {
            System.out.println("Neina paskaičiuoti antro vidurkio.");
        } else {
            long vidurkis;
            if ((k1 < 10 || k1 > 90) && (k2 < 10 || k2 > 90)) {
                vidurkis = k3;
            } else if ((k1 < 10 || k1 > 90) && (k3 < 10 || k3 > 90)) {
                vidurkis = k2;
            } else if ((k2 < 10 || k2 > 90) && (k3 < 10 || k3 > 90)) {
                vidurkis = k1;
            } else if (k1 < 10 || k1 > 90) {
                vidurkis = Math.round((k2 + k3) / 2.0);
            } else if (k2 < 10 || k2 > 90) {
                vidurkis = Math.round((k1 + k3) / 2.0);
            } else if (k3 < 10 || k3 > 90) {
                vidurkis = Math.round((k1 + k2) / 2.0);
            } else {
                vidurkis = Math.round((k1 + k2 + k3) / 3.0);
            }
            System.out.println("Vidurkis2: " + vidurkis);
        }*/

        int sum = 0;
        int count = 0;
        if (k1 >= 10 && k1 <= 90) {
            sum += k1;
            count++;
        }
        if (k2 >= 10 && k2 <= 90) {
            sum += k2;
            count++;
        }
        if (k3 >= 10 && k3 <= 90) {
            sum += k3;
            count++;
        }

        if (count != 0) {
            System.out.println("Vidurkis2: " + (double) sum / count);
        } else {
            System.out.println(0);
        }


        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

// 9. Padarykite skaitmeninį laikrodį, rodantį valandas, minutes ir sekundes. Valandom, minutėm ir sekundėm
// sugeneruoti panaudokite funkciją Math.random(). Sugeneruokite skaičių nuo 0 iki 300. Tai papildomos sekundės.
// Skaičių pridėkite prie jau sugeneruoto laiko. Atspausdinkite laikrodį prieš ir po sekundžių pridėjimo ir pridedamų
// sekundžių skaičių.

        int h = (int) Math.round(Math.random() * 23);
        int m = (int) Math.round(Math.random() * 59);
        int s = (int) Math.round(Math.random() * 59);
        int papildomosSekundes = (int) Math.round(Math.random() * 300);

        System.out.println("Dabar laikrodis rodo: " + h + ":" + m + ":" + s);


        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

//        git config --global user.name "zivilekut"
//        git config --global user.email "zivilekut@gmail.com"



    }
}