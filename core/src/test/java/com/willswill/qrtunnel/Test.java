package com.willswill.qrtunnel;

import com.willswill.qrtunnel.core.*;

import java.awt.image.BufferedImage;
import java.io.File;

/**
 * @author Will
 */
public class Test {
    public static void main(String[] args) {
        test2();
    }

    public static void test2() {
        AppConfigs appConfigs = new AppConfigs();
        appConfigs.setSaveDir("Received");
        Decoder decoder = new Decoder(appConfigs, null);

        Encoder encoder = new Encoder(appConfigs, new EncoderCallback() {
            @Override
            public void imageCreated(int num, BufferedImage image) {
                try {
                    decoder.decode(image, 0);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }, new LogCallback() {
            @Override
            public void printLog(int totalImg, int currentImg) {

            }
        });

        File file = new File("D:\\Temp\\1.png");
        try {
            encoder.encode(file);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
