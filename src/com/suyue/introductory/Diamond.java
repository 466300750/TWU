package com.suyue.introductory;

public class Diamond {
    private String[] generateAsteriskArray(int n) {
        StringBuilder sb;
        String[] result= new String[n];
        for(int i=0; i<n; i++) {
            sb = new StringBuilder();
            for(int j=0; j<n-1-i; j++) {
                sb.append(" ");
            }
            for(int j=0; j<2*i+1; j++) {
                sb.append("*");
            }
            for(int j=0; j<n-1-i; j++) {
                sb.append(" ");
            }
            result[i] = sb.toString();
        }
        return result;
    }
    public void printIsoscelesTriangle(int n){
        String[] result = generateAsteriskArray(n);
        for(int i=0; i<n; i++) {
            System.out.println(result[i]);
        }
    }

    public void printDiamond(int n) {
        String[] result = generateAsteriskArray(n);
        for(int i=0; i<n; i++) {
            System.out.println(result[i]);
        }
        for(int i=n-2; i>=0; i--) {
            System.out.println(result[i]);
        }
    }

    public void printDiamondWithName(int n, String name) {
        String[] result = generateAsteriskArray(n);
        for(int i=0; i<n-1; i++) {
            System.out.println(result[i]);
        }

        int len = name.length();
        for(int i=0; i<(2*n-1-len)/2; i++) {
            System.out.print(" ");
        }
        System.out.print(name);
        System.out.println();

        for(int i=n-2; i>=0; i--) {
            System.out.println(result[i]);
        }
    }
}
