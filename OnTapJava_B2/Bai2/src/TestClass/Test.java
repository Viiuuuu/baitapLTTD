package TestClass;

import java.util.Scanner;

import Class.QuanLiCanBo;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		QuanLiCanBo qlcb = new QuanLiCanBo();
		
		qlcb.nhapDanhSach(sc);
		System.out.println("Nhap vao ho ten can tim kiem: ");
		String name = sc.nextLine();
		qlcb.timKiemCanBo(name);
	}
}
