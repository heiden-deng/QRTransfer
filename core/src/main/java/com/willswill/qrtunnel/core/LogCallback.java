package com.willswill.qrtunnel.core;

/**
 * @Author: heiden
 * @Date: 2021/12/15 08:31
 * @Project: qr-tunnel
 */
public interface LogCallback {
    default void printLog(int totalImg, int currentImg) {
    }
}
