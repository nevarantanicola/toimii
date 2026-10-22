import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Kirjoita jokin numero.");
        String input = in.nextLine();

        System.out.println("Anna toinen numero vielä.");
        String input2 = in.nextLine();

        int numero1 = Integer.parseInt(input);
        int numero2 = Integer.parseInt(input2);
//   System.out.println(" Tulos on " + (numero1 + numero2)); 

 

 

//  if (numero1 + numero2 > 10) { 

    //   System.out.println("Tulos on yli 10." + ("Tulos on ") + (numero1 + numero2) + (".")); 

    //  }  

    // else 

      // System.out.println("Tulos on " + (numero1 + numero2) + (".")); 

    //  } 

 

 

    //    System.out.println("Haluatko laskea yhteen, vai vähentää? Kirjoita plus tai miinus."); 

     

  //  String input3; 

  //    input3 = in.nextLine(); 

  //    if (input3.equals("plus"))  

  //    { 

  //     System.out.println("Tulos on " + (numero1 + numero2) + "."); 

  //    } 

  //    else if (input3.equals("miinus"))  

  //   {  

  //     System.out.println("Tulos on " + (numero1 - numero2) + "."); 

  //   }  

     System.out.println("Tulos on " + ((double) numero1 / numero2) + "."); 

     
// noniin, sain homman toimimaan, kun oikeat tiedostot olivat toisessa kansiossa. Kaltura kun on alhaalla, niin 
// toivon, ettei haittaa pelkästään tiedostojen kopiointi oikeaan kansioon. En keksinyt oikein muutakaan keinoa.
System.out.println("Toivottavasti tehtävä on nyt oikein!");
    } 

} 

 

