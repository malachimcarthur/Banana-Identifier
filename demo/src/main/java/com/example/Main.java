package com.example;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.imageio.ImageIO;

/**
 * Authors: Malachi, Carter
 * Date: 11/8/2025
 * Purpose: From a picture of a banana, it finds
 * and prints out real world units measured from the attributes of the banana.
 */

public class Main {

    public static void main(String[] args) throws IOException {
        String imageName = null;
        Scanner scanner = new Scanner(System.in);
        while (imageName == null) {
            imageName = BananaImage.chooseImage(scanner);
        }
        BufferedImage image = ImageIO
                .read(new File("demo\\src\\main\\java\\com\\example\\bananaImages\\" + imageName + ".jpg"));
        scanner.close();
        int bananaPixels = BananaImage.bananaDimensions(image, imageName);
        Banana b = new Banana(bananaPixels);
        b.printBananaAttributes();

    }
}
