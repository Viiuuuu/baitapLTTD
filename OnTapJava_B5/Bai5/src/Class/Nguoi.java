package Class;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Nguoi {
	private String hoTen148;
	private Date ngaySinh148;
	private String ngheNghiep148;
	
	public Nguoi() {

	}
	
	public Nguoi(String hoTen, Date ngaySinh, String ngheNghiep) {
		this.hoTen148 = hoTen;
		this.ngaySinh148 = ngaySinh;
		this.ngheNghiep148 = ngheNghiep;
	}

	public void nhapThongTin(Scanner sc) {
		System.out.println("Nhap ho ten: ");
		hoTen148 = sc.nextLine();
		System.out.println("Nhap ngay sinh: ");
		String strDate = sc.nextLine();
		ngaySinh148 = strToDate(strDate);
		System.out.println("Nhap nghe nghiep: ");
		ngheNghiep148=sc.nextLine();
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
		System.out.println("Ho ten: "+hoTen148);
		System.out.println("Ngay sinh: "+dateToString(ngaySinh148));
		System.out.println("Nghe nghiep: "+ngheNghiep148);
	}

	private String dateToString(Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		
		String strDate = sdf.format(date);
		return strDate;
	}
	
	public Date getNgaySinh() {
		return ngaySinh148;
	}
}
