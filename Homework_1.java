package xxx;

	public class Homework1 {

		public static void main(String[] args) {

			private String lalala;
			private String hahaha;
			private String hehehe;

			System.out.println("test!");
			int a1 = 6;
			int a2 = 12;
			int num1 = a1 + a2;
			int num2 = a1 * a2;
			System.out.println("和是" + num1);
			System.out.println("積是" + num2);

			int egg = 200;
			int dozen = 12;
			int num3 = egg / dozen;
			int num4 = egg % dozen;
			System.out.println(num3 + "打");
			System.out.println("餘" + num4 + "顆");

			int second = 256559;
			int day = 86400;
			int hour = 3600;
			int minute = 60;
			int num5 = second / day;  //除以86400秒等於幾天
			int num6 = second % day;  //天數剩餘的秒數
			int num7 = num6 / hour;    //天數剩餘的秒數除以3600秒等於幾小時
			int num8 = num6 % hour;    //小時剩餘的秒數
			int num9 = num8 / minute;  //小時剩餘的秒數除以60秒等於幾分鐘
			int num10 = num8 % minute; //分鐘剩餘的秒數

			System.out.println(num5);
			System.out.println(num6);
			System.out.println(num7);
			System.out.println(num8);
			System.out.println(num9);
			System.out.println(num10);
			System.out.println(num5 + "天" + num7 + "小時" + num9 + "分" + num10 + "秒");

			final double PI = 3.1415;
			int r = 5;
			double area = r * r * PI;
			double perimeter = 2 * r *PI;
			System.out.println("圓面積為" + area + "平方公分");
			System.out.println("圓周長為" + perimeter + "公分");

			int money = 1500000;
			double i = 1.02;
			double s = money * (Math.pow(i, 10));
			System.out.println("本金加利息共" + s + "元");

			int a = 5;
			int b = 5;
			char c = '5';
			String d = "5";
			System.out.println(a + b);     //兩個數值相加,5+5=10
			System.out.println(a + c);     //字元轉換成為一個整數(對照unicode表為53),5+53=58
			System.out.println(a + d);     //加號的左邊是字串,會變成文字串接,變成55






	}

}
