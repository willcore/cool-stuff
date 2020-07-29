package com.corlett.coolstuff.service;

import com.corlett.coolstuff.model.Node;
import com.corlett.coolstuff.util.Utility;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import static com.corlett.coolstuff.service.LinkedListService.isThisLLaPalindrome;

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

    @Test
    public void detectCycleTestTricky() {

        Node solution = LinkedListService.detectCycleTricky(head);

        Assert.assertTrue(solution.getContent().equals("2"));
    }

    @Test
    public void testRemoveDup() {

        Node dupHead= new Node("1");
        Node two = new Node("2");
        Node three = new Node("3");
        Node four = new Node("4");
        Node five = new Node("2");


        dupHead.setNext(two);
        two.setNext(three);
        three.setNext(four);
        four.setNext(five);

        Utility.print_LL(dupHead);

        Node solution = LinkedListService.removeDuplicate(dupHead);

        Utility.print_LL(dupHead);

        Assert.assertTrue(LL_Counter(solution)==4);
    }

    public int LL_Counter(Node head) {
        int count = 1;

        while(head.getNext()!=null){
            count++;
            head = head.getNext();
        }

        System.out.println(count);
        return count;
    }

    @Test
    public void testLLPalindromeTrue() {
        Node head = new Node("M");
        Node one = new Node("o");
        Node two = new Node("o");
        Node three = new Node("M");

        head.setNext(one);
        one.setNext(two);
        two.setNext(three);

        Assert.assertTrue(isThisLLaPalindrome(head));
    }

    @Test
    public void testLLPalindromeFalse() {
        Node head = new Node("M");
        Node one = new Node("o");
        Node two = new Node("o");
        Node three = new Node("n");

        head.setNext(one);
        one.setNext(two);
        two.setNext(three);

        Assert.assertTrue(!isThisLLaPalindrome(head));
    }
}
