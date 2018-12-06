//syahrizalhanif
//6701184059

import java.util.Scanner;
//berfungsi sebagai perintah untuk memanggil scanner dalam java

class suhu
//pendeklarasian class suhu 
{
	
	float c,r,f,k;
	//pendeklarasian tipe data, disini saya memilih float karena range angkanya lebih banyak dari integer
	
	Scanner masuk = new Scanner(System.in);
	//pendeklarasian variabel scanner, variabelnya adalah 'masuk'
	
		void view()
		{
			System.out.println("----------------------------------------");
			System.out.println("");
			System.out.println("Program Konversi Suhu");
			System.out.println("");
			System.out.println("Syahrizal Hanif");
			System.out.println("6701184059");
			System.out.println("");
			System.out.println("----------------------------------------");
			System.out.println("1. Celcius");
			System.out.println("2. Reamur");
			System.out.println("3. Fahrenheit");
			System.out.println("4. Kelvin");
			System.out.println("");
			System.out.print("Pilih suhu yang dikonversi :");
			
	int ma = masuk.nextInt();
	//untuk input masuk pilihan suhu	
		switch (ma)
		{
			//case 1-4 merupakan proses dan juga output hasil konversi suhunya
			case 1:
				System.out.println("");
				System.out.print("Masukkan suhu Celcius :");
				c = masuk.nextFloat();
				float reamur = (float) (0.8*c);
				float fahrenheit = (float) (1.8*c+32);
				float kelvin = (float) (c+273.15);
				System.out.println("");
				System.out.println("Reamur = " +reamur);
				System.out.println("Fahrenheit = " +fahrenheit);
				System.out.println("Kelvin = " +kelvin);
			break;
			
			case 2:
				System.out.println("");
				System.out.print("Masukkan suhu Reamur :");
				r = masuk.nextFloat();
				float celcius = (float) (1.25*r);
				float fahrenheit2 = (float) (2.25*r+32);
				float kelvin2 = (float) ((r/0.8)+273.15);
				System.out.println("");
				System.out.println("Celcius = "+celcius);
				System.out.println("Fahrenheit = "+fahrenheit2);
				System.out.println("Kelvin = "+kelvin2);
			break;
			
			case 3:
				System.out.println("");
				System.out.print("Masukkan suhu Fahrenheit :");
				f = masuk.nextFloat();
				float celcius2 = (float) (0.555555556*f-32);
				float reamur2 = (float) (0.444444444*f-32);
				float kelvin3 = (float) ((f+459.67)/2.25);
				System.out.println("");
				System.out.println("Celcius = "+celcius2);
				System.out.println("Reamur = "+reamur2);
				System.out.println("Kelvin = "+kelvin3);
			break;
			
			case 4:
				System.out.println("");
				System.out.print("Masukkan suhu Kelvin :");
				k = masuk.nextFloat();
				float celcius3 = (float) (k-273.15);
				float reamur3 = (float) ((k-273.15)*0.8);
				float fahrenheit3 = (float) ((k*1.8)-459.67);
				System.out.println("");
				System.out.println("Celcius = "+celcius3);
				System.out.println("Reamur = "+reamur3);
				System.out.println("Fahrenheit = "+fahrenheit3);
			break;
			
		}
		}
}