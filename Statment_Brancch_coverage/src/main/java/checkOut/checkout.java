package checkOut;

public class checkout {
		
		public static boolean checkOut(double cart, int creditRating, statusClass.Status status) {
			boolean approved = false; 
			
			if(status == statusClass.Status.GOLD) {
				if(cart<3500.00)
					approved = true;
				else 
					if(creditRating>650)
						approved = true;
				}
			else
				if (status == statusClass.Status.SILVER) {
					if(cart<2500.00)
						approved = true;
					else
						if(creditRating>750)
							approved = true;
					}
			
				else {
					if(cart<1500.00)
						approved = true;
					else 
						if(creditRating>800)
							approved = true;
					}
		return approved;
			
			}
		}
		

