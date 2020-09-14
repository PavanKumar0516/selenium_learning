package com.seleniumtest;

import java.io.IOException;

public class Wrapper {
	public static void main(String[] args)  throws IOException {
        WrapperMethods wm = new WrapperMethods();
        wm.insertapp("https://www.flipkart.com");
        wm.enterbyxapth("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input","9553017205");
        wm.enterbyxapth("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input","pavan@7");
        wm.clickbyxpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[3]/button");
        wm.enterbyxapthkeys("//*[@id='container']/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input","Mobiles");
        wm.takesnap("src\\test\\resources\\screenshots\\filebin.png");
        wm.getelementdata("//*[@id='container']/div/div[3]/div[2]/div[1]/div[2]/div[2]/div/div/div/a/div[2]/div[1]/div[1]");
        wm.getelementdata("//*[@id='container']/div/div[3]/div[2]/div[1]/div[2]/div[2]/div/div/div/a/div[2]/div[1]/div[3]/ul");
    }
}