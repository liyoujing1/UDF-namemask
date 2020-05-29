package com.dsjzx.dunfei;

import org.apache.hadoop.hive.ql.exec.UDF;

public class NameStruct extends UDF {

    public static String evaluate(String xm)  {

        try {
            StringBuilder stringBuilder = new StringBuilder();
            String[] split = xm.split("");
            for (int i = 0; i < split.length; i++) {
                if (i == 1) {
                    stringBuilder.append("X");
                } else {
                    stringBuilder.append(split[i]);
                }

            }
            return stringBuilder.toString();

    } catch (Exception e) {
        e.printStackTrace();
        return "0";
    }

}



}
