package Class;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TheMuon extends SinhVien{
	private int soMuon148;
	private Date ngayMuon148;
	private Date hanTra148;
	private String soHieu148;
	
	public TheMuon() {
		
	}
	
	public TheMuon(int soMuon, Date ngayMuon , String soHieu) {
		this.soMuon148 = soMuon;
		this.ngayMuon148 = ngayMuon;
		this.soHieu148 = soHieu;
	}
	
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		System.out.println("Nhap so muon: ");
		soMuon148 = sc.nextInt();sc.nextLine();
		System.out.println("Nhap ngay muon: ");
		String strNgayMuon = sc.nextLine();
		ngayMuon148=strToDate(strNgayMuon);
		String strNgayTra="31-12-2025";
		hanTra148=strToDate(strNgayTra);
		System.out.println("Nhap so hieu: ");
		soHieu148=sc.nextLine();
	}

	private Date strToDate(String strNgayMuon) {
		Date date = null;
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		
		try {
			date = sdf.parse(strNgayMuon);
		} catch (ParseException e) {
			System.out.println("Sai định dạng ngày tháng!");
		}
		return date;
	}
	
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("So phieu muon: "+ soMuon148);
		System.out.println("Ngay muon: "+ ngayMuon148);
		System.out.println("Han tra: "+ hanTra148);
		System.out.println("So hieu: "+ soHieu148);
	}
	
	public Date getHanTra() {
		return hanTra148;
	}
}
