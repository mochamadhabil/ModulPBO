/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package MINGGU4;

/**
 *
 * @author abil
 */
public interface AnimalsInterface {
    final int STATUS_DEAD = 0;
    final int STATUS_ALIVE = 1;
    
    abstract boolean isAlive();
    abstract String printData();
}
