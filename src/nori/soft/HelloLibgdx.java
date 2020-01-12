package nori.soft;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;

public class HelloLibgdx {
    public static void main(String args[]){
        new LwjglApplication(
                new MainListener(),
                "Hello LibGDX",
                480,
                480
        );
    }
}
