/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cocktailproject1;
import java.awt.Color;

/**
 *
 * @author hp
 */
public class Kiwi extends Fruit{
    public Kiwi() {
        super(40,"Kiwi",23,new Color(97,171,90));
    }
    /**
     *
     * @return
     */
     @Override
    public String getInfo()
    {
        return name+": { "+" calories= "+calories+" ,volume= "+volume+" ,color in RGB= "+getColor().getRed()+", "+getColor().getGreen()+", "+getColor().getBlue()+")"+" }\n";
    }
    
}
