package org.example;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        Folder  php_demo1  = new Folder("php_demo1");
        Folder  source_files  = new Folder("source files", php_demo1);
        Folder  phalcon  = new Folder(".phalcon", source_files);
        Folder  app  = new Folder("app", source_files);
        Folder  config  = new Folder("config", app);
        Folder  controllers  = new Folder("controllers", app);
        Folder  library  = new Folder("library", app);
        Folder  migrations  = new Folder("migrations", app);
        Folder  models  = new Folder("models", app);
        Folder  views  = new Folder("views", app);
        Folder  cache  = new Folder("cache", source_files);
        Folder  Public  = new Folder("public", source_files);
        File htaccess = new File(".htaccess", Public);
        File htrouter_dot_php = new File(".htrouter.php", Public);
        File Index_dot_html = new File("index.html", Public);
        Folder  include_path  = new Folder("Include Path", php_demo1);
        Folder  remote_files  = new Folder("Remote Files", php_demo1);
        php_demo1.print(0);
        System.out.println("-------------------------------------After Deleting the app folder------------------------------------------------");
        app.delete();
        php_demo1.print(0);
        System.out.println("--------------------------------------After deleting the public folder-----------------------------------------------");
        Public.delete();
        php_demo1.print(0);

    }
}