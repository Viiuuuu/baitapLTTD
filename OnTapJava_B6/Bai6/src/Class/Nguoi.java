package Class;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Nguoi {
	protected String hoTen148;
	protected Date ngaySinh148;
	protected int CMND148;
	
	public Nguoi() {
		
	}
	
	public Nguoi(String hoTen, Date ngaySinh, int cMND) {
		this.hoTen148 = hoTen;
		this.ngaySinh148 = ngaySinh;
		this.CMND148 = CMND148;
	}
	
	public void nhapThongTin(Scanner sc) {
		System.out.println("Nhap ho ten: ");
		hoTen148 = sc.nextLine();
		System.out.println("Nhap ngay sinh: ");
		String strDate = sc.nextLine();
		ngaySinh148 = strToDate(strDate);
		System.out.println("Nhap CMND:");
		CMND148 = sc.nextInt();sc.nextLine();
	}

	private Date strToDate(String strDate) {
		Date date = null;
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		
		try {
			date = sdf.parse(strDate);
		} catch (ParseException e) {
			System.out.println("Loi dinh dang ngay thang");
		}
		return date;
	}
	
	public void hienThiThongTin() {
		System.out.println("Ho ten: " +hoTen148);
		System.out.println("Ngay sinh: " +ngaySinh148);
		System.out.println("CMND: " +CMND148);
	}
	
	public int getCMND() {
		return CMND148;
	}
}
