package com.yedam.exam;

public interface payment {
// 상수필드
//	 1) 온라인 결제 할인율 (ONLINE_PAYMENT_RATIO), 5%
//   2) 오프라인 결제 할인율 (OFFLINE_PAYMENT_RATIO), 3%  

//	온라인 결제 할인율
	public static final double ONLINE_PAYMENT_RATIO = 0.05;
//	오프라인 결제 할인율
	public static final double OFFLINE_PAYMENT_RATIO = 0.03;

//	추상 메소드
//	public abstract int online(int price);
	public int online(int price);

	public int offline(int price);

	public void showInfo();

}
