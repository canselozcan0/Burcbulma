import java.util.Scanner;

public class driver {
public static void main(String[] args) {
//	int month,day;
//	Scanner input = new Scanner(System.in);
//	System.out.print("Doğduğunuz ay nedir : ");
//	month = input.nextInt();
//	
//	System.out.print("Doğduğunuz gün: ");
//	day = input.nextInt();
//	
//	switch(month) {
//	
//	case 1 :
//		if(day >= 1 && day<= 31) {
//		if(day < 22) {
//			System.out.println("Oğlak Burcu");
//		}
//		else {
//			System.out.println("Kova Burcu");
//		}}else {
//			System.out.println("Geçersiz gün");
//		}
//		break;
//		
//	case 2:
//		if(day >= 1 && day <= 28) {
//			if(day < 20) {
//				System.out.println("Kova Burcu");
//			}else {
//				System.out.println("Balık Burcu");
//			}
//		 
//		}
//		else {
//			System.out.println("Geçersiz gün");
//		}break;
//	case 3: 
//		if (day >=1 && day <=31) {
//			if(day < 20) {
//				System.out.println("Balık");
//			}else {
//				System.out.println("Koç");
//			}
//			
//		}
//		else{
//			System.out.println("Geçersiz gün");
//		}break;
//	case 4 :
//		if(day >= 1 && day<= 31) {
//		if(day < 22) {
//			System.out.println("KOÇ");
//		
//		}else {
//			System.out.println("boğa Burcu");
//		}}
//		else {
//			System.out.println("Geçersiz gün");
//		}
//		break;
//	case 5 :
//		if(day >= 1 && day<= 31) {
//		if(day < 22) {
//			System.out.println("boğa Burcu");
//		
//		}else {
//			System.out.println("ikizler Burcu");
//		}}else {
//			System.out.println("Geçersiz gün");
//		}
//		break;
//	case 6 :
//		if(day >= 1 && day<= 31) {
//		if(day < 22) {
//			System.out.println("ikizler Burcu");
//		
//		}else {
//			System.out.println("yengeç Burcu");
//		}}else {
//			System.out.println("Geçersiz gün");
//		}
//		break;
//	case 7 :
//		if(day >= 1 && day<= 31) {
//		if(day < 22) {
//			System.out.println("yengeç Burcu");
//		
//		}else {
//			System.out.println("aslan Burcu");
//		}}else {
//			System.out.println("Geçersiz gün");
//		}
//		break;
//	case 8 :
//		if(day >= 1 && day<= 31) {
//		if(day < 22) {
//			System.out.println("aslan Burcu");
//		
//		}else {
//			System.out.println("başak Burcu");
//		}}else {
//			System.out.println("Geçersiz gün");
//		}
//		break;
//	case 9 :
//		if(day >= 1 && day<= 31) {
//		if(day < 22) {
//			System.out.println("başak Burcu");
//		
//		}else {
//			System.out.println("terazi Burcu");
//		}}else {
//			System.out.println("Geçersiz gün");
//		}
//		break;
//		case 10 :
//			if(day >= 1 && day<= 31) {
//				if(day < 22) {
//					System.out.println("terazi Burcu");
//				
//				}else {
//					System.out.println("akrep Burcu");
//				}}else {
//					System.out.println("Geçersiz gün");
//				}
//				break;
//				case 11 :
//					if(day >= 1 && day<= 31) {
//						if(day < 22) {
//							System.out.println("akrep Burcu");
//						
//						}else {
//							System.out.println("yay Burcu");
//						}}else {
//							System.out.println("Geçersiz gün");
//						}
//						break;
//			case 12 :
//							if(day >= 1 && day<= 31) {
//								if(day < 22) {
//									System.out.println("yay Burcu");
//								
//								}else {
//									System.out.println("oğlak Burcu");
//								}}else {
//									System.out.println("Geçersiz gün");
//								}
//								break;
//		
		
		
//}
	
	        int ay, gun;

	        System.out.print("Doğduğunuz ay :");
	        ay = inp.nextInt();

	        System.out.print("Doğduğunuz gün :");
	        gun = inp.nextInt();

	        if (ay == 1 && gun <= 22) {
	            System.out.println("Oğlak Burcu.");
	        }
	        if ((ay == 1 && gun > 22) && (gun <= 31)) {
	            System.out.println("Kova Burcu.");
	        }
	        if (ay == 1 && gun > 31) {
	            System.out.println("Hatalı gün girdiniz!");
	        }

	        if ((ay == 2 && gun >= 20) && (gun <= 28)) {
	            System.out.println("Balık Burcu.");
	        }
	        if (ay == 2 && gun < 20) {
	            System.out.println("Kova Burcu.");
	        }
	        if (ay == 2 && gun > 28) {
	            System.out.println("Hatalı gün girdiniz!");
	        }


	        if ((ay == 3 && gun >= 20) && (gun <= 31)) {
	            System.out.println("Koç Burcu.");
	        }
	        if (ay == 3 && gun < 20) {
	            System.out.println("Balık Burcu.");
	        }
	        if (ay == 3 && gun > 31) {
	            System.out.println("Hatalı gün girdiniz!");
	        }

	        if ((ay == 4 && gun <= 20)) {
	            System.out.println("Koç Burcu.");
	        }
	        if ((ay == 4 && gun > 20) && (gun <= 31)) {
	            System.out.println("Boğa Burcu.");
	        }
	        if (ay == 4 && gun > 31) {
	            System.out.println("Hatalı gün girdiniz!");
	        }

	        if (ay == 5 && gun <= 21) {
	            System.out.println("Boğa Burcu.");
	        }
	        if ((ay == 5 && gun > 21) && (gun <= 31)) {
	            System.out.println("İkizler Burcu.");
	        }
	        if (ay == 5 && gun > 31) {
	            System.out.println("Hatalı gün girdiniz!");
	        }

	        if ((ay == 6 && gun >= 23) && (gun <= 31)) {
	            System.out.println("Yengeç Burcu.");
	        }
	        if (ay == 6 && gun < 23) {
	            System.out.println("İkizler Burcu.");
	        }
	        if (ay == 6 && gun > 31) {
	            System.out.println("Hatalı gün girdiniz!");
	        }


	        if ((ay == 7 && gun >= 23) && (gun <= 31)) {
	            System.out.println(" Aslan Burcu.");
	        }
	        if (ay == 7 && gun < 23) {
	            System.out.println("Yengeç Burcu.");
	        }
	        if (ay == 7 && gun > 31) {
	            System.out.println("Hatalı gün girdiniz!");
	        }

	        if ((ay == 8 && gun <= 23)) {
	            System.out.println("Aslan Burcu.");
	        }
	        if ((ay == 8 && gun > 23) && (gun <= 31)) {
	            System.out.println("Başak Burcu.");
	        }
	        if (ay == 8 && gun > 31) {
	            System.out.println("Hatalı gün girdiniz!");}

	            if ((ay == 9 && gun >= 23) && (gun <= 31)) {
	                System.out.println(" Terazi Burcu.");
	            }
	            if (ay == 9 && gun < 23) {
	                System.out.println("Başak Burcu.");
	            }
	            if (ay == 9 && gun > 31) {
	                System.out.println("Hatalı gün girdiniz!");
	            }

	            if ((ay == 10 && gun < 23)) {
	                System.out.println("Terazi Burcu.");
	            }
	            if ((ay == 10 && gun >= 23) && (gun <= 31)) {
	                System.out.println("Akrep Burcu.");
	            }
	            if (ay == 10 && gun > 31) {
	                System.out.println("Hatalı gün girdiniz!");
	            }

	        if ((ay == 11 && gun >= 23) && (gun <= 31)) {
	            System.out.println(" Yay Burcu.");
	        }
	        if (ay == 11 && gun < 23) {
	            System.out.println("Akrep Burcu.");
	        }
	        if (ay == 11 && gun > 31) {
	            System.out.println("Hatalı gün girdiniz!");
	        }

	        if ((ay == 12 && gun < 22)) {
	            System.out.println("Yay Burcu.");
	        }
	        if ((ay == 12 && gun >= 22) && (gun <= 31)) {
	            System.out.println("Oğlak Burcu.");
	        }
	        if (ay == 12 && gun > 31) {
	            System.out.println("Hatalı gün girdiniz!");


	        }
	    }}
}
}
