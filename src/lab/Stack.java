/*
Zaimplementuj klasę Stack implementującą ideę stosów napisów z następującymi metodami publicznymi:

* push wkłada jeden element na stos
* pop zdejmuje jeden element ze stosu i oddaje wartość tego elementu;
co się ma dziać gdy, pop próbuje zdjąc element z pustego stosu?
* peek podobnie jak pop oddaje wartość elementu na szczycie stosu ale go nie zdejmuje;
podobny problem z pustym stosem co w przypadku pop.
Podstawową strukturą danych w implementacji stosu powinna być tablica.
Stos nie powinien posiadać ograniczeń rozmiaru.
 */

package lab;

import java.lang.String;

public class Stack {
    private String[] stos = new String[0];
    private void change_size(int i, int j){
        int l = this.len();
        String[] stos = new String[l+i];
        if (l >= 0) System.arraycopy(this.stos, 0, stos, 0, l+j);
        this.stos = stos;
    }
    public void  push(String s){
        int l = this.len();
        this.change_size(1, 0);
        this.stos[l] = s;
    }
    public String pop(){
        String p = this.peek();
        this.change_size(-1, -1);
        return p;
    }
    public String peek(){
        if (this.len() == 0){
            return "";
        }
        return this.stos[this.len() - 1];
    }
    public int len(){
        return this.stos.length;
    }
    public String[] all(){
        return this.stos;
    }
}