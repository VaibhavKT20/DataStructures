package AccessControl;
//In-built packages
import java.lang.*;
import java.io.*;
import java.util.*;
import java.applet.*;
import java.math.*;
import java.awt.*;
import java.net.*;
public class A {
    protected int num;
    String name;
    int[] arr;
    public int getNum(){
        return num;
    }
    public void setNum(int num){
        this.num=num;
    }

    public A(int num, String name) {
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }
}
