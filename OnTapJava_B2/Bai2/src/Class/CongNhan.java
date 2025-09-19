package Class;

import java.util.Scanner;

public class CongNhan extends CanBo{
	private String bac148;

	public CongNhan() {

	}

	public CongNhan(String hoTen, String ngaySinh, String gioiTinh, String diaChi) {
		super(hoTen, ngaySinh, gioiTinh, diaChi);
		this.bac148 = bac148;
	}
	
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		System.out.println("Nhap Bac: ");
		bac148 = sc.nextLine();
	}
	
	public void hienThiThongTin(){
		super.hienThiThongTin();
		System.out.println("Bac: "+bac148);
	}
}
