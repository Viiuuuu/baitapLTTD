package Class;

import java.util.Scanner;

public class KiSu extends CanBo{
	private String nganhDaoTao148;

	public KiSu() {

	}

	public KiSu(String hoTen, String ngaySinh, String gioiTinh, String diaChi) {
		super(hoTen, ngaySinh, gioiTinh, diaChi);
		this.nganhDaoTao148 = nganhDaoTao148;
	}
	
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		System.out.println("Nhap nganh dao tao:");
		nganhDaoTao148 = sc.nextLine();
	}
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("Nganh dao tao: "+nganhDaoTao148);
	}
	
	
}
