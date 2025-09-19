package Class;

import java.util.Scanner;

public class CanBo {
	private String hoTen148, ngaySinh148, gioiTinh148, diaChi148;

	public CanBo() {
	}

	public CanBo(String hoTen, String ngaySinh, String gioiTinh, String diaChi) {
		this.hoTen148 = hoTen;
		this.ngaySinh148 = ngaySinh;
		this.gioiTinh148 = gioiTinh;
		this.diaChi148 = diaChi;
	}
	
	public void nhapThongTin(Scanner sc) {
		System.out.println("Nhap vao ho ten: ");
		hoTen148 = sc.nextLine();
		System.out.println("Nhap vao ngay sinh(dd/MM/yyyy): ");
		ngaySinh148 = sc.nextLine();
		System.out.println("Nhap vao gioi tinh: ");
		gioiTinh148 = sc.nextLine();
		System.out.println("Nhap vao dia chi: ");
		diaChi148 = sc.nextLine();
	}
	public void hienThiThongTin() {
		System.out.println("Ho ten: "+hoTen148);
		System.out.println("Ngay sinh: "+ngaySinh148);
		System.out.println("Gioi tinh: "+gioiTinh148);
		System.out.println("Dia chi: "+diaChi148);
	}
	
	public String getHoTen() {
		return this.hoTen148;
	}
}
