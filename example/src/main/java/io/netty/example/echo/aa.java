package io.netty.example.echo;

import java.util.*;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;

public class aa {
    public static void main(String[] args) {


        {
            LinkedHashMap<String, String> map = new LinkedHashMap();
            map.put("1", "1");
            map.put("3", "3");
            map.put("2", "2");

            for (Map.Entry<String, String> entry : map.entrySet()) {
                System.out.println(entry.getKey());
            }

            for (String key : map.keySet()) {
                System.out.println(key);
            }
        }
        System.out.println("====");
        {
            HashMap<String, String> map = new HashMap();
            map.put("1", "1");
            map.put("3", "3");
            map.put("2", "2");

            for (Map.Entry<String, String> entry : map.entrySet()) {
                System.out.println(entry.getKey());
            }
        }

        System.out.println("====");
        {
            Stack<String> stack = new Stack<String>();
            for (int i = 0; i < 10; i++) {
                stack.push(String.valueOf(i));
            }

            while (!stack.isEmpty()){
                System.out.println(stack.pop());
            }
        }

        System.out.println("===queue==");
        {
            Queue<String> queue = new LinkedList<String>();
            for (int i = 0; i < 5; i++) {
                System.out.println("offer:"+i);
                queue.offer(String.valueOf(i));
            }

            while (!queue.isEmpty()){
                System.out.println("poll:"+queue.poll());
            }
        }

        System.out.println("===test==");
         AtomicInteger idx = new AtomicInteger();
        for (int i = 0; i < 100; i++) {
            int a =idx.getAndIncrement();
            System.out.println(a & 16 - 1);
            System.out.println(a & (16 - 1));        }



    }
}
