package com.company;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Comparator;

public class PC implements Serializable,Comparable<PC> {
    private final MotherPlate motherPlate;
    private final CPU cpu;
    private  final PowerSupply powerSupply;
    private final RAM ram;
    private final HDD hdd;
    private final Corpus corpus;
    private final VideoCard videoCard;
    private final ArrayList<Cooler> coolers;



    public PC(MotherPlate motherPlate, CPU cpu, PowerSupply powerSupply, RAM ram, HDD hdd, Corpus corpus, VideoCard videoCard, ArrayList<Cooler> array) {
        this.motherPlate = motherPlate;
        this.cpu = cpu;
        this.powerSupply = powerSupply;
        this.ram = ram;
        this.hdd = hdd;
        this.corpus = corpus;
        this.videoCard = videoCard;
        this.coolers = array;
    }

    public static PC createPC(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter motherboard name");
        String name = sc.next();
        MotherPlate motherPlate = new MotherPlate(name);
        System.out.println("Enter CPU name");
        name = sc.next();
        System.out.println("Enter CPU frequency");
        int a = sc.nextInt();
        CPU cpu = new CPU(name,a);
        System.out.println("Enter power supply name");
        name = sc.next();
        System.out.println("Enter power supply power");
        a = sc.nextInt();
        PowerSupply powerSupply = new PowerSupply(name,a);
        System.out.println("Enter RAM memory");
        a = sc.nextInt();
        RAM ram = new RAM(a);
        System.out.println("Enter HDD memory");
        a = sc.nextInt();
        HDD hdd = new HDD(a);
        System.out.println("Enter corpus name");
        name = sc.next();
        Corpus corpus = new Corpus(name);
        System.out.println("Enter videocard name");
        name = sc.next();
        VideoCard videoCard = new VideoCard(name);
        System.out.println("Enter cooler name");
        name = sc.next();
        ArrayList<Cooler> array = new ArrayList<>();
        Cooler cooler = new Cooler(name);
        array.add(cooler);
        boolean flag = true;
        while(flag){
            System.out.println("Do you wanna add more coolers?   1:yes   other:no");
            int ask = sc.nextInt();
            switch (ask){
                case 1:{
                    System.out.println("Enter cooler name");
                    name = sc.next();
                    cooler = new Cooler(name);
                    array.add(cooler);
                    break;
                }
                default:{
                    flag = false;
                    break;
                }
            }
        }
        return new PC(motherPlate,cpu,powerSupply,ram,hdd,corpus,videoCard,array);
    }

    public MotherPlate getMotherPlate() {
        return motherPlate;
    }

    public CPU getCpu() {
        return cpu;
    }

    public PowerSupply getPowerSupply() {
        return powerSupply;
    }

    public RAM getRam() {
        return ram;
    }

    public HDD getHdd() {
        return hdd;
    }

    public Corpus getCorpus() {
        return corpus;
    }

    public VideoCard getVideoCard() {
        return videoCard;
    }

    @Override
    public String toString() {
        return "PC{" +
                "motherPlate=" + motherPlate +
                ", cpu=" + cpu +
                ", powerSupply=" + powerSupply +
                ", ram=" + ram +
                ", hdd=" + hdd +
                ", corpus=" + corpus +
                ", videoCard=" + videoCard +
                ", coolers=" + coolers +
                '}';
    }

    @Override
    public int compareTo(PC o) {
        if(this.getMotherPlate().getName().equals(o.getMotherPlate().getName())){
            if(this.getCpu().getName().equals(o.getCpu().getName())){
                if(this.getPowerSupply().getName().equals(o.getPowerSupply().getName())){
                    if(this.getCorpus().getName().equals(o.getCorpus().getName())){
                        return this.getVideoCard().getName().compareTo(o.getVideoCard().getName());
                    }
                    return this.getCorpus().getName().compareTo(o.getCorpus().getName());
                }
                return this.getPowerSupply().getName().compareTo(o.getPowerSupply().getName());
            }
            return this.getCpu().getName().compareTo(o.getCpu().getName());
        }
        return this.getMotherPlate().getName().compareTo(o.getMotherPlate().getName());
    }

    public  static  Comparator<PC> RAMMemoryComparator = new Comparator<PC>() {
        @Override
        public int compare(PC o1, PC o2) {
            return o1.getRam().compareTo(o2.getRam());
        }
    };

    public  static  Comparator<PC> CPUFrequencyComparator = new Comparator<PC>() {
        @Override
        public int compare(PC o1, PC o2) {
            return o1.getCpu().compareTo(o2.getCpu());
        }
    };
}
