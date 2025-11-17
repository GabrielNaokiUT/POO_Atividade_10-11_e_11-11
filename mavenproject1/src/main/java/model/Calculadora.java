package model;

public class Calculadora {
        public double dividir(double num1, double num2) throws ArithmeticException{
            if(num2 == 0){
                throw new ArithmeticException("Não é possível dividir por zero!");
            }
            return num1 / num2;
        }
        public double subtrair(double num1, double num2) throws ArithmeticException{
            if(num1 < num2){
                throw new ArithmeticException("Primeiro número não pode ser menor que o segundo número!");
            }
            return num1 - num2;
        }
        public double somar(double num1, double num2) throws ArithmeticException{
            return num1 + num2;
        }
        public double multiplicar(double num1, double num2) throws ArithmeticException{
            return num1 * num2;
        }
}

