/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.ct.dainf.if62c.pratica;

/**
 *
 * @author Ithiro
 */
public class Equacao2Grau<T extends Number & Comparable<T>>{
    
    private T a;
    private T b;
    private T c;
    
    private double da;
    private double db;
    private double dc;
    
    private double r;
    
    private double delta;
    
    private static final String MSG_A0 = "Coeficiente 'A' não pode ser zero";
    private static final String MSG_NRS = "Equação não tem solução real";
    
    public Equacao2Grau() {
    }

    public Equacao2Grau(T a, T b, T c) {
        if (a.intValue() == 0)
        throw new RuntimeException(MSG_A0);
        this.a = a;
        this.b = b;
        this.b = c;
    }
    
    public T getA() {return a;}
    public T getB() {return b;}
    public T getC() {return c;}
    
    public void setA(T a) {
        if (a.intValue() == 0)
        throw new RuntimeException(MSG_A0);
        this.a = a;
    }
    public void setB(T b) {this.b = b;}
    public void setC(T c) {this.c = c;}
    
    public double getDelta() {
        da = a.doubleValue();
        db = b.doubleValue();
        dc = c.doubleValue();
        delta = (db*db)-(4*da*dc);
        if (delta < 0)
        throw new RuntimeException(MSG_NRS);
        return delta;
    }
    
    public double getRaiz1() {
        r = -db + Math.sqrt(getDelta())/2*da;
        return r;
    }
    
    public double getRaiz2() {
        r = -db - Math.sqrt(getDelta())/2*da;
        return r;
    }
    
}
