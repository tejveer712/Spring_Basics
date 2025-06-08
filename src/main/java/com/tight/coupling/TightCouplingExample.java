package com.tight.coupling;

public class TightCouplingExample {
    public static void main(String[] args) {
        UserManager userManager = new UserManager();
        System.out.println(userManager.getUserInfo());

        checkTest checktest = new checkTest();
        System.out.println(checktest.getKnowledgeInfo());
    }
}
