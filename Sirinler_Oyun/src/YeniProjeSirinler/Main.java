package YeniProjeSirinler;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class Main {

    JPanel GamePanel;
    Oyuncu oyuncumuz;
    ArrayList<Karakter> dusman = new ArrayList<>();
    int[][] mapnumber = new int[11][13];
    int secim, secim2, kapi, kapi2;
    KeyListener keys;
    Scanner scan = new Scanner(System.in);
    ArrayList<Integer> loc = new ArrayList<>();
//    Boolean Oyunbitti ;
    Obje objeler;


    public Main() throws FileNotFoundException {

//  OYUNCU SECIMI
        System.out.println("Bir adet oyuncu seciniz  [Gozluklu Sirin : 1]  [Tembel Sirin : 2]:");
        secim = scan.nextInt();

        if (secim == 1) {
            oyuncumuz = new GozlukluSirin();
            oyuncumuz.setID(secim);
            oyuncumuz.setAd("Gozluklu Sirin");

        } else if (secim == 2) {
            oyuncumuz = new TembelSirin();
            oyuncumuz.setID(secim);
            oyuncumuz.setAd("Tembel Sirin");

        }
        Location oyunculocation = new Location(5, 6);
        oyuncumuz.setCurrentlocation(oyunculocation);
        //   System.out.println("sirin : " + oyuncumuz.getCurrentlocation().getX());

//  DUSMAN SECIMI
        System.out.println("Dusman secimi yapiniz  [Azman : 1 ]  [Gargamel : 2]  [Azman ve Gargamel : 3]");
        secim2 = scan.nextInt();

//        Location dusmanlocation = new Location(0,3);
//        dusman1.setCurrentlocation(dusmanlocation);
        if (secim2 == 1) {
            Karakter azman = new Azman();
            azman.setID(secim2);
            azman.setAd("Azman");
            azman.setTur("kotu");
            dusman.add(azman);

            System.out.println("Azman icin giris kapisini giriniz  [1 : A]  [2 : B]  [3 : C]  [4 : D] ");
            kapi = scan.nextInt();
            if (kapi == 1) {
                azman.setKapi("A");
                Location dusmanlocation = new Location(3, 0);
                azman.setCurrentlocation(dusmanlocation);
            } else if (kapi == 2) {
                azman.setKapi("B");
                Location dusmanlocation = new Location(10, 0);
                azman.setCurrentlocation(dusmanlocation);
            } else if (kapi == 3) {
                azman.setKapi("C");
                Location dusmanlocation = new Location(0, 5);
                azman.setCurrentlocation(dusmanlocation);
            } else if (kapi == 4) {
                azman.setKapi("D");
                Location dusmanlocation = new Location(3, 10);
                azman.setCurrentlocation(dusmanlocation);
            }

        } else if (secim2 == 2) {
            Karakter gargamel = new Gargamel();
            gargamel.setID(secim2);
            gargamel.setAd("Gargamel");
            gargamel.setTur("kotu");
            dusman.add(gargamel);

            System.out.println("Gargamel icin giris kapisini giriniz   [1 : A] [2 : B]  [3 : C]  [4 : D] ");
            kapi = scan.nextInt();
            if (kapi == 1) {
                gargamel.setKapi("A");
                Location dusmanlocation = new Location(3, 0);
                gargamel.setCurrentlocation(dusmanlocation);
            } else if (kapi == 2) {
                gargamel.setKapi("B");
                Location dusmanlocation = new Location(10, 0);
                gargamel.setCurrentlocation(dusmanlocation);
            } else if (kapi == 3) {
                gargamel.setKapi("C");
                Location dusmanlocation = new Location(0, 5);
                gargamel.setCurrentlocation(dusmanlocation);
            } else if (kapi == 4) {
                gargamel.setKapi("D");
                Location dusmanlocation = new Location(3, 10);
                gargamel.setCurrentlocation(dusmanlocation);
            }

        } else if (secim2 == 3) {
            Karakter azman = new Azman();
            azman.setID(secim2);
            azman.setAd("Azman");
            azman.setTur("kotu");
            dusman.add(azman);

            Karakter gargamel = new Gargamel();
            gargamel.setID(secim2);
            gargamel.setAd("Gargamel");
            gargamel.setTur("kotu");
            dusman.add(gargamel);

            System.out.println("Azman icin giris kapisini giriniz : [1 : A] [2 : B] [3 : C] [4 : D] ");
            kapi = scan.nextInt();
            if (kapi == 1) {
                azman.setKapi("A");
                Location dusmanlocation = new Location(3, 0);
                azman.setCurrentlocation(dusmanlocation);
            } else if (kapi == 2) {
                azman.setKapi("B");
                Location dusmanlocation = new Location(10, 0);
                azman.setCurrentlocation(dusmanlocation);
            } else if (kapi == 3) {
                azman.setKapi("C");
                Location dusmanlocation = new Location(0, 5);
                azman.setCurrentlocation(dusmanlocation);
            } else if (kapi == 4) {
                azman.setKapi("D");
                Location dusmanlocation = new Location(3, 10);
                azman.setCurrentlocation(dusmanlocation);
            }

            System.out.println("Gargamel icin giris kapisini giriniz : [1 : A] [2 : B] [3 : C] [4 : D] ");
            kapi2 = scan.nextInt();
            if (kapi2 == 1) {
                gargamel.setKapi("A");
                Location dusmanlocation2 = new Location(3, 0);
                gargamel.setCurrentlocation(dusmanlocation2);
            } else if (kapi2 == 2) {
                gargamel.setKapi("B");
                Location dusmanlocation2 = new Location(10, 0);
                gargamel.setCurrentlocation(dusmanlocation2);
            } else if (kapi2 == 3) {
                gargamel.setKapi("C");
                Location dusmanlocation2 = new Location(0, 5);
                gargamel.setCurrentlocation(dusmanlocation2);
            } else if (kapi2 == 4) {
                gargamel.setKapi("D");
                Location dusmanlocation2 = new Location(3, 10);
                gargamel.setCurrentlocation(dusmanlocation2);
            }

        }
        for (int i = 0; i < dusman.size(); i++) {
            System.out.println("dusmanin adi " + dusman.get(i).ad);
            System.out.println("dusmanin lokasyonu : " + dusman.get(i).getCurrentlocation().getX() + ", " + dusman.get(i).getCurrentlocation().getY());
            System.out.println("dusmanin kapisi: " + dusman.get(i).kapi);
        }

        File f = new File("/Users/nisanurkorkmaz/Desktop/JavaApplication33/map.txt");
        Scanner mapreader = new Scanner(f);

        JFrame game = new JFrame();
        game.setSize(1000, 800);
        game.setTitle("Smurfs");
        game.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        game.setVisible(true);
        game.setResizable(false);
        game.setBackground(Color.yellow);
        game.setLayout(null);

        Container container = game.getContentPane();
        
        
        GamePanel gamepanel = new GamePanel();
        gamepanel.setVisible(true);
        gamepanel.setSize(650, 550);
        gamepanel.setLocation(150, 100);
        gamepanel.setBackground(Color.lightGray);
        gamepanel.requestFocus();
        gamepanel.addKeyListener(gamepanel);
        gamepanel.setFocusable(true);
        
        PuanPanel puanpanel = new PuanPanel();
        puanpanel.setVisible(true);
        puanpanel.setSize(150,50);
        puanpanel.setLocation(700,30);
        puanpanel.setBackground(Color.black);
         
        JLabel puantext = new JLabel("20");
        puantext.setSize(200,50);
        puantext.setLocation(100,40);
        puantext.setForeground(Color.white);
        puantext.setFont(new Font("Arial",Font.BOLD,40));
        
        puanpanel.add(puantext);
        container.add(puanpanel);
        container.add(gamepanel);
        container.setBackground(Color.black);
        
        while (mapreader.hasNextLine()) {
            for (int i = 0; i < 11; i++) {
                for (int j = 0; j < 13; j++) {
                    mapnumber[i][j] = mapreader.nextInt();
                    System.out.print(mapnumber[i][j] + "\t");
                }
                System.out.println("\n");
            }

        }
 
    }

    public static void main(String[] args) throws FileNotFoundException {

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Main();
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

    }
    
     public class PuanPanel extends JPanel {

        String puan = "20";

        @Override
        public void paint(Graphics g) {
            super.paint(g); 
            
            Image altin = this.getToolkit().getImage("icons/altin.png");
//            g.setFont(new Font("Arial",Font.BOLD,40));
//            g.setColor(Color.lightGray);
//            g.drawString(puan,55,40);
             g.drawImage(altin, 2, 2, this);
           
        }
   
        public PuanPanel() {
       
        }

        public String getPuan() {
            return puan;
        }

        public void setPuan(String puan) {
            this.puan = puan;
        }
 
    
}

    public class GamePanel extends JPanel implements KeyListener,ActionListener  {
        
        Timer time = new Timer(5, this);
        ArrayList<Location> koordinat = new ArrayList<>();
        Random random = new Random();
        Altin a = new Altin();
        Mantar m = new Mantar();
        Location l;
        Boolean Oyunbitti = false;
        @Override
        public void paint(Graphics g) {
            super.paint(g);
            Image gozluklusirin = this.getToolkit().getImage("icons/gozluklusirin.png");
            Image tembelsirin = this.getToolkit().getImage("icons/tembelsirin.png");
            Image gargamel = this.getToolkit().getImage("icons/gargamel.png");
            Image azman = this.getToolkit().getImage("icons/azman.png");
            Image sirine = this.getToolkit().getImage("icons/sirine.png");
            Image altin = this.getToolkit().getImage("icons/altin.png");
            Image mantar = this.getToolkit().getImage("icons/mantar.png");
           

            for (int y = 0; y < 550; y += 50) {

                int j = y / 50;
                for (int x = 0; x < 650; x += 50) {

                    int i = x / 50;

                    if (mapnumber[j][i] == 1) {//path
                        g.setColor(Color.white);
                        g.fillRect(x + 1, y + 1, 48, 48);

                    } else {//wall
                        g.setColor(Color.gray);
                        g.fillRect(x + 1, y + 1, 48, 48);

                    }
                }
            }
            g.setColor(Color.pink);
            g.fillRect(151, 1, 48, 48);
            g.fillRect(501, 1, 48, 48);
            g.fillRect(1, 251, 48, 48);
            g.fillRect(151, 501, 48, 48);
            g.setColor(Color.black);
            g.drawString("A", 151 + 20, 1 + 25);
            g.drawString("B", 501 + 20, 1 + 25);
            g.drawString("C", 1 + 20, 251 + 25);
            g.drawString("D", 151 + 20, 501 + 25);

//ALTIN OLUSTURMA
               int k=0;
               int v=0;
                    while (k<5){
                        int sayi = random.nextInt(11);
                        int sayi2 = random.nextInt(13);
                         if(mapnumber[sayi][sayi2]==1){
                             g.drawImage(altin, sayi2*50+1, sayi*50+1, this);
                             k++;
                             l = new Location(sayi,sayi2);
                             koordinat.add(l);
                    }                 
                    }
                    while(v<1){
                        int sayi3 = random.nextInt(11);
                        int sayi4 = random.nextInt(13);
                        
                        if(mapnumber[sayi3][sayi4]==1){
                            l = new Location(sayi3,sayi4);
                            if(!koordinat.contains(l)){
                            g.drawImage(mantar, sayi4*50+1, sayi3*50+1, this);
                            v++;
                        }
                            
                        }
                    }
//KISAYOL BOYAMA
            for (int i = 2; i < loc.size(); i = i + 2) {
                g.setColor(Color.yellow);
                g.fillRect(loc.get(i + 1) * 50, loc.get(i) * 50, 48, 48);
                //System.out.println("loc.get(i) "+loc.get(i));
            }
//SIRINE KAPISI
            g.drawImage(sirine, 601, 351, this);

//OYUNCU GIRIS KAPISI
            g.setColor(Color.cyan);
            g.fillRect(301, 251, 48, 48);

            if (secim == 1) {
                g.drawImage(gozluklusirin, oyuncumuz.getCurrentlocation().getY() * 50 + 1, oyuncumuz.getCurrentlocation().getX() * 50 + 1, this);
            } else if (secim == 2) {
                g.drawImage(tembelsirin, oyuncumuz.getCurrentlocation().getY() * 50 + 1, oyuncumuz.getCurrentlocation().getX() * 50 + 1, this);
            }

//DUSMAN GIRIS KAPISI  
            if (secim2 == 1) {
                g.drawImage(azman, dusman.get(0).getCurrentlocation().getX() * 50 + 1, dusman.get(0).getCurrentlocation().getY() * 50 + 1, this);

            } else if (secim2 == 2) {
                g.drawImage(gargamel, dusman.get(0).getCurrentlocation().getX() * 50 + 1, dusman.get(0).getCurrentlocation().getY() * 50 + 1, this);

            } else if (secim2 == 3) {

                if (kapi == 1) {
                    g.drawImage(azman, dusman.get(0).getCurrentlocation().getY() * 50 + 1, dusman.get(0).getCurrentlocation().getX() * 50 + 1, this);
                } else if (kapi == 2) {
                    g.drawImage(azman, dusman.get(0).getCurrentlocation().getY() * 50 + 1, dusman.get(0).getCurrentlocation().getX() * 50 + 1, this);
                } else if (kapi == 3) {
                    g.drawImage(azman, dusman.get(0).getCurrentlocation().getY() * 50 + 1, dusman.get(0).getCurrentlocation().getX() * 50 + 1, this);
                } else if (kapi == 4) {
                    g.drawImage(azman, dusman.get(0).getCurrentlocation().getY() * 50 + 1, dusman.get(0).getCurrentlocation().getX() * 50 + 1, this);
                }

                if (kapi2 == 1) {
                    g.drawImage(gargamel, dusman.get(1).getCurrentlocation().getY() * 50 + 1, dusman.get(1).getCurrentlocation().getX() * 50 + 1, this);
                } else if (kapi2 == 2) {
                    g.drawImage(gargamel, dusman.get(1).getCurrentlocation().getY() * 50 + 1, dusman.get(1).getCurrentlocation().getX() * 50 + 1, this);
                } else if (kapi2 == 3) {
                    g.drawImage(gargamel, dusman.get(1).getCurrentlocation().getY() * 50 + 1, dusman.get(1).getCurrentlocation().getX() * 50 + 1, this);
                } else if (kapi2 == 4) {
                    g.drawImage(gargamel, dusman.get(1).getCurrentlocation().getY() * 50 + 1, dusman.get(1).getCurrentlocation().getX() * 50 + 1, this);
                }

            }
            
            
            //System.out.println("dusmanin lokasyonu : " + dusman.get(0).getCurrentlocation().getX() + " " + dusman.get(0).getCurrentlocation().getY());
            
//KAZANDINIZ

            if (Oyunbitti == true) {

                g.setColor(Color.getHSBColor(0, 0, 0));
                g.fillRect(150, 100, 400, 300);
                g.setColor(Color.WHITE);
                g.setFont(new Font("TimesRoman", Font.BOLD, 100));
                g.drawString("YOU WON", 200, 250);
                GamePanel.removeKeyListener(keys);
            }
        }

        @Override
        public void repaint() {
            super.repaint(); 
        }

        
        Djkstra d = new Djkstra();
        ArrayList<Integer> list = new ArrayList<>();
        
        
        
       
        public void keyPressed(KeyEvent evt) {

            int i, j;

            switch (evt.getKeyCode()) {
                case KeyEvent.VK_DOWN:

                    if (oyuncumuz.currentlocation.getX() != 10) {
                        moveDown();
                    }

                    try {
                        loc = d.yol(oyuncumuz.currentlocation.getX(), oyuncumuz.currentlocation.getY(), dusman.get(0).getCurrentlocation().getX(), dusman.get(0).getCurrentlocation().getY(), loc);

                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    i = loc.get(3);
                    j = loc.get(2);
                    Location l = new Location(i, j);
                    dusman.get(0).setCurrentlocation(l);
                    repaint();
                    d.mapSifirla();
                    break;

                case KeyEvent.VK_UP:
                    if (oyuncumuz.currentlocation.getY() != 0) {
                        moveUp();
                    }
                    
                     {
                        try {
                            loc = d.yol(oyuncumuz.currentlocation.getX(), oyuncumuz.currentlocation.getY(), dusman.get(0).getCurrentlocation().getX(), dusman.get(0).getCurrentlocation().getY(), loc);
                        } catch (FileNotFoundException ex) {
                            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }

                    i = loc.get(3);
                    j = loc.get(2);
                    Location m = new Location(i, j);
                    dusman.get(0).setCurrentlocation(m);
                    repaint();
                    d.mapSifirla();
                    break;

                case KeyEvent.VK_LEFT:
                    if (oyuncumuz.currentlocation.getX() != 0) {
                        moveLeft();
                    }

                     {
                        try {
                            loc = d.yol(oyuncumuz.currentlocation.getX(), oyuncumuz.currentlocation.getY(), dusman.get(0).getCurrentlocation().getX(), dusman.get(0).getCurrentlocation().getY(), loc);
                        } catch (FileNotFoundException ex) {
                            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }

                    i = loc.get(3);
                    j = loc.get(2);
                    Location n = new Location(i, j);
                    dusman.get(0).setCurrentlocation(n);
                    repaint();
                    d.mapSifirla();
                    break;

                case KeyEvent.VK_ENTER: {
                    try {
                        loc = d.yol(oyuncumuz.currentlocation.getX(), oyuncumuz.currentlocation.getY(), dusman.get(0).getCurrentlocation().getX(), dusman.get(0).getCurrentlocation().getY(), loc);
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }

                repaint();
                d.mapSifirla();
                i = loc.get(3);
                j = loc.get(2);
                break;

                case KeyEvent.VK_RIGHT:
                    //sirinenin kapisina geldi demek oluyor
                    if (oyuncumuz.currentlocation.getX() == 12 && oyuncumuz.currentlocation.getY() == 7) {
                        Oyunbitti = true;
                        repaint();
                    }
                    if (oyuncumuz.currentlocation.getX() != 12) {
                        moveRight();
                    }

                     {
                        try {
                            loc = d.yol(oyuncumuz.currentlocation.getX(), oyuncumuz.currentlocation.getY(), dusman.get(0).getCurrentlocation().getX(), dusman.get(0).getCurrentlocation().getY(), loc);
                        } catch (FileNotFoundException ex) {
                            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }

                    i = loc.get(3);
                    j = loc.get(2);
                    Location o = new Location(i, j);
                    dusman.get(0).setCurrentlocation(o);
                    repaint();
                    d.mapSifirla();
                    break;

            }

        }

        public void keyReleased(KeyEvent e) {
            // TODO  not needed	
        }

        public void keyTyped(KeyEvent e) {
            // not needed
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); 
            
        }


    }

    public Boolean duvar(int x, int y) {
        if (mapnumber[x][y] == 1) {
            return false;
        }
        return true;
    }

    public void moveUp() {
        int x = oyuncumuz.getCurrentlocation().getX();
        int y = oyuncumuz.getCurrentlocation().getY();
        if (!duvar((x - 1), y)) {
            oyuncumuz.currentlocation.setX(x - 1);
        }
    }

    private void moveDown() {
        int x = oyuncumuz.getCurrentlocation().getX();
        int y = oyuncumuz.getCurrentlocation().getY();
        if (!duvar((x + 1), y)) {
            oyuncumuz.currentlocation.setX(x + 1);
        }
    }

    private void moveLeft() {
        int x = oyuncumuz.getCurrentlocation().getX();
        int y = oyuncumuz.getCurrentlocation().getY();
        if (!duvar(x, (y - 1))) {
            oyuncumuz.currentlocation.setY(y - 1);
        }
    }

    private void moveRight() {
        int x = oyuncumuz.getCurrentlocation().getX();
        int y = oyuncumuz.getCurrentlocation().getY();
        if (!duvar(x, (y + 1))) {
            oyuncumuz.currentlocation.setY(y + 1);
        }
    }

}
