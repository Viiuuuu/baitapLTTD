package Class;

import java.util.Scanner;

public class CBGV extends Nguoi{
	private double luongCung148, thuong148, phat148, luongThucLinh148;

	public CBGV() {
		
	}

	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		
		System.out.println("Nhap luong cung: ");
		luongCung148 = sc.nextDouble();sc.nextLine();
		System.out.println("Nhap thuong: ");
		thuong148= sc.nextDouble();sc.nextLine();
		System.out.println("Nhap phat: ");
		phat148 = sc.nextDouble();sc.nextLine();
		
		luongThucLinh148 = luongCung148+thuong148-phat148; 
	}
	
	public void hienThiThongTin() {
		super.hienThiThongTin();
		
		System.out.println("Luong cung: "+ luongCung148);
		System.out.println("Thuong: "+ thuong148);
		System.out.println("Phat: "+ phat148);
		System.out.println("Luong thuc linh: "+ luongThucLinh148);
	}
	
	public double getLuongTL() {
		return luongThucLinh148;
				
	}
}
