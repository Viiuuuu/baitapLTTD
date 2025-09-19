package Class;

import java.util.Scanner;

public class Bao extends TaiLieu{
	private String ngayPhatHanh148;

	public Bao() {

	}

	public Bao(String maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh, int ngayPhatHanh) {
		super(maTaiLieu, tenNhaXuatBan, soBanPhatHanh);
		this.ngayPhatHanh148 = this.ngayPhatHanh148;
	}
	
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		System.out.println("Nhap ngay phat hanh: ");
		ngayPhatHanh148 = sc.nextLine();
	}
	
	public void hienThongTin() {
		super.hienThiThongTin();
		System.out.println("Ngay phat hanh: "+ ngayPhatHanh148);
	}
}
