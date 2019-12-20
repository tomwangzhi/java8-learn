package com.wz.client;

import com.wz.service.LamadaEvolution;


import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LamadaWayClient {

    public static void main(String[] args) {

        // 匿名实现接口
        LamadaEvolution lamadaEvolution = new LamadaEvolution() {
            @Override
            public void beforeCollectionSort(List<String> collections) {
                Collections.sort(collections, new Comparator<String>() {
                    @Override
                    public int compare(String o1,String o2) {
                        return o1.compareTo(o2);
                    }
                });
            }

            @Override
            public void lambadaSort(List<String> collection) {
                // lambada的方式，类似一个函数，传进去一种行为，有结果返回和无结果返回两种，这里是两个入参
                //Collections.sort(collection,(a,b)-> a.compareTo(b));
                // 比较器的实现可以在Comparator中寻找
                Collections.sort(collection,Comparator.naturalOrder());
            }
        };

        List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");
        List<String> lnames = Arrays.asList("peter", "anna", "mike", "xenia");

        lamadaEvolution.beforeCollectionSort(names);
        lamadaEvolution.lambadaSort(lnames);

        System.out.println(names);
        System.out.println(lnames);
    }
}
