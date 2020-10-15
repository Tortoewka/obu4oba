package com.company.geekbrains.java.lisson1;


import java.util.ArrayList;
import java.util.HashMap;

public class main {


    public static void main(String[] agrs) {

        String text = "Ночь, улица, фонарь, аптека, \n" +
                "Бессмысленный и тусклый свет. \n" +
                "Живи еще хоть четверть века —\n" +
                "Всё будет так. Исхода нет. \n" +
                "Умрешь — начнешь опять сначала \n" +
                "И повторится всё, как встарь: \n" +
                "Ночь, ледяная рябь канала, \n" +
                "Аптека, улица, фонарь.";


        String text1 = text.replaceAll("\\\n|\\:|\\,|\\.|\\—", "");

        String[] text2 = text1.split(" ");
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < text2.length; i++) {
            Integer j = 0;
            //   map.containsKey(text2[i]);

            map.containsKey(text2[i]);
            if (map.containsKey(text2[i]) == true)
                j++;
            map.put(text2[i], j);

        }
        System.out.print(map);
    }
}
