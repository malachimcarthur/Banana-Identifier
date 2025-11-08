package com.example;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.imageio.ImageIO;

public class Main {
    public static void main(String[] args) {
        Banana b = new Banana(0,3);
		b.Volume();
		b.microsivertsPerInch();
        System.out.printf("Ounces: %.2f\nMicrosiverts: %.2f",b.toOunce(), b.microsivertsPerInch());
        String imageName = null;
        Scanner scanner = new Scanner(System.in);
        while (imageName == null) {
            imageName = BananaImage.choosePicture(scanner);
        }
        BufferedImage image = ImageIO.read(new File("demo\\src\\main\\java\\com\\example\\bananaImages\\" + imageName));
        scanner.close();
        System.out.println(BananaImage.isBanana(image, imageName));

    
}