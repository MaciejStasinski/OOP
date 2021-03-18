package com.company;

import com.company.drive.Drive;
import com.company.drive.HDDDrive;
import com.company.drive.SSDDrive;
import com.company.file.File;
import com.company.file.imagefile.GIFImageFile;
import com.company.file.imagefile.JPGImageFile;
import com.company.file.musicfile.MP3MusicFile;

public class Main {

    public static void main(String[] args) {
        GIFImageFile gif1 = new GIFImageFile("nazwa1.gif", 100);
        JPGImageFile jpg1 = new JPGImageFile("nazwa1.jpg", 200, 80);

        MP3MusicFile mp3file = new MP3MusicFile("plik.mp3", 4000, "Manowar", "Hand of Doom", 100);

        Drive drive = new HDDDrive();
        drive.addFile(gif1);
        drive.addFile(jpg1);
        drive.addFile(mp3file);

//        drive.listFiles();
        File file = drive.findFile("plik.mp3");
        System.out.println(file.getSize());



    }
}

