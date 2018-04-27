package com.cc3002.patterns.composite.filetree;

public class Main {

    public static void main(String[] args) {
        Folder userFolder = createMockFolder();
        userFolder.showTree();
    }

    public static Folder createMockFolder() {
        Folder documentos = new Folder("Documents");
        File doge1 = new File("doge1.png", 21842);
        File fogs = new File("fogs.png", 21842);
        File diagrama = new File("diagrama.png", 21842);
        File tarea = new File("tarea_2_metodologias_final_v3.0_entregable.zip", 583140);
        File serie = new File("Game_Of_Thrones_S07E06_leak_full_1_link_1080P_full_HD.mkv", 1874298173);
        File chifaja = new File("chifaja.mp3", 21888);
        Folder imagenes = new Folder("Images");
        imagenes.add(doge1, fogs, diagrama);
        Folder videos = new Folder("Videos");
        videos.add(serie);
        Folder tareas = new Folder("Homework");
        tareas.add(tarea);
        Folder musica = new Folder("Music");
        Folder musica2 = new Folder("Favorita");
        musica.add(musica2);
        Folder musica3 = new Folder("Albumes Completos");
        musica2.add(musica3);
        musica3.add(chifaja);
        documentos.add(imagenes, videos, tareas, musica);
        return documentos;
    }
}
