package Class;

import java.util.Scanner;

public class TaiLieu {
	private String maTaiLieu148, tenNhaXuatBan17;
	private int soBanPhatHanh148;
	
	public TaiLieu() {
		
	}
	
	public TaiLieu(String maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh) {
		this.maTaiLieu148 = maTaiLieu;
		this.tenNhaXuatBan17 = tenNhaXuatBan;
		this.soBanPhatHanh148 = this.soBanPhatHanh148;
	}
	
	public void nhapThongTin(Scanner sc) {
		System.out.print(" Nhap ma tai lieu: "); maTaiLieu148 = sc.nextLine();
		System.out.print(" Nhap ten nha xuat ban: "); tenNhaXuatBan17 = sc.nextLine();
		System.out.print(" Nhap so ban phat hanh: "); soBanPhatHanh148 = sc.nextInt();sc.nextLine();
	}
	
	public void hienThiThongTin() {
		System.out.println("Ma tai lieu: "+ maTaiLieu148);
		System.out.println("Ten nha xuat ban: "+ tenNhaXuatBan17);
		System.out.println("So ban phat hanh: "+ soBanPhatHanh148);
	}
	
	public String getMaTaiLieu() {
		return maTaiLieu148;
	}
}
