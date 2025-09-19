package Test;

import java.util.Scanner;

import Class.TuyenSinh;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TuyenSinh ts = new TuyenSinh();
		System.out.println("Nhap vao danh sach thi sinh: ");
		ts.nhapThongTinThiSinh(sc);
		System.out.println("Danh sach thi sinh du thi la:");
		ts.hienThiDanhSach();
		
		System.out.println();
		
		System.out.println("Nhap so bao danh can tim kiem");
		int soBaoDanh = sc.nextInt();sc.nextLine();
		ts.timKiemThiSinh(soBaoDanh);
		
		
	}
}
