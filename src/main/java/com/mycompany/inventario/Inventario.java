/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.inventario;

import javax.swing.SwingUtilities;

/**
 *
 * @author jairk
 */
public class Inventario {

    public static void main(String[] args) {
          SwingUtilities.invokeLater(() -> {
            InventarioFrame frame = new InventarioFrame();
            frame.setVisible(true);
        });
    }
}
