package ro.ase.acs.example2;

public class DiscountCalculation {

	public float calculateDiscountBasedOnProductAvailabilityAndClient(ProductType productType, float productPrice,
			int percentageDiscount) {
		// float result = 0;
		// we don't need a variable which is calculated based on others
		float discount = (percentageDiscount > 10) ? (float) 30 / 100 : (float) percentageDiscount / 100;

		float[] discountProductType = { 0f, 0.1f, 0.25f, 0.35f };

		if (productType.getId() <= ProductType.CRITICAL_AVAILAIBILITY.getId()
				&& productType.getId() > ProductType.HIGH_AVAILABILITY.getId()) {
			if (productType.getId() == 1) {
				return productPrice;
			} else {
				return (productPrice - (discountProductType[productType.getId() - 1] * productPrice))
						- discount * (productPrice - (discountProductType[productType.getId() - 1] * productPrice));
			}
		} else {
			return 0;
		}

//		if (productType == 1) {
//			//result = s;
//			return productPrice;
//		} else if (productType == 2) {
//			//result = (s - (0.1f * s)) - value * (s - (0.1f * s));
//			return (productPrice - (0.1f * productPrice)) - discount * (productPrice - (0.1f * productPrice));
//		} else if (productType == 3) {
//			//result = (s - (0.25f * s)) - value * (s - (0.25f * s));
//			return (productPrice - (0.25f * productPrice)) - discount * (productPrice - (0.25f * productPrice));
//		} else if (productType == 4) {
//			//result = (s - (0.35f * s)) - value * (s - (0.35f * s));
//			return (productPrice - (0.35f * productPrice)) - discount * (productPrice - (0.35f * productPrice));
//		}
//		
//		//return result;
//		return 0;
	}

}
