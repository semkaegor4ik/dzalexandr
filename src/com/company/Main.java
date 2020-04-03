package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Main {

    public static void serializable(ArrayList<PC> computers, String filename)throws IOException, ClassNotFoundException{
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(
                new FileOutputStream(filename));
        for (int i = 0; i <computers.size() ; i++) {
            objectOutputStream.writeObject(computers.get(i));
        }
        objectOutputStream.close();
    }

    public static ArrayList<PC> deserializable(String filename)throws IOException, ClassNotFoundException{
        FileInputStream fileInputStream = new FileInputStream(filename);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        ArrayList<PC> computers = new ArrayList<>();
        while (true){
            try {
                PC systemBlock = (PC) objectInputStream.readObject();
                computers.add(systemBlock);
            } catch (Exception e) {
                break;
            }
        }
        objectInputStream.close();
        return computers;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ArrayList<PC> computers = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int a;
        String filename ="PC.out";
        System.out.println("How many computers do you wanna add?");
        a = sc.nextInt();
        for (int i = 0; i <a ; i++) {
            PC pc = PC.createPC();
            computers.add(pc);
        }
        serializable(computers, filename);
        computers = deserializable(filename);
        System.out.println("Do you wanna sort your computers?");
        System.out.println("1:YES, other digit:NO");
        a = sc.nextInt();
        if(a==1) {
            System.out.println("How do you wanna sort your computers?");
            System.out.println("1:RAM memory, 2:CPU frequency, 3: name");
            a = sc.nextInt();
            switch (a){
                case 1:{
                    Collections.sort(computers, PC.RAMMemoryComparator);
                    break;
                }
                case 2:{
                    Collections.sort(computers, PC.CPUFrequencyComparator);
                    break;
                }
                case 3:{
                    Collections.sort(computers);
                    break;
                }
                default:
                    break;
            }
        }
        computers.forEach(i -> System.out.println(i));

    }

}
