package menu;

import java.util.Scanner;
import javax.swing.*;
public class Menu {

    public static void main(String[] args) {
        int opc;
        Scanner bruno=new Scanner(System.in);
        do
        {
            System.out.println("Bienvenido al menú de programas, para ver la lista de programas, escriba [1]. Para salir del menú escriba [0]");
            opc=bruno.nextInt();
            switch(opc)
            {
                case 1:
                    System.out.println("Área de un círculo: [2]"+"\nValor Relativo: [3]"+"\nCambio de valores: [4]"+"\nDoble y Triple de un número: [5]"+"\nVolumen de un cilindro: [6]"+"\nÁrea de un triángulo: [7]"+"\nConvertir de m/s a km/h: [8]"+"\nConvertir de °C a °F: [9]"+"\nOperaciones aritméticas: [10]"+"\nMayor o menor de edad: [11]"+"\nNúmero mayor y menor: [12]"+"\nTipo de Triángulo: [13]"+"\nPar o impar: [14]"+"\nCalcular la masa corporal: [15]"+"\nImprimir del 1 al 10 con for: [16]"+"\nImprimir del 10 al 1 con while: [17]"+"\nUtilizando do while: [18]"+"\nImprime no. pares del 0 al 100: [19]"+"\nImprimir no. impares del 99 al 1: [20]"+"\nPromedio de 5 calificaciones: [21]"+"\nSumatoria del 1 al 100: [22]"+"\nFactorial de un número: [23]"+"\nSerie de Fibonacci: [24]"+"\nMedio árbol: [25]"+"\nÁrbol completo: [26]"+"\nPromedio de 5 calificaciones con arreglos: [27]"+"\nTabla de multiplicar: [28]"+"\nValores positivos y negativos: [29]"+"\nMultiplicación de arreglos: [30]"+"\nSumatoria de un arreglo: [31]");
                break;
                case 2://Área de un círculo
                    final float pi=3.1416f;
                    float radio,area;
                    System.out.println("Inserta un radio: ");
                    radio=bruno.nextFloat();
                    area=pi*radio*radio;
                    System.out.println("El área es: " + area);
                break;
                case 3://Valor Relativo
                    int a,b,c,d,R1,R2,cifra,res;
                    System.out.println("Introduce un número de cuatro cifras: ");
                    cifra=bruno.nextInt();
                    a=cifra/1000;
                    R1=cifra%1000;
                    b=R1/100;
                    R2=R1%100;
                    c=R2/10;
                    d=R2%10;
                    res=a+b+c+d;
                    System.out.println("La suma es: "+ res);
                break;
                case 4://Cambio de valores
                    int e=5,f=4,g=3,h=6,m1,m2;
                    m1=e;
                    m2=f;
                    e=h;
                    f=g;
                    g=m1;
                    h=m2;
                    System.out.println("e es igual a: "+e +"\nf es igual a: "+f+"\ng es igual a: "+g+"\nh es igual a: "+h);
                break;
                case 5://Doble y Triple de un número
                    int num,doble,triple;
                    System.out.println("Inserte un número entero: ");
                    num=bruno.nextInt();
                    doble=num*2;
                    triple=num*3;
                    System.out.println("El doble del número es: "+doble+"\nEl triple del número es: "+triple);
                break;
                case 6://Volumen de un cilindro
                    float r,altura,volumen;
                    System.out.println("Escribe el radio del cilindro: ");
                    r=bruno.nextFloat();
                    System.out.print("Escribe la altura del cilindro: ");
                    altura=bruno.nextFloat();
                    volumen=3.1416f*r*altura;
                    System.out.println("El volument del cilindro es: "+volumen);
                break;
                case 7://Área de un triángulo
                    float ba,al,ar;
                    System.out.println("Escriba la base del triángulo: ");
                    ba=bruno.nextFloat();
                    System.out.println("Escribe la altura del triángulo: ");
                    al=bruno.nextFloat();
                    ar=(ba*al)/2;
                    System.out.println("El área del tripangulo es; "+ar);
                break;
                case 8://Convertir de m/s a km/h
                    float vel,conver;
                    System.out.println("Escribe la velocidad en m/s: ");
                    vel=bruno.nextFloat();
                    conver=(vel*1000)/3600;
                    System.out.println("Tu velocidad es:"+conver+"km/h");
                break;
                case 9://Convertir de °C a °F
                    float celsius, fahren;
                    System.out.println("Escribe la temperatura en °C: ");
                    celsius=bruno.nextFloat();
                    fahren=(celsius*1.8f)+32;
                    System.out.println("La temperaruta es: "+fahren+"°F");
                break;
                case 10://Operaciones aritméticas
                    int sum,mul,div,mod;
                    System.out.println("Escribe un número: ");
                    a=bruno.nextInt();
                    System.out.println("Escribe otro número: ");
                    b=bruno.nextInt();
                    sum=a+b;
                    res=a-b;
                    mul=a*b;
                    div=a/b;
                    mod=a%b;
                    System.out.println("La suma es: "+sum+"\nLa resta es: "+res+"\nLa multiplicación es: "+mul+"\nLa división es: "+"\nEl módulo es: "+mod);
                break;
                case 11://Mayor o menor de edad
                    int edad;
                    System.out.println("Ingresa tu edad: ");
                    edad=bruno.nextInt();
                    if(edad>=18)
                    {
                        System.out.println("Eres mayor de edad");
                    }
                    else
                    {
                        System.out.println("Eres menor de edad");
                    }
                case 12://Número mayor y menor
                    System.out.println("Ingrese un número: ");
                    a=bruno.nextInt();
                    System.out.println("Ingrese un número: ");
                    b=bruno.nextInt();
                    System.out.println("Ingrese un número: ");
                    c=bruno.nextInt();
                    if (a>b && a>c)
                    {
                        System.out.println("El número mayor es:"+a);
                    }
                    else if(b>a && b>c)
                    {
                        System.out.println("El número mayor es:"+b);
                    }
                    else
                    {
                        System.out.println("El número mayor es:"+c);
                    }
                    if (a<b && a<c)
                    {
                        System.out.println("El número menor es:"+a);
                    }
                    else if(b<a && b<c)
                    {
                        System.out.println("El número menor es: "+b);
                    }
                    else
                    {
                        System.out.println("El número menor es: "+c);
                    }
                break;
                case 13://Tipo de Triángulo
                    System.out.println("Ingrese el lado A: ");
                    a=bruno.nextInt();
                    System.out.println("Ingrese el lado B: ");
                    b=bruno.nextInt();
                    System.out.println("Ingrese el lado C: ");
                    c=bruno.nextInt();
                    if (a==b && b==c && c==a)
                    {
                        System.out.println("El triángulo es equilátero");
                    }
                    else if (a!=b && b!=c && c!=a)
                    {
                        System.out.println("El triángulo es escaleno");
                    }
                    else//a==b!=c && a==c!=b && b==c!=a
                    {
                        System.out.println("El triángulo es isóceles");
                    }
                break;
                case 14://Par o impar
                    String issa;
                    issa=JOptionPane.showInputDialog("Ingrese un número");
                    num=Integer.parseInt(issa);
                    res=num%2;
                    if(res==0)
                    {
                        System.out.println("El número: "+num+" es par");
                    }
                break;
                case 15://Calcular la masa corporal
                    float peso,alt,imc;
                    issa=JOptionPane.showInputDialog("Ingrese su peso: ");
                    peso=Float.parseFloat(issa);
                    issa=JOptionPane.showInputDialog("Ingrese su altura: ");
                    alt=Float.parseFloat(issa);
                    imc=peso/(alt*alt);
                    if(imc>=16)
                    {
                        System.out.println("Criterio de ingreso en el hospital");
                    }
                    else if(imc>=17)
                    {
                        System.out.println("Infrapeso");
                    }
                    else if(imc>=18)
                    {
                        System.out.println("Bajo peso");
                    }
                    else if(imc>=25)
                    {
                        System.out.println("Peso normal [Saludable]");
                    }
                    else if(imc>=30)
                    {
                        System.out.println("Sobrepeso [Obesidad grado uno]");
                    }
                    else if(imc>=35)
                    {
                        System.out.println("Obesidad crónica[Obesidad grado dos]");
                    }
                    else if(imc>=40)
                    {
                        System.out.println("Obesidad premórbida[Obesidad grado tres]");
                    }
                    else
                    {
                        System.out.println("Obesidad mórbida[Obesidad grado cuatro]");
                    }
                break;
                case 16://Imprimir del 1 al 10 con for
                    int x;
                    for(x=1;x<=10;x++)
                    {
                        System.out.println(x);
                    }
                break;
                case 17://imprimir del 10 al 1 con while
                    x=10;
                    while(x>=1)
                    {
                        System.out.println(x);
                        x--;
                    }
                break;
                case 18://Utilizando do while
                    x=1;
                    do
                    {
                        System.out.println("Esto no es un mensaje"+x);
                        x++;
                    }
                    while(x<=10);
                break;
                case 19://Imprime no. pares del 0 al 100
                    for(x=0;x<=100;x=x+2)
                    {
                        System.out.println(x);
                    }
                break;
                case 20://Imprimir no. impares del 99 al 1
                    for(x=99;x>=1;x=x-2)
                    {
                        System.out.println(x);
                    }
                break;
                case 21://Promedio de 5 calificaciones
                    x=0;
                    float cal,acum=0.0f, prom;
                    while (x<=4)
                    {
                        issa=JOptionPane.showInputDialog("Ingrese calificación");
                        cal=Float.parseFloat(issa);
                        acum=acum+cal;
                        x++;
                    }
                    prom=acum/5;
                    System.out.println("Tu promedio es: "+prom);
                break;
                case 22://Sumatoria del 1 al 100
                    int y=0;
                    x=0;
                    while(x<=100)
                    {
                        y=y+x;
                        x++;
                    }
                    System.out.println("La suma es: "+y);
                break;
                case 23://Factorial de un número
                break;
                case 24://Serie de Fibonacci
                break;
                case 25://Medio árbol
                break;
                case 26://Árbol completo
                break;
                case 27://Promedio de 5 calificaciones con arreglos
                    float [] calif=new float[5];
                    float suma=0.0f,prome;
                    for(x=0;x<=4;x++)
                    {
                        System.out.println("Dame tu calificación: ");
                        calif[x]=bruno.nextFloat();
                        suma=suma+calif[x];
                    }
                    prome=suma/5;
                    for(x=0;x<=4;x++)
                    {
                        System.out.println("Tus calificaiones son: "+calif[x]);
                    }
                    System.out.println("Tu promedio es: "+prome);
                break;
                case 28://Tabla de multiplicar
                    int z;
                    int [] tabla=new int[10];
                    System.out.println("Ingresa un número: ");
                    z=bruno.nextInt();
                    for(x=0;x<=9;x++)
                    {
                        tabla[x]=z*(x+1);
                    }
                    for(x=0;x<=9;x++)
                    {
                        System.out.println(z+"*"+(x+1)+"="+tabla[x]);
                    }
                break;
                case 29://Valores positivos y negativos
                    int[]ent=new int[10];
                    int mpos,mneg,acum1=0,acum2=0;
                    for(x=0;x<=9;x++)
                    {
                        System.out.println("Ingresa un núemro entero: ");
                        ent[x]=bruno.nextInt();
                        if (ent[x]<0)
                        {
                            acum1=ent[x]-acum1;
                        }
                        else
                        {
                            acum2=acum2+ent[x];
                        }
                    }
                    mneg=acum1/2;
                    mpos=acum2/2;
                    System.out.println("Tu media positiva es: "+mpos+"\nTu media negativa es: "+mneg);
                break;
                case 30://Multiplicación de arreglos
                    int[] uno=new int[5];
                    int[] dos=new int[5];
                    int[] tres=new int[5];
                    for(x=0;x<=4;x++)
                    {
                        System.out.println("Ingresa un número: ");
                        uno[x]=bruno.nextInt();
                    }
                    for(x=0;x<=4;x++)
                    {
                        System.out.println("Ingresa más números: ");
                        dos[x]=bruno.nextInt();
                    }
                    for(x=0;x<=4;x++)
                    {
                        tres[x]=uno[x]*dos[x];
                    }
                    for(x=0;x<=4;x++)
                    {
                        System.out.println("Tu resultado es: "+tres[x]);
                    }
                break;
                case 31://Sumatoria de un arreglo
                    int[]arr={10,5,9,4,8,2,7,62,20,1};
                    sum=0;
                    for(x=0;x<=9;x++)
                    {
                        sum=sum+arr[x];
                        System.out.println("Los números son: "+arr[x]);
                    }
                    System.out.println("La sumatoria es: "+sum);
                break;
                case 0:
                break;
            }
        }
        while(opc==0);
    }
    
}
