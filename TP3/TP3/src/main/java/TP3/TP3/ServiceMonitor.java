package TP3.TP3;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class ServiceMonitor {

    @Before("execution(* TP3.TP3.Store.oneShotOrder(..))")
    public void logService(JoinPoint joinPoint) {
        System.err.println("Envie d'acheter: " + joinPoint);
    }



    @After("execution(* TP3.TP3.Bank.transfert(..))")
    public void logServiceAccess(JoinPoint joinPoint) {
        System.err.println("Achat effectué: " + joinPoint);
    }

    /**@Around("execution(* TP3.TP3.Store.pay())")
    public void logServiceDo(JoinPoint joinPoint) {
        System.err.println("Paying: " + joinPoint);
    }**/


}