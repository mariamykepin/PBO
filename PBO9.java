/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pbo9;

/**
 *
 * @author マリア
 */
public class PBO9 {
    public static void main(String[] args) {
        new PBO9().doTheWork();
    }

    public void doTheWork() {
        Object o = null;
        for (int i = 0; i <= 5; i++) {
            try {
                o = makeObj(i);
                System.out.println(o);
            } catch (IllegalArgumentException e) {
                System.err.println("Error: (" + e.getMessage() + ").");
                return;
            } finally {
                System.err.println("All done");
                if (o == null) {
                    System.exit(0);
                }
            }
        }
    }

    public Object makeObj(int type) throws IllegalArgumentException {
        if (type == 1)
            throw new IllegalArgumentException("Don't like type " + type);
        return new Object();
    }
}
