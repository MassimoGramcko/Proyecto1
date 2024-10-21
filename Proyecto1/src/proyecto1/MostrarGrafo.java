/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1;

import javax.swing.JDialog;

/**
 *
 * @author massi
 */
public class MostrarGrafo {

    public MostrarGrafo() {
           
        int width = 800;
		int height = 600;
		JDialog dialog = new JDialog();
		dialog.setModal(true);
		dialog.setResizable(false);
                dialog.pack();
		dialog.setLocationRelativeTo(null);
		dialog.setVisible(true);
    }

}
