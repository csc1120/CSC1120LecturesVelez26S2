/*
 * Course: Class - Section
 * Semester Year
 * Assignment # - Assignment Name
 * Name: Your Name
 * Created: 3/25/2026
 */
package week9.prep;

public class DungeonPaths extends MyBinaryTree<String> {
    public DungeonPaths(){
        super("Room 1", new MyBinaryTree<>(), new MyBinaryTree<>());
    }

    public DungeonPaths(String roomNumber){
        super(roomNumber, new MyBinaryTree<>(), new MyBinaryTree<>());
    }

    public void addRoom(String roomNumber, String leftRoom, String rightRoom){

    }
    private Node<String> find(String roomNumber){
        return find(root, roomNumber);
    }
    private Node<String> find(Node<String> localRoot, String roomNumber){
        Node<String> ret = null;
        if(localRoot == null){
            ret = null;
        } else if (localRoot.data.equalsIgnoreCase(roomNumber)){
            ret = localRoot;
        } else {
            ret = find(localRoot.left, roomNumber);
            if(ret == null){
                ret = find(localRoot.right, roomNumber);
            }
        }
        return ret;
    }
}
