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
        this.stos = new String[this.len()+1];

    }
    public String pop(){
        return "";
    }
    public String peek(){
        return "";
    }
    public int len(){
        return this.stos.length;
    }
    public String[] all(){
        return new String[0];
    }
}