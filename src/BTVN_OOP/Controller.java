package BTVN_OOP;

import java.util.Scanner;

public class Controller {

    public static void show(NhanVien[] nhanViens) {
        for (NhanVien nv : nhanViens) {
            System.out.println(nv.toString());
        }
    }

    public static NhanVien[] createNhanVien(NhanVien[] nhanViens) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập name");
        String name = scanner.nextLine();
        System.out.println("nhập gender");
        String gender = scanner.nextLine();
        System.out.println("nhập age");
        int age = scanner.nextInt();

        NhanVien nhanVien = new NhanVien(name, age, gender);

        NhanVien[] newNV = new NhanVien[nhanViens.length + 1];
        for (int i = 0; i < nhanViens.length; i++) {
            newNV[i] = nhanViens[i];
        }

        newNV[newNV.length - 1] = nhanVien;
        return newNV;

    }

    public static NhanVien[] delete(NhanVien[] nhanViens){
        return null ;
    }

}
