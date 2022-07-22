package io.game.jade;

import org.lwjgl.Version;
import org.lwjgl.glfw.GLFWErrorCallback;

public class Window {
    private int width, height;
    private String title;

    private static Window window = null;

    public Window() {
        this.width = 1920;
        this.height = 1080;
        this.title = "Mario";
    }

    public static Window get() {
        if (Window.window == null) {
            Window.window = new Window();
        }
        return Window.window;
    }

    public void run() {
        System.out.println("Hello LWJGL " + Version.getVersion() + "!");

        init();
        loop();
    }
    public void init(){
        // Set an error callback
        GLFWErrorCallback.createPrint(System.err).set();
    }
    public void loop(){

    }
}
