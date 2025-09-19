package Class;

import java.util.Scanner;

public class ThiSinh {
	private String  hoTen148, diaChi148, dienUuTienKV148;
	private int soBaoDanh148;
	public ThiSinh() {

	}

	public ThiSinh(int soBaoDanh, String hoTen, String diaChi, String dienUuTienKV) {
		this.soBaoDanh148 = soBaoDanh;
		this.hoTen148 = hoTen;
		this.diaChi148 = diaChi;
		this.dienUuTienKV148 = dienUuTienKV;
	}
	
	public void NhapThongTin(Scanner sc) {
		System.out.println("Nhap so bao danh thi sinh: ");soBaoDanh148=sc.nextInt();sc.nextLine();
		System.out.println("Nhap ho ten thi sinh: ");hoTen148=sc.nextLine();
		System.out.println("Nhap dia chi thi sinh: ");diaChi148=sc.nextLine();
		System.out.println("Nhap dien uu tien khu vuc uu tien thi sinh: ");dienUuTienKV148=sc.nextLine();
	}
	
	public void hienThiThongTin() {
		System.out.println("So bao danh thi sinh: "+ soBaoDanh148);
		System.out.println("Ho ten thi sinh: "+ hoTen148);
		System.out.println("Dia chi thi sinh: "+ diaChi148);
		System.out.println("Dien uu tien khu vuc uu tien thi sinh: "+ dienUuTienKV148);
	}
	
	public int getSBD() {
		return soBaoDanh148;
	}
}
