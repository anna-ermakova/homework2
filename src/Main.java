public class Main {
    public static void main(String[] args) {
        //task 6
        System.out.println("Задача 6");
        var boxersWeight1=78.2;
        var boxersWeight2=82.7;
        System.out.println("Общий вес двух боксеров: "+(boxersWeight1+boxersWeight2));
        System.out.println("Разница в весе боксеров: "+(boxersWeight2-boxersWeight1));

        //task 7
        System.out.println("Задача 7");
        System.out.println(boxersWeight2-boxersWeight1);
        System.out.println(boxersWeight2%boxersWeight1);
        //task 8
        System.out.println("Задача 8,1");
        var totalWorkingHours=640;
        var everyEmployeeWorkingHours=8;
        var totalEmployees=totalWorkingHours/everyEmployeeWorkingHours;
        System.out.println( "Всего работников в компании – "+ totalEmployees+" человек");
        System.out.println("Задача 8,2");
        totalEmployees=totalEmployees+94;
        var newTotalWorkingHours=totalEmployees*everyEmployeeWorkingHours;
        System.out.println("Если в компании работает "+totalEmployees+" человек, то всего "+newTotalWorkingHours+" часов работы может быть поделено между сотрудниками");
    }
}