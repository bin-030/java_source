package pack3;

public class Ex10CoinIn {
	int coin;
	int jandon;
	
	Ex10Machine machine = new Ex10Machine();
	
	public Ex10CoinIn() {
		this.machine = machine;
	}
	
	public void calc(int inCoin, int price, int cup) {
        coin = inCoin;
        int totalPrice = price * cup;
        if (coin < totalPrice) {
            System.out.println("요금이 부족합니다.");
        } else {
            jandon = coin - totalPrice;
            machine.cupminus(cup);
        }
	}
       public void showjandon() {
           System.out.println("잔돈 " + jandon + "원");
        }
    }


/* 답안 풀이
package pack3;

public class Ex10CoinIn {
	private int coin;
	private int jandon;
	
	public void setCoin(int coin) {
		this.coin = coin;
	}

	public int getJandon() {
		return jandon;
	}
	
	public String calc(int cupCount) {
	String re = "";
	if(coin < 200) {
			re = "요금이 부족합니다.";
	}else if(cupCount * 200 > coin) {
			re = "요금이 부족합니다.";
	}else {
			jandon = coin - (200 * cupCount);
			re = "커피 " + cupCount + "잔과 잔돈 " + jandon + "원";
			}
			return re;
	}
} */