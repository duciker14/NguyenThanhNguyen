package basic.dev;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class MainApp {
	static List<Book> readFile(String fileName) throws Exception{
		List<Book> listBook = new ArrayList<Book>();
		
		FileInputStream fts = new FileInputStream(fileName);
		BufferedReader br = new BufferedReader(new InputStreamReader(fts));
		String strLine;
		while((strLine = br.readLine()) != null) {
			if (strLine.indexOf("b") == 0) {
				String[] out = strLine.split("#");
				String maSach = out[0];
				String[] out2 = out[1].split(",");
				String ho = out2[0];
				String ten = out2[1];
				String tenSach = out[2];
				String theLoai = out[3];
				double gia = Double.parseDouble(out[4]);
				String ngay = out[5];
				Book book = new Book(maSach, ho, ten, tenSach, theLoai, gia, ngay);
				listBook.add(book);
			}
		}
		return listBook;
	}
	static void print(List<Book> list) {
		Iterator<Book> it = list.iterator();
		Collections.sort(list, new Comparator<Book>() {
			@Override
			public int compare(Book arg0, Book arg1) {
				// TODO Auto-generated method stub
				if (arg0.ten.hashCode() < arg1.ten.hashCode()) {
					return 1;
				}else if(arg0.ten == arg1.ten){
					return 0;
				}else {
					return -1;
				}
				
			}
		});
		while (it.hasNext()) {
			Book book = (Book) it.next();
			System.out.println(book.toString());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Book> lb = new ArrayList<Book>();
		try {
			lb = readFile("book.dat");
			print(lb);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
