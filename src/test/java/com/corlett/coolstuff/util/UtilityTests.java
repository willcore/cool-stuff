package com.corlett.coolstuff.util;

import com.corlett.coolstuff.model.Node;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
public class UtilityTests {

    private List<String> list = new ArrayList<>();

    @Before
    public void init() {
        list.add("Goku");
        list.add("Piccolo");
        list.add("Vegeta");
    }

    @Test
    public void testbuildLinkedList() {
        Node head = Utility.buildLinkedList(list);

        Utility.print(head);

        Assert.assertEquals(head.getNext().getContent(), "Piccolo");

    }

}
