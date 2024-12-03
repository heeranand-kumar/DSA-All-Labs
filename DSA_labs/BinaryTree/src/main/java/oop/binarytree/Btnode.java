/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.binarytree;

/**
 *
 * @author AYESHA
 */
public class Btnode {
    
    int data;
    Btnode left;
    Btnode right;
    
    Btnode(int data){
        this.data=data;
left=right=null;

    }
    
    
    public void Btnodeleft(Btnode parent,Btnode child){
        this.left=child;
    }
    
    public void Btnoderight(Btnode parent,Btnode child){
        this.right=child;
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
    
    public void PreorderDisplay(Btnode newnode){
        if(newnode==null){
return;
}
          System.out.print(" "+ newnode.data);
          PreorderDisplay(newnode.left);
          PreorderDisplay(newnode.right);
    }
    
    
}
