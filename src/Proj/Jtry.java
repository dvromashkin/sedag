package Proj;

import java.util.Scanner;

public class Jtry {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Введите выражение");
        String str0 = a.nextLine();
        String str1 = str0.trim();
        String s1 = str1.replace("IX", "9");
        String s2 = s1.replace("IV", "4");
        String s3 = s2.replace("VIII", "8");
        String s4 = s3.replace("VII", "7");
        String s5 = s4.replace("VI", "6");
        String s6 = s5.replace("V", "5");
        String s7 = s6.replace("III", "3");
        String s8 = s7.replace("II", "2");
        String s9 = s8.replace("I", "1");
        String s10 = s9.replace("X", "10");
        System.out.println("Введенное выражение: " + str1);
        char[] str11 = str1.toCharArray();
        int tot = 0;
        for(char x:str11){
            if(x == '+'){
                tot = tot+1;
            } else if (x == '-') {
                tot = tot+1;
            } else if (x == '/') {
                tot = tot+1;
            } else if (x == '*') {
                tot = tot+1;
            } else {
                tot=tot;
            }
        }
        if (tot>=2){
            System.out.println("Должен быть всего один оператор (+, -, /, *)");
            return;
        }
        int f, b, d;
        if (s10.contains("-")) {
            String[] strings1 = s10.split("-", 2); // разделение введенной строки на 2 части, относительно "-"
            try {
                b = Integer.parseInt(strings1[0].trim()); // преобразование первого введенного числа из String в int с удалением пробелов (trim)
                f = Integer.parseInt(strings1[1].trim()); // преобразование второго введенного числа из String в int с удалением пробелов (trim)
                } catch (NumberFormatException e){
                    System.out.println("Неверно заданы числовые значения");
                    return;
                    }
            if (f > 10 | f < 0 | b > 10 | b < 0) {
                System.out.println("Как минимум одно из чисел в выражении не принадлежит [0,10] или не существует");
                return;
            }
            d = b - f;
            //System.out.println("Результат: " + d);
        } else if (s10.contains("+")) {
            String[] strings1 = s10.split("\\+", 2); // разделение введенной строки на 2 части, относительно "+"
            try {
                b = Integer.parseInt(strings1[0].trim()); // преобразование первого введенного числа из String в int с удалением пробелов (trim)
                f = Integer.parseInt(strings1[1].trim()); // преобразование второго введенного числа из String в int с удалением пробелов (trim)
                } catch (NumberFormatException e){
                    System.out.println("Неверно заданы числовые значения");
                    return;
                    }
            if (f > 10 | f < 0 | b > 10 | b < 0) {
                System.out.println("Как минимум одно из чисел в выражении не принадлежит [0,10] или не существует");
                return;
            }
            d = b + f;
            //System.out.println("Результат: " + d);
        } else if (s10.contains("/")) {
            String[] strings1 = s10.split("/", 2); // разделение введенной строки на 2 части, относительно "/"
            try {
                b = Integer.parseInt(strings1[0].trim()); // преобразование первого введенного числа из String в int с удалением пробелов (trim)
                f = Integer.parseInt(strings1[1].trim());
                } catch (NumberFormatException e){
                    System.out.println("Неверно заданы числовые значения");
                    return;
                    }
            if (f > 10 | f < 0 | b > 10 | b < 0) {
                System.out.println("Как минимум одно из чисел в выражении не принадлежит [0,10] или не существует");
                return;
            }
            d = b / f;
            //System.out.println("Результат: " + d);
        } else if (s10.contains("*")) {
            String[] strings1 = s10.split("\\*", 2); // разделение введенной строки на 2 части, относительно "*"
            try {
                b = Integer.parseInt(strings1[0].trim()); // преобразование первого введенного числа из String в int с удалением пробелов (trim)
                f = Integer.parseInt(strings1[1].trim());
                } catch (NumberFormatException e){
                    System.out.println("Неверно заданы числовые значения");
                    return;
                    }
            if (f > 10 | f < 0 | b > 10 | b < 0) {
                System.out.println("Как минимум одно из чисел в выражении не принадлежит [0,10] или не существует");
                return;
            }
            d = b * f;
            //System.out.println("Результат: " + d);
        } else {
            System.out.println("Вы не ввели действие или действие введено неверно.");
            return;
        }
        String D = Integer.toString(d);
        char[] D1 = D.toCharArray(); // строка D в массив D1

        //for(char find:str11){
        //    boolean y1 = str11[];
        //}
        boolean t = false;
        if (str1.contains("I")){
            t = true;
        } else if (str1.contains("V")) {
            t = true;
        } else if (str1.contains("X")) {
            t = true;
        } else {
            t = false;
        }
        if (t==true && str1.matches("(.*)[0-9](.*)")){
            System.out.println("В выражении должны быть только римские или только из арабские цифры");
            return;
        } else if (t==true) {
            if (d<0){
                System.out.println("В римской системе нет отрицательных чисел");
                return;
            } else if (D1.length == 3) {
                System.out.print("Результат = С");
            } else if (D1.length == 2) {
                String d0 = String.valueOf(D1[0]);
                String d1 = String.valueOf(D1[1]);
                switch (D1[0]) {
                    case '1':
                        d0 = "X";
                        break;
                    case '2':
                        d0 = "XX";
                        break;
                    case '3':
                        d0 = "XXX";
                        break;
                    case '4':
                        d0 = "XL";
                        break;
                    case '5':
                        d0 = "L";
                        break;
                    case '6':
                        d0 = "LX";
                        break;
                    case '7':
                        d0 = "LXX";
                        break;
                    case '8':
                        d0 = "LXXX";
                        break;
                    case '9':
                        d0 = "XC";
                }
                switch (D1[1]) {
                    case '1':
                        d1 = "I";
                        break;
                    case '2':
                        d1 = "II";
                        break;
                    case '3':
                        d1 = "III";
                        break;
                    case '4':
                        d1 = "IV";
                        break;
                    case '5':
                        d1 = "V";
                        break;
                    case '6':
                        d1 = "VI";
                        break;
                    case '7':
                        d1 = "VII";
                        break;
                    case '8':
                        d1 = "VIII";
                        break;
                    case '9':
                        d1 = "IX";
                        break;
                    case '0':
                        d1 = " ";
                        break;
                }

                System.out.print("Результат = ");
                System.out.println(d0 + d1);
                } else {
                String d0 = String.valueOf(D1[0]);
                switch (D1[0]) {
                    case '1':
                        d0 = "I";
                        break;
                    case '2':
                        d0 = "II";
                        break;
                    case '3':
                        d0 = "III";
                        break;
                    case '4':
                        d0 = "IV";
                        break;
                    case '5':
                        d0 = "V";
                        break;
                    case '6':
                        d0 = "VI";
                        break;
                    case '7':
                        d0 = "VII";
                        break;
                    case '8':
                        d0 = "VIII";
                        break;
                    case '9':
                        d0 = "IX";
                }

                System.out.print("Результат = ");
                System.out.println(d0);
            }
        }
        else {
            System.out.println("Результат: " + d);
        }
    }
}



