import java.util.*;
class Node{
    int val;
    Node left;
    Node right;

    Node(int val){
        this.val=val;
    }
    Node(int val,Node left,Node right){
        this.val=val;
        this.left=left;
        this.right=right;
    }

}
public class BinarySearchTree {
    private Node root;

    Node insert(int newVal,Node root){
        if(root==null){
            return new Node(newVal);
        }
        if(newVal<root.val){
            root.left=insert(newVal,root.left);
        }
        else if(newVal>root.val){
            root.right=insert(newVal,root.right);
        }
        return root;
    }
    boolean search(int key,Node root){
        if(root==null)return false;
        if(root.val==key){
            return true;
        }
        if(key<root.val){
            return search(key,root.left);
        }
        return search(key,root.right);
    }
    Node delete(Node root,int key){
        if(root==null)return null;
        if(key<root.val){
            root.left=delete(root.left,key);
        }
        else if(key>root.val){
            root.right=delete(root.right,key);
        }
        else{
            if(root.left==null&root.right==null){
                return null;
            }
            else if(root.left==null){
                return root.right;
            }
            else if(root.right==null){
                return root.left;
            }
            Node successor = findMin(root.right);
            root.val = successor.val;
            root.right = delete(root.right, successor.val);
        }
        return root;
    }
    Node findMin(Node root){
        if(root==null)return null;
        while(root.left!=null){
            root=root.left;
        }
        return root;
    }

    void printBst(Node root){
        if(root==null)return;
        printBst(root.left);
        System.out.print(root.val+"->");
        printBst(root.right);
    }
    Node createBinarySearchTree(Node root,int[] arr,int low,int high){
        if(low>high)return root;
        if(arr.length==0){
            return root;
        }
            int mid=low+(high-low)/2;

                root=new Node(arr[mid]);

            root.left=createBinarySearchTree(root.left,arr,low,mid-1);
            root.right=createBinarySearchTree(root.right,arr,mid+1,high);
            return root;

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] sortedarr=new int[n];
        for(int i=0;i<n;i++){
            sortedarr[i]=sc.nextInt();
        }
        BinarySearchTree bst=new BinarySearchTree();
//        for(int i=0;i<n;i++){
//            int nodeval=sc.nextInt();
//            bst.root=bst.crea(nodeval,bst.root);
//        }
        bst.root=bst.createBinarySearchTree(bst.root,sortedarr,0,n-1);
        bst.printBst(bst.root);
//        bst.printBst(bst.root);
//        System.out.println();
//        bst.root=bst.delete(bst.root,8);
//        bst.printBst(bst.root);
//        System.out.println();
//        bst.insert(100,bst.root);
//        bst.printBst(bst.root);
//        bst.delete(bst.root,88);
//        bst.printBst(bst.root);
    }
}
