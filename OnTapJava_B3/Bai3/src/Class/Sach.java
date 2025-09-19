package Class;

import java.util.Scanner;

public class Sach extends TaiLieu {
	private String tacGia148;
	private int soTrang148;
	public Sach() {

	}
	public Sach(String maTaiLieu, String tenNhaSanXuat, int soBanPhatHanh, String tacGia, int soTrang) {
		super(maTaiLieu, tenNhaSanXuat, soBanPhatHanh);
		this.tacGia148 = tacGia;
		this.soTrang148 = soTrang;
	}
	
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		System.out.println("Nhap tac gia: ");
		tacGia148 = sc.nextLine();
		System.out.println("Nhap so trang: ");
		soTrang148 = sc.nextInt();
		sc.nextLine();
	}
	
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("Tac gia: "+ tacGia148);
		System.out.println("So trang: "+ soTrang148);
	}
}
