public class ExemploFor {
    public static void execute(){
        for(int cont = 1; cont <= 10; cont++){
            System.out.println(cont);
        }

        String[] frutas = {"Maçã","Banana","Goiaba"};
        //frutas[0] = "Melão"; //Substitui o elemento na posição 0
        for(int pos = 0; pos < 3; pos++){
            System.out.println(frutas[pos]);
        }

        //Foreach
        for(String item : frutas){
            System.out.println(item);
        }
    }
}
