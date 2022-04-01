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

import java.util.List;
import java.lang.String;

public class Stack {
    private String stos[] = new String[0];
    public void  push(String s){
        int l = this.len();
        String[] stos = new String[l+1];
        if (l >= 0) System.arraycopy(this.stos, 0, stos, 0, l);
        stos[l] = s;
        this.stos = stos;

    }
    public String pop(){
        int l = this.len();
        String[] stos = new String[l-1];
        if (l >= 0) System.arraycopy(this.stos, 0, stos, 0, l-1);
        String p = this.peek();
        this.stos = stos;
        return p;
    }
    public String peek(){
        return this.stos[this.len() - 1];
    }
    public int len(){
        return this.stos.length;
    }
    public String[] all(){
        return this.stos;
    }
}