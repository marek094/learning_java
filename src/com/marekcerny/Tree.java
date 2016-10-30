package com.marekcerny;

/**
 * Created by cernym23 on 24.10.16.
 */
public class Tree {
    private int size = 0;

    protected class Node {
        public Node left, right, top;
        public Integer value;

        public Node find(Integer o) {
            if (o.compareTo(value) < 0) {
                if (left != null) {
                    return left.find(o);
                }
            } else if (value.compareTo(o) < 0) {
                if (right != null) {
                    return left.find(o);
                }
            } else {
                return this;
            }
            return null;
        }
    }

    private Node root = new Node();


    public void add(int o) {

    }

    private Node findPlace(Integer o) {
        Node it = root, last_it;
        //while ()
        return null;
    }


    public void remove(Integer o) {

    }


    public boolean find(Integer o) {
        return root.find(o) != null;
    }


    public int getSize() {
        return size;
    }
}
