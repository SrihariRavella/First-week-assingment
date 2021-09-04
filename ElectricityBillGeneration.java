
import java.util.Scanner;

public class ElectricityBillGeneration {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Electricity e1 = new Electricity();
		e1.setBillId("1");
		e1.setApplicantName("ram");
		e1.setApplicantDrno("1-50");
		e1.setApplicantCity("Hyderabad");
		e1.setApplicantPhno("1234567890");
		e1.setBill("1500");
		
		Electricity e2 = new Electricity();
		e2.setBillId("2");
		e2.setApplicantName("laxman");
		e2.setApplicantDrno("2-50");
		e2.setApplicantCity("Secunderabad");
		e2.setApplicantPhno("2345678901");
		e2.setBill("2500");
		
		Electricity e3 = new Electricity();
		e3.setBillId("3");
		e3.setApplicantName("Peter");
		e3.setApplicantDrno("3-50");
		e3.setApplicantCity("Warangal");
		e3.setApplicantPhno("3456789012");
		e3.setBill("3500");
		
		Electricity e4 = new Electricity();
		e4.setBillId("4");
		e4.setApplicantName("TonyStark");
		e4.setApplicantDrno("4-50");
		e4.setApplicantCity("Guntur");
		e4.setApplicantPhno("4567890123");
		e4.setBill("4500");
		
		Electricity e5 = new Electricity();
		e5.setBillId("5");
		e5.setApplicantName("kiran");
		e5.setApplicantDrno("5-50");
		e5.setApplicantCity("Bhimavaram");
		e5.setApplicantPhno("5678901234");
		e5.setBill("5500");
		
		Electricity[] e= {e1,e2,e3,e4,e5};
		String ch;
		String search=null;
		int j=0;
		System.out.println("Welcome To Eastern Power Department");
		do {
			System.out.println("Please Enter Your BillId / Phone Number");
			search = sc.next();
			System.out.println(search);
			for(j=0;j<e.length;j++) {
				if(search.equalsIgnoreCase(e[j].getBillId()) || search.equalsIgnoreCase(e[j].getApplicantPhno())) {
					System.out.println("Bill Details : "+e[j].toString());
				}
			}
			System.out.println("Do u want to Continue once More ? (Y / N)");
			ch=sc.next();
		}while(ch.equalsIgnoreCase("y"));
		System.out.println();
		System.out.println("Designed by Sri Hari");

	}
}


class Electricity {

	private String billId;
	private String applicantName;
	private String applicantDrno;
	private String applicantCity;
	private String applicantPhno;
	private String bill;
	
	public String getBillId() {
		return billId;
	}
	public void setBillId(String billId) {
		this.billId = billId;
	}
	public String getApplicantName() {
		return applicantName;
	}
	public void setApplicantName(String applicantName) {
		this.applicantName = applicantName;
	}
	public String getApplicantDrno() {
		return applicantDrno;
	}
	public void setApplicantDrno(String applicantDrno) {
		this.applicantDrno = applicantDrno;
	}
	public String getApplicantCity() {
		return applicantCity;
	}
	public void setApplicantCity(String applicantCity) {
		this.applicantCity = applicantCity;
	}
	public String getApplicantPhno() {
		return applicantPhno;
	}
	public void setApplicantPhno(String applicantPhno) {
		this.applicantPhno = applicantPhno;
	}
	public String getBill() {
		return bill;
	}
	public void setBill(String bill) {
		this.bill = bill;
	}
	@Override
	public String toString() {
		return "Electricity [billId=" + billId + ", applicantName=" + applicantName + ", applicantDrno=" + applicantDrno
				+ ", applicantCity=" + applicantCity + ", applicantPhno=" + applicantPhno + ", bill=" + bill + "]";
	}
	
	
}
