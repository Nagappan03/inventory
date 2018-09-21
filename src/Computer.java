import java.util.*;

public class Computer {
	int[] customer = new int[2];
	int[] id = new int[2];
	String[] name = new String[2];
	long[] mobile = new long[2];
	int dellQuantity = 400;
	int samsungQuantity = 300;
	int fujitsuQuantity = 1000;
	int nokiaQuantity = 2000;
	int oneplusQuantity = 1000;
	int lenovoQuantity = 5000;
	int sandiskQuantity = 2000;
	int transcendQuantity = 1000;
	int xboxQuantity = 100;
	int sonypsQuantity = 300;
	int dellPrice = 40000;
	int samsungPrice = 30000;
	int fujitsuPrice = 25000;
	int nokiaPrice = 20000;
	int oneplusPrice = 35000;
	int lenovoPrice = 15000;
	int sandiskPrice = 1500;
	int transcendPrice = 1800;
	int xboxPrice = 25000;
	int sonypsPrice = 30000;
	int laptopIncome = 2000000;
	int mobileIncome = 1500000;
	int pendriveIncome = 10000;
	int psIncome = 4000000;

	public void store() {
		Scanner s = new Scanner(System.in);
		for (int i = 0; i < customer.length; i++) {
			System.out.println("Enter the Customer ID");
			id[i] = s.nextInt();
			System.out.println("Enter the customer name");
			name[i] = s.next();
			System.out.println("Enter the customer mobile number");
			mobile[i] = s.nextLong();
		}
	}

	public void displayCustomerDetails() {
		System.out.println("Customer details are :");
		for (int i = 0; i < customer.length; i++) {
			System.out.println("Id is : " + id[i]);
			System.out.println("Name is : " + name[i]);
			System.out.println("Mobile number is : " + mobile[i]);
		}
	}

	public void displayShopDetails() {
		int cho;
		Scanner s = new Scanner(System.in);
		System.out.println("Products available are : 1.Laptops 2.Mobiles 3.Pendrives 4.Playing consoles");
		System.out.println("Enter the choice of product you want to purchase");
		cho = s.nextInt();
		switch (cho) {
		case 1:
			System.out.println("Laptops available are 1)DELL \t 2)SAMSUNG \t 3)FUJITSU");
			System.out.println("Enter the brand");
			String lap = s.next();
			if (lap.equalsIgnoreCase("Dell")) {
				System.out.println("Available stocks are : " + dellQuantity);
				System.out.println("Do you want to place an order");
				String option = s.next();
				if (option.equalsIgnoreCase("yes")) {
					System.out.println("Enter the quantity");
					int qu = s.nextInt();
					if (qu <= dellQuantity) {
						int profit = dellPrice * qu;
						laptopIncome = laptopIncome + profit;
						int shopIncome = laptopIncome + mobileIncome + pendriveIncome + psIncome;
						System.out.println("Updated quantity is : " + (dellQuantity - qu));
						System.out.println("Updated income is : " + shopIncome);
					} else {
						System.out.println("Not enough stocks");
					}
				}
			}
			if (lap.equalsIgnoreCase("Samsung")) {
				System.out.println("Available stocks are : " + samsungQuantity);
				System.out.println("Do you want to place an order");
				String option = s.next();
				if (option.equalsIgnoreCase("yes")) {
					System.out.println("Enter the quantity");
					int qu = s.nextInt();
					if (qu <= samsungQuantity) {
						int profit = samsungPrice * qu;
						laptopIncome = laptopIncome + profit;
						int shopIncome = laptopIncome + mobileIncome + pendriveIncome + psIncome;
						System.out.println("Updated quantity is : " + (samsungQuantity - qu));
						System.out.println("Updated income is : " + shopIncome);
					} else {
						System.out.println("Not enough stocks");
					}
				}
			}
			if (lap.equalsIgnoreCase("Fujitsu")) {
				System.out.println("Available stocks are : " + fujitsuQuantity);
				System.out.println("Do you want to place an order");
				String option = s.next();
				if (option.equalsIgnoreCase("yes")) {
					System.out.println("Enter the quantity");
					int qu = s.nextInt();
					if (qu <= fujitsuQuantity) {
						int profit = fujitsuPrice * qu;
						laptopIncome = laptopIncome + profit;
						int shopIncome = laptopIncome + mobileIncome + pendriveIncome + psIncome;
						System.out.println("Updated quantity is : " + (fujitsuQuantity - qu));
						System.out.println("Updated income is : " + shopIncome);
					} else {
						System.out.println("Not enough stocks");
					}
				}
			}
			break;
		case 2:
			System.out.println("Mobiles available are 1)NOKIA \t 2)ONEPLUS \t 3)LENOVO");
			System.out.println("Enter the brand");
			String mobile = s.next();
			if (mobile.equalsIgnoreCase("Nokia")) {
				System.out.println("Available stocks are : " + nokiaQuantity);
				System.out.println("Do you want to place an order");
				String option = s.next();
				if (option.equalsIgnoreCase("yes")) {
					System.out.println("Enter the quantity");
					int qu = s.nextInt();
					if (qu <= nokiaQuantity) {
						int profit = nokiaPrice * qu;
						mobileIncome = mobileIncome + profit;
						int shopIncome = laptopIncome + mobileIncome + pendriveIncome + psIncome;
						System.out.println("Updated quantity is : " + (nokiaQuantity - qu));
						System.out.println("Updated income is : " + shopIncome);
					} else {
						System.out.println("Not enough stocks");
					}
				}
			}
			if (mobile.equalsIgnoreCase("Oneplus")) {
				System.out.println("Available stocks are : " + oneplusQuantity);
				System.out.println("Do you want to place an order");
				String option = s.next();
				if (option.equalsIgnoreCase("yes")) {
					System.out.println("Enter the quantity");
					int qu = s.nextInt();
					if (qu <= oneplusQuantity) {
						int profit = oneplusPrice * qu;
						mobileIncome = mobileIncome + profit;
						int shopIncome = laptopIncome + mobileIncome + pendriveIncome + psIncome;
						System.out.println("Updated quantity is : " + (oneplusQuantity - qu));
						System.out.println("Updated income is : " + shopIncome);
					} else {
						System.out.println("Not enough stocks");
					}
				}
			}
			if (mobile.equalsIgnoreCase("Lenovo")) {
				System.out.println("Available stocks are : " + lenovoQuantity);
				System.out.println("Do you want to place an order");
				String option = s.next();
				if (option.equalsIgnoreCase("yes")) {
					System.out.println("Enter the quantity");
					int qu = s.nextInt();
					if (qu <= lenovoQuantity) {
						int profit = lenovoPrice * qu;
						mobileIncome = mobileIncome + profit;
						int shopIncome = laptopIncome + mobileIncome + pendriveIncome + psIncome;
						System.out.println("Updated quantity is : " + (lenovoQuantity - qu));
						System.out.println("Updated income is : " + shopIncome);
					} else {
						System.out.println("Not enough stocks");
					}
				}
			}
			break;
		case 3:
			System.out.println("Pendrives available are 1)SANDISK \t 2)TRANSCEND");
			System.out.println("Enter the brand");
			String pendrive = s.next();
			if (pendrive.equalsIgnoreCase("Sandisk")) {
				System.out.println("Available stocks are : " + sandiskQuantity);
				System.out.println("Do you want to place an order");
				String option = s.next();
				if (option.equalsIgnoreCase("yes")) {
					System.out.println("Enter the quantity");
					int qu = s.nextInt();
					if (qu <= sandiskQuantity) {
						int profit = sandiskPrice * qu;
						pendriveIncome = pendriveIncome + profit;
						int shopIncome = laptopIncome + mobileIncome + pendriveIncome + psIncome;
						System.out.println("Updated quantity is : " + (sandiskQuantity - qu));
						System.out.println("Updated income is : " + shopIncome);
					} else {
						System.out.println("Not enough stocks");
					}
				}
			}
			if (pendrive.equalsIgnoreCase("Transcend")) {
				System.out.println("Available stocks are : " + transcendQuantity);
				System.out.println("Do you want to place an order");
				String option = s.next();
				if (option.equalsIgnoreCase("yes")) {
					System.out.println("Enter the quantity");
					int qu = s.nextInt();
					if (qu <= transcendQuantity) {
						int profit = transcendPrice * qu;
						pendriveIncome = pendriveIncome + profit;
						int shopIncome = laptopIncome + mobileIncome + pendriveIncome + psIncome;
						System.out.println("Updated quantity is : " + (transcendQuantity - qu));
						System.out.println("Updated income is : " + shopIncome);
					} else {
						System.out.println("Not enough stocks");
					}
				}
			}
			break;
		case 4:
			System.out.println("Gaming consoles available are 1)XBOX \t 2)SONY");
			System.out.println("Enter the brand");
			String ps = s.next();
			if (ps.equalsIgnoreCase("Xbox")) {
				System.out.println("Available stocks are : " + xboxQuantity);
				System.out.println("Do you want to place an order");
				String option = s.next();
				if (option.equalsIgnoreCase("yes")) {
					System.out.println("Enter the quantity");
					int qu = s.nextInt();
					if (qu <= xboxQuantity) {
						int profit = xboxPrice * qu;
						psIncome = psIncome + profit;
						int shopIncome = laptopIncome + mobileIncome + pendriveIncome + psIncome;
						System.out.println("Updated quantity is : " + (xboxQuantity - qu));
						System.out.println("Updated income is : " + shopIncome);
					} else {
						System.out.println("Not enough stocks");
					}
				}
			}
			if (ps.equalsIgnoreCase("Sony")) {
				System.out.println("Available stocks are : " + sonypsQuantity);
				System.out.println("Do you want to place an order");
				String option = s.next();
				if (option.equalsIgnoreCase("yes")) {
					System.out.println("Enter the quantity");
					int qu = s.nextInt();
					if (qu <= sonypsQuantity) {
						int profit = sonypsPrice * qu;
						psIncome = psIncome + profit;
						int shopIncome = laptopIncome + mobileIncome + pendriveIncome + psIncome;
						System.out.println("Updated quantity is : " + (sonypsQuantity - qu));
						System.out.println("Updated income is : " + shopIncome);
					} else {
						System.out.println("Not enough stocks");
					}
				}
			}
			break;
		default:
			System.out.println("You have entered a wrong choice");
			break;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer c = new Computer();
		System.out.println("Welcome to BBK Electronics");
		System.out.println("1.Display Customer details");
		System.out.println("2.Display purchase details");
		System.out.println("Enter the choice which you want to perform");
		Scanner s = new Scanner(System.in);
		int choice1 = s.nextInt();
		switch (choice1) {
		case 1:
			c.store();
			c.displayCustomerDetails();
			break;
		case 2:
			c.displayShopDetails();
			break;
		default:
			System.out.println("You have entered a wrong choice");
			break;
		}

	}
}
