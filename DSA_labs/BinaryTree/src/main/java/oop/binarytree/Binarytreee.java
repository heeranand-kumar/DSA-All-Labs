/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.binarytree;



/**
 *
 * @author AYESHA
 */

    import java.util.Queue;
import java.util.LinkedList;
public class Binarytreee {
    Btnode root;
    Binarytreee(int data){
        root=new Btnode(data);
    }
    
    
    
    
    public void PostOrderDisplay(Btnode newNode){
    //left>right>root
    if(newNode==null){
        return;
        
    }
    PostOrderDisplay(newNode.left);
    PostOrderDisplay(newNode.right);
        System.out.println(newNode.data);
    }
    

    //preorder   root>left>right
    //inorder   left>root>right
    
        
     public void levelorder(Btnode root){
         Queue<Btnode> queue=new LinkedList();
         queue.add(root);  //works as enqueues
         
         
         while(!queue.isEmpty()){
             Btnode current=queue.poll(); //works as dequeue
             System.out.println(current.data);
             if(current.left!=null){
                 queue.add(current.left);
             }
             if(current.right!=null){
                 queue.add(current.right);
             }
         }
    
    }

           
           
       
    
    
   //level order can be implemented through queue
   // public void LevelOrder(Btnode newNode){
        
    
    
    public static void main(String args[]){
        
        
        
        Binarytreee t1=new Binarytreee(1);
        
        System.out.println(t1.root.data);
        Btnode t2=new Btnode(2);
        
        
        
        
        t1.root.Btnodeleft(t1.root, t2);
        System.out.println(t1.root.left.data);
        
        Btnode t3=new Btnode(3);
        t1.root.Btnodeleft(t1.root, t3);
        
        Btnode t4=new Btnode(4);
        t1.root.Btnoderight(t1.root, t4);
        t3.PostOrderDisplay(t3);
        System.out.println("Level order display: ");
        t1.levelorder(t4);
        
        
        
    }
    
    

    
    
}
    

