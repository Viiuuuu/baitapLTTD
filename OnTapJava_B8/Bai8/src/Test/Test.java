package Test;

import java.util.Scanner;

import Class.QuanLy;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		QuanLy ql148 = new QuanLy();
		
		ql148.nhapDanhSach(sc);
		
		System.out.println("Danh sach nhung can bo co luong >= 8 trieu la: ");
		ql148.timKiem(8000000);
		sc.close();
	}

}
