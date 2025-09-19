package Class;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Nguoi {
	protected String hoTen148;
	protected Date ngaySinh148;
	protected String queQuan148;
	public Nguoi() {

	}
	public Nguoi(String hoTen, Date ngaySinh, String queQuan) {
		this.hoTen148 = hoTen;
		this.ngaySinh148 = ngaySinh;
		this.queQuan148 = queQuan;
	}
	
	public void nhapThongTin(Scanner sc) {
		System.out.println("Nhap ho ten: ");
		hoTen148 = sc.nextLine();
		System.out.println("Nhap ngay sinh: ");
		String strDate=sc.nextLine();
		ngaySinh148 = strToDate(strDate);
		System.out.println("Nhap que quan: ");
		queQuan148 = sc.nextLine();
	}
	private Date strToDate(String strDate) {
		Date date = null;
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		
		try {
			date = sdf.parse(strDate);
		} catch (ParseException e) {
			System.out.println("Loi dinh dang ngay thang!");
		}
		return date;
	}
	
	public void hienThiThongTin() {
		System.out.println("Ho ten: "+hoTen148);
		System.out.println("Ngay sinh: "+ngaySinh148);
		System.out.println("Que quan: "+queQuan148);
	}
	
	public String getQueQuan() {
		return queQuan148;
	}
	
	public Date getNgaySinDate() {
		return ngaySinh148;
	}
}
