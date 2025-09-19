package Class;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class KhuPho {
	private ArrayList<HoDan> dshd148;
	
	public KhuPho() {
		dshd148 = new ArrayList<HoDan>(10);                 	
	}
	
	public void themHoDan(HoDan hoDan) {
		dshd148.add(hoDan);
	}
	
	public void nhapDanhSach(Scanner sc) {
		HoDan hoDan;
		
		System.out.println("Nhap vao so ho dan: ");
		int soHoDan=sc.nextInt();sc.nextLine();
		
		System.out.println("Nhap vao thong tin cho tung ho dan: ");
		for(int i = 0; i<soHoDan;i++) {
			System.out.println("Ho dan thu "+(i+1)+" la: ");
			hoDan = new HoDan();
			hoDan.nhapThongTin(sc);
			themHoDan(hoDan);
		}
	}
	
	public void hienThiDanhSach() {
		int n = dshd148.size();
		
		for(int i = 0; i<n;i++) {
			System.out.println("Ho dan thu "+(i+1)+" la: ");
			dshd148.get(i).hienThiThongTin();
		}
	}
	
	public void timKiemThongTin() {
		Date now = new Date();
		int namHienTai = now.getYear()+1900;
		
		Nguoi[] dstv = null;
		
		for(HoDan hoDan:dshd148) {
			dstv=hoDan.getList();
			for(int i = 0; i< hoDan.getSoNguoi();i++) {
				if(namHienTai-(dstv[i].getNgaySinh().getYear()+1900) == 80) {
					hoDan.hienThiThongTin();
				}
			}
		}
	}
}
