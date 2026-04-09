/*
 * Course: Class - Section
 * Semester Year
 * Assignment # - Assignment Name
 * Name: Your Name
 * Created: 3/31/2026
 */
package exam2;

public class TestBST {
    static void main() {
        MyBST<Integer> bst1 = new MyBST<>();
        bst1.add(7);
        bst1.add(3);
        bst1.add(11);
        bst1.add(1);
        bst1.add(5);
        bst1.add(9);
        System.out.println(bst1);
        System.out.println(bst1.heightOf(7)); //1
        System.out.println(bst1.heightOf(3)); //2
        System.out.println(bst1.heightOf(11)); //2
        System.out.println(bst1.heightOf(1)); //3
        System.out.println(bst1.heightOf(5)); //3
        System.out.println(bst1.heightOf(9)); //3
        System.out.println(bst1.numBigger(8)); //2
        System.out.println(bst1.numBigger(3)); //4
        System.out.println(bst1.numBigger(11)); //0
        System.out.println("Height balanced " + bst1.height());
        System.out.println("Size balanced "+bst1.size());

        MyBST<Integer> bst2 = new MyBST<>();
        bst2.add(11);
        bst2.add(9);
        bst2.add(7);
        bst2.add(5);
        bst2.add(3);
        bst2.add(1);
        System.out.println(bst2);
        System.out.println(bst2.heightOf(11)); //1
        System.out.println(bst2.heightOf(9)); //2
        System.out.println(bst2.heightOf(7)); //3
        System.out.println(bst2.heightOf(5)); //4
        System.out.println(bst2.heightOf(3)); //5
        System.out.println(bst2.heightOf(1)); //6

        System.out.println(bst2.numBigger(8)); //2
        System.out.println(bst2.numBigger(3)); //4
        System.out.println(bst2.numBigger(11)); //0
        System.out.println("Height unbalanced " + bst2.height());
        System.out.println("Size unbalanced "+bst2.size());

        MyBST<Integer> tree = new MyBST<>();
        tree.add(5);
        tree.add(3);
        tree.add(4);
        tree.add(7);
        tree.add(6);
        tree.add(2);
        tree.add(9);

//        tree.delete(7);
//        tree.delete(16);


    }
}
