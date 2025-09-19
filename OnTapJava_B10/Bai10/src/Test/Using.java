package Test;

import java.util.Scanner;

import Class.QuanLy;

public class Using {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		QuanLy ql148 = new QuanLy();
		ql148.nhapDanhSach(sc);
		
		System.out.println("Danh sach bien lai cua cac ho gia dinh la: ");
		ql148.hienThiDanhSach();
		
		sc.close();
	}
}
