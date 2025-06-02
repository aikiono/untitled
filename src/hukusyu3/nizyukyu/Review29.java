package hukusyu3.nizyukyu;

import java.util.Scanner;

public class Review29 {
    public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("宛先を入力>");
            String to =sc.nextLine() ;
            System.out.print("件名を入力>");
            String subject =sc.nextLine() ;
            System.out.print("本文を入力>");
            String body =sc.nextLine() ;
            System.out.println(to + "に以下のメールを送信しました。");
            System.out.println("件名: " + subject);
            System.out.println("本文: " + body);
        }
    }
}


