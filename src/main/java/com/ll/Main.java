package com.ll;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        App app = new App();
        app.run();

    }
}

class App {
    public void run() {

        System.out.println("== 명언 앱 ==");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("명령) ");


            String cmd = scanner.nextLine();

            if (cmd.equals("종료")) {
                break;
            } else if (cmd.equals("등록")) {
                System.out.print("명언: ");
                String content = scanner.nextLine();
                System.out.println("작가: ");
                String author = scanner.nextLine();

            }
            System.out.println("입력한 명령: " + cmd);

            scanner.close();


        }
    }
}
