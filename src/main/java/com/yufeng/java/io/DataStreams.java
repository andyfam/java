package com.yufeng.java.io;

import java.io.*;

public class DataStreams {

    static final String dataFile = "invoicedata";

    static final double[] prices = {19.99, 9.99, 15.99, 3.99, 4.99};
    static final int[] units = {12, 8, 13, 29, 50};
    static final String[] descs = {
            "Java T-shirt",
            "Java Mug",
            "Duke Juggling Dolls",
            "Java Pin",
            "Java Key Chain"
    };

    public static void main(String[] args) throws IOException {
        DataOutputStream out = null;
        DataInputStream in = null;

        try {
            out = new DataOutputStream(new BufferedOutputStream(
                    new FileOutputStream(dataFile)));

            for (int i = 0; i < prices.length; i++) {
                out.writeDouble(prices[i]);
                out.writeInt(units[i]);
                out.writeUTF(descs[i]);
            }
        } finally {
            if (out != null) {
                out.close();
            }
        }

        try {
            in = new DataInputStream(new
                    BufferedInputStream(new FileInputStream(dataFile)));

            double price;
            int unit;
            String desc;
            double total = 0.0;

            try {
                while (true) {
                    price = in.readDouble();
                    unit = in.readInt();
                    desc = in.readUTF();
                    System.out.format("You ordered %d" + " units of %s at $%.2f%n",
                            unit, desc, price);
                    total += unit * price;
                }
            } catch (EOFException e) {
            }
        } finally {
            if (in != null) {
                in.close();
            }
        }
    }
}
