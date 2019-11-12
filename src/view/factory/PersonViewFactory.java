/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.factory;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author student1
 */
public abstract class PersonViewFactory {

    protected JFrame main;
    protected JPanel panel;
    
    public abstract JPanel getPersonView();

    public abstract void createMainFrame();

    public abstract void createPanel();

    public abstract void showForm();
}
