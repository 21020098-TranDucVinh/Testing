package uet.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Nhập vị trí ứng tuyển: ");
        Scanner sc = new Scanner(System.in);
        String pos = sc.nextLine();
        System.out.println("Nhập tuổi: ");
        int age = sc.nextInt();

        System.out.println(decide(pos, age));
    }

    static String decide(String pos, int age) {
        if (pos.equals("Junior")) {
            if (age <= 0) return "Đầu vào không hợp lệ";
            else if (age <= 18) return "Không thuê";
            else if (age <= 22) return "Thuê bán thời gian";
            else if (age <= 50) return "Thuê toàn thời gian";
            else return "Không thuê";
        } else if (pos.equals("Senior")) {
            if (age <= 0)  {
                return "Đầu vào không hợp lệ";
            } else if (age <= 18) return "Không thuê";
            else if (age <= 22) return "Thuê toàn thời gian";
            else if (age <= 50) return "Thuê toàn thời gian";
            else return "Không thuê";
        } else {
            return "Đầu vào không hợp lệ";
        }
    }

}

