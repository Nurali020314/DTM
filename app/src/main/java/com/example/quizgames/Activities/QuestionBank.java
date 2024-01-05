package com.example.quizgames.Activities;

import java.util.ArrayList;
import java.util.List;

public class QuestionBank {
    private static List<QuestinsList> matemQuestion() {
        final List<QuestinsList> allquestions = new ArrayList<>();
        final QuestinsList question1 = new QuestinsList("1, 2, 3, 4, …, 9, 10, 11 – ushbu ketma ketlikda tushirib qoldirilgan sonlar  yig'indisini toping.", "26", "21", "35", "30", "26", "");
        final QuestinsList question2 = new QuestinsList("O'n ikki milliard olti yuz sakson to'qqiz ming ikki sonini raqamlar bilan yozing.", "126892", "12689002", "12689002", "12000689002", "12000689002", "");
        final QuestinsList question3 = new QuestinsList("5 + 10 + 15 + 20 + ... + 95 + 100 yig'indini hisoblang", "1050", "1065", "1035", "1080", "1050", "");
        final QuestinsList question4 = new QuestinsList("3 raqami qatnashgan nechta ikki xonali son bor?", "9", "18", "19", "20", "18", "");
        final QuestinsList question5 = new QuestinsList("Quyidagilardan qaysi biri notoʻgʻri?", "78 sm = 7 dm 8 sm", "6 dm 2 sm = 62 sm", "1 m 1 sm = 11 sm", "4 dm 6 sm 7 mm = 467 mm", "1 m 1 sm = 11 sm", "");
        final QuestinsList question6 = new QuestinsList("Kesishuvchi ikki to'g'ri chiziq tekislikni nechta qismga bo’ladi?", "1", "2", "3", "4", "4", "");
        final QuestinsList question7 = new QuestinsList("Kilogramm bilan ifodalang: 7 t 20 kg.", "720 kg", " 702 kg", "7200 kg", "7020 kg", "7020 kg", "");
        final QuestinsList question8 = new QuestinsList("Tenglamani yeching:37-(x-13)= 24 ", "74", "4", "26", "36", "26", "");
        final QuestinsList question9 = new QuestinsList("3 ta turli kitobni 3 ta o‘quvchiga (har biriga bir donadan berish sharti bilan) necha xil usulda berish mumkin?", "6", "4", "2", "3", "6", "");
        final QuestinsList question10 = new QuestinsList("A mulohaza “Har qanday toq son 2 ga qoldiqsiz bo‘linadi”, B mulohaza esa “6 soni 4 ta natural bo‘luvchiga ega”. Ushbu mulohazalar asosida to‘g‘ri javobni toping.", "A yolg‘on va B rost ", "A va B rost", "A rost va B yolg‘on", "A va B yolg‘on", "A yolg‘on va B rost ", "");
      //  final QuestinsList question11 = new QuestinsList("Yulduzcha o‘rniga qo‘yish mumkin bo‘lgan barcha raqamlar yig‘indisini toping. ”. Ushbu mulohazalar asosida to‘g‘ri javobni toping.", "30", "18", "24", "20", "20", "");
       // final QuestinsList question12 = new QuestinsList(" a va b manfiy butun sonlar uchun  a=b+ 2 va  a+b-c = 13 bo‘lsa, c ning eng katta qiymatini toping.", "-18", " −17", "−16 ", " −15", " −15", "");
       // final QuestinsList question13 = new QuestinsList("Qirralarining uzunligi 4 m bo`lgan kub yasash uchun qancha sim kerak? ", "40 m", "48 m", " 36 m ", "64 m", "64 m", "");
       // final QuestinsList question14 = new QuestinsList(" Quyidagi juftliklardan o’zaro tub bo’lmaganini aniqlang .", "(5;85)", "(11;92)", "(1;17)", "(45;47)", "(45;47)", "");
       // final QuestinsList question15 = new QuestinsList("|x-8|<5 tengsizlik natural yechimlari yig'indisini 50%ga kattalashtirishdan hosil bo'lgan sonni toping.", "144", "72", "108", "36", "36", "");

        allquestions.add(question1);
        allquestions.add(question2);
        allquestions.add(question3);
        allquestions.add(question4);
        allquestions.add(question5);
        allquestions.add(question6);
        allquestions.add(question7);
        allquestions.add(question8);
        allquestions.add(question9);
        allquestions.add(question10);
      // allquestions.add(question11);
      // allquestions.add(question12);
      // allquestions.add(question13);
      // allquestions.add(question14);
      // allquestions.add(question15);
       return allquestions;
    }

    private static List<QuestinsList> tarix(){
        final List<QuestinsList> allquestions = new ArrayList<>();
        final QuestinsList question1 = new QuestinsList("1917-yil tuzilgan Turkiston o’lka musulmonlar kengashi raisi kim bo’lgan? ", "Mustafo Cho’qay", " Nizomiddin Xo’jayev ", "Abdurauf Fitrat ", "Usmon Yusupov", "Mustafo Cho’qay", "");
        final QuestinsList question2 = new QuestinsList("Mil.avv. I mingyillikda O’rta Osiyoda qaysi din keng tarqalgan? ", "shomoniylik", "moniylik ", " zardushtiylik", "buddaviylik ", " zardushtiylik", "");
        final QuestinsList question3 = new QuestinsList("1865-yil tashkil etilgan Turkiston viloyati gubernatori kim bo’lgan? ", "Duxovoskoy", "Kaufman", "Korolkov", "Chernyayev", "Chernyayev", "");
        final QuestinsList question4 = new QuestinsList("999-yilda Somoniylar davlatiga barham bergan qoraxoniy hukmdori kim? ", "Mahmud ", "Nasr Eloqxon ", "Horun Bug’roxon ", " Ibrohim Bo’ritegin ", "Nasr Eloqxon ", "");
        final QuestinsList question5 = new QuestinsList("O’rta asrlarda kimlar o’zbeklar va tojiklar etnogenezida muhim rol o’ynagan? ", "Qipchoqlar ", "O’g’uzlar  ", "Qarluqlar ", "Qo’ng’irotlar ", "Qarluqlar ", "");
        final QuestinsList question6 = new QuestinsList("1740-yilda Xiva xonligi qaysi davlatga qaram bo’lib qoldi? ", "Safaviylar", "Buxoro amirligi ", "Qo’qon xonligi ", "Rossiya imperiyasi ", "Safaviylar", "");
        final QuestinsList question7 = new QuestinsList("1858-yil Buxoroga diplomatik aloqa  o’rnatish uchun Rossiya tomonidan yuborilgan vakil kim? ", " Muravyov ", "Perovskiy", "Benevini", " Ignatyev ", " Ignatyev ", "");
        final QuestinsList question8 = new QuestinsList("2000-yil 30-avgustda quyidagi qaysi orden joriy etilgan? ", " “Alisher Navoiy” ordeni ", "“Amir Temur” ordeni ", "”Jaloliddin Manguberdi” ordeni ", "“Kamoliddin Behzod” ordeni ", "”Jaloliddin Manguberdi” ordeni ", "");
        final QuestinsList question9 = new QuestinsList("Turk xoqonligida chorvador aholi qanday nom bilan atalgan? ", "Budun", "Sho", "Tegin", "Naqib", "Budun", "");
        final QuestinsList question10 = new QuestinsList("Oydo’stbiy boshchiligidagi qo’zg’olon qachon bo’lib o’ygan?", "1827 yil", "1828 yil", "1823 yil ", "1723 yil", "1827 yil", "");


         allquestions.add(question1);
         allquestions.add(question2);
         allquestions.add(question3);
         allquestions.add(question4);
         allquestions.add(question5);
         allquestions.add(question6);
         allquestions.add(question7);
         allquestions.add(question8);
         allquestions.add(question9);
         allquestions.add(question10);
         return allquestions;
    }

    private static List<QuestinsList> onatili(){
        final List<QuestinsList> allquestions = new ArrayList<>();
        final QuestinsList question1 = new QuestinsList("Gap bo'laklari va gaplarni tobelantirib bog'lovchi, ular orasidagi shart ma'nosini ifodalovchi bog'lovchini toping.", "Ya'ni ", "Negaki", "Garchi", "Balki", "Garchi", "");
        final QuestinsList question2 = new QuestinsList("Chog'li, bo'ylab, kabi ko'makchilar qaysi kelishik shaklidagi so'zlarga qo'shiladi?", "Bosh kelishigidagi", "Qaratqich kelishigidagi", "Jo'nalish kelishigidagi", "Chiqish kelishigidagi", "Bosh kelishigidagi", "");
        final QuestinsList question3 = new QuestinsList("Qiy-chuv bilan ularni yengib bo'lmaydi. Ushbu gapda qaysi ikkinchi darajali gap bo'lagi qatnashgan?", "Faqat to'ldiruvchi ", "Hol va to'ldiruvchi", "Aniqlovchi va hol", "Aniqlovchi va to'ldiruvchi", "Hol va to'ldiruvchi", "");
        final QuestinsList question4 = new QuestinsList("Gap qatnashgan qatorni toping.", "Chiroyli gul ", "Muhandis akam", "G'azalni yodlash", "Gul chiroyli", "Gul chiroyli", "");
        final QuestinsList question5= new QuestinsList("gap markazida bolib, u tasdiq-inkor, zamon, mayl, shaxs-son ma'nolarini ifodalab keladi, hukmni ifodalaydi va gapning boshqa bolaklarini oz atrofida birlashtiradi. Bu ta'rif qaysi bolakka tegishli?", "Ega", "Kesim", "Ega va kesim", "Aniqlovchi", "Kesim", "");
        final QuestinsList question6= new QuestinsList("Qaysi qatordagi gapda hozirgi zamon shaklining yozma nutq uslubiga xos 7 shakli qo'llangan? ", "O'qishlar boshlanib, o'quvchilar ham maktabga kelyapti.", "Dalaga suv chiqaraman, ekinlar gurkirab, yashnab ketadi.", "Istiqlol tufayli chekka qishloqlarda ham havaslansa arzigulik korxonalar yaratildi", " Anjuman yuzasidan tavsiyanomalar ishlab chiqilib ishtirokchilarga tarqatilmoqda.", " Anjuman yuzasidan tavsiyanomalar ishlab chiqilib ishtirokchilarga tarqatilmoqda.", "");

        final QuestinsList question7= new QuestinsList("It tumshug'i suqqani bilan daryo harom bo'lib qolmaydi, nomard tosh otgani bilan tog' qulab tushmaydi. Ushbu gapda qo'llangan so'zlarning nechtasi fonetik hodisaga uchragan?", "1 ta so'zda", "2 ta so'zda", "3 ta so'zda", "maqolda fonetik o'zgarishga uchragan so'z berilmagan", "2 ta so'zda", "");
        final QuestinsList question8= new QuestinsList("Qaysi qatorda berilgan gap yig'iq gap emas? ", " Barpo etilmoqda.", "Havas qilmoqda.", "Dovrug'i oshdi.", "Barchasi yig'iq gap.", "Barchasi yig'iq gap.", "");
        final QuestinsList question9= new QuestinsList("Rejani yana qaytadan ko'rib chiqishga to'g'ri keladi. Ushbu gap...", " shaxsi umumlashgan gap", "shaxsi noma'lum gap ", " shaxsi ma'lum gap", "atov gap", "shaxsi noma'lum gap ", "");
        final QuestinsList question10= new QuestinsList(" Qaysi qatordagi gapda qo'llangan antonim (zid ma'noli) so'zlar ravish so'z turkumiga oid?", "  Yaxshi so'z-jon ozig'i, yomon so'z-bosh qozig'i", "Do'st achitib gapirar, dushman kuldirib.", " Oz so'zla, ko'p tingla.", " Eskisiz yangi bo'lmas, yomonsiz yaxshi ", " Oz so'zla, ko'p tingla.", "");

        allquestions.add(question1);
        allquestions.add(question2);
        allquestions.add(question3);
        allquestions.add(question4);
        allquestions.add(question5);
        allquestions.add(question6);
        allquestions.add(question7);
        allquestions.add(question8);
        allquestions.add(question9);
        allquestions.add(question10);
        return allquestions;

    }

    public static List<QuestinsList> getQuestions(String seletedTopic){
        switch (seletedTopic){
            case "Matematika":
                return matemQuestion();
            case "Tarix":
                return tarix();
            case "Ona tili":
                return onatili();
            default:
                return null;
        }
    }
}

