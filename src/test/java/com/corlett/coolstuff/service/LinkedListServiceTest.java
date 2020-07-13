package com.corlett.coolstuff.service;

import com.corlett.coolstuff.model.Node;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class LinkedListServiceTest {

    Node head;

    @Before
    public void init() {
        head= new Node("1");
        Node two = new Node("2");
        Node three = new Node("3");
        Node four = new Node("4");

        head.setNext(two);
        two.setNext(three);
        three.setNext(four);
        four.setNext(two);
    }

    @Test
    public void detectCycleTest() {

        Node solution = LinkedListService.detectCycle(head);

        Assert.assertTrue(solution.getContent().equals("2"));
    }
}
