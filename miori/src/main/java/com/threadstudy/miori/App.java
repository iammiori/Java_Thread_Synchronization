 package com.threadstudy.miori;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        // thread 생성
        Thread t1 = new HelloWorldThread();
        
        // thread 실행
        t1.start();
         
        System.out.println("Hello World2");
    }
}
 