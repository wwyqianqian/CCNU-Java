// 输入：
// 一个整数 num，表示图形个数
// num 行，每行是用空格隔开的整数
// 输出：
// num 行，每行是一个图形的面积


import java.util.Scanner;  // Import Scanner 类，用于读取键入

public class MainClass { // 文件名 MainClass.java

	public static void main(String[] args) { // main 函数主体
		
		Scanner in = new Scanner(System.in); // 读取用户输入的内容作为对象 in
		int number = Integer.parseInt(in.nextLine()); // number 代表一共几个图形，parseInt() 方法用于将字符串参数作为有符号的十进制整数进行解析
		String[] str = new String[number]; // 定义字符串数组类型对象 str[]
		
		for (int i = 0; i < number; i++) { // 把用户输入的每一行字符串，形如："2 3" 或者形如："3 4 5"，存入字符串数组 str[]
			str[i] = in.nextLine();
		}
		
		for (int n = 0; n < number; n++) {
			String[] temp = str[n].split(" "); // 定义暂时的字符串数组 temp，按照每一行，把刚刚的 str[] 按照空格划分，把每一个只含有数字、不含有空格的字符串存入临时数组 temp

			if (temp.length == 2) { // 如果 temp[] 含两个元素，说明是矩形
				int[] side = new int[2]; // 建立整形 side[] 数组
				for (int m = 0; m < 2; m++) { // 目的是把 string 类型的 temp[] 中的所有元素，即一行里面的元素拷贝进 int 类型的 side[]
					side[m] = Integer.parseInt(temp[m]);  // parseInt() 把 string 转换为 int
				}
				
				Rectangle rectangle = new Rectangle(); // 建立一个 Rectangle 类的矩形对象
				rectangle.setside(side); // 调用类方法设置矩形长宽
				System.out.println(rectangle.average()); // 输出矩形的面积
			}
			
			if (temp.length == 3) { // 如果 temp[] 含有三个元素，说明是三角形
				int[] side = new int[3]; // 建立整形 side[] 数组 
				for (int m = 0; m < 3; m++) { // 同上 把一行里面的元素拷贝进 int 类型的 side[]
					side[m] = Integer.parseInt(temp[m]); // 同上 把 string 转换为 int
				}
				
				Triangle triangle = new Triangle(); // 建立一个 Triangle 类的三角形对象
				triangle.setside(side);  // 调用类方法设置三角形三边长
				if (triangle.triangletorf(side[0], side[1], side[2])) { // 判断三角形三边是否合法
					System.out.println(triangle.average()); // 输出三角形的面积
				}
			}
		}
	}
}

class Graph { // 定义父类图形
	int[] side; // 类的变量

	public int[] getside() { // 类的函数
		return this.side;
	}

}

class Triangle extends Graph { // 三角形子类继承父类
	public int[] setside(int[] side) { // side[] 数组拷贝
		return this.side = side;
	}
	public int average() { // 计算三角形面积
		int avg = 0;
		double s = (side[0] + side[1] + side[2]) / 2.0;
		avg = (int) Math.floor(Math.sqrt(s * (s - side[0]) * (s - side[1]) * (s - side[2])));
		return avg;
	}
	public boolean triangletorf(int i1, int i2, int i3) { // 判断三角形三边是否合法
		if (i1 + i2 < i3 || i1 + i3 < i2 || i2 + i3 < i1) {
			return false;
		}
		return true;
	}
}

class Rectangle extends Graph { // 矩形子类继承父类
	public int[] setside(int[] side) { // side[] 数组拷贝
		return this.side = side;
	}
	public int average() { // 计算矩形面积
		int avg = 0;
		avg = (int) Math.floor(this.side[0] * this.side[1]);
		return avg;
	}
}


//  ~/Desktop  javac Main.java                3750ms  Sun May  5 11:03:56 2019
//  ~/Desktop  java Main                      636ms  Sun May  5 11:04:25 2019
// 3
// 3 4 5
// 2 6
// 1 7
// 6
// 12
// 7