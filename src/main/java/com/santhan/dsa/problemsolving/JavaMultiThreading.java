package com.santhan.dsa.problemsolving;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class JavaMultiThreading {

    public static void runAThread() throws InterruptedException {
        long startTime = System.currentTimeMillis();
        Thread thread1 = new Thread(()->{
            Path path = Path.of("src/main/resources/data.txt");
            if(Files.isReadable(path)){
                System.out.println("File is readable");
                try {
                    List<String> strings = Files.readAllLines(path);
                    Path out = Path.of("src/main/resources/output.txt");
                    Files.write(out,strings);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("Thread1 is doing its Job");
        });

        Thread thread2 = new Thread(()->{
            Path path = Path.of("src/main/resources/input.txt");
            if(Files.isReadable(path)){
                System.out.println("File is readable");
                try {
                    List<String> strings = Files.readAllLines(path);
                    Path out = Path.of("src/main/resources/output.txt");
                    for(String s : strings){
                        Files.writeString(out,s);
                    }

                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("Thread2 is doing its Job");
        });

        thread1.start();
        thread2.start();
        thread2.join();
        System.out.println("Total time taken is :"+(System.currentTimeMillis()-startTime));

    }
}
