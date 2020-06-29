package com.corlett.coolstuff.service;

import com.corlett.coolstuff.model.GNode;

public class DirectedGraphService {

    /*
    Given a directed graph, design an algorithm to find out whether there is a route between two nodes.
     */

    /*
    Notes:
    DFS can be implemented recursively or with a Stack. I assume BFS is similiar but with a Queue.

    Graphs can be a bit more complex than Binary Search Tree's - as we will need to account for cycles.
     */

    public static boolean isRoute(GNode node){
        //read in a Graph and two nodes and see if traversal of our BFS can get us from one to another

        boolean[] visited = new boolean[node.getVerticies().size()];


        return false;
    }

    public static boolean DFS(GNode node, boolean[] cycleTracker) {
        //visit aka check if DFS found the other graph node
        //STUBBs

        //tracking visit
        cycleTracker[node.getContent()] = true;

        for(GNode child : node.getVerticies()){
            if(!cycleTracker[child.getContent()]){
                DFS(child, cycleTracker);
            }
        }

        return false;
    }
}
