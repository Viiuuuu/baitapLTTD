package Class;

import java.util.Scanner;

public class Nguoi {
	private String hoTen148, ngaySinh148, queQuan148;
	public Nguoi() {
	
	}

	public Nguoi(String hoTen, String ngaySinh, String queQuan) {
		this.hoTen148 = hoTen;
		this.ngaySinh148 = ngaySinh;
		this.queQuan148 = queQuan;
	}
	
	public void nhapThongTin(Scanner sc) {
		System.out.println("Nhap ho ten:");
		hoTen148 =sc.nextLine();
		System.out.println("Nhap ngay sinh:");
		ngaySinh148 =sc.nextLine();
		System.out.println("Nhap que quan:");
		queQuan148 =sc.nextLine();
	}
	
	public void hienThiThongTin() {
		System.out.println("Ho ten: "+ hoTen148);
		System.out.println("Ngay sinh: "+ ngaySinh148);
		System.out.println("Que quan: "+ queQuan148);
	}
}
