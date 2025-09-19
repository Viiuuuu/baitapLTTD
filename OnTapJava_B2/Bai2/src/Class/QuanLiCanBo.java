package Class;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLiCanBo {
	private ArrayList<CanBo> dscb148;

	public QuanLiCanBo() {
		dscb148 = new ArrayList<CanBo>(10);
	}
	
	public void themCanBo(CanBo cb) {
		dscb148.add(cb);
	}
	
	public void nhapDanhSach(Scanner sc) {
		CanBo cb;
		System.out.println("Nhap vao so luong can bo");
		int n = sc.nextInt();sc.nextLine();
		
		System.out.println("Nhap thong tin chi tiet: ");
		for(int i=0;i<n;i++) {
			System.out.println("Lan nhap thu "+(i+1)+ ":");
			System.out.println("Chon can bo(1-Ki su; 2-Nhan vien; 3-Cong nhan)");
			int chon = sc.nextInt();sc.nextLine();
			
			cb = new CanBo();
			switch (chon) {
			case 1:
				cb = new KiSu();
				break;
			case 2:
				cb = new NhanVien();
				break;
			case 3:
				cb = new CongNhan();
				break;

			default:
				cb = new KiSu();
				break;
			}
			
			cb.nhapThongTin(sc);
			themCanBo(cb);
		}
	}
	
	public void timKiemCanBo(String hoTen) {
		for (CanBo cb : dscb148) {
			if(hoTen.equals(cb.getHoTen()))
				cb.hienThiThongTin();
		}
	}
}
