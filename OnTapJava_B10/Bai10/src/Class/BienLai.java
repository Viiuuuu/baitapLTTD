package Class;

import java.util.Scanner;

public class BienLai extends KhachHang{
	private int chiSoMoi148;
	private int chiSoCu148;
	private double tien148;
	
	public BienLai() {

	}

	public BienLai(String tenChuHo, int chiSoMoi, int chiSoCu, double tien) {
		this.tenChuHo148=tenChuHo;
		this.chiSoMoi148 = chiSoMoi;
		this.chiSoCu148 = chiSoCu;
		this.tien148 = tien;
	}

	public BienLai(int chiSoMoi, int chiSoCu, double tien) {
		this.chiSoMoi148 = chiSoMoi;
		this.chiSoCu148 = chiSoCu;
		this.tien148 = tien;
	}
	
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		System.out.println("Nhap chi so moi: ");
		chiSoMoi148=sc.nextInt();sc.nextLine();
		System.out.println("Nhap chi so cu: ");
		chiSoCu148=sc.nextInt();sc.nextLine();
		tien148=(chiSoMoi148-chiSoCu148)*750;
		
	}
	
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("Chi so moi: "+ chiSoMoi148);
		System.out.println("Chi so cu: "+ chiSoCu148);
		System.out.println("Tien: "+ tien148);
	}
}
