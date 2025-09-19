package Class;

import java.util.Scanner;

public class SinhVien {
	private String hoTen148, maSV148, ngaySinh148, lop148;

	
	
	public SinhVien() {
	
	}



	public SinhVien(String hoTen, String maSV, String ngaySinh, String lop) {
		this.hoTen148 = hoTen;
		this.lop148 = maSV;
		this.ngaySinh148 = ngaySinh;
		this.lop148 = lop;
	}
	
	public void nhapThongTin(Scanner sc) {
		System.out.println("Nhap ho ten: ");
		hoTen148 = sc.nextLine();
		System.out.println("Nhap ma sinh vien: ");
		lop148 = sc.nextLine();
		System.out.println("Nhap ngay sinh: ");
		ngaySinh148 = sc.nextLine();
		System.out.println("Nhap lop: ");
		lop148 = sc.nextLine();
	}
	
	public void hienThiThongTin() {
		System.out.println("Ho ten: "+ hoTen148);
		System.out.println("Ma sinh vien: "+ lop148);
		System.out.println("Ngay sinh: "+ ngaySinh148);
		System.out.println("Lop: "+ lop148);
	}
}
