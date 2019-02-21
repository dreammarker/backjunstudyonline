package backjun;

public class Money {
	
	//
	// 클래스 구현을 완성 하십시오.
	// 

	
	private int amount;
	
	public Money(int money) {
		money= amount;
	}

	public Money add(Money money) {
		amount+=money.getAmount();
		money.setAmount(amount);
		return money;
	}

	public Money minus(Money money) {
		amount-=money.getAmount();
		money.setAmount(amount);
		return money;
	}

	public Money multiply(Money money) {
		amount*=money.getAmount();
		money.setAmount(amount);
		return money;
	}

	public Money devide(Money money) {
		if(money.getAmount()!=0)
		amount/=money.getAmount();
		money.setAmount(amount);
		return money;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + amount;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Money other = (Money) obj;
		if (amount != other.amount)
			return false;
		return true;
	}
	
}
