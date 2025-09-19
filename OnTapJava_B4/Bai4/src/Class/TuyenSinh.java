package Class;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class TuyenSinh {
	private ArrayList<ThiSinh> dsts148;
	
	public TuyenSinh() {
		dsts148 = new ArrayList<ThiSinh>(10);
	}
	public void ThemThiSinh(ThiSinh ts) {
		dsts148.add(ts);
	}
	public void nhapThongTinThiSinh(Scanner sc ) {
		ThiSinh ts;
		int chon;
		
		System.out.println("Nhap so luong thi sinh: ");
		int n = sc.nextInt();sc.nextLine();
				
		for(int i=0;i<n; i++) {
			System.out.println("Vui long chon khoi (1-Khoi A; 2-Khoi B; 3-Khoi C)");
			chon = sc.nextInt();
			
			switch (chon) {
			case 1:
				ts = new KhoiA("Toan","Ly","Hoa");
				break;
			case 2:
				ts = new KhoiB("Toan","Hoa","Sinh");

				break;
			case 3:
				ts = new KhoiC("Van", "Su","Dia");
				break;
			default:
				ts = new KhoiA("Toan","Ly","Hoa");
				break;
			}
			ts.NhapThongTin(sc);
			ThemThiSinh(ts);
			
		}
	}
	
	public void hienThiDanhSach() {
		int n = dsts148.size();
		for(int i=0;i<n;i++) {
			System.out.println("Thi sinh thu "+(i+1)+" la: ");
			dsts148.get(i).hienThiThongTin();
		}
	}
	
	public void timKiemThiSinh(int soBaoDanh) {
		for (ThiSinh thiSinh : dsts148) {
			if(thiSinh.getSBD()==soBaoDanh) {
				thiSinh.hienThiThongTin();
			}

		}
	}
}
