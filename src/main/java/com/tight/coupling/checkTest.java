package com.tight.coupling;

public class checkTest {
    private TestKnowledge testKnowledge = new TestKnowledge();
    public String getKnowledgeInfo() {
        return testKnowledge.getTest();
    }
}
