package Class;

import java.util.Date;
import java.util.Scanner;

public class HocSinh extends Nguoi{
	private String lop148, khoaHoc148, kyHoc148;

	public HocSinh() {

	}

	public HocSinh(String hoTen, String lop, String khoaHoc, String kyHoc) {
		this.hoTen148 = hoTen;
		this.lop148 = lop;
		this.kyHoc148 = kyHoc;
		this.khoaHoc148 = khoaHoc;
	}
	
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		
		System.out.println("Nhap lop: ");
		lop148 = sc.nextLine();
		
		System.out.println("Nhap khoa hoc: ");
		khoaHoc148 = sc.nextLine();
		
		System.out.println("Nhap ky hoc: ");
		kyHoc148 = sc.nextLine();
	}
	
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("Lop: "+lop148);
		System.out.println("Khoa hoc: "+khoaHoc148);
		System.out.println("Ky hoc: "+kyHoc148);
	}
	
	public String getLop() {
		return lop148;
	}
}
