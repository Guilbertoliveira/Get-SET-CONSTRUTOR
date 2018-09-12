/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula04;


public class Caneta {
    
    public String modelo;
    private float ponto;
    private boolean tampa;
    private String cor;
    
    
    public Caneta(String m, float p, boolean t, String c) // metodo construtor sempre tem  o mesmo nome da classe. Com isso consigo adicionar informações automaticas. Metodo construtor utiliza apenas public e o nome da classe
    {
        this.setModelo(m);
        this.setPonto(p);
        this.setTampa(t);
        this.setCor(c);
    }
    
    public String getCor()
    {
        return this.cor;
    }
    
    public void setCor(String c)
    {
        this.cor = c;
    }
    
    public String getModelo()//faz com que tenha um tipo de proteção de dados, criando um metodo que pega um certo atributo protegido e o utiliza.
    {
       return this.modelo;
    }
    
    public void setModelo(String m)//normalmente um metodo set necessita de um parametro, serve para adicionar algo a um atributo especifico
    {
        this.modelo = m;
    }
    
    public float getPonto() //faz com que tenha um tipo de proteção de dados, criando um metodo que pega um certo atributo protegido e o utiliza.
    {
        return this.ponto;
    }
    
    public void setPonto(float p) //set da ponta
    {
        this.ponto = p;
    }
    
    
   public boolean getTampa() // get da tampa
   {
       return this.tampa;
   }
   
   public void setTampa(boolean t) // set da tampa
   {
       this.tampa = t;
   }
   
    public void status()
    {
        System.out.println("O modelo e: " +this.getModelo());
        System.out.println("A ponta e: " +this.getPonto());
        System.out.println("A cor e: " +this.getCor());
        System.out.println("O status da tampa e: " +this.getTampa());
    }
    
    public void tampar()
    {
        this.tampa=false;
    }
    
    public void destampar()
    {
        this.tampa=true;
    }
}
