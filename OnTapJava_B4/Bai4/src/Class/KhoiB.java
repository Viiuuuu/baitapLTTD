package Class;

import java.util.Scanner;

public class KhoiB extends KhoiA  {
	private String mon1148, mon2148, mon3148;
	public KhoiB() {

	}
	
	public KhoiB( String mon1, String mon2, String mon3) {
		this.mon1148 = mon1;
		this.mon2148 = mon2;
		this.mon3148 = mon3;
	}
	
	public void NhapThongTin(Scanner sc) {
		super.NhapThongTin(sc);
	}
	
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("To hop mon thi: "+mon1148+"-"+mon2148+"-"+mon3148);
	}
}
