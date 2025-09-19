package Class;

import java.util.Scanner;

public class KhachHang {
	protected  String tenChuHo148;
	protected int soNha148;
	protected String maCongTo148;
	
	public KhachHang() {
		
	}
	
	public KhachHang(String tenChuHo, int soNha, String maCongTo) {
		this.tenChuHo148 = tenChuHo;
		this.soNha148 = soNha;
		this.maCongTo148 = maCongTo;
	}
	
	public void nhapThongTin(Scanner sc) {
		System.out.println("Nhap ten chu ho: ");
		tenChuHo148=sc.nextLine();
		System.out.println("Nhap so nha: ");
		soNha148=sc.nextInt();sc.nextLine();
		System.out.println("Nhap ma cong to: ");
		maCongTo148=sc.nextLine();
	}
	
	public void hienThiThongTin() {
		System.out.println("Ten chu ho: "+tenChuHo148);
		System.out.println("So nha: "+soNha148);
		System.out.println("Ma cong to: "+maCongTo148);
	}
}
