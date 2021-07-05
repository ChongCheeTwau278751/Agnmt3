package A_3Test;

 class TotalPayment implements TotalPrice {

	 int price = 150;
	 
	@Override
	public int totalPrice() {
		// TODO Auto-generated method stub
		return price;
	}

	@Override
	public int totalPrice(int person) {
		// TODO Auto-generated method stub
		return price*person;
	}

	@Override
	public int totalPrice(int person, int time) {
		// TODO Auto-generated method stub
		if(time%60 != 0) {
			return person * ((time/60)+1) * price;
		}else if(time%60 == 0) {
			return person * (time/60) * price;
		}else {
			return totalPrice();
		}
	}
}
