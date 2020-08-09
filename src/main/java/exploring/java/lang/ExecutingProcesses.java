package exploring.java.lang;

import java.io.IOException;

public class ExecutingProcesses {

    public static void main(String[] args) {

        /*
        * The Runtime class encapsulates the run-time environment. You cannot instantiate a Runtime object.
        * However, you can get a reference to the current Runtime object by calling the static method Runtime.getRuntime( ).
        * uses of the Runtime class: memory management and executing additional processes.
        * */



        memoryManagement();
        executingProcesses();
    }


    static void memoryManagement(){
        Runtime runtime = Runtime.getRuntime();

        Integer numbers[] = new Integer[1000];

        System.out.println("Total memory: " + runtime.totalMemory());
        System.out.println("initial Free memory: " + runtime.freeMemory());

        // Run garpage collector manully
        runtime.gc();

        System.out.println("Free memory after garpage collection: " + runtime.freeMemory());

        //Allocate the integer array
        for(Integer i: numbers) i=Integer.valueOf(5);

        System.out.println("Total memory: " + runtime.totalMemory());
        System.out.println("initial Free memory: " + runtime.freeMemory());

        // Run garpage collector manully
        runtime.gc();

        System.out.println("Free memory after garpage collection: " + runtime.freeMemory());

    }
    static void executingProcesses(){
        Runtime r = Runtime.getRuntime();
        Process p = null;
        /*
        * ProcessBulider class can also be use to create and execute processes
        * */

        try{
            p = r.exec("gedit");
            // wait for child processes to finish
            p.waitFor();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(p.exitValue());
    }

}
