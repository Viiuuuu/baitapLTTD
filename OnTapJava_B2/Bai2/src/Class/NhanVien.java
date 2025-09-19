package Class;

import java.util.Scanner;

public class NhanVien extends CanBo {
	private String congViec148;
	public NhanVien() {

	}

	public NhanVien(String hoTen, String ngaySinh, String gioiTinh, String diaChi) {
		super(hoTen, ngaySinh, gioiTinh, diaChi);
		this.congViec148 = congViec148;
	}
	
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		System.out.println("Nhap cong viec: ");
		congViec148 = sc.nextLine();
	}
	
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("Cong viec: "+congViec148);
	}
	
}
