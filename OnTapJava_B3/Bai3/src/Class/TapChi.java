package Class;

import java.util.Scanner;

public class TapChi extends TaiLieu{
	private int soPhatHanh117;
	private int thangPhatHanh117;
	public TapChi() {

	}
	public TapChi(String maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh,int soPhatHanh, int thangPhatHanh) {
		super(maTaiLieu, tenNhaXuatBan, soBanPhatHanh);
		this.soPhatHanh117 = soPhatHanh;
		this.soPhatHanh117 = thangPhatHanh;
	}
	
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		System.out.println("Nhap so phat hanh: ");
		soPhatHanh117 = sc.nextInt();
		System.out.println("Nhap thang phat hanh: ");
		soPhatHanh117 = sc.nextInt();sc.nextLine();
	}
	
	public void hienThongTin() {
		super.hienThiThongTin();
		System.out.println("So phat hanh: "+ soPhatHanh117);
		System.out.println("Thang phat hanh: "+ soPhatHanh117);
	}
}
