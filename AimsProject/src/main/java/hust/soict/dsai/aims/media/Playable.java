/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hust.soict.dsai.aims.media;

/**
 *
 * @author khangpt
 */
import hust.soict.dsai.aims.exception.PlayerException;
public interface Playable {
	public void play() throws PlayerException;
	public String getInfo() throws PlayerException;
}
