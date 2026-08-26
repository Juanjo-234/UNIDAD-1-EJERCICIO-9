class planHosting{
String nombreDominio;
int capacidadMaximaGB;
double espacioOcupadoGB;

public planHosting(String nombreDominio, int capacidadMaximaGB, double espacioOcupadoGB){
    this.nombreDominio = nombreDominio;
    this.capacidadMaximaGB = capacidadMaximaGB;
    this.espacioOcupadoGB = espacioOcupadoGB;
}
    
public String getNombreDominio(){
    return nombreDominio;
}

public int getCapacidadMaximaGB(){
    return capacidadMaximaGB;
}

public double getEspacioOcupadoGB(){
    return espacioOcupadoGB;
}



public void setNombreDominio(String nombreDominio){
    this.nombreDominio = nombreDominio;
}

public void setCapacidadMaximaGB(int capacidadMaximaGB){
    this.capacidadMaximaGB = capacidadMaximaGB;
}

public void setEspacioOcupadoGB(double espacioOcupadoGB){
    this.espacioOcupadoGB = espacioOcupadoGB;
}


void  subirArchivos(double pesoGB){
    if(this.espacioOcupadoGB + pesoGB > this.capacidadMaximaGB){
        System.out.println("Atención. Capacidad de almacenamiento máxima superada.");
        System.out.println("No se ha podido subir el archivo de " + pesoGB);
    }else{
       this.espacioOcupadoGB += pesoGB;
    
       double disponible = this.capacidadMaximaGB - this.espacioOcupadoGB;
       System.out.println("Almacenamiento disponible: " + disponible);
    }
}

void mostrardetalles(){
    System.out.println("----------------------------------------");
    System.out.println("Dominio: " + this.nombreDominio);
    System.out.println("Capacidad maxima: " + this.capacidadMaximaGB + " GB ");
    System.out.println("Espacio ocupado: " + this.espacioOcupadoGB + " GB ");
    System.out.println("Espacio disponible: " + (this.capacidadMaximaGB - this.espacioOcupadoGB) + " GB ");
    System.out.println("-----------------------------------------");
}

public static void main(String[] args) {
    planHosting p1 = new planHosting("mi-sitio-web.com", 10, 0);
    p1.subirArchivos(5);
    p1.subirArchivos(6);
    p1.mostrardetalles();
}




}