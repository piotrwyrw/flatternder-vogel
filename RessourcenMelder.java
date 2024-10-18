import java.io.File;

public class RessourcenMelder {
    
    @Eingespritzt
    private RessourcenVerwaltung ressourcen;
    
    @Bereit
    public void melden() throws java.io.IOException {
        ressourcen.ressourceMelden("bg1", new File("ressourcen/background/1.png"));
        ressourcen.ressourceMelden("bg2", new File("ressourcen/background/2.png"));
        ressourcen.ressourceMelden("bg3", new File("ressourcen/background/3.png"));
        ressourcen.ressourceMelden("bg4", new File("ressourcen/background/4.png"));
        ressourcen.ressourceMelden("bg5", new File("ressourcen/background/5.png"));
        ressourcen.ressourceMelden("bg6", new File("ressourcen/background/6.png"));
    }
    
}