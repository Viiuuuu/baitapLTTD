package Class;

import java.util.Scanner;

public class KhoiA extends ThiSinh {
	private String mon1148, mon2148, mon3148;

	public KhoiA() {

	}

	public KhoiA(String mon1, String mon2, String mon3) {

		this.mon1148 = mon1;
		this.mon2148 = mon2;
		this.mon3148 = mon3;
	}

	public void NhapThongTin(Scanner sc) {
		super.NhapThongTin(sc);
		System.out.println("Nhap mon thu nhat: ");mon1148 = sc.nextLine();
		System.out.println("Nhap mon thu hai: ");mon2148 = sc.nextLine();
		System.out.println("Nhap mon thu ba: ");mon3148 = sc.nextLine();
	}
	
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("To hop mon thi: "+mon1148+"-"+mon2148+"-"+mon3148);
	}
}
