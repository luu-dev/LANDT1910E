package com.t3h.mangtinh;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class MangTinh {
    private Integer[] arr = new Integer[50];
    private Random rd = new Random();

    public MangTinh() {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(100);
        }
    }

    public void inMang() {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }

    public void sapXep() {
        Arrays.sort(arr, comparator);
    }

    private Comparator<Integer> comparator = new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o2 - o1;
        }
    };


}
