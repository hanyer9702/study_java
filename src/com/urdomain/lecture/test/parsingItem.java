package com.urdomain.lecture.test;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class parsingItem {

	public static void main(String[] args) throws IOException {
		String url = ("https://search.shopping.naver.com/catalog/29669228618?query=%EA%B0%80%EA%B5%AC%EC%9D%98%20%EA%B0%80%EC%B9%98%20%EA%B5%BF%EB%AA%A8%EB%8B%9D%20%EC%9B%90%EB%AA%A9&NaPm=ct%3Dl1zu5bd4%7Cci%3D2c1786841918030fd017bc76b33b36b15a661de9%7Ctr%3Dslsl%7Csn%3D95694%7Chk%3D48c86a7033448db66650281e30d5d985b0cf99eb");
		Document doc = Jsoup.connect(url).get();
		
		Elements contents = doc.select(".productByMall_list_seller__2-bzE");
//		Elements contentsName = doc.select(".productByMall_list_seller__2-bzE tbody tr td div a img");
		Elements img = doc.getElementsByTag("img"); 
//		Elements img = img1.select(".productByMall_list_seller__2-bzE");
		
		String text = contents.text();
//		String text2 = contentsName.text();
		
		int counter = 0; 

        // Loop through img tags
        for (Element el : img) {
            // If alt is empty or null, add one to counter
            if(el.attr("alt") == null || el.attr("alt").equals("")) {
                counter++;
            }
            System.out.println("image tag: " + el.attr("src") + " Alt: " + el.attr("alt"));
        }
        System.out.println("Number of unset alt: " + counter);


		System.out.println("text1"+text);
//		System.out.println("text2"+text2);
	} 
 
}
